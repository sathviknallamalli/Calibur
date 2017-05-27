package Motion;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class FinalTest extends JFrame {
	static public JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public FinalTest() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Physics - Machines Final Test\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(182, 11, 365, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"<html>This is the final exam covering all of the lessons. You do not have any access to outside resources and once you submit, you will be able to review your score and this test will be screenshotted and saved for you in a folder along with all of your other tests. In order for you to get a Certificate of Achievement on this, you must score at least 80%.\r\n");
		quizIntro.setFont(new Font("Times New Roman", Font.BOLD, 13));
		quizIntro.setBounds(10, 52, 803, 51);
		getContentPane().add(quizIntro);

		JLabel q1 = new JLabel("1.) Identify the simple machines in a Hand Drill?");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 201, 265, 25);
		getContentPane().add(q1);

		JRadioButton op1 = new JRadioButton("Wheel and Axle");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 233, 109, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Levers");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 259, 70, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Wedge");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 285, 82, 23);
		getContentPane().add(op3);


		JRadioButton op21 = new JRadioButton("1");
		op21.setVerticalAlignment(SwingConstants.TOP);
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 355, 282, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("7");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 381, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("3");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 407, 109, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) Identify the number of constants in this equation: 3x - 6y + 9 = 30");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(53, 506, 361, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton("4");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 460, 109, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("1");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 486, 109, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("3");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 512, 109, 23);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) Which of the following descriptions correlate to a variable");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 542, 340, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton(
				"<html>It is in front of a number and determines how many times it is multiplied by");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 574, 221, 33);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton(
				"<html> It is a representation for a variable and you must isolate it to solve the equation");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 610, 221, 33);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton(
				"<html> A part in the equation that is required for an equation and there can only be 1");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 650, 228, 33);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) Which of these best describes the Associative property");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(462, 201, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("a(b+c) = ab + ac");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(501, 233, 109, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("a+(b+c) = (a+b)+c");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(501, 259, 139, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("a+b=b+a");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(501, 285, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIsThisA = new JLabel("6.) What is the difference betwen Commutative and Associative Property?");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(462, 315, 350, 25);
		getContentPane().add(lblIsThisA);

		JLabel lblAStudentSolved = new JLabel(
				"<html>7.) A student solved this equation using the properties of equalities, in which step did they make a mistake?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(462, 481, 350, 33);
		getContentPane().add(lblAStudentSolved);
		// 3x + 5 = 14 Division Property of Equality
		JLabel lblNewLabel = new JLabel("<html>2.) Which of the following descrpitions details the difference between a simple and complex machine?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 315, 386, 33);
		getContentPane().add(lblNewLabel);

		JLabel lblxDivisionProperty = new JLabel("6(x-9) = 36           Original");
		lblxDivisionProperty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblxDivisionProperty.setBounds(532, 525, 265, 16);
		getContentPane().add(lblxDivisionProperty);

		JLabel lblxSubtractionProperty = new JLabel("6x-54 = 36            Distributive Property \r\n");
		lblxSubtractionProperty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblxSubtractionProperty.setBounds(532, 549, 287, 16);
		getContentPane().add(lblxSubtractionProperty);

		JLabel lblXDivisionProperty = new JLabel("6x=-18             Subbtraction Property of Equality");
		lblXDivisionProperty.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblXDivisionProperty.setBounds(532, 572, 287, 16);
		getContentPane().add(lblXDivisionProperty);

		JLabel label = new JLabel("1.)");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(501, 520, 21, 25);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("2.)");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(501, 546, 21, 25);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("3.)");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_2.setBounds(501, 571, 21, 25);
		getContentPane().add(label_2);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(1162, 632, 172, 40);
		getContentPane().add(btnNewButton);

		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFullName.setBounds(32, 114, 70, 25);
		getContentPane().add(lblFullName);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(125, 114, 188, 26);
		getContentPane().add(textField);

		JLabel lbltest = new JLabel("-----------------------------Test----------------------------");
		lbltest.setFont(new Font("Castellar", Font.PLAIN, 20));
		lbltest.setBounds(69, 170, 683, 42);
		getContentPane().add(lbltest);

		JRadioButton op61 = new JRadioButton(
				"<html>Associative Property is where signs are flipped, and Commutative is when the groups of parantheses are switched");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(490, 346, 350, 42);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton(
				"<html>Commutative Property is where signs are flipped, and Assicative is when the groups of parantheses are switched");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(490, 391, 326, 42);
		getContentPane().add(op62);

		JRadioButton op63 = new JRadioButton(
				"<html>Commutative Property is where signs are flipped, and Distributuve is when the groups of parantheses are switched");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(490, 429, 310, 54);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg3.add(op63);
		bg3.add(op62);
		bg3.add(op61);

		JLabel label_3 = new JLabel("4.)");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(501, 597, 21, 25);
		getContentPane().add(label_3);

		JLabel lblXDivisionProperty_1 = new JLabel("x=-3            Division Property of Equality");
		lblXDivisionProperty_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblXDivisionProperty_1.setBounds(532, 598, 287, 16);
		getContentPane().add(lblXDivisionProperty_1);

		JRadioButton op71 = new JRadioButton("1\r\n");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(501, 623, 46, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("2");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(501, 649, 36, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("3");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(553, 623, 36, 23);
		getContentPane().add(op73);

		JRadioButton op74 = new JRadioButton("4");
		op74.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op74.setBounds(553, 650, 46, 23);
		getContentPane().add(op74);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op74);
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JLabel lblWhiciProperty = new JLabel(
				"<html>8.) Which property is being described: You can set any value or variable equal to itself");
		lblWhiciProperty.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhiciProperty.setBounds(843, 52, 350, 33);
		getContentPane().add(lblWhiciProperty);

		JRadioButton op81 = new JRadioButton("Reflexive\r\n");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(886, 92, 109, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Symmetrical");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(886, 118, 139, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("Transitive");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(886, 144, 109, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel lblForWhich = new JLabel("9.) For which of the following properties does Subbtraction not work?\r\n");
		lblForWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblForWhich.setBounds(843, 182, 375, 25);
		getContentPane().add(lblForWhich);

		JRadioButton op91 = new JRadioButton("Commutative AND Associative\r\n");
		op91.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op91.setBounds(885, 213, 192, 23);
		getContentPane().add(op91);

		JRadioButton op92 = new JRadioButton("Associative AND Distributive");
		op92.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op92.setBounds(885, 240, 192, 23);
		getContentPane().add(op92);

		JRadioButton op93 = new JRadioButton("Not Listed Above");
		op93.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op93.setBounds(885, 266, 176, 23);
		getContentPane().add(op93);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(op93);
		bg9.add(op92);
		bg9.add(op91);

		JLabel lblNegativeNumbers = new JLabel("10.) Negative numbers belong to which number group");
		lblNegativeNumbers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNegativeNumbers.setBounds(843, 302, 375, 25);
		getContentPane().add(lblNegativeNumbers);

		JRadioButton op101 = new JRadioButton("Natural");
		op101.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op101.setBounds(886, 329, 192, 23);
		getContentPane().add(op101);

		JRadioButton op102 = new JRadioButton("Whole Numbers");
		op102.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op102.setBounds(886, 356, 192, 23);
		getContentPane().add(op102);

		JRadioButton op103 = new JRadioButton("Integers");
		op103.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op103.setBounds(886, 382, 176, 23);
		getContentPane().add(op103);

		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(op103);
		bg10.add(op102);
		bg10.add(op101);

		JLabel lblSelectAll = new JLabel("11.) Select all that apply: Which are irrational numbers");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(843, 413, 375, 25);
		getContentPane().add(lblSelectAll);

		JRadioButton op111 = new JRadioButton("1/3\r\n");
		op111.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op111.setBounds(886, 438, 62, 23);
		getContentPane().add(op111);

		JRadioButton op112 = new JRadioButton("1/6");
		op112.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op112.setBounds(886, 465, 56, 23);
		getContentPane().add(op112);

		JRadioButton op113 = new JRadioButton("\u03C0");
		op113.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op113.setBounds(886, 491, 46, 23);
		getContentPane().add(op113);

		JRadioButton op114 = new JRadioButton("i");
		op114.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op114.setBounds(959, 438, 70, 23);
		getContentPane().add(op114);

		JRadioButton op115 = new JRadioButton("e");
		op115.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op115.setBounds(959, 465, 62, 23);
		getContentPane().add(op115);

		JRadioButton op116 = new JRadioButton("1/9");
		op116.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op116.setBounds(959, 491, 46, 23);
		getContentPane().add(op116);

		JLabel lblSolveThis_1 = new JLabel("12.) Solve this equation: 6(x-2) + 3(3x-9) = 45");
		lblSolveThis_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_1.setBounds(838, 525, 239, 25);
		getContentPane().add(lblSolveThis_1);

		JRadioButton op121 = new JRadioButton("84/15");
		op121.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op121.setBounds(878, 552, 62, 23);
		getContentPane().add(op121);

		JRadioButton op122 = new JRadioButton("15/84");
		op122.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op122.setBounds(967, 552, 91, 23);
		getContentPane().add(op122);

		ButtonGroup bg12 = new ButtonGroup();

		bg12.add(op122);
		bg12.add(op121);

		JLabel lblSolveThis_2 = new JLabel("13.) Solve this expression when 'x' = 7: 3x-7 + (x-5) * 3");
		lblSolveThis_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_2.setBounds(838, 578, 287, 25);
		getContentPane().add(lblSolveThis_2);

		JRadioButton op131 = new JRadioButton("64");
		op131.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op131.setBounds(848, 601, 46, 23);
		getContentPane().add(op131);

		JRadioButton op132 = new JRadioButton("84");
		op132.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op132.setBounds(914, 601, 46, 23);
		getContentPane().add(op132);

		JRadioButton op133 = new JRadioButton("48");
		op133.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op133.setBounds(985, 601, 46, 23);
		getContentPane().add(op133);

		ButtonGroup bg13 = new ButtonGroup();
		bg13.add(op133);
		bg13.add(op132);
		bg13.add(op131);

		JLabel lblSolveThis_3 = new JLabel("14.) Solve this expression when 'x' = 5: 4x-3 + (x-5) * 2");
		lblSolveThis_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_3.setBounds(838, 627, 287, 25);
		getContentPane().add(lblSolveThis_3);

		JRadioButton op141 = new JRadioButton("0");
		op141.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op141.setBounds(843, 649, 46, 23);
		getContentPane().add(op141);

		JRadioButton op142 = new JRadioButton("17");
		op142.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op142.setBounds(909, 649, 46, 23);
		getContentPane().add(op142);

		JRadioButton op143 = new JRadioButton("7");
		op143.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op143.setBounds(980, 649, 46, 23);
		getContentPane().add(op143);

		ButtonGroup bg14 = new ButtonGroup();
		bg14.add(op143);
		bg14.add(op142);
		bg14.add(op141);

		JLabel lblWhatIs = new JLabel("15.) What is Order of Operations");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(1065, 460, 287, 25);
		getContentPane().add(lblWhatIs);

		JRadioButton op152 = new JRadioButton("DEMPAS");
		op152.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op152.setBounds(1136, 512, 82, 23);
		getContentPane().add(op152);

		JRadioButton op151 = new JRadioButton("PEMDAS\r\n");
		op151.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op151.setBounds(1136, 482, 91, 23);
		getContentPane().add(op151);

		JRadioButton op153 = new JRadioButton("SAMPED");
		op153.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op153.setBounds(1136, 543, 91, 23);
		getContentPane().add(op153);

		ButtonGroup bg15 = new ButtonGroup();
		bg15.add(op153);
		bg15.add(op152);
		bg15.add(op151);

		JLabel lblcheckAnswersBefore = new JLabel("<html>CHECK ANSWERS BEFORE SUBMITTING\r\n");
		lblcheckAnswersBefore.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblcheckAnswersBefore.setBounds(1162, 592, 172, 29);
		getContentPane().add(lblcheckAnswersBefore);
		
		JRadioButton op6 = new JRadioButton("Rope and Pulley");
		op6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op6.setBounds(161, 285, 114, 23);
		getContentPane().add(op6);
		
		JRadioButton op5 = new JRadioButton("Gear");
		op5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op5.setBounds(161, 259, 70, 23);
		getContentPane().add(op5);
		
		JRadioButton op4 = new JRadioButton("Ramp");
		op4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op4.setBounds(161, 233, 109, 23);
		getContentPane().add(op4);

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
				if (op21.isSelected()) {
					maxScore++;
				}
				if (op32.isSelected()) {
					maxScore++;
				}
				if (op42.isSelected()) {
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
				if (op81.isSelected()) {
					maxScore++;
				}
				if (op93.isSelected()) {
					maxScore++;
				}
				if (op103.isSelected()) {
					maxScore++;
				}
				if (op113.isSelected() && op115.isSelected()) {
					maxScore++;
				}
				if (op121.isSelected()) {
					maxScore++;
				}
				if (op132.isSelected()) {
					maxScore++;
				}
				if (op142.isSelected()) {
					maxScore++;
				}
				if (op151.isSelected()) {
					maxScore++;
				}
				frame.getContentPane().setLayout(null);
				
				final int ms = maxScore;
				JLabel result = new JLabel("You scored " + maxScore + " out of 15");
				result.setFont(new Font("Times New Roman", Font.BOLD, 14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);

				JButton next = new JButton("Continue");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);

				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (ms >= 12) {
							Cert w = new Cert();
							w.NewScreen();
							close();
						} else {
							JOptionPane.showMessageDialog(null,
									"Sorry, but you failed, no certificate for you. You can redo this course and try to get the achievement certificate. ");
						}

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

		setSize(1378, 729);
		setLocation(0, 0);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
