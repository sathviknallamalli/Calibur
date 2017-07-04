package BasicsChemistry;

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
import javax.swing.SwingConstants;

import AInterfaces.TACALIBUR;

public class Lesson6Review extends JFrame {

	public Lesson6Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 6 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(297, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(118, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What are the boiling and freezing points of a Kelvin Scale?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("0K and 100K\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("32K and 212K");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("273K and 373K");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 211, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel("2.) Determine which temperature is the lowest?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("10K");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 248, 25);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("72F");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 301, 25);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("37C");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 262, 301, 25);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("<html>3.) Convert 89F to Kelvin");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 294, 384, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("304K");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 325, 61, 25);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("31K");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 353, 61, 25);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("36K");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 381, 61, 25);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Which temperature scale is the smallest, interval");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(11, 413, 321, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Celsius");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 445, 69, 25);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Farenheit");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(105, 445, 71, 25);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Kelvin");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(183, 445, 242, 25);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("<html>5.) Convert 50 Celsius to Farenheit");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 260, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("323.15F");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(458, 107, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("10F");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(458, 133, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("122F");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(458, 159, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel("6.) What is absolute zero?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 192, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("9/5x + 32");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(458, 371, 348, 25);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("5/9(x-32)");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(458, 399, 335, 25);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("x+273");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(458, 427, 88, 25);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(628, 433, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton(
				"<html>The temperature at 0Celsius and is the lowest possible temperature an object can get");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(458, 218, 307, 37);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton(
				"<html>It is when molecules are motionless and it occurs at 0 Kelvin and nothing can be lower than that");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(458, 258, 289, 31);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("7.) What formula is used to convert from celsius to faranheit");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 339, 360, 25);
		getContentPane().add(lblWhichOf);

		JRadioButton op63 = new JRadioButton(
				"<html>The lowest temperature on the positive scale and the higest on the negative scale of temperatures");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(458, 295, 295, 37);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(594, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Basics of Chemistry: Lesson 6 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Basics of Chemistry: Lesson 6 Review");
		}

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
				if (op21.isSelected()) {
					maxScore++;
				}
				if (op31.isSelected()) {
					maxScore++;
				}
				if (op42.isSelected()) {
					maxScore++;
				}
				if (op53.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
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
				final int score = maxScore;
				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						TACALIBUR.courseComplete("Basics of Chemistry: Lesson 6 Review", score);
						End e = new End();
						e.newClass();
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

		setSize(783, 520);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
