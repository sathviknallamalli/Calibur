import java.io.File;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import com.ibm.icu.util.Calendar;

import Machines.Audio;

public class AlarmClock extends Reminders {

	public void checkAlarm(final int a, final int b, String file, final int mon, final int day, final int yr,
			final int te, String subject) {
		Thread t = new Thread() {

			public void run() {
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
