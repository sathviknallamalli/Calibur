package AInterfaces;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import com.ibm.icu.util.Calendar;

import Machines.Audio;

public class AlarmClock extends Reminders {
	Connection connection = null;

	public void checkAlarm(final int a, final int b, String file, final int mon, final int day, final int yr,
			final int te, String subject) {
		Thread t = new Thread() {

			public void run() {
				connection = sqlConnection.sqlExpress();
				try {
					for (;;) {
						Calendar calendar = Calendar.getInstance();

						int hours = calendar.get(Calendar.HOUR);
						int mins = calendar.get(Calendar.MINUTE);
						int secs = calendar.get(Calendar.SECOND);

						int month = calendar.get((Calendar.MONTH)) + 1;
						int date = calendar.get((Calendar.DATE));
						int year = calendar.get((Calendar.YEAR));
						int time = calendar.get((Calendar.AM_PM));

						if (a == hours && b == mins && secs == 0 && mon == month && day == date && yr == year
								&& te == time) {
							File Clap = new File(file);
							Audio.PlaySound(Clap);
							int p = JOptionPane.showConfirmDialog(null,
									"Snooze and de-activate alarm? Message: " + subject, "Snooze",
									JOptionPane.YES_NO_OPTION);
							try {
								String am_PM = "";
								if (time == 0) {
									am_PM = "AM";
								} else {
									am_PM = "PM";
								}
								String alarm = yr + "-" + mon + "-" + day;
								String clockTime = a + ":" + b + " " + am_PM;
								int val = file.indexOf('.');
								String sub = file.substring(34, val);
								String query = "delete from Reminders where Date=?, Time= ?, AlarmType=?, Message=?";
								PreparedStatement pst = connection.prepareStatement(query);

								try {
									SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
									java.util.Date parsed = format.parse(alarm);
									java.sql.Date sql_date = new java.sql.Date(parsed.getTime());
									pst.setDate(1, sql_date);
								} catch (Exception a) {

								}
								pst.setString(2, clockTime);
								pst.setString(3, sub);
								pst.setString(4, subject);

								pst.execute();

								pst.close();

							} catch (Exception e) {
								JOptionPane.showMessageDialog(null, e);
							}
							if (p == 0) {
								System.out.println("yes was clicked");
							}
							break;

						}
						sleep(1000);
					}
				} catch (Exception e) {

				}

			}
		};

		t.start();
	}

	public static void main(String[] args) {

	}

}
