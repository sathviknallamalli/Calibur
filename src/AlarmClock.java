import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.ibm.icu.util.Calendar;

import Machines.Audio;

public class AlarmClock extends Reminders {
	Connection connection = null;

	public void checkAlarm(final int a, final int b, String file, final int mon, final int day, final int yr,
			final int te, String subject) {
		Thread t = new Thread() {

			public void run() {
				connection = sqliteConnection.c();
				try {
					for (;;) {
						Calendar calendar = Calendar.getInstance();

						int hours = calendar.get(Calendar.HOUR);
						int mins = calendar.get(Calendar.MINUTE);
						int secs = calendar.get(Calendar.SECOND);

						int month = calendar.get((Calendar.MONTH));
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
								String finalMonth = "";
								if (mon == 0) {
									finalMonth = "January";
								} else if (mon == 1) {
									finalMonth = "February";
								} else if (mon == 2) {
									finalMonth = "March";
								} else if (mon == 3) {
									finalMonth = "April";
								} else if (mon == 4) {
									finalMonth = "May";
								} else if (mon == 5) {
									finalMonth = "June";
								} else if (mon == 6) {
									finalMonth = "July";
								} else if (mon == 7) {
									finalMonth = "August";
								} else if (mon == 8) {
									finalMonth = "September";
								} else if (mon == 9) {
									finalMonth = "October";
								} else if (mon == 10) {
									finalMonth = "November";
								} else if (mon == 11) {
									finalMonth = "December";
								}
								String alarm = finalMonth + " " + day + " " + yr;
								String clockTime = a + ":" + b;
								int val = file.indexOf('.');
								String sub = file.substring(34, val);
								String query = "delete from Reminders where Date=" + alarm + "and Time" + clockTime
										+ " and AlarmType=" + sub + " and Message=" + subject;
								PreparedStatement pst = connection.prepareStatement(query);
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
