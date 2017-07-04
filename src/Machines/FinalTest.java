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
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import AInterfaces.TACALIBUR;

public class FinalTest extends JFrame {
	static public JTextField textField;

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

		JRadioButton op21 = new JRadioButton("2nd Class Lever");
		op21.setVerticalAlignment(SwingConstants.TOP);
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 346, 120, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("Wheel and Axle");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 372, 109, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("3rd Class Lever");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 398, 109, 23);
		getContentPane().add(op23);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\wb.png"));
		pic.setBounds(182, 351, 98, 78);
		getContentPane().add(pic);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblSolveThis = new JLabel("3.) What description matches that of a simple machine?");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 440, 361, 25);
		getContentPane().add(lblSolveThis);

		JRadioButton op31 = new JRadioButton(
				"<html>A machine that is made up of only one piece and can do little work");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 465, 265, 33);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton(
				"<html>An object that has multiple parts and can complete multiple tasks at once");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 501, 256, 34);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton(
				"<html>A machine that can complete a task in one movement and can multiply the original force\r\n");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 538, 282, 33);
		getContentPane().add(op33);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel lblWhatIs_1 = new JLabel("4.) A record player is which type of simple machine?");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 578, 340, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op41 = new JRadioButton("Gear");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 599, 62, 25);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("Wheel and Axle");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 623, 139, 24);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("Rope and Pulley");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 650, 114, 22);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblSolveThe = new JLabel("5.) What part of a lever is the fulcrum?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(462, 201, 350, 25);
		getContentPane().add(lblSolveThe);

		JRadioButton op51 = new JRadioButton("Always in the middle");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(501, 233, 139, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Input force for a lever");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(501, 259, 139, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Pivot point");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(501, 285, 109, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIsThisA = new JLabel("6.) What arrangement of parts would result in a 3rd class lever?");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(462, 315, 350, 25);
		getContentPane().add(lblIsThisA);

		JLabel lblAStudentSolved = new JLabel("<html>7.) A 2nd class lever is which of the following?");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(463, 429, 350, 33);
		getContentPane().add(lblAStudentSolved);
		// 3x + 5 = 14 Division Property of Equality
		JLabel lblNewLabel = new JLabel(
				"<html>2.) Looking at this picture, identify the simple machine being depicted");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 315, 386, 25);
		getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Submit");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(1152, 632, 172, 40);
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

		JRadioButton op61 = new JRadioButton("Fulcrum, Load, Effort");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(490, 346, 350, 25);
		getContentPane().add(op61);

		JRadioButton op62 = new JRadioButton("Fulcrum, Effort, Load");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(490, 371, 326, 25);
		getContentPane().add(op62);

		JRadioButton op63 = new JRadioButton("Load, Fulcrum, Effort\r\n");
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(490, 397, 310, 25);
		getContentPane().add(op63);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JRadioButton op71 = new JRadioButton("Catapult");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(501, 465, 88, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Seesaw");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(501, 491, 88, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Bottle Opener");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(501, 517, 109, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JLabel lblWhiciProperty = new JLabel("<html>8.) How can you increase the work done in an object");
		lblWhiciProperty.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhiciProperty.setBounds(462, 552, 350, 25);
		getContentPane().add(lblWhiciProperty);

		JRadioButton op81 = new JRadioButton("Increase force applies");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(501, 578, 139, 23);
		getContentPane().add(op81);

		JRadioButton op82 = new JRadioButton("Decrease the distance it is pushed by");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(501, 604, 203, 23);
		getContentPane().add(op82);

		JRadioButton op83 = new JRadioButton("Add more mass to the object");
		op83.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op83.setBounds(501, 630, 176, 23);
		getContentPane().add(op83);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(op83);
		bg8.add(op82);
		bg8.add(op81);

		JLabel lblForWhich = new JLabel("9.) Calculate the work done by this object");
		lblForWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblForWhich.setBounds(823, 40, 375, 25);
		getContentPane().add(lblForWhich);

		JLabel pic1 = new JLabel();
		pic1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\test.png"));
		pic1.setBounds(833, 76, 297, 86);
		getContentPane().add(pic1);

		JRadioButton op91 = new JRadioButton("1.3333333Joules");
		op91.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op91.setBounds(858, 172, 192, 23);
		getContentPane().add(op91);

		JRadioButton op92 = new JRadioButton("300Joules");
		op92.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op92.setBounds(858, 199, 192, 23);
		getContentPane().add(op92);

		JRadioButton op93 = new JRadioButton(".75Joules");
		op93.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op93.setBounds(858, 225, 176, 23);
		getContentPane().add(op93);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(op93);
		bg9.add(op92);
		bg9.add(op91);

		JLabel lblNegativeNumbers = new JLabel(
				"<html>10.) If the amount of work done to the object above was 100 Joules, how much force should be applied to push the same distance");
		lblNegativeNumbers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNegativeNumbers.setBounds(822, 259, 375, 33);
		getContentPane().add(lblNegativeNumbers);

		JRadioButton op101 = new JRadioButton(".05Newtons");
		op101.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op101.setBounds(864, 299, 192, 23);
		getContentPane().add(op101);

		JRadioButton op102 = new JRadioButton("2000Newtons");
		op102.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op102.setBounds(864, 326, 192, 23);
		getContentPane().add(op102);

		JRadioButton op103 = new JRadioButton("5Newtons");
		op103.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op103.setBounds(864, 352, 176, 23);
		getContentPane().add(op103);

		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(op103);
		bg10.add(op102);
		bg10.add(op101);

		JLabel lblSelectAll = new JLabel("11.) What is ideal mechanical advantage used for?");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(807, 397, 375, 25);
		getContentPane().add(lblSelectAll);

		JRadioButton op111 = new JRadioButton("When only output and input forces are given");
		op111.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op111.setBounds(833, 422, 249, 23);
		getContentPane().add(op111);

		JRadioButton op112 = new JRadioButton("In a situation where no friction is present");
		op112.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op112.setBounds(833, 449, 240, 23);
		getContentPane().add(op112);

		JRadioButton op113 = new JRadioButton("When force and distances are given");
		op113.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op113.setBounds(833, 475, 222, 23);
		getContentPane().add(op113);

		ButtonGroup bg11 = new ButtonGroup();
		bg11.add(op113);
		bg11.add(op112);
		bg11.add(op111);

		JLabel lblSolveThis_1 = new JLabel("12.) Calculate the advantage of this object\r\n");
		lblSolveThis_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_1.setBounds(801, 501, 239, 25);
		getContentPane().add(lblSolveThis_1);

		JLabel pic2 = new JLabel();
		pic2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\Question.png"));
		pic2.setBounds(821, 527, 191, 77);
		getContentPane().add(pic2);

		JRadioButton op121 = new JRadioButton("3");
		op121.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op121.setBounds(1018, 533, 62, 23);
		getContentPane().add(op121);

		JRadioButton op122 = new JRadioButton("1/3");
		op122.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op122.setBounds(1017, 559, 91, 23);
		getContentPane().add(op122);

		ButtonGroup bg12 = new ButtonGroup();
		bg12.add(op122);
		bg12.add(op121);

		JLabel lblSolveThis_2 = new JLabel("13.) Why is mechanical advantage important to physics?");
		lblSolveThis_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_2.setBounds(746, 603, 310, 25);
		getContentPane().add(lblSolveThis_2);

		JRadioButton op131 = new JRadioButton("<html>To find how efficent the machine is?");
		op131.setVerticalAlignment(SwingConstants.TOP);
		op131.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op131.setBounds(751, 630, 109, 53);
		getContentPane().add(op131);

		JRadioButton op132 = new JRadioButton("<html>To determine the force multiplucation?");
		op132.setVerticalAlignment(SwingConstants.TOP);
		op132.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op132.setBounds(862, 638, 133, 34);
		getContentPane().add(op132);

		JRadioButton op133 = new JRadioButton("<html>Determine the power of a machine");
		op133.setVerticalAlignment(SwingConstants.TOP);
		op133.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op133.setBounds(997, 630, 118, 48);
		getContentPane().add(op133);

		ButtonGroup bg13 = new ButtonGroup();
		bg13.add(op133);
		bg13.add(op132);
		bg13.add(op131);

		JLabel lblSolveThis_3 = new JLabel("14.) Calculate the power of this object");
		lblSolveThis_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis_3.setBounds(1102, 315, 222, 25);
		getContentPane().add(lblSolveThis_3);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\opB.PNG"));
		p.setBounds(1127, 342, 166, 77);
		getContentPane().add(p);

		JRadioButton op141 = new JRadioButton("60");
		op141.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op141.setBounds(1137, 426, 46, 23);
		getContentPane().add(op141);

		JRadioButton op142 = new JRadioButton("6.75");
		op142.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op142.setBounds(1203, 426, 46, 23);
		getContentPane().add(op142);

		JRadioButton op143 = new JRadioButton("9.2");
		op143.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op143.setBounds(1274, 426, 46, 23);
		getContentPane().add(op143);

		ButtonGroup bg14 = new ButtonGroup();
		bg14.add(op143);
		bg14.add(op142);
		bg14.add(op141);

		JLabel lblcheckAnswersBefore = new JLabel("<html>CHECK ANSWERS BEFORE SUBMITTING\r\n");
		lblcheckAnswersBefore.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblcheckAnswersBefore.setBounds(1152, 592, 172, 29);
		getContentPane().add(lblcheckAnswersBefore);

		JLabel lblWhichOf = new JLabel("<html>15.) Which of the following concepts are a rate?");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(1092, 468, 421, 22);
		getContentPane().add(lblWhichOf);

		JRadioButton op151 = new JRadioButton("Efficiency");
		op151.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op151.setBounds(1119, 491, 301, 23);
		getContentPane().add(op151);

		JRadioButton op152 = new JRadioButton("Power");
		op152.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op152.setBounds(1119, 517, 315, 23);
		getContentPane().add(op152);

		JRadioButton op153 = new JRadioButton("Work");
		op153.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op153.setBounds(1119, 543, 348, 23);
		getContentPane().add(op153);

		ButtonGroup bg15 = new ButtonGroup();
		bg15.add(op153);
		bg15.add(op152);
		bg15.add(op151);

		JLabel bs = new JLabel("");
		bs.setFont(new Font("Arial", Font.BOLD, 18));
		bs.setBounds(594, 11, 160, 30);
		getContentPane().add(bs);

		boolean exists = TACALIBUR.startCourseVerify("Physics- Machines");
		if (exists == true) {
			TACALIBUR.scoreShow(bs, "Physics- Machines");
		}

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if (op1.isSelected() && op2.isSelected() && op5.isSelected()) {
					maxScore++;
				}
				if (op21.isSelected()) {
					maxScore++;
				}
				if (op33.isSelected()) {
					maxScore++;
				}
				if (op42.isSelected()) {
					maxScore++;
				}
				if (op53.isSelected()) {
					maxScore++;
				}
				if (op62.isSelected()) {
					maxScore++;
				}
				if (op71.isSelected()) {
					maxScore++;
				}
				if (op81.isSelected()) {
					maxScore++;
				}
				if (op92.isSelected()) {
					maxScore++;
				}
				if (op103.isSelected()) {
					maxScore++;
				}
				if (op112.isSelected()) {
					maxScore++;
				}
				if (op121.isSelected()) {
					maxScore++;
				}
				if (op132.isSelected()) {
					maxScore++;
				}
				if (op141.isSelected()) {
					maxScore++;
				}
				if (op153.isSelected()) {
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
							Dup w = new Dup();
							w.newClass();
							String cName = TACALIBUR.verifyIfCourseComplete("Physics- Machines", "Machines");
							TACALIBUR.saveCertificate(cName);
							TACALIBUR.courseComplete("Physics- Machines", ms);
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
