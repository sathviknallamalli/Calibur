package PeriodicTable;

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

public class Lesson2Review extends JFrame {
	private JRadioButton op81;

	public Lesson2Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(346, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(167, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) Identify the period of the element Cobalt");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 251, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("9");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("4");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("27");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel(
				"<html>2.) If the atomic number of Fluorine is 9 and it has a mass of 19, find the missing information");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 410, 37);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Neutrons - 9, Electrons -10");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 226, 159, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Neutrons - 19, Electrons 9");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 254, 159, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Neutrons - 10, Electrons - 9");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 280, 176, 23);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) What does a group define in the periodic table");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 304, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("<html>The number of energy levels of the electrons in the atom");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 330, 301, 25);
		getContentPane().add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) If an element has 4 protons and 5 neutrons, what is the mass number");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 411, 380, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("9");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 443, 159, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("4");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 469, 62, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("5");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(95, 469, 37, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) What group does the element Silver belong to");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 261, 25);
		getContentPane().add(lblSolveThe);

		JLabel lblAStudentSolved = new JLabel("6.) How created the periodic table");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 189, 294, 25);
		getContentPane().add(lblAStudentSolved);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(626, 455, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("Antoine Lavasioer");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(472, 213, 159, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Dmitri Mendeleev");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(472, 239, 159, 23);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("<html>7.) Which element in Period 5 has the least number of electrons");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 293, 317, 36);
		getContentPane().add(lblWhichOf);

		JLabel lblAcoordingTo = new JLabel("8.) How many periods in the periodic table");
		lblAcoordingTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAcoordingTo.setBounds(437, 411, 251, 16);
		getContentPane().add(lblAcoordingTo);

		op81 = new JRadioButton("18");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(447, 434, 301, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("7");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(447, 456, 224, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("118");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(447, 476, 86, 23);
		getContentPane().add(op83);

		JRadioButton op63 = new JRadioButton("Albert Einstein");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(472, 265, 186, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JButton button = new JButton("Periodic Table");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PTable p = new PTable();
				p.newClass();
			}
		});
		button.setFont(new Font("Arial", Font.PLAIN, 14));
		button.setBounds(10, 11, 127, 40);
		getContentPane().add(button);

		JRadioButton op32 = new JRadioButton("<html>Similar chemical properties of the elements in the group");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 356, 301, 25);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("<html>Elements that occur in the same color in their normal phase");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 382, 301, 37);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JRadioButton op51 = new JRadioButton("Actinoids");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(472, 107, 159, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Transition Metals");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(472, 133, 159, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Metals");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(472, 159, 186, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JRadioButton op71 = new JRadioButton("Xenon");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 330, 159, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Strontium");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 356, 159, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Rubidium");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 382, 186, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

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
				if (op41.isSelected()) {
					maxScore++;
				}
				if (op52.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
					maxScore++;
				}
				if (op73.isSelected()) {
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

				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
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

		setSize(781, 545);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
