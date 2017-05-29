package BasicsChemistry;

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

public class Lesson3Review extends JFrame {

	public Lesson3Review() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(345, 11, 200, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(166, 48, 558, 16);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) Select all of the following that are homogeneous mixtures");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Blood");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(32, 107, 81, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Lemonade");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 99, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Salad");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 82, 23);
		getContentPane().add(op3);

		JLabel lblWhatIs = new JLabel("2.) Select the category that is heterogeneous mixture");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op21 = new JRadioButton("Colloid");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 176, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Suspension");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("Solution");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);

		ButtonGroup b2 = new ButtonGroup();
		b2.add(op23);
		b2.add(op22);
		b2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) What are the properties of a homogeneous mixture?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton(
				"<html>The solutes are equally distributed and you cannot see the different parts because of its mixture\r\n");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 284, 31);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton(
				"<html>It has equal proportions and you can see the different parts due to same distributions");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(32, 341, 260, 31);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton(
				"<html>It has equal proportions throughout the mixture and you cannot see the different parts");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 375, 248, 35);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) What is a good example of a heterogeneous mixture?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 417, 375, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Pizza");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(32, 449, 82, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Lemonade");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(125, 449, 99, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Air");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(226, 449, 176, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) How can you seperate the parts of a homogeneous mixture?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton(
				"<html>Based on the elements in the material, you have to use a reactant that will activate those compounds");
		op51.setVerticalAlignment(SwingConstants.TOP);
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(482, 107, 305, 31);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton(
				"<html>Develop a chemical formula for the substance and determine the complements of the formula and apply the new substance");
		op52.setVerticalAlignment(SwingConstants.TOP);
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(482, 143, 322, 39);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton(
				"<html>Determine the properties of each part and perform a method called distillation\r\n\r\n");
		op53.setVerticalAlignment(SwingConstants.TOP);
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(482, 183, 322, 35);
		getContentPane().add(op53);

		JRadioButton op54 = new JRadioButton(
				"<html>It is not posisble because the properties are in fixed ratios and cannot be seperated");
		op54.setVerticalAlignment(SwingConstants.TOP);
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(482, 221, 305, 36);
		getContentPane().add(op54);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op54);
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblAStudentSolved = new JLabel("6.) Is alchohol considered a heterogeneous mixture?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 259, 392, 25);
		getContentPane().add(lblAStudentSolved);

		JRadioButton op71 = new JRadioButton("Heterogeneous");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(482, 341, 348, 25);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Homogeneous");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(482, 369, 315, 25);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Rocks are not substances, no category");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(482, 397, 348, 25);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(752, 435, 128, 37);
		getContentPane().add(btnNewButton);

		JRadioButton op61 = new JRadioButton("Yes");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(447, 286, 49, 23);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("No");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(516, 286, 54, 23);
		getContentPane().add(op62);

		JLabel lblWhichOf = new JLabel(
				"7.) If granite is a heterogeneous mixture, then what are all rocks categorized as?\r\n");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 313, 421, 25);
		getContentPane().add(lblWhichOf);

		JRadioButton op63 = new JRadioButton("Maybe");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(572, 286, 75, 23);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JRadioButton op4 = new JRadioButton("Soda");
		op4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op4.setBounds(166, 107, 81, 23);
		getContentPane().add(op4);

		JRadioButton op5 = new JRadioButton("Sand");
		op5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op5.setBounds(166, 133, 99, 23);
		getContentPane().add(op5);

		JRadioButton op6 = new JRadioButton("Hot Sauce");
		op6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op6.setBounds(166, 159, 82, 23);
		getContentPane().add(op6);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if (op1.isSelected() && op2.isSelected() && op4.isSelected()) {
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
				if (op53.isSelected()) {
					maxScore++;
				}
				if (op61.isSelected()) {
					maxScore++;
				}
				if (op71.isSelected()) {
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

		setSize(getSize());
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
