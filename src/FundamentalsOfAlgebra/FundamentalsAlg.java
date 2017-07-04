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

public class FundamentalsAlg extends JFrame {

	public FundamentalsAlg() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Welcome to the Fundamentals of Algebra Course");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(77, 11, 628, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"Before beginning the real content of this course, please take a quick preview/quiz about the course");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(112, 49, 556, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What are letter represented in equations called?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 277, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Constants");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 109, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Co-effecient");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Variable");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 109, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op1);
		bg1.add(op2);
		bg1.add(op3);

		JLabel lblWhatIs = new JLabel("2.) What is the value of x in this equation: 2x-18 = 20?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 287, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("9");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 109, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("19");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("20");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op21);
		bg2.add(op22);
		bg2.add(op23);

		JLabel lblSolveThis = new JLabel("3.) Solve this equation if x=5 and y=3: 2x+3y=20?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 287, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("1");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 109, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("-5");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 109, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("-1");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 109, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op31);
		bg3.add(op32);
		bg3.add(op33);

		JLabel lblWhatIs_1 = new JLabel("4.) What is the Division Identity if the number is a");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 382, 277, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("a/1");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 404, 109, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("1/a");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 431, 109, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("a");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 457, 109, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op41);
		bg4.add(op42);
		bg4.add(op43);

		JLabel lblSolveThe = new JLabel("5.) Solve the given equation, what is the value of x: 3(x-16) = 48?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(403, 88, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("32");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(425, 107, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("96");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(425, 133, 109, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("14");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(425, 159, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op51);
		bg5.add(op52);
		bg5.add(op53);

		JLabel lblIsThisA = new JLabel("6.) Is this a true statement or not (a+b) +c = a + (b+c)?");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(403, 187, 350, 25);
		getContentPane().add(lblIsThisA);

		JRadioButton op61 = new JRadioButton("Yes");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(425, 206, 109, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("No");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(425, 234, 109, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op61);
		bg6.add(op62);

		JLabel lblAStudentSolved = new JLabel(
				"<html>7.) A student solved this equation using this property, what property should have the student used in step 2");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(403, 264, 370, 46);
		getContentPane().add(lblAStudentSolved);
		// 3x + 5 = 14 Division Property of Equality
		JLabel lblNewLabel = new JLabel("2(3x + 5) = 28   Original");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(440, 306, 193, 24);
		getContentPane().add(lblNewLabel);

		JLabel lblxDivisionProperty = new JLabel("3x+5=14           Division Property of Equality");
		lblxDivisionProperty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblxDivisionProperty.setBounds(440, 335, 265, 16);
		getContentPane().add(lblxDivisionProperty);

		JLabel lblxSubtractionProperty = new JLabel("3x=19               Addition Property of Equality");
		lblxSubtractionProperty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblxSubtractionProperty.setBounds(440, 359, 287, 16);
		getContentPane().add(lblxSubtractionProperty);

		JLabel lblXDivisionProperty = new JLabel("x=19/3              Division Property of Equality");
		lblXDivisionProperty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblXDivisionProperty.setBounds(440, 382, 287, 16);
		getContentPane().add(lblXDivisionProperty);

		JLabel label = new JLabel("1.)");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(413, 331, 21, 25);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("2.)");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(413, 357, 21, 25);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("3.)");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(413, 382, 21, 25);
		getContentPane().add(label_2);

		JRadioButton op71 = new JRadioButton("Subtraction Property of Equality");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(425, 417, 185, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Additive Identitiy");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(425, 443, 146, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Multiplucation Identity");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(425, 469, 172, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op71);
		bg7.add(op72);
		bg7.add(op73);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(664, 450, 109, 37);
		getContentPane().add(btnNewButton);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(614, 8, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Pre-test: Fundamentals of Algebra");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Pre-test: Fundamentals of Algebra");
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 7;
				if (!op3.isSelected()) {
					maxScore--;
				}
				if (!op22.isSelected()) {
					maxScore--;
				}
				if (!op33.isSelected()) {
					maxScore--;
				}
				if (!op41.isSelected()) {
					maxScore--;
				}
				if (!op51.isSelected()) {
					maxScore--;
				}
				if (!op61.isSelected()) {
					maxScore--;
				}
				if (!op71.isSelected()) {
					maxScore--;

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
				final int score = maxScore;
				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						TACALIBUR.lessonComplete("Pre-test: Fundamentals of Algebra", score);
						TACALIBUR.saveProgress("Fundamentals of Algebra");
						Lesson1 w = new Lesson1();
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

		setSize(800, 540);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

}
