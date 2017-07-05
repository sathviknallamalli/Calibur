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

public class Lesson2Review extends JFrame {

	public Lesson2Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(335, 11, 199, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(149, 50, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What is the formula to calculate work?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 301, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Force * Mass\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 139, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Force * Distance");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Distance * Mass");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 139, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhatIs = new JLabel("2.) What are the units for work?\r\n");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 323, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Joules\r\n");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 109, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Newtons");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Meter");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Calculate the amount of work done by this object");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 287, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("1000Joules\r\n");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(20, 317, 212, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("100Joules");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(20, 343, 150, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("1000Newtons");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(20, 369, 131, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\example.png"));
		pic.setBounds(171, 309, 222, 107);
		getContentPane().add(pic);

		JLabel lblWhatIs_1 = new JLabel("4.) Select all the situations in which work has been done\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(12, 432, 340, 25);
		getContentPane().add(lblWhatIs_1);

		JLabel lblSolveThe = new JLabel("5.) Which of the following statemments are true about work?\r\n");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(447, 83, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Work depends on mass and distance\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(472, 107, 261, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Work is a vector\r\n");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(472, 133, 261, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Joule = Newton*Meter\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(472, 159, 178, 23);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton("Work = Force/Distance\r\n");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(472, 183, 178, 23);
		getContentPane().add(op54);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op54);
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel(
				"<html>6.) A box was pushed across a slippery table 20 meters down and generated 200 Joules. How much force was applied to the object?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(447, 211, 394, 42);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("6 Meters");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 369, 301, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("60 Meters");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 390, 315, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("6 Newtons");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 414, 348, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(668, 569, 178, 49);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("20 Newtons");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(472, 255, 109, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("20 Meters");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(472, 278, 109, 23);
		getContentPane().add(op62);

		JRadioButton op63 = new JRadioButton("10 Newtons");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(472, 304, 109, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op62);
		bg6.add(op61);
		bg6.add(op63);

		JLabel lblWhichOf = new JLabel(
				"<html>7.) An object has generated 540 Joules of work and a force of 90Newtons was applied. So how far was it pushed?");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(447, 334, 421, 32);
		getContentPane().add(lblWhichOf);

		JRadioButton op41 = new JRadioButton(
				"<html>A box is on top of a persons head and they are applying force to lift it up\r\n");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 456, 199, 49);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton(
				"<html>A box is lying on the ground and a force is being applied on top of it but still staying there not moving at all\r\n");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 508, 222, 52);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton(
				"<html>A person pushed a box across a table while applying a string force by its hand\r\n");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 563, 222, 42);
		getContentPane().add(op43);

		JLabel lblWhatIs_2 = new JLabel("<html>8.) What is work in terms of Physics\r\n\r\n");
		lblWhatIs_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_2.setBounds(447, 444, 421, 25);
		getContentPane().add(lblWhatIs_2);

		JRadioButton op81 = new JRadioButton("<html>Being a hard worker and good student\r\n");
		op81.setVerticalAlignment(SwingConstants.TOP);
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(472, 476, 315, 25);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("<html> A correlation between force and distance\r\n");
		op82.setVerticalAlignment(SwingConstants.TOP);
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(472, 504, 315, 25);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("<html> A correlation between force and mass\r\n");
		op83.setVerticalAlignment(SwingConstants.TOP);
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(472, 532, 372, 25);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(708, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Machines: Lesson 2 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Machines: Lesson 2 Review");
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
				if (op2.isSelected()) {
					maxScore++;
				}
				if (op21.isSelected()) {
					maxScore++;
				}
				if (op31.isSelected()) {
					maxScore++;
				}
				if (op41.isSelected() && op43.isSelected()) {
					maxScore++;
				}

				if (op53.isSelected()) {
					maxScore++;
				}
				if (op63.isSelected()) {
					maxScore++;
				}
				if (op71.isSelected()) {
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
						TACALIBUR.lessonComplete("Machines: Lesson 2 Review", score);
						TACALIBUR.saveProgress("Machines");
						Lesson3 l = new Lesson3();
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

		setSize(893, 674);
		setLocation(300, 50);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
