package AInterfaces;

import java.awt.Color;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import PeriodicTable.Audio;

public class Countdown {
	static int secondsPassed = 1;
	static int secPass = 0;

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

		Timer tim = new Timer();
		TimerTask t = new TimerTask() {
			public void run() {
				from.setText("00:00:0" + secPass);
				if (secPass >= 10) {
					from.setText("00:00:" + secPass);
				}
				if (secPass >= 60) {
					int minholder = secPass / 60;
					int secholder = secPass % 60;
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
				if (secPass >= 3600) {
					int hourholder = secPass / 3600;
					int minholder = (secPass % 3600) / 60;
					int secholder = (secPass % 3600) % 60;
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
				secPass++;

			}
		};

		tim.scheduleAtFixedRate(t, 1000, 1000);

	}

	static int resetsecs = 0;

	static public void reset() {
	}

}
