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

public class Lesson4Review extends JFrame {

	public Lesson4Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 4 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(334, 11, 199, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(149, 50, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel(
				"<html>1.) Calculate the efficiency of a machine if 20 Joules of work is needed to power it, and only 15 joules is produced\r\n");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 408, 32);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("133.3\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 122, 201, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("75");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 148, 161, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("80");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 174, 139, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhatIs = new JLabel("2.) What will happen to the power of a machine if the time increases");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 204, 368, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Also increase");
		op21.setVerticalAlignment(SwingConstants.TOP);
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 236, 222, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("<html>Decrease");
		op22.setVerticalAlignment(SwingConstants.TOP);
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 262, 212, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("<html> Stay the same\r\n");
		op23.setVerticalAlignment(SwingConstants.TOP);
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 288, 191, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) What will happen to the overall power, if the work increases");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 318, 340, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("Increase\r\n");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 350, 212, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Decrease");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 376, 150, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Need more information");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 402, 161, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Which of the following situations has a greater power\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 432, 308, 25);
		getContentPane().add(lblWhatIs_1);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\opA.PNG"));
		pic.setBounds(10, 466, 178, 77);
		getContentPane().add(pic);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\opB.PNG"));
		p.setBounds(198, 468, 166, 77);
		getContentPane().add(p);

		JLabel pi = new JLabel();
		pi.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\opC.PNG"));
		pi.setBounds(10, 582, 166, 77);
		getContentPane().add(pi);

		JLabel lblSolveThe = new JLabel(
				"<html>5.) Select the statements that are always true about evaulating machines\r\n");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(447, 83, 399, 23);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Efficiency is measured in percentage and Power is in Joules");
		op51.setVerticalAlignment(SwingConstants.TOP);
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(472, 113, 348, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("1 watt = 1Joule/sec");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(472, 139, 261, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Work output = work input");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(472, 165, 191, 23);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton("Efficiency <= 1");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(472, 191, 178, 23);
		getContentPane().add(op54);

		JLabel lblAStudentSolved = new JLabel(
				"<html>6.) Machine A needs 100J to work and can produce 80 Joules. Machine B can do the same job but needs 120J to work and can produce 100Joules. Which machine is more efficient");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(447, 225, 394, 51);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("Efficiency");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 352, 301, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Power");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 378, 315, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Work");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 404, 348, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(656, 630, 178, 49);
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

		JLabel lblWhichOf = new JLabel("<html>7.) Which of the following concepts are a rate?");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(447, 313, 421, 32);
		getContentPane().add(lblWhichOf);

		JRadioButton op41 = new JRadioButton("A");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(10, 550, 35, 25);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("B");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(198, 550, 35, 25);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("C");
		op43.setToolTipText("");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(182, 605, 40, 25);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblWhatIs_2 = new JLabel(
				"<html>8.) Calculate the power. A person can move a box 5 meters with 10Newtons of force in 20secs\r\n\r\n\r\n");
		lblWhatIs_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_2.setBounds(447, 434, 402, 32);
		getContentPane().add(lblWhatIs_2);

		JRadioButton op81 = new JRadioButton("<html>5.2\r\n");
		op81.setVerticalAlignment(SwingConstants.TOP);
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(472, 473, 315, 25);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("2.5");
		op82.setVerticalAlignment(SwingConstants.TOP);
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(472, 501, 315, 25);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("2.5 Watts");
		op83.setVerticalAlignment(SwingConstants.TOP);
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(472, 529, 372, 25);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel lblCalculateThe = new JLabel(
				"<html>9.) Calculate the work output of this machine if it needs 70Joules to power it and its efficiency is 60%\r\n\r\n\r\n");
		lblCalculateThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblCalculateThe.setBounds(444, 561, 402, 32);
		getContentPane().add(lblCalculateThe);

		JRadioButton op91 = new JRadioButton("42");
		op91.setVerticalAlignment(SwingConstants.TOP);
		op91.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op91.setBounds(481, 598, 40, 25);
		getContentPane().add(op91);

		JRadioButton op92 = new JRadioButton("116");
		op92.setVerticalAlignment(SwingConstants.TOP);
		op92.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op92.setBounds(481, 626, 43, 25);
		getContentPane().add(op92);

		JRadioButton op93 = new JRadioButton("120");
		op93.setVerticalAlignment(SwingConstants.TOP);
		op93.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op93.setBounds(481, 654, 57, 25);
		getContentPane().add(op93);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(op93);
		bg9.add(op92);
		bg9.add(op91);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(687, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Machines: Lesson 4 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Machines: Lesson 4 Review");
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
				if (op22.isSelected()) {
					maxScore++;
				}
				if (op31.isSelected()) {
					maxScore++;
				}
				if (op43.isSelected()) {
					maxScore++;
				}
				if (op54.isSelected() && op52.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
					maxScore++;
				}
				if (op72.isSelected()) {
					maxScore++;
				}
				if (op83.isSelected()) {
					maxScore++;
				}
				if (op92.isSelected()) {
					maxScore++;
				}
				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 9");
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
						TACALIBUR.lessonComplete("Machines: Lesson 4 Review", score);
						TACALIBUR.saveProgress("Machines");
						Lesson5 l = new Lesson5();
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

		setSize(876, 725);
		setLocation(300, 50);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
