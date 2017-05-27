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

public class LeversCopy extends JFrame {
	public LeversCopy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 - Levers\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(386, 11, 200, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
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

		JLabel ae = new JLabel("Quick Overview");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(544, 64, 132, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>As mentioned before there are 3 main types of levers, and below is a diagram of how each one differs with each other. Each one has been practically used and the work, force, speed of each class changes and are very powerful. They have been incorporated in very small inventions that we use everyday. To understand some more of the differences between these classes it has to do with advantage and work, which you will learn later, but here you will learn how speed, distance, and force changes. ");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(277, 100, 686, 70);
		getContentPane().add(lblinOrderFor);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\ClassofLevers.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(696, 70, 132, 23);
		getContentPane().add(button);

		JButton btnLessonReview = new JButton("Lesson Review\r\n");
		btnLessonReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnLessonReview.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLessonReview.setBounds(768, 627, 200, 51);
		getContentPane().add(btnLessonReview);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\lev.png"));
		p.setBounds(277, 180, 438, 155);
		getContentPane().add(p);

		JLabel lblClassLever = new JLabel("Class 1 Lever\r\n");
		lblClassLever.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblClassLever.setBounds(21, 396, 112, 32);
		getContentPane().add(lblClassLever);

		JLabel lblinAClass = new JLabel(
				"<html>In a class 1 lever the main part that remains consistent is that the fulcrum is in the middle and the load and effort can be on either side. So this lever functions by one side going up and the other going down, like a seesaw. Remember that the fulcrum is what the plane revolves around. A class 1 lever exists in a seesaw, scissors, and a crowbar. The effort force is the input force, and the load is the output force. The height it will get rised to depends on the input force, this is called mechanical advantage, and if you apply \"x\" amount of input the output will always be less than \"x\".");
		lblinAClass.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinAClass.setBounds(21, 426, 921, 70);
		getContentPane().add(lblinAClass);

		JLabel lblFulcrum = new JLabel("Fulcrum");
		lblFulcrum.setForeground(Color.BLUE);
		lblFulcrum.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblFulcrum.setBounds(736, 184, 75, 32);
		getContentPane().add(lblFulcrum);

		JLabel lblEffort = new JLabel("Effort\r\n");
		lblEffort.setForeground(Color.BLUE);
		lblEffort.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblEffort.setBounds(736, 260, 75, 32);
		getContentPane().add(lblEffort);

		JLabel lblLoad = new JLabel("Load\r\n");
		lblLoad.setForeground(Color.BLUE);
		lblLoad.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblLoad.setBounds(736, 333, 75, 23);
		getContentPane().add(lblLoad);

		JLabel lblas = new JLabel(
				"<html> The fulcrum is the part in which the leve pivots around, thus the pivot point. ");
		lblas.setForeground(Color.BLUE);
		lblas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblas.setBounds(736, 215, 215, 42);
		getContentPane().add(lblas);

		JLabel lbltheEffortIs = new JLabel("<html>The effort is the place where you apply force");
		lbltheEffortIs.setForeground(Color.BLUE);
		lbltheEffortIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheEffortIs.setBounds(736, 291, 215, 32);
		getContentPane().add(lbltheEffortIs);

		JLabel lbltheLoadIs = new JLabel(
				"<html>The load is the output force and is what happens after you apply the input.");
		lbltheLoadIs.setForeground(Color.BLUE);
		lbltheLoadIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheLoadIs.setBounds(736, 360, 215, 32);
		getContentPane().add(lbltheLoadIs);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Fulcrum.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(810, 190, 132, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Effort.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(795, 266, 132, 23);
		getContentPane().add(button_2);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Load.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(795, 334, 132, 23);
		getContentPane().add(button_3);

		JButton button_4 = new JButton("Activate Calibur!");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Class1P1.wav");
				Audio.PlaySound(Clap);
				File clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Class1P2.wav");
				Audio.PlaySound(clap);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(143, 402, 132, 23);
		getContentPane().add(button_4);

		JLabel lblSeesaw = new JLabel("Seesaw");
		lblSeesaw.setForeground(Color.BLUE);
		lblSeesaw.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSeesaw.setBounds(294, 500, 50, 16);
		getContentPane().add(lblSeesaw);

		JLabel lblScissors = new JLabel("Scissors");
		lblScissors.setForeground(Color.BLUE);
		lblScissors.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblScissors.setBounds(196, 507, 50, 16);
		getContentPane().add(lblScissors);

		JLabel lblPliers = new JLabel("Pliers");
		lblPliers.setForeground(Color.BLUE);
		lblPliers.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPliers.setBounds(83, 500, 50, 16);
		getContentPane().add(lblPliers);

		JLabel lblClassLever_1 = new JLabel("Class 2 Lever\r\n");
		lblClassLever_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblClassLever_1.setBounds(21, 578, 112, 32);
		getContentPane().add(lblClassLever_1);

		JLabel lbltheMostCommon = new JLabel(
				"<html>The most common example to realte to Class 2 is a WHEELBARROW. The wheel is used as the fulcrum and as it is lifted up which is the effort the load is in the middle, what is in the wheelbarrow, and can be transported. Load in the middle, effort at end, and fulcrum at end too.");
		lbltheMostCommon.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheMostCommon.setBounds(21, 609, 451, 69);
		getContentPane().add(lbltheMostCommon);

		JLabel lblWheelbarrow = new JLabel("Wheelbarrow\r\n");
		lblWheelbarrow.setForeground(Color.RED);
		lblWheelbarrow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWheelbarrow.setBounds(386, 664, 82, 16);
		getContentPane().add(lblWheelbarrow);

		JLabel lblNutcracker = new JLabel("Nutcracker");
		lblNutcracker.setForeground(Color.RED);
		lblNutcracker.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNutcracker.setBounds(298, 664, 82, 16);
		getContentPane().add(lblNutcracker);

		JLabel lblBottleOpener = new JLabel("Bottle opener");
		lblBottleOpener.setForeground(Color.RED);
		lblBottleOpener.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBottleOpener.setBounds(196, 664, 94, 16);
		getContentPane().add(lblBottleOpener);

		JLabel lblClassLever_2 = new JLabel("Class 3 Lever\r\n");
		lblClassLever_2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblClassLever_2.setBounds(508, 495, 112, 32);
		getContentPane().add(lblClassLever_2);

		JLabel lbltheBestExample = new JLabel(
				"<html>The best example to relate to is catapult, and the fulcrum is still at the end, and the force goes up and in the middle, the load is at the end and can be released. ");
		lbltheBestExample.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheBestExample.setBounds(508, 527, 451, 32);
		getContentPane().add(lbltheBestExample);

		JLabel lblCatapult = new JLabel("Catapult");
		lblCatapult.setForeground(Color.MAGENTA);
		lblCatapult.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCatapult.setBounds(508, 570, 94, 16);
		getContentPane().add(lblCatapult);

		JLabel lblMandible = new JLabel("Mandible");
		lblMandible.setForeground(Color.MAGENTA);
		lblMandible.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblMandible.setBounds(612, 570, 94, 16);
		getContentPane().add(lblMandible);

		JButton button_5 = new JButton("Activate Calibur!");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Class2.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_5.setBounds(143, 586, 132, 23);
		getContentPane().add(button_5);

		JButton button_6 = new JButton("Activate Calibur!");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Class3.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_6.setBounds(630, 498, 132, 23);
		getContentPane().add(button_6);

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

		setSize(996, 730);
		setLocation(300, 0);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
