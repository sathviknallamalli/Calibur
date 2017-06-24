package FundamentalsOfAlgebra;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Lesson2PracticeProblemsCopy extends JFrame {
	public Lesson2PracticeProblemsCopy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 - Practice Problems\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(317, 11, 356, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Anatomy of an Equation");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Properties");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JCheckBox l4 = new JCheckBox("Lesson 5 - Order of Operations");
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l4.setEnabled(false);
		l4.setBounds(6, 180, 215, 23);
		getContentPane().add(l4);

		JCheckBox l3 = new JCheckBox("Lesson 3 - Types of Numbers");
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l3.setEnabled(false);
		l3.setBounds(6, 128, 215, 23);
		getContentPane().add(l3);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JButton btnNewButton = new JButton("Move on!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson2Part2 lp2 = new Lesson2Part2();
				lp2.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(731, 564, 215, 36);
		getContentPane().add(btnNewButton);

		JLabel ae = new JLabel("Practice Probelms");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(495, 68, 202, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>These practice problems are for your own good and practice sincerely. They will cover questions on identifying and performing actions on the properties. The solutions are available, but try to solve before viewing the solution/answer.\r\n\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(252, 104, 702, 32);
		getContentPane().add(lblinOrderFor);

		JLabel lblWhichOfThe = new JLabel(
				"Which of the following correctly represents the Commutative Property, Check all that apply");
		lblWhichOfThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOfThe.setBounds(252, 151, 485, 25);
		getContentPane().add(lblWhichOfThe);

		JRadioButton op1 = new JRadioButton("2-7=7-2");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(273, 175, 109, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("a+b = a-b");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(273, 201, 109, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("(a+b) +c = a + (b+c)");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(273, 227, 146, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JButton sol1 = new JButton("Solution");
		sol1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Test t = new Test();
				t.newClass();

			}
		});
		sol1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		sol1.setBounds(371, 255, 137, 23);
		getContentPane().add(sol1);

		JLabel answer = new JLabel();
		answer.setFont(new Font("Times New Roman", Font.BOLD, 13));
		answer.setBounds(292, 281, 127, 25);
		getContentPane().add(answer);

		JButton check1 = new JButton("Check My Answer!");
		check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op2.isSelected()) {
					answer.setText("You answer is correct!");
				} else if (op1.isSelected() || op3.isSelected()) {
					answer.setText("Sorry, try again");
				}
			}
		});
		check1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		check1.setBounds(224, 255, 137, 23);
		getContentPane().add(check1);

		JLabel lblWhatIsThe = new JLabel("What is the distrubutive property represented as variables?\r\n");
		lblWhatIsThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIsThe.setBounds(21, 299, 324, 25);
		getContentPane().add(lblWhatIsThe);

		JRadioButton op21 = new JRadioButton("(a+b) + c = a + (b+c)");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(54, 325, 146, 23);
		getContentPane().add(op21);

		JRadioButton op22 = new JRadioButton("a(b+c) = ab + ac");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(54, 351, 146, 23);
		getContentPane().add(op22);

		JRadioButton op23 = new JRadioButton("a+b = b+c");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(54, 377, 146, 23);
		getContentPane().add(op23);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel answer2 = new JLabel();
		answer2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		answer2.setBounds(168, 636, 127, 25);
		getContentPane().add(answer2);

		JButton check2 = new JButton("Check My Answer!");
		check2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (op22.isSelected()) {
					answer2.setText("You answer is correct!");
				} else if (op21.isSelected() || op23.isSelected()) {
					answer2.setText("Sorry, try again");
				}
			}
		});
		check2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		check2.setBounds(21, 402, 137, 23);
		getContentPane().add(check2);

		JButton sol2 = new JButton("Solution");
		sol2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Test2 t2 = new Test2();
				t2.newClass();
			}
		});
		sol2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		sol2.setBounds(168, 402, 137, 23);
		getContentPane().add(sol2);

		JLabel lblWhatPropertyIs = new JLabel("What property is represented in this equation: -x+8=8-x");
		lblWhatPropertyIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatPropertyIs.setBounds(635, 180, 324, 25);
		getContentPane().add(lblWhatPropertyIs);

		JRadioButton op33 = new JRadioButton("Commutative");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(679, 258, 146, 23);
		getContentPane().add(op33);

		JRadioButton op31 = new JRadioButton("Additive");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(679, 206, 146, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("Associative");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(679, 232, 146, 23);
		getContentPane().add(op32);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(op33);
		bg3.add(op32);
		bg3.add(op31);

		JLabel answer3 = new JLabel();
		answer3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		answer3.setBounds(698, 310, 127, 25);
		getContentPane().add(answer3);

		JButton check3 = new JButton("Check My Answer!");
		check3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op33.isSelected()) {
					answer3.setText("You answer is correct!");
				} else if (op31.isSelected() || op32.isSelected()) {
					answer3.setText("Sorry, try again");
				}

			}
		});
		check3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		check3.setBounds(615, 283, 137, 23);
		getContentPane().add(check3);

		JButton sol3 = new JButton("Solution");
		sol3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test3 t3 = new Test3();
				t3.newClass();
			}
		});
		sol3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		sol3.setBounds(757, 283, 137, 23);
		getContentPane().add(sol3);

		JLabel lblWhatIsThe_1 = new JLabel("What is the difference between Commutative and Associative Property");
		lblWhatIsThe_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIsThe_1.setBounds(21, 438, 398, 25);
		getContentPane().add(lblWhatIsThe_1);

		JCheckBox checkBox = new JCheckBox("Lesson 4 - Solving Equations");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 154, 215, 23);
		getContentPane().add(checkBox);

		JRadioButton op41 = new JRadioButton(
				"<html>Associative Property is where signs are flipped, and Commutative is when the groups of parantheses are switched");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(21, 470, 454, 32);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton(
				"<html>Commutative Property is where signs are flipped, and Assicative is when the groups of parantheses are switched");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(495, 505, 406, 36);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton(
				"<html>Commutative Property is where signs are flipped, and Distributuve is when the groups of parantheses are switched");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 505, 412, 36);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel answer4 = new JLabel();
		answer4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		answer4.setBounds(168, 651, 127, 25);
		getContentPane().add(answer4);

		JButton check4 = new JButton("Check My Answer!");
		check4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (op42.isSelected()) {
					answer4.setText("You answer is correct!");
				} else if (op41.isSelected() || op43.isSelected()) {
					answer4.setText("Sorry, try again");
				}
			}
		});
		check4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		check4.setBounds(76, 548, 137, 23);
		getContentPane().add(check4);

		JButton sol4 = new JButton("Solution");
		sol4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test4 t4 = new Test4();
				t4.newClass();
			}
		});
		sol4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		sol4.setBounds(223, 548, 137, 23);
		getContentPane().add(sol4);

		JLabel lblWhatIsThe_2 = new JLabel("What is the method for solving equations called\r\n");
		lblWhatIsThe_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIsThe_2.setBounds(593, 333, 324, 25);
		getContentPane().add(lblWhatIsThe_2);

		JRadioButton op51 = new JRadioButton("System of Equations\r\n");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(633, 358, 146, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("Order of Operations\r\n");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(633, 384, 146, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("Golden Method\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(633, 410, 146, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JButton button = new JButton("Check My Answer!");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(563, 440, 137, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("Solution");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(724, 440, 137, 23);
		getContentPane().add(button_1);
	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(973, 650);
		setLocation(200, 0);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
