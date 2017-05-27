import java.awt.EventQueue;

import java.sql.*;

import java.util.*;
import net.proteanit.sql.DbUtils;

import java.awt.event.*;

import java.awt.*;

import com.ibm.icu.util.Calendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Reminders {

	JFrame frame;
	JLabel lblCurrentTimeIs;

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
	private JLabel label;
	private JLabel label_1;
	String s;
	String m;
	String h;
	private JTextPane subject;

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
		frame = new JFrame("Reminder Dashboard");
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 956, 445);
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

		JLabel lblSetReminder = new JLabel("Set Reminder:");
		lblSetReminder.setBounds(21, 88, 115, 23);
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
		noise.setBounds(639, 112, 115, 23);
		noise.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(noise);

		String[] hour = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		JComboBox hr = new JComboBox(hour);
		hr.setBounds(427, 106, 55, 35);
		hr.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(hr);

		String[] minute = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
				"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
				"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

		JComboBox min = new JComboBox(minute);
		min.setBounds(500, 106, 55, 35);
		min.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(min);

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setBounds(487, 102, 16, 39);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);

		String[] times = { "AM", "PM" };

		JComboBox te = new JComboBox(times);
		te.setBounds(565, 106, 55, 35);
		te.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(te);

		label = new JLabel("Reminder & Calendar\r\n");
		label.setBounds(250, 11, 457, 42);
		label.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(label);

		label_1 = new JLabel(
				"<html>Welcome to the reminder dashboard. If you want to set a new reminder, enter the necessary parameters. To check existing reminders visit your dashboard. ");
		label_1.setBounds(55, 53, 832, 23);
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(label_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(21, 170, 251, 94);
		frame.getContentPane().add(scrollPane_1);

		subject = new JTextPane();
		scrollPane_1.setViewportView(subject);

		JButton button = new JButton("Set Reminder!!");
		button.setBounds(319, 160, 171, 42);
		button.addActionListener(new ActionListener() {
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

		JLabel lblVie = new JLabel("View Existing Reminders");
		lblVie.setBounds(21, 275, 160, 23);
		lblVie.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblVie);

		JButton del = new JButton("Delete Reminder");
		del.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(del);

		JButton btnExistingReminders = new JButton("Existing Reminders\r\n");
		btnExistingReminders.setBounds(21, 297, 152, 35);
		btnExistingReminders.addActionListener(new ActionListener() {
			DefaultTableModel model = new DefaultTableModel();

			public void actionPerformed(ActionEvent e) {
				del.setBounds(21, 337, 152, 35);
				scrollPane.setBounds(319, 213, 594, 174);
				try {
					String query = "select * from Reminders";
					PreparedStatement pst = connection1.prepareStatement(query);
					ResultSet rs = pst.executeQuery();

					table.setModel(DbUtils.resultSetToTableModel(rs));
					table.setFont(new Font("Times New Roman", Font.PLAIN, 12));

				} catch (Exception a) {
					a.printStackTrace();
				}
				del.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Please select a reminder to delete");

					}
				});

			}
		});

		btnExistingReminders.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(btnExistingReminders);
		button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().add(button);

		JLabel lblSetReminderMessage = new JLabel("Set Reminder Subject and Info\r\n");
		lblSetReminderMessage.setBounds(21, 146, 217, 23);
		lblSetReminderMessage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblSetReminderMessage);

		lblCurrentTimeIs = new JLabel();
		lblCurrentTimeIs.setBounds(498, 170, 350, 23);
		lblCurrentTimeIs.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblCurrentTimeIs);

	}

	public void newClass() {

		frame.setSize(959, 456);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
