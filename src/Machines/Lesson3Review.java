package Machines;

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
import javax.swing.SwingConstants;

import AInterfaces.TACALIBUR;

public class Lesson3Review extends JFrame {

	public Lesson3Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(334, 11, 199, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(149, 50, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) The follwing formula correlates to which type of Advantage: F(out) / F(in)");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 408, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Actual Mechanical Advantage\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 201, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Ideal Mechanical Advantage\r\n");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 161, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Mehcnaical Advantage\r\n");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 139, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhatIs = new JLabel("2.) What is the difference between AMA and IMA?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 323, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("<html> AMA is the ratio of distance and IMA is the ratio of forces ");
		op21.setVerticalAlignment(SwingConstants.TOP);
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 222, 32);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton(
				"<html> AMA applies only to levers and IMA is solely for ramps and other simple machines");
		op22.setVerticalAlignment(SwingConstants.TOP);
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 242, 212, 49);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("<html> AMA accounts for friction and IMA doesnt account for friction");
		op23.setVerticalAlignment(SwingConstants.TOP);
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 294, 191, 33);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Calculate the mechanical advantage in the given situation ");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 337, 340, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("1/3");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(228, 369, 212, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("3");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(228, 395, 150, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("3/5");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(228, 421, 131, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\Question.png"));
		pic.setBounds(31, 373, 191, 77);
		getContentPane().add(pic);

		JLabel lblWhatIs_1 = new JLabel("4.) Which of the following laws distinguishes the 2 types of advantages\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 451, 382, 25);
		getContentPane().add(lblWhatIs_1);

		JLabel lblSolveThe = new JLabel(
				"<html>5.) Calculate the input distance if the IMA is 25 and the output distance is 5 meters\r\n");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(447, 83, 399, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("5 meters\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(472, 117, 261, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("125 Newtons");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(472, 143, 261, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Cannot solve: You need the force\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(472, 169, 191, 23);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton("125 meters");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(472, 195, 178, 23);
		getContentPane().add(op54);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op54);
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel(
				"<html>6.) In which situation is the Actual Mechanical Advantage is greater: A. Box has an output force of 100N and it is lifted with 50N. B. The same Box has an output force of 50N and lifted with 100N");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(447, 225, 394, 51);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("<html> How much the input force is multiplied by output force");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 352, 301, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("<html> How much the output force is multiplied by the input force");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 378, 315, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("The ratio of output force to input force");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 404, 348, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(287, 550, 178, 49);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("A");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(472, 283, 109, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("B");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(598, 283, 109, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op62);
		bg6.add(op61);

		JLabel lblWhichOf = new JLabel("<html>7.) What is Advantage, generacilly?");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(447, 313, 421, 32);
		getContentPane().add(lblWhichOf);

		JRadioButton op41 = new JRadioButton("<html>Law of Conservation of Energy\r\n\r\n");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 476, 199, 25);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("<html>Law of Conservation of Momentum\r\n");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 504, 222, 25);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("<html>Law of Mechanical Energy\r\n");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 532, 222, 25);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblWhatIs_2 = new JLabel("<html>8.) Why are there no units for Advantage\r\n\r\n\r\n");
		lblWhatIs_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_2.setBounds(447, 434, 421, 25);
		getContentPane().add(lblWhatIs_2);

		JRadioButton op81 = new JRadioButton("<html>Because physicists couldnt think of a letter");
		op81.setVerticalAlignment(SwingConstants.TOP);
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(472, 466, 315, 25);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("<html>The units cancel out\r\n");
		op82.setVerticalAlignment(SwingConstants.TOP);
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(472, 494, 315, 25);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("<html> Advantage is used as a description not a measurement\r\n\r\n");
		op83.setVerticalAlignment(SwingConstants.TOP);
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(472, 522, 372, 25);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(699, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Machines: Lesson 3 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Machines: Lesson 3 Review");
		}

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
				if (op42.isSelected()) {
					maxScore++;
				}

				if (op54.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op72.isSelected()) {
					maxScore++;
				}
				if (op82.isSelected()) {
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
				final int score = maxScore;
				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						TACALIBUR.courseComplete("Machines: Lesson 3 Review", score);
						Lesson4 l = new Lesson4();
						l.newClass();
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

		setSize(885, 646);
		setLocation(300, 50);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
