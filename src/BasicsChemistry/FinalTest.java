package BasicsChemistry;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import AInterfaces.TACALIBUR;

public class FinalTest extends JFrame {
	static public JTextField textField;

	public FinalTest() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Chemistry - Basics of Chemistry Final Test\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(137, 11, 529, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"<html>This is the final exam covering all of the lessons. You do not have any access to outside resources and once you submit, you will be able to review your score and this test will be screenshotted and saved for you in a folder along with all of your other tests. In order for you to get a Certificate of Achievement on this, you must score at least 80%. BEWARE QUESTION 14 IS WRITTEN RED SO YOU DONT FORGET IT. QUESTION 15 IS WRITTEN IN BLUE SO YOU DONT FORGET.\r\n");
		quizIntro.setFont(new Font("Times New Roman", Font.BOLD, 13));
		quizIntro.setBounds(10, 52, 803, 70);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) If 2 atoms of Hydrogen and 1 atom of oxygen are combined, what is the result?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 201, 442, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Molecule");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 233, 109, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Compound");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 259, 82, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Mixture");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 285, 82, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblSolveThis = new JLabel("3.) What defines matter and is common amongst the entire world?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 440, 361, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton(
				"<html>Matter has 1 atom and its the type of atom that defines the matters' properties and how it functions");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 465, 297, 33);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton(
				"<html>Matter is anything with atoms and can take up space and has a measurable quantity of mass");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 501, 297, 34);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton(
				"<html>Matter must have a fixed atomic structure and cannot change when heat or temperature is added to it");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 538, 297, 33);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Identify all the molecules in these pictures\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 578, 340, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("1");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 610, 36, 25);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("2");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 634, 36, 24);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("3");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(91, 611, 46, 22);
		getContentPane().add(op43);

		JLabel lblSolveThe = new JLabel("5.) Which of the following are pure substances");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(462, 201, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Solutions");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(501, 233, 139, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Mixture");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(501, 259, 139, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Compound");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(501, 285, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIsThisA = new JLabel("6.) Identify all the pure substances ");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(462, 315, 350, 25);
		getContentPane().add(lblIsThisA);

		JLabel lblAStudentSolved = new JLabel("<html>7.) Which of the following is the atomic structure of a mixture?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(463, 429, 350, 29);
		getContentPane().add(lblAStudentSolved);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(1172, 639, 172, 40);
		getContentPane().add(btnNewButton);

		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFullName.setBounds(31, 133, 70, 25);
		getContentPane().add(lblFullName);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 133, 188, 26);
		getContentPane().add(textField);

		JLabel lbltest = new JLabel("-----------------------------Test----------------------------");
		lbltest.setFont(new Font("Castellar", Font.PLAIN, 20));
		lbltest.setBounds(69, 170, 683, 42);
		getContentPane().add(lbltest);

		JRadioButton op61 = new JRadioButton("Salsa");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(490, 346, 82, 25);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Oxygen");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(490, 371, 82, 25);
		getContentPane().add(op62);

		JRadioButton op63 = new JRadioButton("Air");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(490, 397, 70, 25);
		getContentPane().add(op63);

		JRadioButton op71 = new JRadioButton("1");
		op71.setToolTipText("");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(501, 465, 88, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("2");
		op72.setToolTipText("");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(501, 491, 88, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("3");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(501, 517, 109, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JLabel lblWhiciProperty = new JLabel("<html>8.) Which of the following is a homogeneous solution?");
		lblWhiciProperty.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhiciProperty.setBounds(486, 633, 350, 25);
		getContentPane().add(lblWhiciProperty);

		JRadioButton op81 = new JRadioButton("Sand");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(486, 649, 62, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Lemonade");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(549, 649, 85, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("Mud");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(636, 649, 56, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel lblForWhich = new JLabel("9.) What is the difference between heterogeneous and homogeneous\r\n");
		lblForWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblForWhich.setBounds(823, 40, 375, 25);
		getContentPane().add(lblForWhich);

		JRadioButton op91 = new JRadioButton(
				"<html>Heterogeneous is a solution there are more than 2 substances in the solution and mixed in proportions. Homogeneous solutions are mixed in no fixed proportion");
		op91.setVerticalAlignment(SwingConstants.TOP);
		op91.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op91.setBounds(853, 72, 345, 51);
		getContentPane().add(op91);

		JRadioButton op92 = new JRadioButton(
				"<html>Homogeneous is a solution where the components are in a liquid so no one can see them individually, but heterogeneous combine to make a solid");
		op92.setVerticalAlignment(SwingConstants.TOP);
		op92.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op92.setBounds(853, 126, 345, 51);
		getContentPane().add(op92);

		JRadioButton op93 = new JRadioButton(
				"<html>Homogeneous solutions have fixed proportion and heterogeneous have no fixed proportion and can be seperated physically");
		op93.setVerticalAlignment(SwingConstants.TOP);
		op93.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op93.setBounds(864, 183, 334, 51);
		getContentPane().add(op93);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(op93);
		bg9.add(op92);
		bg9.add(op91);

		JLabel lblNegativeNumbers = new JLabel("<html>10.) Which of the following are gomogeneous solutions?");
		lblNegativeNumbers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNegativeNumbers.setBounds(822, 233, 375, 25);
		getContentPane().add(lblNegativeNumbers);

		JRadioButton op101 = new JRadioButton("Solutions");
		op101.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op101.setBounds(864, 259, 192, 23);
		getContentPane().add(op101);

		JRadioButton op102 = new JRadioButton("Colloid");
		op102.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op102.setBounds(864, 286, 192, 23);
		getContentPane().add(op102);

		JRadioButton op103 = new JRadioButton("Suspension");
		op103.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op103.setBounds(864, 312, 176, 23);
		getContentPane().add(op103);

		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(op103);
		bg10.add(op102);
		bg10.add(op101);

		JLabel lblSelectAll = new JLabel("11.) In which phase of matter do the atoms move the fastest?");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(823, 338, 375, 25);
		getContentPane().add(lblSelectAll);

		JRadioButton op111 = new JRadioButton("Solid");
		op111.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op111.setBounds(849, 363, 249, 23);
		getContentPane().add(op111);

		JRadioButton op112 = new JRadioButton("Liquid");
		op112.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op112.setBounds(849, 390, 240, 23);
		getContentPane().add(op112);

		JRadioButton op113 = new JRadioButton("Gas");
		op113.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op113.setBounds(849, 416, 222, 23);
		getContentPane().add(op113);

		ButtonGroup bg11 = new ButtonGroup();
		bg11.add(op113);
		bg11.add(op112);
		bg11.add(op111);

		JLabel lblSolveThis_1 = new JLabel("12.) Select all of the following phases where the shape is not fixed");
		lblSolveThis_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_1.setBounds(822, 440, 350, 25);
		getContentPane().add(lblSolveThis_1);

		JLabel lblSolveThis_2 = new JLabel("13.) What is the order of phase changes from gas to solid");
		lblSolveThis_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_2.setBounds(823, 569, 310, 25);
		getContentPane().add(lblSolveThis_2);

		JRadioButton op131 = new JRadioButton("Melting, Vaporization");
		op131.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op131.setBounds(828, 596, 155, 25);
		getContentPane().add(op131);

		JRadioButton op132 = new JRadioButton("Deposition, Sublimation, Vaprization");
		op132.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op132.setBounds(828, 620, 224, 25);
		getContentPane().add(op132);

		JRadioButton op133 = new JRadioButton("Condensation, Freezing");
		op133.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op133.setBounds(828, 645, 175, 25);
		getContentPane().add(op133);

		ButtonGroup bg13 = new ButtonGroup();
		bg13.add(op133);
		bg13.add(op132);
		bg13.add(op131);

		JLabel lblSolveThis_3 = new JLabel("14.) How can you perform a phase change?");
		lblSolveThis_3.setForeground(Color.RED);
		lblSolveThis_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_3.setBounds(1104, 371, 240, 25);
		getContentPane().add(lblSolveThis_3);

		JRadioButton op141 = new JRadioButton("Added heat\r\n");
		op141.setForeground(Color.RED);
		op141.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op141.setBounds(1104, 398, 88, 23);
		getContentPane().add(op141);

		JRadioButton op142 = new JRadioButton("Added temp.");
		op142.setForeground(Color.RED);
		op142.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op142.setBounds(1194, 398, 88, 23);
		getContentPane().add(op142);

		JRadioButton op143 = new JRadioButton("Added heat and temp.");
		op143.setForeground(Color.RED);
		op143.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op143.setBounds(1194, 420, 133, 23);
		getContentPane().add(op143);

		ButtonGroup bg14 = new ButtonGroup();
		bg14.add(op143);
		bg14.add(op142);
		bg14.add(op141);

		JLabel lblcheckAnswersBefore = new JLabel("<html>CHECK ANSWERS BEFORE SUBMITTING\r\n");
		lblcheckAnswersBefore.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblcheckAnswersBefore.setBounds(1172, 599, 172, 29);
		getContentPane().add(lblcheckAnswersBefore);

		JLabel lblWhichOf = new JLabel("<html>15.) Convert 60F to Kelvin");
		lblWhichOf.setForeground(Color.BLUE);
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(1142, 473, 155, 22);
		getContentPane().add(lblWhichOf);

		JRadioButton op151 = new JRadioButton("15.5");
		op151.setForeground(Color.BLUE);
		op151.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op151.setBounds(1169, 496, 73, 23);
		getContentPane().add(op151);

		JRadioButton op152 = new JRadioButton("288.7");
		op152.setForeground(Color.BLUE);
		op152.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op152.setBounds(1169, 522, 70, 23);
		getContentPane().add(op152);

		JRadioButton op153 = new JRadioButton("-351.67");
		op153.setForeground(Color.BLUE);
		op153.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op153.setBounds(1169, 548, 139, 23);
		getContentPane().add(op153);

		ButtonGroup bg15 = new ButtonGroup();
		bg15.add(op153);
		bg15.add(op152);
		bg15.add(op151);

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\qued.png"));
		label.setBounds(145, 334, 109, 95);
		getContentPane().add(label);

		JRadioButton op23 = new JRadioButton("2,5,3");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 389, 176, 23);
		getContentPane().add(op23);

		JRadioButton op22 = new JRadioButton("2,4");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 363, 109, 23);
		getContentPane().add(op22);

		JRadioButton op21 = new JRadioButton("1,5");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 335, 109, 23);
		getContentPane().add(op21);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op21);
		bg2.add(op22);
		bg2.add(op23);

		JLabel label_1 = new JLabel("2.) Identify the atoms in this diagram");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(10, 311, 200, 25);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel();
		label_2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\mol1.PNG"));
		label_2.setBounds(143, 606, 74, 66);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel();
		label_3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\a1.PNG"));
		label_3.setBounds(227, 611, 36, 42);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel();
		label_4.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\a2.PNG"));
		label_4.setBounds(273, 614, 82, 39);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel();
		label_5.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\a3.PNG"));
		label_5.setBounds(365, 606, 70, 66);
		getContentPane().add(label_5);

		JRadioButton op44 = new JRadioButton("4");
		op44.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op44.setBounds(91, 634, 36, 24);
		getContentPane().add(op44);

		JRadioButton op64 = new JRadioButton("Aluminum Foil");
		op64.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op64.setBounds(595, 347, 133, 25);
		getContentPane().add(op64);

		JRadioButton op65 = new JRadioButton("Blood");
		op65.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op65.setBounds(595, 372, 82, 25);
		getContentPane().add(op65);

		JRadioButton op66 = new JRadioButton("Metal");
		op66.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op66.setBounds(595, 398, 70, 25);
		getContentPane().add(op66);

		JLabel label_6 = new JLabel();
		label_6.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\b1.PNG"));
		label_6.setBounds(616, 469, 88, 66);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel();
		label_7.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\b2.PNG"));
		label_7.setBounds(501, 547, 124, 66);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel();
		label_8.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\b3.PNG"));
		label_8.setBounds(666, 543, 146, 70);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel("1");
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_9.setBounds(714, 462, 23, 29);
		getContentPane().add(label_9);

		JLabel label_10 = new JLabel("2");
		label_10.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_10.setBounds(489, 556, 23, 29);
		getContentPane().add(label_10);

		JLabel label_11 = new JLabel("3");
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_11.setBounds(746, 514, 23, 29);
		getContentPane().add(label_11);

		JRadioButton op121 = new JRadioButton("Solid");
		op121.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op121.setBounds(849, 465, 249, 23);
		getContentPane().add(op121);

		JRadioButton op122 = new JRadioButton("Liquid");
		op122.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op122.setBounds(849, 492, 240, 23);
		getContentPane().add(op122);

		JRadioButton op123 = new JRadioButton("Gas");
		op123.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op123.setBounds(849, 518, 222, 23);
		getContentPane().add(op123);

		JRadioButton op124 = new JRadioButton("Plasma");
		op124.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op124.setBounds(849, 543, 222, 23);
		getContentPane().add(op124);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if (op1.isSelected()) {
					maxScore++;
				}
				if (op22.isSelected()) {
					maxScore++;
				}
				if (op32.isSelected()) {
					maxScore++;
				}
				if (op41.isSelected()) {
					maxScore++;
				}
				if (op53.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected() && op64.isSelected()) {
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
				if (op101.isSelected()) {
					maxScore++;
				}
				if (op113.isSelected()) {
					maxScore++;
				}
				if (op122.isSelected() && op123.isSelected() && op124.isSelected()) {
					maxScore++;
				}
				if (op133.isSelected()) {
					maxScore++;
				}
				if (op141.isSelected()) {
					maxScore++;
				}
				if (op151.isSelected()) {
					maxScore++;
				}
				frame.getContentPane().setLayout(null);

				final int ms = maxScore;
				JLabel result = new JLabel("You scored " + maxScore + " out of 15");
				result.setFont(new Font("Times New Roman", Font.BOLD, 14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);

				JButton next = new JButton("Continue");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);

				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (ms >= 12) {
							TACALIBUR.courseComplete("Chemistry- Basics of Chemistry");
							Dup w = new Dup();
							w.newClass();
							close();

						} else {
							JOptionPane.showMessageDialog(null,
									"Sorry, but you failed, no certificate for you. You can redo this course and try to get the achievement certificate. ");
						}

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

		setSize(1378, 729);
		setLocation(0, 0);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
