package Machines;

import java.awt.Font;
import javafx.scene.media.*;
import marytts.server.http.AudioStreamNHttpEntity;

import java.io.*;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

import com.sun.speech.freetts.audio.AudioPlayer;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import sun.audio.*;

public class Lesson4 extends JFrame {
	public Lesson4() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 4 - Evaluating Machines");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(281, 11, 400, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Work ");
		l2.setSelected(true);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Lesson Overview\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(552, 64, 181, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>There are so many machines in this world that we use everyday, but what makes it that we use only particular ones? Why do we use the bigger one and not the smaller one? All these answers relate back to physics and how machines work. This is called a measure of Efficiency. Its this measurement that allows us to make decisions and do the right work. As we learnt in the previous lesson that work is force times distance. Work leads to 2 new concepts that evaluate machines called Efficiency and Power.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(286, 100, 658, 85);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Lesson Review");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson4Review l1 = new Lesson4Review();
				l1.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(770, 602, 174, 42);
		getContentPane().add(btnNewButton);

		JLabel lbltakeABicycle = new JLabel(
				"<html>In order to solve efficiency and power, you need two things. Work input and Work output. Input is what we need to do to power it, and output is the result. They are calculated the same way of force * distance.");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(286, 225, 666, 32);
		getContentPane().add(lbltakeABicycle);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setSelected(true);
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Overview.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(743, 74, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JLabel lblWhatIsWork = new JLabel("Efficiency");
		lblWhatIsWork.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhatIsWork.setBounds(281, 266, 90, 32);
		getContentPane().add(lblWhatIsWork);

		JLabel lblExamples = new JLabel("Power");
		lblExamples.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblExamples.setBounds(281, 400, 69, 32);
		getContentPane().add(lblExamples);

		JLabel lblIdealMechanicalAdvantage = new JLabel("Work Input and Output");
		lblIdealMechanicalAdvantage.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblIdealMechanicalAdvantage.setBounds(281, 196, 277, 32);
		getContentPane().add(lblIdealMechanicalAdvantage);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\InputandOutput.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(479, 198, 132, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Power.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(348, 408, 132, 23);
		getContentPane().add(button_2);

		JLabel lblasYouCan = new JLabel(
				"<html>Work can equal each other if it is very efficient, but can never be greater\r\n");
		lblasYouCan.setForeground(Color.MAGENTA);
		lblasYouCan.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblasYouCan.setBounds(743, 527, 206, 54);
		getContentPane().add(lblasYouCan);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\iando.PNG"));
		pic.setBounds(736, 268, 208, 251);
		getContentPane().add(pic);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\eff.PNG"));
		p.setBounds(422, 354, 103, 46);
		getContentPane().add(p);

		JLabel pi = new JLabel();
		pi.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\pow.PNG"));
		pi.setBounds(281, 475, 262, 78);
		getContentPane().add(pi);

		JLabel p1 = new JLabel();
		p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\p1.PNG"));
		p1.setBounds(6, 311, 147, 101);
		getContentPane().add(p1);

		JLabel p2 = new JLabel();
		p2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\p2.PNG"));
		p2.setBounds(124, 423, 147, 101);
		getContentPane().add(p2);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Example2.wav");
				Audio.PlaySound(clap);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(99, 274, 132, 23);
		getContentPane().add(button_3);

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

		JLabel lblthisIsComputed = new JLabel(
				"<html>This is computed by dividing the work output by the work input and then multiplying by 100 to get a percentage. If you notice in this formula it will never be greater than 1, because the work output can never exceed work input due to the Conservation of Energy. ");
		lblthisIsComputed.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisIsComputed.setBounds(281, 298, 452, 64);
		getContentPane().add(lblthisIsComputed);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Efficiency.wav");
				Audio.PlaySound(clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(374, 274, 132, 23);
		getContentPane().add(button);

		JLabel lblitIsBasically = new JLabel(
				"<html>It is basically the rate at which work is done, so you need time. The power will increase if you can do the work in less time, it reeally is a practical application");
		lblitIsBasically.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblitIsBasically.setBounds(281, 432, 452, 32);
		getContentPane().add(lblitIsBasically);

		JLabel lblExamples_1 = new JLabel("Examples");
		lblExamples_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblExamples_1.setBounds(10, 268, 277, 32);
		getContentPane().add(lblExamples_1);

		JLabel lblwhichPersonIs = new JLabel("<html>Which person is doing more work?");
		lblwhichPersonIs.setForeground(Color.BLUE);
		lblwhichPersonIs.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblwhichPersonIs.setBounds(163, 339, 119, 52);
		getContentPane().add(lblwhichPersonIs);

		JLabel lblwhichSituationDepicts = new JLabel("<html>Which situation depicts greater power?");
		lblwhichSituationDepicts.setForeground(Color.BLUE);
		lblwhichSituationDepicts.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblwhichSituationDepicts.setBounds(6, 460, 119, 46);
		getContentPane().add(lblwhichSituationDepicts);

		JLabel lblworkForce = new JLabel("<html>Work = Force * Distance:    100N * 2M = 200J");
		lblworkForce.setForeground(Color.RED);
		lblworkForce.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblworkForce.setBounds(6, 551, 252, 23);
		getContentPane().add(lblworkForce);

		JLabel label = new JLabel("<html>Work = Force * Distance:    100N * 2M = 200J");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(6, 585, 252, 23);
		getContentPane().add(label);

		JLabel lbltheyAreBoth = new JLabel("<html>They are both doing the same amount of work");
		lbltheyAreBoth.setForeground(Color.RED);
		lbltheyAreBoth.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lbltheyAreBoth.setBounds(6, 616, 252, 23);
		getContentPane().add(lbltheyAreBoth);

		JLabel lblpowerWork = new JLabel("<html>Power = Work / Time:  200J / 10S = 20W");
		lblpowerWork.setForeground(Color.RED);
		lblpowerWork.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblpowerWork.setBounds(286, 556, 252, 23);
		getContentPane().add(lblpowerWork);

		JLabel lblpowerWork_1 = new JLabel("<html>Power = Work / Time:  200J / 1S = 200J");
		lblpowerWork_1.setForeground(Color.RED);
		lblpowerWork_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblpowerWork_1.setBounds(286, 590, 252, 23);
		getContentPane().add(lblpowerWork_1);

		JLabel lblsituationDoes = new JLabel("<html>Situation 1 does greater work");
		lblsituationDoes.setForeground(Color.RED);
		lblsituationDoes.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblsituationDoes.setBounds(286, 621, 252, 23);
		getContentPane().add(lblsituationDoes);

		JLabel lblthisProvesThat = new JLabel(
				"<html>This proves that if you have the same amount of work, less time means more power");
		lblthisProvesThat.setForeground(Color.MAGENTA);
		lblthisProvesThat.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblthisProvesThat.setBounds(537, 561, 147, 83);
		getContentPane().add(lblthisProvesThat);
		
		JLabel label_1 = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_1.setBounds(703, 580, 261, 23);
		getContentPane().add(label_1);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(979, 694);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
