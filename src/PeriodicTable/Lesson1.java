package PeriodicTable;

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

import Machines.Audio;

public class Lesson1 extends JFrame {
	public Lesson1() {
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

		JLabel lblWhoWhatWhen = new JLabel("Arrangement");
		lblWhoWhatWhen.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhoWhatWhen.setBounds(256, 57, 112, 32);
		getContentPane().add(lblWhoWhatWhen);

		JLabel lblthisPeriodicTable = new JLabel(
				"<html>The periodic table consists of 7 rows and 18 columns. New elements will continously be added to the table based on the propertues. A ROW IS CALLED A PERIOD and a COLUMN is called a GROUP. They are arranged by similar CHEMICAL PROPERTIES");
		lblthisPeriodicTable.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisPeriodicTable.setBounds(256, 90, 605, 58);
		getContentPane().add(lblthisPeriodicTable);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Arrangement.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(378, 66, 132, 23);
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

		JButton button_1 = new JButton("Continue!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson1Structure l = new Lesson1Structure();
				l.newClass();
				close();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(646, 441, 215, 36);
		getContentPane().add(button_1);

		JLabel lblPeriod = new JLabel("Period");
		lblPeriod.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblPeriod.setBounds(256, 150, 65, 32);
		getContentPane().add(lblPeriod);

		JLabel lblaPeriodIndicates = new JLabel(
				"<html>A period indicates the number of ENERGY LEVELS in the atom. So if an element is in the 5th period, that means it contains 5 shells");
		lblaPeriodIndicates.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaPeriodIndicates.setBounds(256, 183, 254, 58);
		getContentPane().add(lblaPeriodIndicates);

		JLabel lblGroup = new JLabel("Group");
		lblGroup.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblGroup.setBounds(520, 158, 65, 32);
		getContentPane().add(lblGroup);

		JLabel lblaGroupRepresents = new JLabel(
				"<html>A group represents a FAMILY of elements. A group contains elements that have similar chemical properties such as their metal classification and reactivity. ");
		lblaGroupRepresents.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaGroupRepresents.setBounds(520, 190, 297, 51);
		getContentPane().add(lblaGroupRepresents);

		JLabel lblsoAsYou = new JLabel(
				"<html>So as you move to the right, the number of electrons increase. The family will also begin to change based on column. ");
		lblsoAsYou.setForeground(Color.RED);
		lblsoAsYou.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsoAsYou.setBounds(256, 244, 604, 40);
		getContentPane().add(lblsoAsYou);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\period.PNG"));
		lblNewLabel.setBounds(256, 285, 283, 131);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\group.PNG"));
		label.setBounds(577, 274, 254, 154);
		getContentPane().add(label);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(888, 527);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
