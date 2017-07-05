package PeriodicTable;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class PeriodicTable extends JFrame {

	public PeriodicTable() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Welcome to the Periodic Table of Elements Course");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(75, 11, 633, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"Before beginning the real content of this course, please take a quick preview/quiz about the course");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(112, 49, 556, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What are variations in the atoms nucleus called?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 277, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Ions");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 109, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Isotopes");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Anion");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 109, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op1);
		bg1.add(op2);
		bg1.add(op3);

		JLabel lblWhatIs = new JLabel("2.) What is the electron capacity for the shells in an atom?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 315, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("2,4,8,16");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 185, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("2,8,32");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 232, 172, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("2,8,8,18");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op21);
		bg2.add(op22);
		bg2.add(op23);

		JLabel lblSolveThis = new JLabel(
				"<html>3.) If the mass number is 27 and there are 14 neutrons, what will the atomic number be?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 287, 344, 39);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("41");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 326, 109, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("13");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 352, 109, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("27");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 378, 109, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op31);
		bg3.add(op32);
		bg3.add(op33);

		JLabel lblWhatIs_1 = new JLabel("4.) Determine the element based on a diagram of the model");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 403, 315, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Beryllium");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 432, 109, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Fluorine");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 459, 109, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Oxygen");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 485, 109, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op41);
		bg4.add(op42);
		bg4.add(op43);

		JLabel lblSolveThe = new JLabel("5.) What is the right most column on the periodic table?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(10, 511, 301, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Halogens");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(10, 543, 95, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Noble Gases");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(112, 543, 109, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Lanthanides");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(235, 543, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op51);
		bg5.add(op52);
		bg5.add(op53);

		JLabel lblIsThisA = new JLabel("6.) Why are noble gasses stable?");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(403, 83, 352, 25);
		getContentPane().add(lblIsThisA);

		JRadioButton op61 = new JRadioButton("<html>All of the shells that they contain are complete and filled");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(425, 102, 315, 25);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("<html>There is only one shell in the atom");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(425, 130, 193, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op61);
		bg6.add(op62);

		JLabel lblAStudentSolved = new JLabel("<html>7.) Name the earliest spot where the periodic table breaks");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(403, 192, 370, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("Barium - 56");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(425, 224, 87, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Rubidium - 103");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(514, 224, 109, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Technacium - 43");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(625, 224, 115, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op71);
		bg7.add(op72);
		bg7.add(op73);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(664, 547, 109, 37);
		getContentPane().add(btnNewButton);

		JLabel lblWhichFormula = new JLabel("<html>8.) Who developed the first version of the periodic table?");
		lblWhichFormula.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichFormula.setBounds(403, 254, 370, 25);
		getContentPane().add(lblWhichFormula);

		JRadioButton op81 = new JRadioButton("Albert Einstein");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(425, 279, 152, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Dimitri Mendeleev");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(425, 303, 138, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("James Watson");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(425, 326, 109, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op81);
		bg8.add(op82);
		bg8.add(op83);

		JLabel lblWhenWill = new JLabel("<html>9.) Which of the following elements completes all of its shells");
		lblWhenWill.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhenWill.setBounds(403, 350, 370, 25);
		getContentPane().add(lblWhenWill);

		JRadioButton op91 = new JRadioButton("Neon");
		op91.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op91.setBounds(425, 378, 152, 23);
		getContentPane().add(op91);

		JRadioButton op92 = new JRadioButton("Sodium");
		op92.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op92.setBounds(425, 403, 138, 23);
		getContentPane().add(op92);

		JRadioButton op93 = new JRadioButton("Fluorine");
		op93.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op93.setBounds(425, 429, 109, 23);
		getContentPane().add(op93);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(op91);
		bg9.add(op92);
		bg9.add(op93);

		JLabel lblWhatAre = new JLabel("<html>10.) What are a majority of the elements classified as?");
		lblWhatAre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatAre.setBounds(403, 459, 370, 25);
		getContentPane().add(lblWhatAre);

		JRadioButton op101 = new JRadioButton("Gases");
		op101.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op101.setBounds(425, 487, 208, 23);
		getContentPane().add(op101);

		JRadioButton op102 = new JRadioButton("Metals");
		op102.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op102.setBounds(425, 513, 218, 23);
		getContentPane().add(op102);

		JRadioButton op103 = new JRadioButton("Actinides");
		op103.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op103.setBounds(425, 539, 193, 23);
		getContentPane().add(op103);

		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(op101);
		bg10.add(op102);
		bg10.add(op103);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\model.PNG"));
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label.setBounds(146, 432, 77, 82);
		getContentPane().add(label);

		JRadioButton op63 = new JRadioButton("<html>Since it is a gas there are no electrons and only protons");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(425, 159, 301, 23);
		getContentPane().add(op63);
		bg6.add(op63);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if (op2.isSelected()) {
					maxScore++;
				}
				if (op23.isSelected()) {
					maxScore++;
				}
				if (op32.isSelected()) {
					maxScore++;
				}
				if (op41.isSelected()) {
					maxScore++;
				}
				if (op52.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op71.isSelected()) {
					maxScore++;
				}
				if (op82.isSelected()) {
					maxScore++;
				}
				if (op91.isSelected()) {
					maxScore++;
				}
				if (op102.isSelected()) {
					maxScore++;
				}
				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 10");
				result.setFont(new Font("Times New Roman", Font.BOLD, 14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);

				JButton next = new JButton("Next Lesson >>>>");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);

				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Lesson1 l = new Lesson1();
						l.newClass();
					}
				});

			}
		});
	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(800, 631);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
