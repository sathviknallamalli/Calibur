package FundamentalsOfAlgebraContents;

import java.awt.*;

import java.awt.event.*;

import java.io.File;

import javax.swing.*;

public class End extends JFrame {
	public End() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Welcome to the End - Fundamentals of Algebra\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(209, 11, 615, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Anatomy of an Equation");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Properties");
		l2.setSelected(true);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JCheckBox l4 = new JCheckBox("Lesson 4 - Solving Equations");
		l4.setSelected(true);
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l4.setEnabled(false);
		l4.setBounds(6, 152, 215, 23);
		getContentPane().add(l4);

		JCheckBox l3 = new JCheckBox("Lesson 3 - Types of Numbers");
		l3.setSelected(true);
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l3.setEnabled(false);
		l3.setBounds(6, 128, 215, 23);
		getContentPane().add(l3);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel descrip = new JLabel(
				"<html>You have completed all the lessons in this chapter and before you end this chapter, you will have to take the final test in which you cannot access any of the previous lessons. This is a resource page that will let you go to any of the lesson resources for help. This test will cover all of the topics that you learned here. ");
		descrip.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		descrip.setBounds(316, 64, 628, 52);
		getContentPane().add(descrip);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setSelected(true);
		checkBox_1.setEnabled(false);
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setBounds(5, 175, 215, 23);
		getContentPane().add(checkBox_1);

		JButton btnNewButton = new JButton("Lesson 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson1Copy l = new Lesson1Copy();
				l.newClass();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(312, 139, 193, 31);
		getContentPane().add(btnNewButton);

		JButton btnLesson = new JButton("Lesson 2 - Properties of Equations\r\n\r\n");
		btnLesson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson2Copy l = new Lesson2Copy();
				l.newClass();
			}
		});
		btnLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLesson.setBounds(598, 139, 267, 31);
		getContentPane().add(btnLesson);

		JButton btnLesson_1 = new JButton("Lesson 3");
		btnLesson_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson3Copy l = new Lesson3Copy();
				l.newClass();
			}
		});
		btnLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLesson_1.setBounds(482, 209, 193, 31);
		getContentPane().add(btnLesson_1);

		JButton btnLesson_2 = new JButton("Lesson 4");
		btnLesson_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson4Copy l = new Lesson4Copy();
				l.newClass();
			}
		});
		btnLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLesson_2.setBounds(312, 287, 193, 31);
		getContentPane().add(btnLesson_2);

		JButton btnLesson_3 = new JButton("Lesson 5\r\n");
		btnLesson_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson5Copy l = new Lesson5Copy();
				l.newClass();
			}
		});
		btnLesson_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnLesson_3.setBounds(642, 287, 193, 31);
		getContentPane().add(btnLesson_3);

		JLabel lblAnatomyOfAn = new JLabel("Anatomy of an Equation\r\n");
		lblAnatomyOfAn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAnatomyOfAn.setBounds(348, 175, 131, 23);
		getContentPane().add(lblAnatomyOfAn);

		JLabel lblPropertiesOfEquations = new JLabel("Properties of Equations");
		lblPropertiesOfEquations.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPropertiesOfEquations.setBounds(666, 175, 131, 23);
		getContentPane().add(lblPropertiesOfEquations);

		JLabel lblTypesOfNumber = new JLabel("Types of Numbers");
		lblTypesOfNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTypesOfNumber.setBounds(522, 251, 131, 23);
		getContentPane().add(lblTypesOfNumber);

		JLabel lblSolvingEquations = new JLabel("Solving Equations\r\n");
		lblSolvingEquations.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolvingEquations.setBounds(357, 329, 103, 23);
		getContentPane().add(lblSolvingEquations);

		JLabel lblOrderOfOperations = new JLabel("Order of Operations\r\n");
		lblOrderOfOperations.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblOrderOfOperations.setBounds(692, 329, 131, 23);
		getContentPane().add(lblOrderOfOperations);

		JButton btnFinalTest = new JButton("Final Test");
		btnFinalTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinalTest ft = new FinalTest();
				ft.newClass();
				close();
			}
		});
		btnFinalTest.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnFinalTest.setBounds(482, 372, 202, 45);
		getContentPane().add(btnFinalTest);

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
