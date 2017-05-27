package Motion;

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

public class Lesson1 extends JFrame {
	public Lesson1() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("LESSON 1 MOTIOTN THING");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(331, 11, 326, 42);
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

		JCheckBox l4 = new JCheckBox("Lesson 5 - Evaluating Machines");
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l4.setEnabled(false);
		l4.setBounds(6, 180, 215, 23);
		getContentPane().add(l4);

		JCheckBox l3 = new JCheckBox("Lesson 4 - Units & Conversions");
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l3.setEnabled(false);
		l3.setBounds(6, 154, 215, 23);
		getContentPane().add(l3);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("What is?");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(598, 64, 76, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>A SIMPLE MACHINE is a machine that accomplishes a task in ONE MOVEMENT, many of the machines we use in our daily life are a combination of simple machines and mkae our life easier to accomplish things. There are several types of machines that are so small, but create a large amount of work and force.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 615, 48);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Continue!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(729, 484, 215, 36);
		getContentPane().add(btnNewButton);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 6 - Energy & Machines\r\n");
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(6, 206, 215, 23);
		getContentPane().add(chckbxLesson);

		JLabel lblTypesOfSimple = new JLabel("Types of Simple Machines\r\n");
		lblTypesOfSimple.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblTypesOfSimple.setBounds(529, 155, 215, 32);
		getContentPane().add(lblTypesOfSimple);

		JLabel lbltakeABicycle = new JLabel(
				"<html>Take a bicycle for example, each of its functions are composed of numerous simple machines, and is thus a COMPLEX MACHINE. Even in the olden days, people combined these simple machines together to make very famous inventions that we use today. Below are a list of the simple machines. \r\n\r\n");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(331, 190, 615, 48);
		getContentPane().add(lbltakeABicycle);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 7 - Practice Problems\r\n");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(6, 234, 215, 23);
		getContentPane().add(chckbxLesson_2);

		JLabel lblwheelAndAxle = new JLabel("<html>Wheel and Axle\r\n");
		lblwheelAndAxle.setForeground(Color.BLUE);
		lblwheelAndAxle.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblwheelAndAxle.setBounds(273, 249, 98, 16);
		getContentPane().add(lblwheelAndAxle);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\wa.png"));
		pic.setBounds(265, 276, 98, 102);
		getContentPane().add(pic);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\pulley.png"));
		p.setBounds(405, 276, 89, 125);
		getContentPane().add(p);

		JLabel pi = new JLabel();
		pi.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\gear.png"));
		pi.setBounds(541, 276, 148, 115);
		getContentPane().add(pi);

		JLabel w = new JLabel();
		w.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\wedge.PNG"));
		w.setBounds(750, 276, 164, 102);
		getContentPane().add(w);

		JLabel l = new JLabel();
		l.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\lever.PNG"));
		l.setBounds(284, 425, 181, 59);
		getContentPane().add(l);

		JLabel r = new JLabel();
		r.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\ramp.PNG"));
		r.setBounds(608, 388, 125, 132);
		getContentPane().add(r);

		JLabel lblRopeAndPulley = new JLabel("Rope and Pulley");
		lblRopeAndPulley.setForeground(Color.BLUE);
		lblRopeAndPulley.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRopeAndPulley.setBounds(415, 249, 105, 16);
		getContentPane().add(lblRopeAndPulley);

		JLabel lblGears = new JLabel("Gears");
		lblGears.setForeground(Color.BLUE);
		lblGears.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGears.setBounds(608, 249, 36, 16);
		getContentPane().add(lblGears);

		JLabel lblWedge = new JLabel("Wedge");
		lblWedge.setForeground(Color.BLUE);
		lblWedge.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWedge.setBounds(817, 249, 42, 16);
		getContentPane().add(lblWedge);

		JLabel lblLever = new JLabel("Lever");
		lblLever.setForeground(Color.BLUE);
		lblLever.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLever.setBounds(353, 398, 42, 16);
		getContentPane().add(lblLever);

		JLabel lblRampo = new JLabel("Ramp");
		lblRampo.setForeground(Color.BLUE);
		lblRampo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRampo.setBounds(556, 435, 42, 16);
		getContentPane().add(lblRampo);

		JLabel lbltheseAreThe = new JLabel(
				"<html>These are the basic parts that exist in everyday machines. These combined together make a complex machine and in the next lesson you will learn how to identify each one and learn more about the speculations. \r\n\r\n");
		lbltheseAreThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lbltheseAreThe.setBounds(21, 295, 215, 189);
		getContentPane().add(lbltheseAreThe);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MachinesL1SM.wav");
				Audio.PlaySound(Clap);

			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(727, 70, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MachinesL1SM2.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(763, 163, 132, 23);
		getContentPane().add(button);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(981, 570);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
