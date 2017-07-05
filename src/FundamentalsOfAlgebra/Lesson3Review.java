package FundamentalsOfAlgebra;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import AInterfaces.TACALIBUR;

public class Lesson3Review extends JFrame {

	public Lesson3Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(274, 11, 200, 30);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(105, 50, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) Which of the following are irrational numbers?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("\u03C0");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("e\r\n");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("i\r\n");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);

		JLabel lblWhatIs = new JLabel("2.) Integers come under which category?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Whole numbers\r\n");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 176, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Rational numbers\r\n");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Natural Numbers\r\n");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op21);
		bg2.add(op22);
		bg2.add(op23);

		JLabel lblSolveThis = new JLabel("3.) \"i\" is which type of number?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("Real Numbers\r\n");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 109, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Irrational Numbers\r\n");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(140, 307, 122, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Imaginary Numbers\r\n");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(264, 307, 133, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op31);
		bg3.add(op32);
		bg3.add(op33);

		JLabel lblWhatIs_1 = new JLabel(
				"<html>4.) Which type of number would fit this scenario: How many pairs of pants do I have?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(359, 85, 375, 35);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Natural Numbers\r\n");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(384, 127, 192, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Integers\r\n");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(384, 153, 176, 23);
		getContentPane().add(op42);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) A decimal is which type of number?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(359, 182, 404, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Integer\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(384, 206, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Rational ");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(384, 234, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Natural\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(384, 260, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op51);
		bg5.add(op52);
		bg5.add(op53);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(643, 300, 109, 37);
		getContentPane().add(btnNewButton);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(593, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Fundamentals of Algebra: Lesson 3 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Fundamentals of Algebra: Lesson 3 Review");
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if (op1.isSelected() && op2.isSelected()) {
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
				if (op52.isSelected()) {
					maxScore++;
				}

				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 5");
				result.setFont(new Font("Times New Roman", Font.BOLD, 14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);

				JButton next = new JButton("Next Lesson >>>>");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);
				final int score = maxScore;
				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						TACALIBUR.lessonComplete("Fundamentals of Algebra: Lesson 3 Review", score);
						TACALIBUR.saveProgress("Fundamentals of Algebra");
						Lesson4 w = new Lesson4();
						w.newClass();
						close();
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

		setSize(779, 383);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
