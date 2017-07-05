package Machines;

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

public class Lesson1Review extends JFrame {

	public Lesson1Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(335, 11, 185, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(149, 50, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What is a combination of simple machines called?\r\n");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 301, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Compund Machine\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 139, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Bicycle");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Complex Machine");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 139, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhatIs = new JLabel("2.) Which of the following are simple machines?\r\n");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 323, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Bicycle");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 109, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Lever");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Gears");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);

		JLabel lblSolveThis = new JLabel("3.) What is the arrangement of a 3rd class lever (L->R)\r\n\r\n\r\n");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 287, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("Effort, Fulcrum, Load\r\n");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(20, 317, 212, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Fulcrum, Load, Efrort");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(20, 343, 150, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Effort, Load, Fulcrum");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(20, 369, 131, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Select all the simple machines that are in a bicycle");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 398, 340, 25);
		getContentPane().add(lblWhatIs_1);

		JLabel lblSolveThe = new JLabel("5.) What is a simple machine?\r\n");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(447, 83, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("A machine that is simple\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(472, 107, 162, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Something that can accomplish in 1 movement\r\n");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(472, 133, 261, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("A lever\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(472, 159, 109, 23);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton("In a compound machine\r\n");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(472, 183, 178, 23);
		getContentPane().add(op54);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op54);
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel(
				"<html>6.) Which simple machine does this description correlate to: A wheel with teeth");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(447, 211, 394, 42);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("Class1");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 329, 301, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Class2");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 355, 315, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Class3");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 381, 348, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(668, 569, 178, 49);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("Wheel and axle");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(472, 255, 109, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Gear");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(472, 281, 109, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op62);
		bg6.add(op61);

		JLabel lblWhichOf = new JLabel("7.) A bottle opener is which tyoe of lever\r\n");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(447, 304, 421, 25);
		getContentPane().add(lblWhichOf);

		JRadioButton op24 = new JRadioButton("Pedal");
		op24.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op24.setBounds(181, 206, 109, 23);
		getContentPane().add(op24);

		JRadioButton op25 = new JRadioButton("Wedge");
		op25.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op25.setBounds(181, 234, 109, 23);
		getContentPane().add(op25);

		JRadioButton op26 = new JRadioButton("Ramp");
		op26.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op26.setBounds(181, 260, 109, 23);
		getContentPane().add(op26);

		JRadioButton op41 = new JRadioButton("Wheel and Axle");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(20, 430, 101, 23);
		getContentPane().add(op41);

		JRadioButton op44 = new JRadioButton("Gears");
		op44.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op44.setBounds(149, 430, 101, 23);
		getContentPane().add(op44);

		JRadioButton op42 = new JRadioButton("Rope and Pulley");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(20, 457, 120, 23);
		getContentPane().add(op42);

		JRadioButton op45 = new JRadioButton("Ramp");
		op45.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op45.setBounds(149, 457, 120, 23);
		getContentPane().add(op45);

		JRadioButton op43 = new JRadioButton("Wedge");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(20, 483, 120, 23);
		getContentPane().add(op43);

		JRadioButton op46 = new JRadioButton("Lever");
		op46.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op46.setBounds(149, 483, 120, 23);
		getContentPane().add(op46);

		JRadioButton op47 = new JRadioButton("Screw");
		op47.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op47.setBounds(77, 509, 120, 23);
		getContentPane().add(op47);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op47);
		bg4.add(op46);
		bg4.add(op45);
		bg4.add(op44);
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblWhatIs_2 = new JLabel(
				"<html>8.) What is the difference between the effort and load force on a lever\r\n");
		lblWhatIs_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_2.setBounds(447, 414, 421, 25);
		getContentPane().add(lblWhatIs_2);

		JRadioButton op81 = new JRadioButton(
				"<html>The effort force is on the left side, and the load force is on the right end of a lever");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(472, 440, 315, 42);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton(
				"<html>The effort force is where the input is and the load is the output force\r\n");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(472, 480, 315, 40);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton(
				"<html>The effort force is the output force on the left hand of a lever and the load is the input force on the right side.");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(472, 520, 372, 42);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(687, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Machines: Lesson 1 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Machines: Lesson 1 Review");
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
				if (op3.isSelected()) {
					maxScore++;
				}
				if (op22.isSelected() && op23.isSelected() && op25.isSelected() && op26.isSelected()) {
					maxScore++;
				}
				if (op32.isSelected()) {
					maxScore++;
				}
				if (op41.isSelected() && op44.isSelected() && op46.isSelected()) {
					maxScore++;
				}

				if (op52.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
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
						TACALIBUR.lessonComplete("Machines: Lesson 1 Review", score);
						TACALIBUR.saveProgress("Machines");
						Lesson2 l = new Lesson2();
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

		setSize(873, 668);
		setLocation(100, 50);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
