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

public class Lesson4Review extends JFrame {

	public Lesson4Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 4 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(342, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(163, 50, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) Solve the given equation: 2(x -1) = 4x - 20");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("13\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("15");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("17");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(op3);
		bg.add(op2);
		bg.add(op1);

		JLabel lblWhatIs = new JLabel("2. ) Solve the given equation: 7 = 3x + 1");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("4\r\n");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 176, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("3\r\n");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("2\r\n");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg.add(op22);
		bg.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Solve the given equation: 12x - 30 = 32x + 28");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("3");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 159, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("-58/20");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 133, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("-38/20");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 133, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) What is the standard rule to follow for solving an equation?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 382, 375, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Silver Rule\r\n");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 404, 89, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Equality Rule\r\n");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(135, 404, 98, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Golden Rule");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(244, 404, 176, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) What is the most logical next step in solving this equations: 2x + 3 = 9");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Divide both sides by 3");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(482, 107, 159, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Subbtract 2 from both sides\r\n");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(482, 133, 183, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Add 3 to both sides\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(482, 159, 159, 23);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton("Subbtract 3 from both sides\r\n");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(482, 183, 159, 23);
		getContentPane().add(op54);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op54);
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel("6.) Solve this equation: 9x - 8 = 11x + 12");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 206, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("x=14\r\n");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 307, 301, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("x=-14\r\n");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 333, 315, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("x=16");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 359, 348, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op71);
		bg7.add(op72);
		bg7.add(op73);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(653, 400, 176, 31);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("x = -10\r\n");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(482, 234, 159, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("x=10\r\n");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(482, 260, 159, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op61);
		bg6.add(op62);

		JLabel lblWhichOf = new JLabel("7.) Solve the equation: 3(x + 10) - 2x = 4x - 12");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 285, 421, 25);
		getContentPane().add(lblWhichOf);

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
				if (op23.isSelected()) {
					maxScore++;
				}
				if (op32.isSelected() && op32.isSelected()) {
					maxScore++;
				}
				if (op43.isSelected()) {
					maxScore++;
				}
				if (op54.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op71.isSelected()) {
					maxScore++;
				}
				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 7");
				result.setFont(new Font("Times New Roman", Font.BOLD, 14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);

				JButton next = new JButton("Next Lesson >>>>");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);

				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Lesson5 w = new Lesson5();
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

		setSize(858, 481);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
