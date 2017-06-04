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
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.ibm.icu.util.Calendar;

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
	private JTable table;
	private JLabel lblAlarmsClocks;
	private JLabel lblwelcomeToThe;
	String s;
	String m;
	String h;
	private JTextPane subject;
	private JTextField txtTimer;

	public void clock() {
		Thread clock = new Thread() {
			public void run() {
				try {
					for (;;) {

						GregorianCalendar c = new GregorianCalendar();
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
		frame.setBounds(100, 100, 956, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 0, 0);
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		JComboBox month = new JComboBox(months);
		month.setBounds(21, 112, 115, 23);
		month.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(month);

		JLabel lblSetReminder = new JLabel("Set Reminder / Alarm:");
		lblSetReminder.setBounds(21, 88, 141, 23);
		lblSetReminder.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblSetReminder);

		String[] dates31 = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

		JComboBox day = new JComboBox(dates31);
		day.setBounds(146, 112, 115, 23);
		day.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(day);

		String[] year = { "2017", "2018", "2019" };

		JComboBox yr = new JComboBox(year);
		yr.setBounds(271, 112, 115, 23);
		yr.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(yr);

		String[] sound = { "Alarm", "Chimes", "Guitar", "Xylophone", "Metal Drop", "Percussion" };

		JComboBox noise = new JComboBox(sound);
		noise.setBounds(245, 149, 115, 23);
		noise.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(noise);

		String[] hour = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		JComboBox hr = new JComboBox(hour);
		hr.setBounds(21, 143, 55, 35);
		hr.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(hr);

		String[] minute = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
				"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
				"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

		JComboBox min = new JComboBox(minute);
		min.setBounds(94, 143, 55, 35);
		min.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(min);

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setBounds(81, 139, 16, 39);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);

		String[] times = { "AM", "PM" };

		JComboBox te = new JComboBox(times);
		te.setBounds(168, 143, 55, 35);
		te.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(te);

		lblAlarmsClocks = new JLabel("Alarms & Clocks");
		lblAlarmsClocks.setBounds(292, 11, 357, 42);
		lblAlarmsClocks.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(lblAlarmsClocks);

		lblwelcomeToThe = new JLabel(
				"<html>Welcome to the alarms dashboard. If you want to set a new alarm or reminder enter the necessary parameters. To check existing ones visit your dashboard. ");
		lblwelcomeToThe.setBounds(48, 52, 845, 23);
		lblwelcomeToThe.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(lblwelcomeToThe);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 213, 251, 94);
		frame.getContentPane().add(scrollPane_1);

		subject = new JTextPane();
		subject.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPane_1.setViewportView(subject);

		JButton btnSetAlarm = new JButton("Set alarm\r\n");
		btnSetAlarm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnSetAlarm.setBounds(370, 149, 167, 35);
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String m = (String) month.getSelectedItem();
				String dy = (String) day.getSelectedItem();
				String y = (String) yr.getSelectedItem();
				String h = (String) hr.getSelectedItem();
				String minute = (String) min.getSelectedItem();
				String t = (String) te.getSelectedItem();
				String a = (String) noise.getSelectedItem();
				String s = subject.getText();

				try {
					String query = "insert into Reminders (Month,Date,Year,Hour,Minute,Time,AlarmType,Message) values (?, ?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, m);
					pst.setString(2, dy);
					pst.setString(3, y);
					pst.setString(4, h);
					pst.setString(5, minute);
					pst.setString(6, t);
					pst.setString(7, a);
					pst.setString(8, s);

					pst.execute();

					/*
					 * SignUp.sendEmail(tempe, "", "", "Reminder Saved: " + s,
					 * "We have successfully saved your reminder and you will be notified through the application of Calibur along with an email that will be sent to the registered email. \nThe reminder has been scheduled for "
					 * + m + " " + dy + ", " + y + " and at " + h + ":" + minute
					 * + " " + te +
					 * ", the message has been recorded with information of: " +
					 * s);
					 */
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
						int hr = Integer.parseInt(rs.getString("Hour"));
						int min = Integer.parseInt(rs.getString("Minute"));
						int day = Integer.parseInt(rs.getString("Date"));
						int year = Integer.parseInt(rs.getString("Year"));
						int month = 0;
						if (rs.getString("Month").equals("January")) {
							month = 0;
						} else if (rs.getString("Month").equals("February")) {
							month = 1;
						} else if (rs.getString("Month").equals("March")) {
							month = 2;
						} else if (rs.getString("Month").equals("April")) {
							month = 3;
						} else if (rs.getString("Month").equals("May")) {
							month = 4;
						} else if (rs.getString("Month").equals("June")) {
							month = 5;
						} else if (rs.getString("Month").equals("July")) {
							month = 6;
						} else if (rs.getString("Month").equals("August")) {
							month = 7;
						} else if (rs.getString("Month").equals("September")) {
							month = 8;
						} else if (rs.getString("Month").equals("October")) {
							month = 9;
						} else if (rs.getString("Month").equals("November")) {
							month = 10;
						} else if (rs.getString("Month").equals("December")) {
							month = 11;
						}

						int time = 0;
						if (te.getSelectedItem().toString().equals("AM")) {
							time = 0;
						} else if (te.getSelectedItem().toString().equals("PM")) {
							time = 1;
						}

						if (a == "Alarm") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\AlarmNoise.wav", month, day,
									year, time, s);

						} else if (a == "Chimes") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Chimes.wav", month, day, year,
									time, s);

						} else if (a == "Guitar") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Guitar.wav", month, day, year,
									time, s);

						} else if (a == "Xylophone") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Xylophone.wav", month, day,
									year, time, s);

						} else if (a == "Metal Drop") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Metal.wav", month, day, year,
									time, s);

						} else if (a == "Percussion") {
							AlarmClock c = new AlarmClock();
							c.checkAlarm(hr, min, "C:\\Users\\sathv\\Desktop\\WAV Audios\\Percussion.wav", month, day,
									year, time, s);

						}

					}

				} catch (Exception me) {
					JOptionPane.showMessageDialog(null, me);
				}

			}
		});
		frame.getContentPane().add(btnSetAlarm);

		JLabel lblSetReminderMessage = new JLabel("Set Alarm Subject and Info\r\n");
		lblSetReminderMessage.setBounds(21, 189, 217, 23);
		lblSetReminderMessage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblSetReminderMessage);

		lblCurrentTimeIs = new JLabel();
		lblCurrentTimeIs.setBounds(397, 103, 350, 35);
		lblCurrentTimeIs.setFont(new Font("Arial", Font.BOLD, 20));
		frame.getContentPane().add(lblCurrentTimeIs);

		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTimer.setBounds(304, 190, 217, 23);
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
		hours.setBounds(304, 213, 41, 23);
		frame.getContentPane().add(hours);

		JComboBox ms = new JComboBox(mins);
		ms.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ms.setBounds(416, 213, 41, 23);
		frame.getContentPane().add(ms);

		JComboBox ss = new JComboBox(secs);
		ss.setFont(new Font("Times New Roman", Font.BOLD, 13));
		ss.setBounds(528, 213, 41, 23);
		frame.getContentPane().add(ss);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\titles.png"));
		p.setBounds(304, 239, 265, 17);
		frame.getContentPane().add(p);

		JLabel label = new JLabel();
		label.setText("00:00:00");
		label.setFont(new Font("Arial", Font.BOLD, 20));
		label.setBounds(585, 213, 127, 29);
		frame.getContentPane().add(label);

		JLabel p1 = new JLabel();
		p1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
		});
		p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\reset.png"));
		p1.setBounds(675, 213, 63, 35);
		frame.getContentPane().add(p1);

		JLabel p11 = new JLabel();
		p11.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseReleased(MouseEvent arg0) {
				count++;
				if (count % 2 == 1) {
					p11.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\pause.PNG"));
					p11.setBounds(729, 215, 63, 35);
					p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\laps.png"));
					p1.setBounds(684, 213, 63, 35);
					Countdown c = new Countdown();
					c.countUp(label);
				} else {
					p11.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\play.PNG"));
					p11.setBounds(725, 213, 63, 35);
					p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\reset.png"));
					p1.setBounds(675, 213, 63, 35);

				}

			}
		});
		p11.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\play.PNG"));
		p11.setBounds(725, 213, 63, 35);
		frame.getContentPane().add(p11);

		JLabel lblTimerName = new JLabel("Timer name");
		lblTimerName.setForeground(new Color(0, 0, 0));
		lblTimerName.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblTimerName.setBounds(304, 257, 217, 23);
		frame.getContentPane().add(lblTimerName);

		txtTimer = new JTextField();
		txtTimer.setText("Timer(1)");
		txtTimer.setForeground(Color.GRAY);
		txtTimer.setFont(new Font("Arial", Font.PLAIN, 11));
		txtTimer.setBounds(304, 277, 153, 20);
		frame.getContentPane().add(txtTimer);
		txtTimer.setColumns(10);

		JButton btnViewCurrentAlarms = new JButton("View current alarms");
		btnViewCurrentAlarms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnViewCurrentAlarms.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnViewCurrentAlarms.setBounds(545, 149, 167, 35);
		frame.getContentPane().add(btnViewCurrentAlarms);

		JLabel displayTime = new JLabel();
		displayTime.setFont(new Font("Arial", Font.BOLD, 14));
		displayTime.setBounds(566, 277, 301, 20);
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
		start.setBounds(467, 277, 89, 20);
		frame.getContentPane().add(start);

		JLabel lblStopwatch = new JLabel("Stopwatch");
		lblStopwatch.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblStopwatch.setBounds(585, 190, 217, 23);
		frame.getContentPane().add(lblStopwatch);

	}

	public void newClass() {

		frame.setSize(959, 456);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
