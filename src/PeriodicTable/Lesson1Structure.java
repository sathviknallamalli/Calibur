package PeriodicTable;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Machines.Audio;
import javax.swing.ImageIcon;

public class Lesson1Structure extends JFrame {
	public Lesson1Structure() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 - Arrangement & Structure");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(285, 11, 453, 42);
		getContentPane().add(title);

		JCheckBox chckbxLesson_4 = new JCheckBox("Lesson 6 - Halogens & Noble Gases");
		chckbxLesson_4.setForeground(Color.RED);
		chckbxLesson_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_4.setEnabled(false);
		chckbxLesson_4.setBounds(11, 244, 230, 23);
		getContentPane().add(chckbxLesson_4);

		JCheckBox chckbxLesson_3 = new JCheckBox("Lesson 5 - Other Families\r\n");
		chckbxLesson_3.setForeground(Color.RED);
		chckbxLesson_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_3.setEnabled(false);
		chckbxLesson_3.setBounds(11, 218, 239, 23);
		getContentPane().add(chckbxLesson_3);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 3 - Alkaline Earth Metals");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(11, 166, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 2 - Alkali Metals ");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(11, 140, 239, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 1 - Arrangement & Structure");
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(11, 114, 230, 23);
		getContentPane().add(chckbxLesson);

		JLabel label_1 = new JLabel("Chapter Progress");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_1.setBounds(25, 64, 112, 16);
		getContentPane().add(label_1);

		JButton btnPeriodictable = new JButton("Periodic Table");
		btnPeriodictable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PTable p = new PTable();
				p.newClass();
			}
		});
		btnPeriodictable.setFont(new Font("Arial", Font.PLAIN, 14));
		btnPeriodictable.setBounds(10, 14, 127, 40);
		getContentPane().add(btnPeriodictable);

		JLabel lblWhoWhatWhen = new JLabel("How to read it");
		lblWhoWhatWhen.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhoWhatWhen.setBounds(256, 57, 127, 32);
		getContentPane().add(lblWhoWhatWhen);

		JLabel lblthisPeriodicTable = new JLabel(
				"<html>Each elemental block consists of the mass number, atomic number, atomic symbol, and element name. There are 118 elements that follow this format. Reading it can help determine the chemical structure of it");
		lblthisPeriodicTable.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisPeriodicTable.setBounds(256, 90, 605, 42);
		getContentPane().add(lblthisPeriodicTable);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\HowToRead.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(390, 66, 132, 23);
		getContentPane().add(button);

		JCheckBox chckbxLesson_5 = new JCheckBox("Lesson 4 - Transition Metals");
		chckbxLesson_5.setForeground(Color.RED);
		chckbxLesson_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_5.setEnabled(false);
		chckbxLesson_5.setBounds(11, 192, 239, 23);
		getContentPane().add(chckbxLesson_5);

		JCheckBox chckbxLesson_6 = new JCheckBox("Lesson 7 - Finish the Puzzle");
		chckbxLesson_6.setForeground(Color.RED);
		chckbxLesson_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_6.setEnabled(false);
		chckbxLesson_6.setBounds(10, 270, 230, 23);
		getContentPane().add(chckbxLesson_6);

		JCheckBox chckbxPreview = new JCheckBox("Preview");
		chckbxPreview.setSelected(true);
		chckbxPreview.setForeground(Color.RED);
		chckbxPreview.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxPreview.setEnabled(false);
		chckbxPreview.setBounds(11, 87, 230, 23);
		getContentPane().add(chckbxPreview);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\element.png"));
		lblNewLabel.setBounds(255, 140, 102, 103);
		getContentPane().add(lblNewLabel);

		JLabel lblMassNumber = new JLabel("Atomic number - 1");
		lblMassNumber.setForeground(Color.BLUE);
		lblMassNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblMassNumber.setBounds(377, 140, 112, 23);
		getContentPane().add(lblMassNumber);

		JLabel lblAtomicSymbol = new JLabel("Atomic symbol - H");
		lblAtomicSymbol.setForeground(Color.BLUE);
		lblAtomicSymbol.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAtomicSymbol.setBounds(377, 166, 112, 23);
		getContentPane().add(lblAtomicSymbol);

		JLabel lblElementName = new JLabel("Element name - Hydrogen");
		lblElementName.setForeground(Color.BLUE);
		lblElementName.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblElementName.setBounds(377, 192, 162, 23);
		getContentPane().add(lblElementName);

		JLabel lblAtomicMass = new JLabel("Atomic mass - 1.008");
		lblAtomicMass.setForeground(Color.BLUE);
		lblAtomicMass.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAtomicMass.setBounds(377, 218, 162, 23);
		getContentPane().add(lblAtomicMass);

		JLabel lblatomicNumberIs = new JLabel("<html>Atomic number is the number of protons & electrons in the atom");
		lblatomicNumberIs.setForeground(Color.RED);
		lblatomicNumberIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblatomicNumberIs.setBounds(509, 140, 352, 23);
		getContentPane().add(lblatomicNumberIs);

		JLabel lblatomicSymbolIs = new JLabel(
				"<html>Atomic symbol is only 1 or 2 letters that can be used in equations");
		lblatomicSymbolIs.setForeground(Color.RED);
		lblatomicSymbolIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblatomicSymbolIs.setBounds(525, 166, 336, 32);
		getContentPane().add(lblatomicSymbolIs);

		JLabel lblelementNameUsually = new JLabel("<html>Element name usually occurs below the atomic symbol");
		lblelementNameUsually.setForeground(Color.RED);
		lblelementNameUsually.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblelementNameUsually.setBounds(525, 205, 336, 23);
		getContentPane().add(lblelementNameUsually);

		JLabel lblatomicMassIs = new JLabel(
				"<html>Atomic mass is a weighted average of all stable isotopes mass number. MASS NUMBER is SUM of PROTONS and NEUTRONS");
		lblatomicMassIs.setForeground(Color.RED);
		lblatomicMassIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblatomicMassIs.setBounds(525, 226, 336, 53);
		getContentPane().add(lblatomicMassIs);

		JLabel lblthisElementIs = new JLabel("<html>This element is found in Period 1, so it has only 1 energy level");
		lblthisElementIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisElementIs.setBounds(256, 244, 196, 53);
		getContentPane().add(lblthisElementIs);

		JLabel lblallElementsIn = new JLabel(
				"<html>All elements in the periodic table are stable and balanced so they have the same number of protons and electrons which can be determined by the mass number or the rounded atomic mass. ");
		lblallElementsIn.setForeground(Color.BLUE);
		lblallElementsIn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblallElementsIn.setBounds(10, 320, 336, 63);
		getContentPane().add(lblallElementsIn);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(377, 360, 261, 23);
		getContentPane().add(label);

		JButton button_1 = new JButton("Lesson Review");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson1Review l = new Lesson1Review();
				l.newClass();
				close();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(646, 354, 215, 36);
		getContentPane().add(button_1);

		JLabel lblwhenGivenThe = new JLabel(
				"<html>When given the atomic number and atomic mass, you can easily find the number of neutrons by subbtracting the two. Because atomic number is protons and mass number is protons + neutrons, you are isolating neutrons");
		lblwhenGivenThe.setForeground(Color.RED);
		lblwhenGivenThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblwhenGivenThe.setBounds(377, 290, 471, 53);
		getContentPane().add(lblwhenGivenThe);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(889, 440);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
