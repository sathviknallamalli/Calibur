package Machines;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson2Copy extends JFrame {
	public Lesson2Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 - Work");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(384, 11, 200, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Work ");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Work and its Physics Applications");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(485, 64, 277, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>We commonly hear people saying that they did a lot of work, but did they really do it? What kind of work are they talking about? In terms of physics work is all about the aspects of a machine and depends on two main aspects, force and distance. Work correlates to a machine, and it contributes to its effectiveness. You will learn in this Lesson how to calculate work and what work really is.\r\n\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(286, 100, 658, 64);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Lesson Review");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(729, 439, 215, 36);
		getContentPane().add(btnNewButton);

		JLabel lbltakeABicycle = new JLabel(
				"<html>Work occurs when force is applied to an object and it is moved. So the object doesnt remain stationary and there is something powering it. Below is the formula to calculate how much work is done and the parameters. \r\n\r\n\r\n");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(286, 205, 615, 32);
		getContentPane().add(lbltakeABicycle);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JLabel lblRopeAndPulley = new JLabel("Force (Newtons)");
		lblRopeAndPulley.setForeground(Color.BLUE);
		lblRopeAndPulley.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRopeAndPulley.setBounds(444, 248, 105, 16);
		getContentPane().add(lblRopeAndPulley);

		JLabel lblGears = new JLabel("Distance (Meters)");
		lblGears.setForeground(Color.BLUE);
		lblGears.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGears.setBounds(286, 248, 112, 16);
		getContentPane().add(lblGears);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MachineL1SM.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(769, 71, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MachineL1SM2.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(417, 180, 132, 23);
		getContentPane().add(button);

		JLabel lblWhatIsWork = new JLabel("What is Work?");
		lblWhatIsWork.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhatIsWork.setBounds(286, 171, 277, 32);
		getContentPane().add(lblWhatIsWork);

		JLabel lblWorkjoules = new JLabel("Work (Joules) = Force * Distance");
		lblWorkjoules.setForeground(Color.RED);
		lblWorkjoules.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWorkjoules.setBounds(314, 275, 221, 16);
		getContentPane().add(lblWorkjoules);

		JLabel lblworkIsMeasured = new JLabel(
				"<html>Work is measured in Joules and work is basically a form of energy, which is why a NewtonMeter = Joule\r\n\r\n\r\n\r\n");
		lblworkIsMeasured.setForeground(Color.MAGENTA);
		lblworkIsMeasured.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblworkIsMeasured.setBounds(582, 248, 215, 57);
		getContentPane().add(lblworkIsMeasured);

		JLabel lblExamples = new JLabel("Examples");
		lblExamples.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblExamples.setBounds(21, 302, 277, 32);
		getContentPane().add(lblExamples);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\work.png"));
		pic.setBounds(21, 345, 167, 92);
		getContentPane().add(pic);

		JLabel lblCalculateTheWork = new JLabel("<html>Calculate the work done by this object");
		lblCalculateTheWork.setForeground(Color.BLUE);
		lblCalculateTheWork.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCalculateTheWork.setBounds(21, 439, 215, 32);
		getContentPane().add(lblCalculateTheWork);

		JLabel label = new JLabel("Work (Joules) = Force * Distance");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(237, 334, 221, 16);
		getContentPane().add(label);

		JLabel lblWorkn = new JLabel("Work = 100N * 15M");
		lblWorkn.setForeground(Color.RED);
		lblWorkn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWorkn.setBounds(237, 360, 221, 16);
		getContentPane().add(lblWorkn);

		JLabel lblm = new JLabel("15M\r\n");
		lblm.setForeground(Color.RED);
		lblm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblm.setBounds(134, 403, 35, 16);
		getContentPane().add(lblm);

		JLabel lblWorkj = new JLabel("Work = 1500J\r\n");
		lblWorkj.setForeground(Color.RED);
		lblWorkj.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWorkj.setBounds(237, 387, 221, 16);
		getContentPane().add(lblWorkj);

		JLabel lblsometimesYouWill = new JLabel(
				"<html>Sometimes you will be given problems in which the work is provided, but you need to find the parameters of force and distance, in which you would divide and solve backwards. \r\n\r\n\r\n\r\n");
		lblsometimesYouWill.setForeground(Color.MAGENTA);
		lblsometimesYouWill.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblsometimesYouWill.setBounds(497, 333, 293, 104);
		getContentPane().add(lblsometimesYouWill);

		JCheckBox checkBox = new JCheckBox("Lesson 4 - Evaluating Machines");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 154, 215, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Energy & Machines\r\n");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 180, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 6 - Practice Problems\r\n");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(6, 208, 215, 23);
		getContentPane().add(checkBox_2);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(967, 528);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
