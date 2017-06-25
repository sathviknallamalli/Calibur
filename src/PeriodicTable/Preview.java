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

public class Preview extends JFrame {
	public Preview() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Preview");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(443, 11, 103, 42);
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

		JLabel lblWhoWhatWhen = new JLabel("First Organization Method");
		lblWhoWhatWhen.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhoWhatWhen.setBounds(256, 57, 230, 32);
		getContentPane().add(lblWhoWhatWhen);

		JLabel lblthisPeriodicTable = new JLabel(
				"<html>The first method was a SIMPLE TABLE organized by COLUMNS if they were METALS, NONMETALS, GASES, EARTHS. This was developed by ANTOINE LAVASIOER. ");
		lblthisPeriodicTable.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisPeriodicTable.setBounds(256, 95, 605, 42);
		getContentPane().add(lblthisPeriodicTable);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Preview.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(421, 170, 132, 23);
		getContentPane().add(button);

		JLabel lblDmitriMendeleev = new JLabel("Dmitri Mendeleev\r\n");
		lblDmitriMendeleev.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblDmitriMendeleev.setBounds(255, 166, 378, 32);
		getContentPane().add(lblDmitriMendeleev);

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
		chckbxPreview.setForeground(Color.RED);
		chckbxPreview.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxPreview.setEnabled(false);
		chckbxPreview.setBounds(11, 87, 230, 23);
		getContentPane().add(chckbxPreview);

		JLabel lblthisMethodWas = new JLabel(
				"<html>This method was ineffective because more elements were discovered and the table became too crowded.");
		lblthisMethodWas.setForeground(Color.RED);
		lblthisMethodWas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisMethodWas.setBounds(256, 141, 605, 19);
		getContentPane().add(lblthisMethodWas);

		JLabel lblhisTableWas = new JLabel(
				"<html>His table was arranged like a MATRIX of ROWS AND COLUMNS. He arranged them based on similar properties and the atomic mass. Since there were only 63 elements at the time, he neede to leave space for more. SO HE LEFT BLANKS for future scientists to find out. His table was like a puzzle that scientists solved.");
		lblhisTableWas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblhisTableWas.setBounds(256, 196, 605, 56);
		getContentPane().add(lblhisTableWas);

		JLabel lblPeriodicTable = new JLabel("Periodic Table");
		lblPeriodicTable.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblPeriodicTable.setBounds(255, 254, 378, 32);
		getContentPane().add(lblPeriodicTable);

		JLabel lblthisTableBecame = new JLabel(
				"<html>This table became known as the PERIODIC TABLE because it was arranged based on periods too. A chart that organizes elements by their chemical properties and increasing atomic number.");
		lblthisTableBecame.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisTableBecame.setBounds(256, 286, 605, 42);
		getContentPane().add(lblthisTableBecame);

		JButton button_1 = new JButton("Continue!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson1 l = new Lesson1();
				l.newClass();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(642, 331, 215, 36);
		getContentPane().add(button_1);

	}

	public static void music() {

	}

	public void newClass() {

		setSize(886, 414);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
