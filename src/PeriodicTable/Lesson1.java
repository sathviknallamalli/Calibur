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

public class Lesson1 extends JFrame {
	public Lesson1() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 - History\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(426, 11, 217, 42);
		getContentPane().add(title);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lesson2Review l = new Lesson2Review();
				// l.newClass();
				close();
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(635, 364, 215, 36);
		getContentPane().add(button_3);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(611, 337, 256, 16);
		getContentPane().add(label);

		JCheckBox chckbxLesson_5 = new JCheckBox("Lesson 7 - Notable Families\r\n");
		chckbxLesson_5.setForeground(Color.RED);
		chckbxLesson_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_5.setEnabled(false);
		chckbxLesson_5.setBounds(10, 237, 230, 23);
		getContentPane().add(chckbxLesson_5);

		JCheckBox chckbxLesson_4 = new JCheckBox("Lesson 6 - Halogens & Noble Gases");
		chckbxLesson_4.setForeground(Color.RED);
		chckbxLesson_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_4.setEnabled(false);
		chckbxLesson_4.setBounds(10, 211, 230, 23);
		getContentPane().add(chckbxLesson_4);

		JCheckBox chckbxLesson_3 = new JCheckBox("Lesson 5 - Other metals, Metalloids, etc.");
		chckbxLesson_3.setForeground(Color.RED);
		chckbxLesson_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_3.setEnabled(false);
		chckbxLesson_3.setBounds(10, 187, 239, 23);
		getContentPane().add(chckbxLesson_3);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 4 - Transition Metals");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(10, 162, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Alkali Metals & Earth Metals");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(10, 136, 239, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 2 - Arrangement \r\n");
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(10, 110, 230, 23);
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
		
		JCheckBox chckbxLesson_6 = new JCheckBox("Lesson 1 - History!\r\n");
		chckbxLesson_6.setForeground(Color.RED);
		chckbxLesson_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_6.setEnabled(false);
		chckbxLesson_6.setBounds(10, 84, 230, 23);
		getContentPane().add(chckbxLesson_6);
		
		JLabel lblWhoWhatWhen = new JLabel("Who, What, When, Where, Why, AND HOW!?");
		lblWhoWhatWhen.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhoWhatWhen.setBounds(256, 57, 378, 32);
		getContentPane().add(lblWhoWhatWhen);
		
		JLabel lblthisPeriodicTable = new JLabel("<html>This periodic table was developed by a famous Russian Scientist who displayed these elements with such brilliance that it is the epitome of all chemistry conventions developed. This mans name is DMITRI MENDELEEV. He had a rather rough life as a child and was able to prosper through the hard work of his mother. ");
		lblthisPeriodicTable.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisPeriodicTable.setBounds(256, 95, 605, 48);
		getContentPane().add(lblthisPeriodicTable);
		
		JButton button = new JButton("Activate Calibur!");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(644, 65, 132, 23);
		getContentPane().add(button);
		
		JLabel lblDmitriMendeleev = new JLabel("Dmitri Mendeleev\r\n");
		lblDmitriMendeleev.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblDmitriMendeleev.setBounds(256, 153, 378, 32);
		getContentPane().add(lblDmitriMendeleev);

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
