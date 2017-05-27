package BalancingEquations;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class BalancingEquations extends JFrame {

	public BalancingEquations() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Welcome to the Balancing Equations Course");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(105, 11, 573, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"Before beginning the real content of this course, please take a quick preview/quiz about the course");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(112, 49, 556, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What is the smallest part of any type of matter?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 277, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Molecules");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 109, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Particles");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Atoms");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 109, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op1);
		bg1.add(op2);
		bg1.add(op3);

		JLabel lblWhatIs = new JLabel("2.) What categories are used to classify all matter?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 287, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Solids, Liquids, Gases");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 185, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Pure Substances & Mixtures");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 232, 172, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Mass and Weight");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op21);
		bg2.add(op22);
		bg2.add(op23);

		JLabel lblSolveThis = new JLabel("3.) Which of these are elements?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 287, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("H2O");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 109, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("CO2");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 109, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Au");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 109, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op31);
		bg3.add(op32);
		bg3.add(op33);

		JLabel lblWhatIs_1 = new JLabel("4.) What is an element composed of?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 382, 277, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Molecules");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 404, 109, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("One Atom");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 431, 109, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Atoms");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 457, 109, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op41);
		bg4.add(op42);
		bg4.add(op43);

		JLabel lblSolveThe = new JLabel("5.) Which of these are compounds?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(10, 483, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Magnesium");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(32, 502, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("S8");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(32, 528, 109, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Glucose");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(32, 554, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op51);
		bg5.add(op52);
		bg5.add(op53);

		JLabel lblIsThisA = new JLabel("6.) Is blood a homogoneous mixture?");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(403, 83, 350, 25);
		getContentPane().add(lblIsThisA);

		JRadioButton op61 = new JRadioButton("Yes");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(425, 102, 109, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("No");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(425, 130, 109, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op61);
		bg6.add(op62);

		JLabel lblAStudentSolved = new JLabel(
				"<html>7.) What is the measurment to determine the kinetic energy of atoms in matter?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(403, 159, 370, 37);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("Velocity");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(425, 202, 67, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Heat");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(514, 203, 49, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Temperature");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(578, 203, 87, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op71);
		bg7.add(op72);
		bg7.add(op73);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(664, 547, 109, 37);
		getContentPane().add(btnNewButton);

		JLabel lblWhichFormula = new JLabel("<html>8.) Which formula is this used for: (9/5)T + 32?");
		lblWhichFormula.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichFormula.setBounds(404, 234, 370, 25);
		getContentPane().add(lblWhichFormula);

		JRadioButton op81 = new JRadioButton("Faranheit -> Celsius");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(426, 262, 152, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Celsius -> Faranheit");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(426, 288, 138, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("Celsius -> Kelvin");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(426, 314, 109, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op81);
		bg8.add(op82);
		bg8.add(op83);

		JLabel lblWhenWill = new JLabel("<html>9.) When will matter undergo phase change?");
		lblWhenWill.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhenWill.setBounds(403, 340, 370, 25);
		getContentPane().add(lblWhenWill);

		JRadioButton op91 = new JRadioButton("Increse in temperature");
		op91.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op91.setBounds(425, 368, 152, 23);
		getContentPane().add(op91);

		JRadioButton op92 = new JRadioButton("Same temperature");
		op92.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op92.setBounds(425, 394, 138, 23);
		getContentPane().add(op92);

		JRadioButton op93 = new JRadioButton("Added Heat");
		op93.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op93.setBounds(425, 420, 109, 23);
		getContentPane().add(op93);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(op91);
		bg9.add(op92);
		bg9.add(op93);

		JLabel lblWhatAre = new JLabel("<html>10.) What are the phase changes from solid to gas?");
		lblWhatAre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatAre.setBounds(403, 446, 370, 25);
		getContentPane().add(lblWhatAre);

		JRadioButton op101 = new JRadioButton("Freeezing, Sublimation, Deposition\r\n");
		op101.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op101.setBounds(425, 474, 208, 23);
		getContentPane().add(op101);

		JRadioButton op102 = new JRadioButton("Melting, Vaporization, Sublimation");
		op102.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op102.setBounds(425, 500, 218, 23);
		getContentPane().add(op102);

		JRadioButton op103 = new JRadioButton("Melting, Vaporization, Deposiiton\r\n");
		op103.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op103.setBounds(425, 526, 193, 23);
		getContentPane().add(op103);

		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(op101);
		bg10.add(op102);
		bg10.add(op103);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if (op3.isSelected()) {
					maxScore++;
				}
				if (op22.isSelected()) {
					maxScore++;
				}
				if (op33.isSelected()) {
					maxScore++;
				}
				if (op43.isSelected()) {
					maxScore++;
				}
				if (op53.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
					maxScore++;
				}
				if (op73.isSelected()) {
					maxScore++;
				}
				if (op82.isSelected()) {
					maxScore++;
				}
				if (op93.isSelected()) {
					maxScore++;
				}
				if (op103.isSelected()) {
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
