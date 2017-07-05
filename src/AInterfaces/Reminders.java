package AInterfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
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

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

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
	private JLabel lblAlarmsClocks;
	private JLabel lblwelcomeToThe;
	String s;
	String m;
	String h;
	private JTextPane subject;
	private JTextPane subject_1;
	private JTextField txtTimer;
	String fromHome = Home.username;

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
		connection = sqlConnection.sqlExpress();
		initialize();
		clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("Alarms and clocks");
		frame.getContentPane().setBackground(Color.YELLOW);
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
		noise.setBounds(214, 155, 96, 23);
		noise.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(noise);

		String[] hour = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		JComboBox hr = new JComboBox(hour);
		hr.setBounds(20, 152, 46, 29);
		hr.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(hr);

		String[] minute = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
				"32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
				"49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

		JComboBox min = new JComboBox(minute);
		min.setBounds(93, 152, 46, 29);
		min.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(min);

		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setBounds(73, 145, 16, 39);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel_1);

		String[] times = { "AM", "PM" };

		JComboBox te = new JComboBox(times);
		te.setBounds(158, 152, 46, 29);
		te.setFont(new Font("Times New Roman", Font.BOLD, 13));
		frame.getContentPane().add(te);

		lblAlarmsClocks = new JLabel("Alarms & Clocks");
		lblAlarmsClocks.setBounds(181, 11, 357, 42);
		lblAlarmsClocks.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(lblAlarmsClocks);

		lblwelcomeToThe = new JLabel(
				"<html>Welcome to the alarms dashboard. If you want to set a new alarm or reminder enter the necessary parameters. ");
		lblwelcomeToThe.setBounds(72, 50, 594, 23);
		lblwelcomeToThe.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(lblwelcomeToThe);

		JButton btnSetAlarm = new JButton("Set alarm\r\n");
		btnSetAlarm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnSetAlarm.setBounds(320, 152, 153, 29);
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String day = "" + jd.getDate().getDate();
				int month = jd.getDate().getMonth() + 1;
				String year = jd.getDate().getYear() + 1900 + "";

				String time = (String) hr.getSelectedItem() + ":" + (String) min.getSelectedItem() + " "
						+ (String) te.getSelectedItem();
				String sound = (String) noise.getSelectedItem();
				try {
					String query = "insert into Reminders (Date,Time,AlarmType,Message,Username) values (?, ?, ?, ?, ?)";
					PreparedStatement pst = connection.prepareStatement(query);
					try {
						String date = month + "/" + day + "/" + year;
						SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
						java.util.Date parsed = format.parse(date);
						java.sql.Date sql_date = new java.sql.Date(parsed.getTime());
						pst.setDate(1, sql_date);
					} catch (Exception a) {

					}

					String sub = subject.getText();
					if (sub.equals("")) {
						sub = "No message";
					}
					pst.setString(2, time);
					pst.setString(3, sound);
					pst.setString(4, sub);
					pst.setString(5, Home.username);

					pst.execute();

					JOptionPane.showMessageDialog(null, "Reminder has been saved");
					pst.close();
				} catch (Exception b) {
					JOptionPane.showMessageDialog(null, b);
				}

				// alarm to excel
				Workbook wb = new HSSFWorkbook();
				CreationHelper createHelper = wb.getCreationHelper();
				Sheet sheet = wb.createSheet("Alarms");
				Row row = sheet.createRow((short) 0);

				row.createCell(0).setCellValue(createHelper.createRichTextString("Time"));
				row.createCell(1).setCellValue(createHelper.createRichTextString("Date"));
				row.createCell(2).setCellValue(createHelper.createRichTextString("Noise"));
				row.createCell(3).setCellValue(createHelper.createRichTextString("Message/ Information"));

				FileOutputStream fileOut;
				try {
					fileOut = new FileOutputStream(
							"C:\\Users\\sathv\\Desktop\\" + fromHome + "_Calibur\\Alarms\\Alarms and Reminders.xls");

					// save alarm

					// retrieve reminder info drom table
					try {
						String query = "select * from Reminders";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						int count = 0;
						while (rs.next()) {
							if (rs.getString("Username").equals(Home.username)) {
								count++;
								String rTime = rs.getString("Time");
								String rDate = rs.getString("Date");
								String rType = rs.getString("AlarmType");
								String rMessage = rs.getString("Message");

								if (rMessage.equals("")) {
									rMessage = "No message";
								}
								Row r = sheet.createRow((short) count);

								r.createCell(0).setCellValue(createHelper.createRichTextString(rTime));
								r.createCell(1).setCellValue(createHelper.createRichTextString(rDate));
								r.createCell(2).setCellValue(createHelper.createRichTextString(rType));
								r.createCell(3).setCellValue(createHelper.createRichTextString(rMessage));
							}
						}
					} catch (Exception a) {
						JOptionPane.showMessageDialog(null, a);
					}
					wb.write(fileOut);
					fileOut.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();
				}

				// check alarm
				try {
					String query = "select * from Reminders";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();

					while (rs.next()) {
						int hr = Integer.parseInt(rs.getString("Time").substring(0, 1));
						int min = Integer.parseInt(rs.getString("Time").substring(2, 4));
						int dayVal = Integer.parseInt(rs.getString("Date").substring(8, 10));
						int yearVal = Integer.parseInt(rs.getString("Date").substring(0, 4));
						int monthVal = Integer.parseInt(rs.getString("Date").substring(5, 7));

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

		JLabel lblSetReminderMessage = new JLabel("Alarm Subject and Info\r\n");
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
		label.setBounds(557, 224, 96, 29);
		frame.getContentPane().add(label);

		JLabel resetLaps = new JLabel();
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
					pausePlay.setBounds(680, 223, 55, 35);
					resetLaps.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\laps.png"));
					resetLaps.setBounds(634, 224, 63, 29);
					Countdown c = new Countdown();
					c.countUp(label);

					resetLaps.addMouseListener(new MouseAdapter() {
						ArrayList a = new ArrayList();

						@Override
						public void mouseReleased(MouseEvent arg0) {
							JScrollPane scrollPane = new JScrollPane();
							scrollPane.setBounds(557, 250, 126, 62);
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
					pausePlay.setBounds(676, 221, 63, 35);
					resetLaps.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\reset.png"));
					resetLaps.setBounds(626, 221, 63, 35);

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
		btnViewCurrentAlarms.setBounds(479, 152, 153, 29);
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
