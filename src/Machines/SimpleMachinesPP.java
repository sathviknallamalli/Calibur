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

public class SimpleMachinesPP extends JFrame {
	public SimpleMachinesPP() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Simple Machines - Practice Problems");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(213, 11, 462, 42);
		getContentPane().add(title);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\2.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(150, 225, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\1.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(213, 61, 132, 23);
		getContentPane().add(button);

		JLabel lblIdentifyWhich = new JLabel("<html>1.) Identify which class lever this is?\r\n");
		lblIdentifyWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyWhich.setBounds(10, 60, 201, 23);
		getContentPane().add(lblIdentifyWhich);

		JRadioButton op1 = new JRadioButton("Class 1");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 90, 66, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Class 2");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 116, 66, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Class 3");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 142, 66, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\2.PNG"));
		pic.setBounds(112, 87, 221, 90);
		getContentPane().add(pic);

		JLabel lblWhichPart = new JLabel("<html>2.) Which part of a lever matches this description: The input force ");
		lblWhichPart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichPart.setBounds(10, 200, 356, 23);
		getContentPane().add(lblWhichPart);

		JRadioButton op23 = new JRadioButton("Effort");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 277, 66, 23);
		getContentPane().add(op23);

		JRadioButton op22 = new JRadioButton("Load");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 251, 66, 23);
		getContentPane().add(op22);

		JRadioButton op21 = new JRadioButton("Fulcrum");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 225, 66, 23);
		getContentPane().add(op21);

		ButtonGroup bg2 = new ButtonGroup();
		bg1.add(op23);
		bg1.add(op22);
		bg1.add(op21);

		JLabel lblIdentifyAll = new JLabel(
				"<html>3.) Identify all of the simple machines in this complex machine: Wheelbarrow\r\n ");
		lblIdentifyAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyAll.setBounds(10, 302, 404, 23);
		getContentPane().add(lblIdentifyAll);

		JRadioButton op31 = new JRadioButton("Pulley");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 327, 66, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Wheel and Axle");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 353, 101, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Lever");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 379, 66, 23);
		getContentPane().add(op33);

		JRadioButton op34 = new JRadioButton("Ramp");
		op34.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op34.setBounds(173, 327, 66, 23);
		getContentPane().add(op34);

		JRadioButton op35 = new JRadioButton("Wedge");
		op35.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op35.setBounds(173, 353, 101, 23);
		getContentPane().add(op35);

		JRadioButton op36 = new JRadioButton("Gear");
		op36.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op36.setBounds(173, 379, 66, 23);
		getContentPane().add(op36);

		JLabel lblSelectAll = new JLabel("<html>4.) Select all the statements that are always true about machines");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(10, 409, 347, 23);
		getContentPane().add(lblSelectAll);

		JRadioButton op41 = new JRadioButton("<html>A compound machine is made of multiple simple machines");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(10, 433, 158, 50);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("<html>A gear needs 2 wheels in order to function properly");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(175, 433, 158, 37);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("<html>A class 1 lever always has an advantage of 1");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(333, 433, 158, 37);
		getContentPane().add(op43);

		JLabel lblWhatIs = new JLabel("<html>5.) What is the arrangement of a 3rd class lever\r\n ");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(429, 60, 256, 23);
		getContentPane().add(lblWhatIs);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\3.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(256, 327, 132, 23);
		getContentPane().add(button_1);

		JRadioButton op51 = new JRadioButton("Fulcrum, Load, Effort\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(483, 90, 146, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Fulcrum, Effort, Load");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(483, 116, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Effort, Fulcrum, Load");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(483, 142, 146, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblWhichOf = new JLabel(
				"<html>6.) Which of the following complex machines contain a pulley as a simple machine");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(429, 172, 478, 23);
		getContentPane().add(lblWhichOf);

		JRadioButton op61 = new JRadioButton("Clock");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(483, 200, 53, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Elevator");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(483, 226, 75, 23);
		getContentPane().add(op62);

		JRadioButton op63 = new JRadioButton("Rolling Pins");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(483, 252, 83, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\5.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(648, 90, 132, 23);
		getContentPane().add(button_2);

		JLabel lblIdentifyThe = new JLabel("<html>7.) Identify the class of lever from this picture");
		lblIdentifyThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyThe.setBounds(465, 282, 241, 23);
		getContentPane().add(lblIdentifyThe);

		JRadioButton op71 = new JRadioButton("1");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(496, 311, 31, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("2");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(496, 337, 41, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("3");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(496, 363, 41, 23);
		getContentPane().add(op73);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\7.png"));
		p.setBounds(557, 302, 101, 168);
		getContentPane().add(p);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\7.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(668, 311, 132, 23);
		getContentPane().add(button_3);

		JButton btnCheckAnswers = new JButton("Check Answers");

		btnCheckAnswers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCheckAnswers.setBounds(710, 446, 158, 37);
		getContentPane().add(btnCheckAnswers);

		JLabel ans1 = new JLabel("");
		ans1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans1);

		JLabel ans2 = new JLabel("");
		ans2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans2);

		JLabel ans3 = new JLabel("");
		ans3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans3);

		JLabel ans4 = new JLabel("");
		ans4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans4);

		JLabel ans5 = new JLabel("");
		ans5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans5);

		JLabel ans6 = new JLabel("");
		ans6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans6);

		JLabel ans7 = new JLabel("\r\n");
		ans7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans7);

		btnCheckAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans1.setBounds(10, 177, 335, 23);
				ans1.setText("Class 2 Lever");
				ans2.setBounds(103, 259, 356, 23);
				ans2.setText("Effort");
				ans3.setBounds(245, 375, 201, 23);
				ans3.setText("Wheel & Axle and Lever");
				ans4.setBounds(173, 477, 347, 23);
				ans4.setText("2 and 3");
				ans5.setBounds(624, 138, 256, 23);
				ans5.setText("Fulcrum, Effort, Load");
				ans6.setBounds(590, 229, 256, 23);
				ans6.setText("Elevator");
				ans7.setBounds(666, 357, 201, 23);
				ans7.setText("3rd Class Lever");

			}
		});
	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(907, 545);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
