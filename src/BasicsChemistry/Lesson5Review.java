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
import javax.swing.SwingConstants;

public class Lesson5Review extends JFrame {

	public Lesson5Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 5 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(345, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(166, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) What are the order of phases from gas to solid?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Melting, Vaporization, Boiling");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Condensation, Freezing\r\n");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Condensation, Evaporation, Freezing");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 211, 23);
		getContentPane().add(op3);

		ButtonGroup b = new ButtonGroup();
		b.add(op3);
		b.add(op2);
		b.add(op1);

		JLabel lblWhatIs = new JLabel("2.) What happens to the atoms during the vaporization phase?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton(
				"<html>The atoms will become more pact and dense so it solidifies from a gas to a liquid\r\n");
		op21.setVerticalAlignment(SwingConstants.TOP);
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 248, 37);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton(
				"<html>The atoms are loosly bound originally, but when the heat is added it can become more flowy and fill the space all around it");
		op22.setVerticalAlignment(SwingConstants.TOP);
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 246, 301, 45);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton(
				"<html>The atoms become tighter together and thus is the phase from liquid to gas and can be evaporated or boiled.");
		op23.setVerticalAlignment(SwingConstants.TOP);
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 294, 301, 31);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel(
				"<html>3.) Determine the position in which only liquid is present in the graph if it starts as a solid, remember what causes a phase change.");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 335, 384, 37);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("C");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(208, 391, 61, 25);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("D");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(208, 418, 61, 25);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("B");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(208, 446, 61, 25);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) What is the difference between evaporation and boiling");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 523, 321, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton(
				"<html>Evaporation occurs on the surface of the liquid whereas boiling is also within");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(10, 555, 289, 37);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton(
				"<html>Evaporation occurs when a liquid changes to a gas, but boiling is from gas to liquid");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(10, 595, 289, 39);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton(
				"<html>Evaporation and boiling occur at different temperatures and convert from liquid to gas");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(301, 595, 242, 37);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel(
				"<html>5.) Which phase in this diagram matches that of Section D in diagram question 3");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 31);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Condensation");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(708, 120, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Evaporation");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(708, 146, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Precipitation");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(708, 172, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel("6.) Which of these statements is true about heat and temperature?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 310, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton(
				"<html>Heat is what causes a phase change and it also increases the temperature");
		op71.setVerticalAlignment(SwingConstants.TOP);
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(482, 481, 348, 31);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton(
				"<html>Temperature is what causes a phase change and it also increases the heat");
		op72.setVerticalAlignment(SwingConstants.TOP);
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(482, 515, 335, 33);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton(
				"<html>Temperature stays the same during a phase change and heat increases");
		op73.setVerticalAlignment(SwingConstants.TOP);
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(482, 551, 348, 31);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(733, 596, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton(
				"<html>Heat is how hot an object is and temperature is a more accurate and numerical value of that measure");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(482, 342, 307, 37);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton(
				"<html>Heat is what causes temperature and heat is a measure of the movement in atoms of a material");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(482, 382, 289, 31);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel("7.) How does heat and temperature contribute to a phase change");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 459, 360, 25);
		getContentPane().add(lblWhichOf);

		JRadioButton op63 = new JRadioButton(
				"<html>Temperature is the kinetic energy of atoms in an object and heat is the energy transfer between objects");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(482, 419, 295, 37);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\phasegraph.PNG"));
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label.setBounds(10, 383, 192, 138);
		getContentPane().add(label);

		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\wcycle.PNG"));
		label_1.setBounds(437, 118, 256, 185);
		getContentPane().add(label_1);

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
				if (op22.isSelected()) {
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
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op73.isSelected()) {
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
						Lesson6 l = new Lesson6();
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

		setSize(886, 680);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
