package BasicsChemistry;

import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class Lesson2Review extends JFrame {
	private JRadioButton op81;

	public Lesson2Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(345, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(166, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) A type of material made of one type of moleculs is called what?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Element");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Compound");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Mixture");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel("2.) Which of the following is a compound?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Sn");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 176, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("N");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("C6H12O6");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) What description will match that of a mixture");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton(
				"<html>Saltwater is a compound made of chlorine and sodium along with water as an element and they make only one molecule. ");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 284, 49);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton(
				"<html>Salsa is made of tomotatoes and onions which are two elements that make the mixture.");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 359, 260, 31);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton(
				"<html>Sodium is made of chlorine and sodium that create the mixture with two elements.");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 393, 248, 35);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Which of the following are considered as pure substances?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 435, 375, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Compound and Mixture");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 457, 159, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Mixture and Element");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 483, 139, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Compound and Element");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(203, 467, 176, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) Select all the compounds that are listed below?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Saltwater");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(482, 107, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Glucose");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(482, 133, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Baking Soda");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(482, 159, 109, 23);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton("Aluminium");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(482, 183, 109, 23);
		getContentPane().add(op54);

		JLabel lblAStudentSolved = new JLabel("6.) Where can all of the elements in the world be found?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 206, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton(
				"<html>A compound consists of different atoms but a mixture has different molecules");
		op71.setVerticalAlignment(SwingConstants.TOP);
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 307, 348, 31);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton(
				"<html>A compound has only one molecule, but a mixture can have different molecules and atoms");
		op72.setVerticalAlignment(SwingConstants.TOP);
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 341, 315, 31);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton(
				"<html>A mixture can contain different elements but a compound has only one molecule");
		op73.setVerticalAlignment(SwingConstants.TOP);
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 375, 348, 31);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(730, 450, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("Periodic Table");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(482, 234, 159, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Chemical Resistance Chart");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(482, 260, 159, 23);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("7.) How does a compound differ from a mixture in atomic properties?\r\n");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 285, 421, 25);
		getContentPane().add(lblWhichOf);

		JLabel lblAcoordingTo = new JLabel("<html>8.) Determine the elements in this list below\r\n");
		lblAcoordingTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAcoordingTo.setBounds(437, 414, 443, 16);
		getContentPane().add(lblAcoordingTo);

		op81 = new JRadioButton("Aluminium Foil");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(472, 439, 301, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Iron Nail");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(472, 461, 176, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("Oxygen");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(472, 483, 315, 23);
		getContentPane().add(op83);

		JRadioButton op63 = new JRadioButton("Infinite Number of Elements");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(655, 234, 186, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				if (op43.isSelected()) {
					maxScore++;
				}
				if (op52.isSelected() && op53.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op72.isSelected()) {
					maxScore++;
				}
				if (op82.isSelected() && op81.isSelected()) {
					maxScore++;
				}
				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 8");
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

		setSize(906, 549);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
