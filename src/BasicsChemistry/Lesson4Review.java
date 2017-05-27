package BasicsChemistry;

import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class Lesson4Review extends JFrame {
	private JRadioButton op81;

	public Lesson4Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 4 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(345, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(166, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) Phases of matter can be classified as what?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("MIxtures and Substances");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Organic & Inorganic");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Solid, Liquid, Gas");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel("2.) In which phase of matter do the particles move the fastest?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Solid");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 176, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Gas");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Liquid");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Determine the phase based on its atomic movement");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);

		JLabel lab1 = new JLabel();
		lab1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\liquidq.png"));
		lab1.setBounds(109, 321, 81, 67);
		getContentPane().add(lab1);

		JRadioButton op31 = new JRadioButton("Solid");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 284, 25);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Liquid");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 335, 260, 25);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("Gas");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 363, 248, 25);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Select ALL of the following which have the weakest intermlecular force");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 399, 404, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Rubbing alchohol");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 431, 109, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Propane");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 457, 72, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Carbon Dioxide");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 483, 101, 23);
		getContentPane().add(op43);

		JLabel lblSolveThe = new JLabel(
				"<html>5.) Which phase of matter matches this description: The molecules will only vibrate becuase they are densely packed.");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 31);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Solid");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(482, 121, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Liquid");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(482, 147, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Gas");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(482, 173, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel("6.) What does the kinetic theory of matter state about particles?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 202, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton(
				"<html>The size and speed of the particles will not change during a phase change");
		op71.setVerticalAlignment(SwingConstants.TOP);
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(482, 357, 348, 31);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("<html>The speed of molecules will increase as the phases change");
		op72.setVerticalAlignment(SwingConstants.TOP);
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(482, 391, 315, 25);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton(
				"<html>Particles from phase changes will become loosely packed and become more fluid");
		op73.setVerticalAlignment(SwingConstants.TOP);
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(482, 412, 348, 31);
		getContentPane().add(op73);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(737, 517, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("<html>All particles in matter will constantly move");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(482, 234, 271, 25);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton(
				"<html>All matter is composed of only one atom that defines its chemical properties");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(482, 260, 224, 31);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("7.) Select the statements that differentiate the phases of matter");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 335, 338, 25);
		getContentPane().add(lblWhichOf);

		op81 = new JRadioButton("Gas, Liquid, Solid");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(482, 483, 111, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Liquid, Solid, Gas");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(595, 483, 111, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("Solid, Liquid, Gas");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(708, 483, 116, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JRadioButton op63 = new JRadioButton(
				"<html>All matter can be transformed into different phases and reversable");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(482, 294, 242, 37);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JRadioButton op44 = new JRadioButton("Butter");
		op44.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op44.setBounds(159, 431, 109, 23);
		getContentPane().add(op44);

		JRadioButton op45 = new JRadioButton("Helium");
		op45.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op45.setBounds(159, 457, 72, 23);
		getContentPane().add(op45);

		JRadioButton op46 = new JRadioButton("Carbon Dioxide");
		op46.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op46.setBounds(159, 483, 101, 23);
		getContentPane().add(op46);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);
		bg4.add(op46);
		bg4.add(op45);
		bg4.add(op44);

		JLabel lblDetermineThe = new JLabel("8.) Determine the correct order of phase from increasing temperature");
		lblDetermineThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDetermineThe.setBounds(437, 455, 417, 25);
		getContentPane().add(lblDetermineThe);

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
				if (op22.isSelected()) {
					maxScore++;
				}
				if (op33.isSelected()) {
					maxScore++;
				}
				if (op42.isSelected() && op43.isSelected() && op45.isSelected() && op46.isSelected()) {
					maxScore++;
				}
				if (op51.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op72.isSelected() && op71.isSelected()) {
					maxScore++;
				}
				if (op83.isSelected()) {
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

		setSize(891, 605);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
