package BasicsChemistry;

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

public class Lesson3More extends JFrame {
	public Lesson3More() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 - More Solutions");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(439, 11, 321, 42);
		getContentPane().add(title);

		JLabel ae = new JLabel("Solutions");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 82, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>A solution is classified as a homogeneous mixture and it is composed of particles called solvent. As different things are dissolved into the substance, they become the solute of the materal. Numerous chemical reactions are carried out using these solutions, however they are homogeneous.");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 833, 51);
		getContentPane().add(lblinOrderFor);

		JLabel label = new JLabel("Solutions");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(329, 189, 62, 23);
		getContentPane().add(label);

		JLabel lblRubbingAlchohol = new JLabel(
				"<html>Exact Definition: A solution is a type of homogeneous mixture that is made up of two or more substances");
		lblRubbingAlchohol.setForeground(Color.BLACK);
		lblRubbingAlchohol.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblRubbingAlchohol.setBounds(329, 162, 607, 23);
		getContentPane().add(lblRubbingAlchohol);

		JLabel lblRubbingAlchohol_1 = new JLabel("Rubbing Alchohol");
		lblRubbingAlchohol_1.setForeground(Color.BLUE);
		lblRubbingAlchohol_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRubbingAlchohol_1.setBounds(329, 214, 112, 23);
		getContentPane().add(lblRubbingAlchohol_1);

		JLabel lblSaltWater = new JLabel("Salt Water");
		lblSaltWater.setForeground(Color.BLUE);
		lblSaltWater.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSaltWater.setBounds(464, 214, 112, 23);
		getContentPane().add(lblSaltWater);

		JLabel lblColloids = new JLabel("Colloids");
		lblColloids.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblColloids.setBounds(21, 243, 82, 32);
		getContentPane().add(lblColloids);

		JLabel lbltheseAreAlso = new JLabel(
				"<html>These are also known as colloidal dispersions because the substances remain dispersed and do not settle to the bottom of the container. In colloids, one substance is evenly dispersed in another. The substance being dispersed is referred to as being in the dispersed phase, while the substance in which it is dispersed is in the continuous phase.");
		lbltheseAreAlso.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheseAreAlso.setBounds(21, 279, 678, 51);
		getContentPane().add(lbltheseAreAlso);

		JLabel lblColloids_1 = new JLabel("Colloids");
		lblColloids_1.setForeground(Color.RED);
		lblColloids_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblColloids_1.setBounds(21, 335, 62, 23);
		getContentPane().add(lblColloids_1);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\cols.png"));
		pt.setBounds(297, 333, 523, 115);
		getContentPane().add(pt);

		JLabel lblJelly = new JLabel("Jelly");
		lblJelly.setForeground(Color.BLUE);
		lblJelly.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblJelly.setBounds(21, 360, 112, 23);
		getContentPane().add(lblJelly);

		JLabel lblSaltWater_1 = new JLabel("Muddy Water");
		lblSaltWater_1.setForeground(Color.BLUE);
		lblSaltWater_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSaltWater_1.setBounds(87, 360, 112, 23);
		getContentPane().add(lblSaltWater_1);

		JLabel lbltheseAreThe = new JLabel(
				"<html>These are the classifications of colloids that differ based on the phase changes they are currently in, you will learn more about these changes in the next lesson");
		lbltheseAreThe.setForeground(Color.RED);
		lbltheseAreThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheseAreThe.setBounds(830, 292, 112, 156);
		getContentPane().add(lbltheseAreThe);

		JLabel lblSuspensions = new JLabel("Suspensions");
		lblSuspensions.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblSuspensions.setBounds(709, 203, 112, 32);
		getContentPane().add(lblSuspensions);

		JLabel lblaSuspensionIs = new JLabel(
				"<html>A suspension is a heterogeneous mixture in which solute-like particles settle out of a solvent-like phase some time after their introduction. ");
		lblaSuspensionIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaSuspensionIs.setBounds(709, 239, 453, 42);
		getContentPane().add(lblaSuspensionIs);

		JLabel lblinTheseSolutions = new JLabel(
				"<html>In these solutions occur when the solutes will rise to the top and suspend and rise.");
		lblinTheseSolutions.setForeground(Color.RED);
		lblinTheseSolutions.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinTheseSolutions.setBounds(21, 385, 280, 57);
		getContentPane().add(lblinTheseSolutions);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Solution.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(428, 72, 132, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Suspension.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(823, 211, 132, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Colloid.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(102, 249, 132, 23);
		getContentPane().add(button_2);

		JLabel label_1 = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_1.setBounds(952, 371, 208, 41);
		getContentPane().add(label_1);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson3Review l = new Lesson3Review();
				l.newClass();
				close();
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(947, 412, 215, 36);
		getContentPane().add(button_3);
		
		JCheckBox checkBox = new JCheckBox("Lesson 6 - Temperature Conversions\r\n");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 210, 230, 23);
		getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Phase Changes");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 184, 215, 23);
		getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(6, 160, 230, 23);
		getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		checkBox_3.setSelected(true);
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(6, 135, 230, 23);
		getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Lesson 2 - Classifying Matter");
		checkBox_4.setSelected(true);
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_4.setEnabled(false);
		checkBox_4.setBounds(6, 109, 215, 23);
		getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Lesson 1 - Structure");
		checkBox_5.setSelected(true);
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(6, 83, 215, 23);
		getContentPane().add(checkBox_5);
		
		JLabel label_2 = new JLabel("Chapter Progress");
		label_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_2.setBounds(21, 64, 112, 16);
		getContentPane().add(label_2);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(1116, 615);
		setLocation(300, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
