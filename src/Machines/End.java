package Machines;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class End extends JFrame {
	public End() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Welcome to the End - Machines\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(285, 11, 399, 42);
		getContentPane().add(title);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel descrip = new JLabel(
				"<html>You have completed all the lessons in this chapter and before you end this chapter, you will have to take the final test in which you cannot access any of the previous lessons. This is a resource page that will let you go to any of the lesson resources for help. This test will cover all of the topics that you learned here. ");
		descrip.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		descrip.setBounds(265, 64, 679, 52);
		getContentPane().add(descrip);

		JLabel lblAnatomyOfAn = new JLabel("Simple Machines");
		lblAnatomyOfAn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAnatomyOfAn.setBounds(348, 175, 131, 23);
		getContentPane().add(lblAnatomyOfAn);

		JLabel lblPropertiesOfEquations = new JLabel("Work");
		lblPropertiesOfEquations.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPropertiesOfEquations.setBounds(666, 175, 131, 23);
		getContentPane().add(lblPropertiesOfEquations);

		JLabel lblTypesOfNumber = new JLabel("Advantage");
		lblTypesOfNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTypesOfNumber.setBounds(522, 251, 131, 23);
		getContentPane().add(lblTypesOfNumber);

		JLabel lblSolvingEquations = new JLabel("Evaluating Machines");
		lblSolvingEquations.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolvingEquations.setBounds(357, 329, 148, 23);
		getContentPane().add(lblSolvingEquations);

		JLabel lblOrderOfOperations = new JLabel("Energy and Machines");
		lblOrderOfOperations.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblOrderOfOperations.setBounds(692, 329, 131, 23);
		getContentPane().add(lblOrderOfOperations);

		JButton btnFinalTest = new JButton("Final Test");
		btnFinalTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinalTest f = new FinalTest();
				f.newClass();
				close();
			}
		});
		btnFinalTest.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnFinalTest.setBounds(482, 372, 202, 45);
		getContentPane().add(btnFinalTest);

		JCheckBox checkBox = new JCheckBox("Lesson 6 - Practice Problems\r\n");
		checkBox.setSelected(true);
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 207, 215, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Energy & Machines\r\n");
		checkBox_1.setSelected(true);
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 181, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Evaluating Machines");
		checkBox_2.setSelected(true);
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(6, 155, 215, 23);
		getContentPane().add(checkBox_2);

		JCheckBox checkBox_3 = new JCheckBox("Lesson 2 - Work ");
		checkBox_3.setSelected(true);
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(6, 106, 215, 23);
		getContentPane().add(checkBox_3);

		JCheckBox checkBox_4 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
		checkBox_4.setSelected(true);
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_4.setEnabled(false);
		checkBox_4.setBounds(6, 80, 215, 23);
		getContentPane().add(checkBox_4);

		JCheckBox checkBox_5 = new JCheckBox("Lesson 3 - Advantage");
		checkBox_5.setSelected(true);
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(6, 132, 215, 23);
		getContentPane().add(checkBox_5);

		JButton btnLesson = new JButton("Lesson 1");
		btnLesson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson1Copy c = new Lesson1Copy();
				c.newClass();
			}
		});
		btnLesson.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLesson.setBounds(305, 130, 189, 34);
		getContentPane().add(btnLesson);

		JButton btnLesson_1 = new JButton("Lesson 2");
		btnLesson_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson2Copy c = new Lesson2Copy();
				c.newClass();
			}
		});
		btnLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLesson_1.setBounds(604, 130, 189, 34);
		getContentPane().add(btnLesson_1);

		JButton btnLesson_2 = new JButton("Lesson 3");
		btnLesson_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson3Copy c = new Lesson3Copy();
				c.newClass();
			}
		});
		btnLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLesson_2.setBounds(466, 217, 189, 34);
		getContentPane().add(btnLesson_2);

		JButton btnLesson_3 = new JButton("Lesson 4");
		btnLesson_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson4Copy c = new Lesson4Copy();
				c.newClass();
			}
		});
		btnLesson_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLesson_3.setBounds(316, 293, 189, 34);
		getContentPane().add(btnLesson_3);

		JButton btnLesson_4 = new JButton("Lesson 5");
		btnLesson_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson5Copy c = new Lesson5Copy();
				c.newClass();
			}
		});
		btnLesson_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLesson_4.setBounds(666, 293, 189, 34);
		getContentPane().add(btnLesson_4);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(982, 491);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
