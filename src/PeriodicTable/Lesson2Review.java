package PeriodicTable;

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

public class Lesson2Review extends JFrame {

	public Lesson2Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(279, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(100, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) All of the following are Alkali metals EXCEPT");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 261, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Lithium");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 72, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Beryillium");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 86, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Francium");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 80, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel("<html>2.) Which bohr model represents that of an alkali metal?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 393, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton();
		op21.setText("Option 1");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 211, 72, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Option 2");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 239, 80, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Option 3");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 265, 72, 23);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Which description matches that of alkali metals");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 304, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton(
				"<html>It is a low reactive material that is highly durable and has high density making it difficult to cut through and break");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 330, 317, 37);
		getContentPane().add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Where are the alkali elements located on the periodic table");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(424, 83, 330, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Left most");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(447, 107, 159, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Middle row");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(447, 133, 86, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Right most");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(447, 159, 99, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel(
				"<html>5.) What element is in the same column as the alkali metals, but not part of the group?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(424, 183, 330, 37);
		getContentPane().add(lblSolveThe);

		JLabel lblAStudentSolved = new JLabel("6.) What is the classification of alkali metals?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(424, 298, 294, 25);
		getContentPane().add(lblAStudentSolved);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(626, 455, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("Nonmetals");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(447, 319, 159, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Metals");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(447, 345, 159, 23);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("<html>7.) What is the suffix of all alkali metals?");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(414, 396, 342, 25);
		getContentPane().add(lblWhichOf);

		JRadioButton op63 = new JRadioButton("Metalloids");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(447, 371, 186, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JRadioButton op32 = new JRadioButton(
				"<html>A soft metal that has low reactivity and when mixed with other chemicals only changes color but not create a compound");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 370, 301, 51);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton(
				"<html>Soft metals that have high reactivity making explosions when mixed with other elements");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 420, 301, 37);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JRadioButton op51 = new JRadioButton("Hydrogen");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(445, 220, 159, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Rubidium");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(445, 246, 159, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Boron");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(445, 272, 186, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JRadioButton op71 = new JRadioButton("'GEN'");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(447, 420, 159, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("'IUM'");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(447, 446, 159, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("'INE'");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(447, 472, 186, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JRadioButton op4 = new JRadioButton("Cesium");
		op4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op4.setBounds(124, 107, 224, 23);
		getContentPane().add(op4);

		JRadioButton op5 = new JRadioButton("Potassium");
		op5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op5.setBounds(124, 133, 224, 23);
		getContentPane().add(op5);

		JRadioButton op6 = new JRadioButton("Sodium");
		op6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op6.setBounds(124, 159, 224, 23);
		getContentPane().add(op6);

		b.add(op6);
		b.add(op5);
		b.add(op4);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\less.PNG"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(109, 209, 91, 84);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\full.PNG"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setBounds(210, 211, 72, 84);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\extra.PNG"));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setBounds(292, 211, 98, 84);
		getContentPane().add(label_1);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				close();
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
				if (op33.isSelected()) {
					maxScore++;
				}
				if (op41.isSelected()) {
					maxScore++;
				}
				if (op51.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
					maxScore++;
				}
				if (op72.isSelected()) {
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

		setSize(782, 544);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
