package Machines;

import java.awt.Font;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Machines extends JFrame {

	public Machines() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Physics - Machines Course");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(256, 11, 329, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"Before beginning the real content of this course, please take a quick preview/quiz about the course");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(126, 50, 556, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("!.) What is a machine that can complete the job in one movment");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 342, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Complex Machine\r\n");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 138, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Simple Machine\r\n");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Singular Machine\r\n");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 109, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhatIs = new JLabel(
				"2.) What is the term that states how much the output force is multiplied by input force");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblWhatIs.setBounds(10, 182, 424, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Actual Mechanical Advantage");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 172, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Ideal Mechanical Advantage");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 172, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Mechanical Advantage");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 154, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op21);
		bg2.add(op22);
		bg2.add(op23);

		JLabel lblSolveThis = new JLabel("3.) Which of the following are simple machines, check all that apply");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 370, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("Levers\r\n");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 109, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Bicycle\r\n");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 109, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Ramp\r\n");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 109, 23);
		getContentPane().add(op33);

		JLabel lblWhatIs_1 = new JLabel("4.) How many classes of levers are there?\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 416, 277, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("1");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 443, 109, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("2");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(150, 443, 109, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("3");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(94, 469, 109, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) What is the term that describes the ratio of work output to work input");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(404, 83, 385, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Effeciency\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(425, 107, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Power");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(425, 133, 109, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Energy");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(425, 159, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIsThisA = new JLabel("6.) How can you increase the amount of work done by a machine?");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(481, 182, 350, 25);
		getContentPane().add(lblIsThisA);

		JRadioButton op61 = new JRadioButton("Increase force\r\n");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(524, 206, 109, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Decrease distance");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(524, 234, 130, 23);
		getContentPane().add(op62);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op61);
		bg6.add(op62);

		JLabel lblAStudentSolved = new JLabel(
				"<html>7.) How much power is generated by this machine: The work is 100J and the time it took is 25secs.");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(425, 264, 406, 46);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("25000Watts");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(524, 307, 185, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("4Watts\r\n");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(524, 333, 146, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("240Watts");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(524, 359, 172, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(715, 455, 109, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op34 = new JRadioButton("Gears\r\n");
		op34.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op34.setBounds(31, 385, 109, 23);
		getContentPane().add(op34);

		JRadioButton op35 = new JRadioButton("Screw\r\n");
		op35.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op35.setBounds(150, 307, 109, 23);
		getContentPane().add(op35);

		JRadioButton op36 = new JRadioButton("Wedge\r\n");
		op36.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op36.setBounds(150, 333, 109, 23);
		getContentPane().add(op36);

		JRadioButton op37 = new JRadioButton("Wheelbarrow\r\n");
		op37.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op37.setBounds(150, 359, 109, 23);
		getContentPane().add(op37);

		JRadioButton op38 = new JRadioButton("Seesaw");
		op38.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op38.setBounds(150, 384, 109, 23);
		getContentPane().add(op38);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op31);
		bg3.add(op32);
		bg3.add(op33);
		bg3.add(op34);
		bg3.add(op35);
		bg3.add(op36);
		bg3.add(op37);
		bg3.add(op38);

		JLabel lblWhatAre = new JLabel("<html>8.) What are the units for effeciency?");
		lblWhatAre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatAre.setBounds(425, 389, 406, 16);
		getContentPane().add(lblWhatAre);

		JRadioButton op81 = new JRadioButton("%");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(524, 410, 185, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("J/s");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(524, 436, 185, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("J");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(524, 462, 185, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

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
				if (op21.isSelected()) {
					maxScore++;
				}
				if (op31.isSelected() && op33.isSelected() && op34.isSelected() && op35.isSelected()
						&& op36.isSelected()) {
					maxScore++;
				}
				if (op43.isSelected()) {
					maxScore++;
				}
				if (op51.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op72.isSelected()) {
					maxScore++;
				}
				if (op81.isSelected()) {
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
						Lesson1 l1 = new Lesson1();
						l1.newClass();
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

		setSize(857, 540);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
