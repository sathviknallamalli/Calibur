package BasicsChemistry;

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
import javax.swing.JTextField;

import AInterfaces.TACALIBUR;

public class Lesson1Review extends JFrame {
	private JRadioButton op81;
	private JTextField enter;

	public Lesson1Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(301, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(122, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What is the smallest part of any matter?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Molecule");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Atom");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Nucleus");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel("2.) Identify the atoms in this diagram");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 200, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("2,4");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 109, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("1,5");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JLabel p3 = new JLabel();
		p3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\qued.png"));
		p3.setBounds(178, 206, 154, 77);
		getContentPane().add(p3);

		JRadioButton op23 = new JRadioButton("2,5,3");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Which of the following are molecules?\r\n");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("Hydrogen");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 80, 25);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("H2O");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 335, 89, 16);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("CO2");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 115, 13);
		getContentPane().add(op33);

		JLabel lblWhatIs_1 = new JLabel("4.) What is an atom made up of?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 411, 375, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Electron,Proton,Neutron");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 443, 159, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Ions");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 469, 62, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Nucleas,Protons,Electrons");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(133, 469, 176, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) What is a combination of atoms and molecules called?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 25);
		getContentPane().add(lblSolveThe);

		JLabel lblAStudentSolved = new JLabel("6.) What category do atoms and molecules fall under?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 141, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("Infinite");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 291, 348, 16);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("1");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 311, 315, 16);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("6");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 335, 348, 16);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(626, 462, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("Elements\r\n");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(482, 173, 159, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Matter");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(482, 199, 159, 23);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("7.) How many different molecules are in water?");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 259, 421, 25);
		getContentPane().add(lblWhichOf);

		JLabel lblAcoordingTo = new JLabel("8.) What is common amongst all matter in the world?");
		lblAcoordingTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAcoordingTo.setBounds(437, 359, 443, 16);
		getContentPane().add(lblAcoordingTo);

		op81 = new JRadioButton("All matter has to have at least one molecule");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(447, 382, 301, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("All matter has to have at least one atom");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(447, 404, 224, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("All matter has to have at least one moleule and atom");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(447, 426, 315, 23);
		getContentPane().add(op83);

		JRadioButton op63 = new JRadioButton("Particles");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(482, 225, 186, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JRadioButton op34 = new JRadioButton("Carbon");
		op34.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op34.setBounds(31, 380, 115, 13);
		getContentPane().add(op34);

		enter = new JTextField();
		enter.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		enter.setBounds(498, 108, 143, 22);
		getContentPane().add(enter);
		enter.setColumns(10);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(594, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Basics of Chemistry: Lesson 1 Review");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Basics of Chemistry: Lesson 1 Review");
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
				if (op21.isSelected()) {
					maxScore++;
				}
				if (op32.isSelected() && op33.isSelected()) {
					maxScore++;
				}
				if (op41.isSelected()) {
					maxScore++;
				}
				if (enter.getText() == "Mixture" || enter.getText() == "mixture") {
					maxScore++;
				}
				if (op63.isSelected()) {
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
						TACALIBUR.courseComplete("Basics of Chemistry: Lesson 1 Review", score);
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

		setSize(780, 545);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
