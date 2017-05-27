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

public class Lesson3 extends JFrame {
	public Lesson3() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 - Advantage");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(340, 11, 282, 42);
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

		JLabel ae = new JLabel("Advantage in Physics\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(552, 64, 181, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>ADVANTAGE is a very important topic to know about when learning about machines. Advantage is basically how many times the output force is amplified by the input force. This can let you know how effective it is and if it is amplified greater, then its stronger and better. There are two types of advantages you will learn about, ACTUAL MECHANICAL ADVANTAGE and IDEAL MECHANICAL ADVANTAGE. In order to understand this topic better, you must know about the Law of Conservation of Energy.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(286, 100, 658, 85);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Lesson Review");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson3Review l1 = new Lesson3Review();
				l1.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(729, 509, 215, 36);
		getContentPane().add(btnNewButton);

		JLabel lbltakeABicycle = new JLabel(
				"<html>This is literally the ratio between the output force and the input force. Sometimes in pulleys and levers, they will give you the input and output distances. The formula is still the same just the output distance divided by input distance");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(286, 225, 303, 85);
		getContentPane().add(lbltakeABicycle);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Advantage.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(743, 74, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JLabel lblWhatIsWork = new JLabel("Actual Mechanical Advantage\r\n");
		lblWhatIsWork.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhatIsWork.setBounds(286, 196, 277, 32);
		getContentPane().add(lblWhatIsWork);

		JLabel lblWorkjoules = new JLabel("AMA = F(out) / F(in)");
		lblWorkjoules.setForeground(Color.RED);
		lblWorkjoules.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWorkjoules.setBounds(286, 321, 221, 16);
		getContentPane().add(lblWorkjoules);

		JLabel lblExamples = new JLabel("Examples");
		lblExamples.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblExamples.setBounds(21, 302, 277, 32);
		getContentPane().add(lblExamples);

		JLabel label_1 = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_1.setBounds(683, 475, 261, 23);
		getContentPane().add(label_1);

		JLabel lblIdealMechanicalAdvantage = new JLabel("Ideal Mechanical Advantage");
		lblIdealMechanicalAdvantage.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblIdealMechanicalAdvantage.setBounds(629, 197, 277, 32);
		getContentPane().add(lblIdealMechanicalAdvantage);

		JLabel lblasLearntIn = new JLabel(
				"<html>As learnt in previous lessons and by the Law of Conservation of Energy, the output energy will NEVER be greater than or equal to the input, because of friction. So this concept measures the MA if there was no friction at all in the system. It is the input distance / output dustance");
		lblasLearntIn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblasLearntIn.setBounds(629, 225, 303, 98);
		getContentPane().add(lblasLearntIn);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\AMA.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(387, 295, 132, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\IMA.wav");
				Audio.PlaySound(clap);

				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\IMA2.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(731, 310, 132, 23);
		getContentPane().add(button_2);

		JLabel lblImaDin = new JLabel("IMA = D(in) / D(out)");
		lblImaDin.setForeground(Color.RED);
		lblImaDin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblImaDin.setBounds(629, 338, 221, 16);
		getContentPane().add(lblImaDin);

		JLabel lblasYouCan = new JLabel(
				"<html>As you can see here, these formulas have no units, because in the numrator and denominator they are the same measurments, so they cancel out.");
		lblasYouCan.setForeground(Color.BLUE);
		lblasYouCan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblasYouCan.setBounds(286, 348, 327, 54);
		getContentPane().add(lblasYouCan);

		JLabel lblsometimesYouWill = new JLabel(
				"<html>Sometimes you will be given problems in which the advantage is provided, and you need to find one of the forces or distance\r\n\r\n\r\n\r\n");
		lblsometimesYouWill.setForeground(Color.MAGENTA);
		lblsometimesYouWill.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblsometimesYouWill.setBounds(643, 376, 293, 54);
		getContentPane().add(lblsometimesYouWill);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\MA.png"));
		pic.setBounds(21, 345, 226, 134);
		getContentPane().add(pic);

		JLabel lblweAreGiven = new JLabel(
				"<html>We are given only distances, so we have to use Ideal Mechanical Advatange. This is a first class lever, so the box side is the output, and the opposite is the input side. So it becomes 3 divided by 1.");
		lblweAreGiven.setForeground(Color.BLACK);
		lblweAreGiven.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblweAreGiven.setBounds(191, 441, 327, 64);
		getContentPane().add(lblweAreGiven);

		JLabel label = new JLabel("IMA = D(in) / D(out)");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(191, 518, 221, 16);
		getContentPane().add(label);

		JLabel lblImam = new JLabel("IMA = 3M / 1M\r\n");
		lblImam.setForeground(Color.RED);
		lblImam.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblImam.setBounds(348, 520, 103, 16);
		getContentPane().add(lblImam);

		JLabel lblIma = new JLabel("IMA = 3\r\n");
		lblIma.setForeground(Color.RED);
		lblIma.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblIma.setBounds(469, 520, 103, 16);
		getContentPane().add(lblIma);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Example.wav");
				Audio.PlaySound(clap);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(21, 490, 132, 23);
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

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(979, 595);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
