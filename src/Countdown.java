import java.awt.Color;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import PeriodicTable.Audio;

public class Countdown {
	static int secondsPassed = 1;

	public void start(JLabel from, String timerType) {
		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
			public void run() {
				secondsPassed--;

				if (secondsPassed >= 0) {
					from.setText("Seconds remaining = " + secondsPassed);
					if (secondsPassed == 0) {
						from.setForeground(Color.RED);
						File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\AlarmNoise.wav");
						Audio.PlaySound(Clap);
						JOptionPane.showMessageDialog(null, "Timer done: " + timerType);

					}
				}

			}
		};

		timer.scheduleAtFixedRate(task, 1000, 1000);

	}

	public void countUp(JLabel from) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				from.setText("00:00:0" + secondsPassed);
				if (secondsPassed >= 10) {
					from.setText("00:00:" + secondsPassed);
				}
				if (secondsPassed >= 60) {
					int minholder = secondsPassed / 60;
					int secholder = secondsPassed % 60;
					String mm;
					if (minholder >= 10) {
						mm = "" + minholder;
					} else {
						mm = "0" + minholder;
					}
					if (secholder >= 10) {
						from.setText("00:" + mm + ":" + secholder);
					} else {
						from.setText("00:" + mm + ":0" + secholder);
					}
				}
				if (secondsPassed >= 3600) {
					int hourholder = secondsPassed / 3600;
					int minholder = (secondsPassed % 3600) / 60;
					int secholder = (secondsPassed % 3600) % 60;
					String hh;
					String mm;
					String ss;

					if (hourholder >= 10) {
						hh = "" + hourholder;
					} else {
						hh = "0" + hourholder;
					}
					if (minholder >= 10) {
						mm = "" + minholder;
					} else {
						mm = "0" + minholder;
					}
					if (secholder >= 10) {
						ss = "" + secholder;
					} else {
						ss = "0" + secholder;
					}
					from.setText(hh + ":" + mm + ":" + ss + ":");

				}
				secondsPassed++;

			}
		};

		timer.scheduleAtFixedRate(task, 1000, 1000);

	}

	static int resetsecs = 0;

	static public void reset() {
	}

}
