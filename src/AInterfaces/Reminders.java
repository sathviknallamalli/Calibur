package AInterfaces;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.ibm.icu.util.Calendar;
import com.toedter.calendar.JDateChooser;

public class Reminders {

	JFrame frame;
	JLabel lblCurrentTimeIs;
	static String tempe = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reminders window = new Reminders();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	Connection connection1 = null;
	Connection connection2 = null;
	private JLabel lblAlarmsClocks;
	private JLabel lblwelcomeToThe;
	String s;
	String m;
	String h;
	private JTextPane subject;
	private JTextPane subject_1;
	private JTextField txtTimer;

	public void clock() {
		Thread clock = new Thread() {
			public void run() {
				try {
					for (;;) {

						Calendar calendar = Calendar.getInstance();
						int hour = calendar.get(Calendar.HOUR);
						int min = calendar.get(Calendar.MINUTE);
						int sec = calendar.get(Calendar.SECOND);

						if (sec == 0 || sec == 1 || sec == 2 || sec == 3 || sec == 4 || sec == 5 || sec == 6 || sec == 7
								|| sec == 8 || sec == 9) {
							s = "0" + sec;
						} else {
							s = "" + sec;
						}
						if (min == 0 || min == 1 || min == 2 || min == 3 || min == 4 || min == 5 || min == 6 || min == 7
								|| min == 8 || min == 9) {
							m = "0" + min;
						} else {
							m = "" + min;
						}
						if (hour == 0) {
							h = "12";
						} else {
							h = "" + hour;
						}
						lblCurrentTimeIs.setText("The current time is " + h + ":" + m + ":" + s);

						sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}

	/**
	 * Create the application.
	 */
	public Reminders() {
		connection = sqliteConnection.c();
		connection1 = sqliteConnection.c();
		connection2 = sqliteConnection.c();
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("Alarms and clocks");
		frame.getContentPane().setBackground(new Color(51, 204, 0));
		frame.setBounds(100, 100, 756, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JDateChooser jd = new JDateChooser();
		jd.getCalendarButton().setText("Please select a date");
		jd.getCalendarButton().setFont(new Font("Arial", Font.PLAIN, 13));
		jd.setBounds(20, 113, 318, 29);
		frame.getContentPane().add(jd);

		JLabel lblSetReminder = new JLabel("Set Reminder / Alarm:");
		lblSetReminder.setBounds(21, 88, 141, 23);
		lblSetReminder.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblSetReminder);

		String[] sound = { "Alarm", "Chimes", "Guitar", "Xylophone", "Metal Drop", "Percussion" };

		JComboBox noise = new JComboBox(sound);
		noise.setBounds(223, 155, 115, 23);
		noise.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(noise);

		String[] hour = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		JComboBox hr = new JComboBox(hour);
		hr.setBounds(20, 149, 55, 35);
		hr.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(hr);

		String[] minute = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
				"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
				"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

		JComboBox min = new JComboBox(minute);
		min.setBounds(93, 149, 55, 35);
		min.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(min);

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setBounds(80, 145, 16, 39);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);

		String[] times = { "AM", "PM" };

		JComboBox te = new JComboBox(times);
		te.setBounds(158, 149, 55, 35);
		te.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(te);

		lblAlarmsClocks = new JLabel("Alarms & Clocks");
		lblAlarmsClocks.setBounds(181, 11, 357, 42);
		lblAlarmsClocks.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(lblAlarmsClocks);

		lblwelcomeToThe = new JLabel(
				"<html>Welcome to the alarms dashboard. If you want to set a new alarm or reminder enter the necessary parameters. ");
		lblwelcomeToThe.setBounds(62, 50, 594, 23);
		lblwelcomeToThe.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(lblwelcomeToThe);

		JButton btnSetAlarm = new JButton("Set alarm\r\n");
		btnSetAlarm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnSetAlarm.setBounds(348, 155, 153, 29);
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String day = "" + jd.getDate().getDate();
				int month = jd.getDate().getMonth();
				String m = "";
				String year = jd.getDate().getYear() + 1900 + "";
				if (month == 0) {
					m = "January";
				} else if (month == 1) {
					m = "February";
				} else if (month == 2) {
					m = "March";
				} else if (month == 3) {
					m = "April";
				} else if (month == 4) {
					m = "May";
				} else if (month == 5) {
					m = "June";
				} else if (month == 6) {
					m = "July";
				} else if (month == 7) {
					m = "August";
				} else if (month == 8) {
					m = "September";
				} else if (month == 9) {
					m = "October";
				} else if (month == 10) {
					m = "November";
				} else if (month == 11) {
					m = "December";
				}
				String date = m + " " + day + " " + year;
				String time = (String) hr.getSelectedItem() + ":" + (String) min.getSelectedItem();
				try {
					String query = "insert into Reminders (Date,Time,AlarmType,Message) values (?, ?, ?, ?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, date);
					pst.setString(2, time);
					pst.setString(3, (String) noise.getSelectedItem());
					pst.setString(4, subject.getText());

					pst.execute();

					JOptionPane.showMessageDialog(null, "Reminder has been saved");
					pst.close();
				} catch (Exception b) {
					JOptionPane.showMessageDialog(null, b);
				}

				// check alarm
				try {
					String query = "select * from Reminders";
					PreparedStatement pst = connection2.prepareStatement(query);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						int hr = Integer.parseInt(rs.getString("Time").substring(0, 1));
						int min = Integer.parseInt(rs.getString("Time").substring(2, 4));
						int occ = rs.getString("Date").indexOf(" ");
						int dayVal = Integer.parseInt(rs.getString("Date").substring(occ + 1, occ + 3));
						int yearVal = Integer.parseInt(rs.getString("Date").substring(occ + 4, occ + 8));

						String mv = rs.getString("Date").substring(0, occ);

						int monthVal = 0;
						if (mv.equals("January")) {
							monthVal = 0;
						} else if (mv.equals("February")) {
							monthVal = 1;
						} else if (mv.equals("March")) {
							monthVal = 2;
						} else if (mv.equals("April")) {
							monthVal = 3;
						} else if (mv.equals("May")) {
							monthVal = 4;
						} else if (mv.equals("June")) {
							monthVal = 5;
						} else if (mv.equals("July")) {
							monthVal = 6;
						} else if (mv.equals("August")) {
							monthVal = 7;
						} else if (mv.equals("September")) {
							monthVal = 8;
						} else if (mv.equals("October")) {
							monthVal = 9;
						} else if (mv.equals("November")) {
							monthVal = 10;
						} else if (mv.equals("December")) {
							monthVal = 11;
						}

						int timeofDay = 0;
						if (te.getSelectedItem().toString().equals("AM")) {
							timeofDay = 0;
						} else if (te.getSelectedItem().toString().equals("PM")) {
							timeofDay = 1;
						}

						if ((String) noise.getSelectedItem() == "Alarm") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\AlarmNoise.wav", monthVal,
									dayVal, yearVal, timeofDay, subject.getText());

						} else if ((String) noise.getSelectedItem() == "Chimes") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Chimes.wav", monthVal, dayVal,
									yearVal, timeofDay, subject.getText());

						} else if ((String) noise.getSelectedItem() == "Guitar") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Guitar.wav", monthVal, dayVal,
									yearVal, timeofDay, subject.getText());

						} else if ((String) noise.getSelectedItem() == "Xylophone") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Xylophone.wav", monthVal,
									dayVal, yearVal, timeofDay, subject.getText());

						} else if ((String) noise.getSelectedItem() == "Metal Drop") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Metal.wav", monthVal, dayVal,
									yearVal, timeofDay, subject.getText());

						} else if ((String) noise.getSelectedItem() == "Percussion") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Percussion.wav", monthVal,
									dayVal, yearVal, timeofDay, subject.getText());

						}

					}

				} catch (Exception me) {
					JOptionPane.showMessageDialog(null, me);
				}

			}
		});

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 213, 251, 114);
		frame.getContentPane().add(scrollPane_1);

		subject = new JTextPane();
		subject.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPane_1.setViewportView(subject);
		frame.getContentPane().add(btnSetAlarm);

		JLabel lblSetReminderMessage = new JLabel("Set Alarm Subject and Info\r\n");
		lblSetReminderMessage.setBounds(20, 189, 217, 23);
		lblSetReminderMessage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblSetReminderMessage);

		lblCurrentTimeIs = new JLabel();
		lblCurrentTimeIs.setBounds(342, 107, 350, 35);
		lblCurrentTimeIs.setFont(new Font("Arial", Font.BOLD, 20));
		frame.getContentPane().add(lblCurrentTimeIs);

		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTimer.setBounds(282, 190, 217, 23);
		frame.getContentPane().add(lblTimer);

		String[] hrs = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23" };

		String[] mins = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
				"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
				"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

		String[] secs = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
				"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
				"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

		JComboBox hours = new JComboBox(hrs);
		hours.setFont(new Font("Times New Roman", Font.BOLD, 13));
		hours.setBounds(282, 213, 41, 23);
		frame.getContentPane().add(hours);

		JComboBox ms = new JComboBox(mins);
		ms.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ms.setBounds(394, 213, 41, 23);
		frame.getContentPane().add(ms);

		JComboBox ss = new JComboBox(secs);
		ss.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ss.setBounds(506, 213, 41, 23);
		frame.getContentPane().add(ss);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\titles.png"));
		p.setBounds(282, 239, 265, 17);
		frame.getContentPane().add(p);

		JLabel label = new JLabel();
		label.setText("00:00:00");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(557, 224, 127, 29);
		frame.getContentPane().add(label);

		JLabel resetLaps = new JLabel();
		resetLaps.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

			}
		});
		resetLaps.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\reset.png"));
		resetLaps.setBounds(626, 221, 63, 35);
		frame.getContentPane().add(resetLaps);

		JLabel pausePlay = new JLabel();
		pausePlay.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseReleased(MouseEvent arg0) {
				count++;
				if (count % 2 == 1) {
					pausePlay.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\pause.PNG"));
					pausePlay.setBounds(729, 215, 63, 35);
					resetLaps.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\laps.png"));
					resetLaps.setBounds(684, 213, 63, 35);
					Countdown c = new Countdown();
					c.countUp(label);

					resetLaps.addMouseListener(new MouseAdapter() {
						ArrayList a = new ArrayList();

						@Override
						public void mouseReleased(MouseEvent arg0) {
							JScrollPane scrollPane = new JScrollPane();
							scrollPane.setBounds(586, 239, 126, 62);
							frame.getContentPane().add(scrollPane);

							subject_1 = new JTextPane();
							subject_1.setFont(new Font("Arial", Font.PLAIN, 11));
							scrollPane.setRowHeaderView(subject_1);
							frame.getContentPane().add(btnSetAlarm);

							a.add((String) label.getText() + " - Split/ Laps ");
							String thing = a.toString();
							subject_1.setText(thing);
						}
					});
				} else {
					pausePlay.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\play.PNG"));
					pausePlay.setBounds(698, 221, 63, 35);
					resetLaps.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\reset.png"));
					resetLaps.setBounds(648, 221, 63, 35);

				}

			}
		});
		pausePlay.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\play.PNG"));
		pausePlay.setBounds(676, 221, 63, 35);
		frame.getContentPane().add(pausePlay);

		JLabel lblTimerName = new JLabel("Timer name");
		lblTimerName.setForeground(new Color(0, 0, 0));
		lblTimerName.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblTimerName.setBounds(282, 257, 217, 23);
		frame.getContentPane().add(lblTimerName);

		txtTimer = new JTextField();
		txtTimer.setText("Timer(1)");
		txtTimer.setForeground(Color.GRAY);
		txtTimer.setFont(new Font("Arial", Font.PLAIN, 11));
		txtTimer.setBounds(282, 277, 153, 20);
		frame.getContentPane().add(txtTimer);
		txtTimer.setColumns(10);

		JButton btnViewCurrentAlarms = new JButton("View current alarms");
		btnViewCurrentAlarms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ExistingReminders er = new ExistingReminders();
				er.newClass();
			}
		});
		btnViewCurrentAlarms.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnViewCurrentAlarms.setBounds(507, 155, 153, 29);
		frame.getContentPane().add(btnViewCurrentAlarms);

		JLabel displayTime = new JLabel();
		displayTime.setFont(new Font("Arial", Font.BOLD, 14));
		displayTime.setBounds(281, 307, 301, 20);
		frame.getContentPane().add(displayTime);

		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int hsec = Integer.parseInt((String) hours.getSelectedItem()) * 3600;
				int minsec = Integer.parseInt((String) ms.getSelectedItem()) * 60;
				int ssec = Integer.parseInt((String) ss.getSelectedItem());
				int totalsec = hsec + minsec + ssec;

				Countdown.secondsPassed = totalsec + 1;
				Countdown c = new Countdown();
				c.start(displayTime, txtTimer.getText());

			}
		});
		start.setFont(new Font("Arial", Font.PLAIN, 10));
		start.setBounds(445, 277, 89, 20);
		frame.getContentPane().add(start);

		JLabel lblStopwatch = new JLabel("Stopwatch");
		lblStopwatch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStopwatch.setBounds(557, 201, 217, 23);
		frame.getContentPane().add(lblStopwatch);

	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
