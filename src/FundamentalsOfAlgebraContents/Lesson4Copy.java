package FundamentalsOfAlgebraContents;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Lesson4Copy extends JFrame {
	public Lesson4Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 4");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(251, 11, 450, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Anatomy of an Equation");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Properties");
		l2.setSelected(true);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JCheckBox l4 = new JCheckBox("Lesson 4 - Solving Equations");
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l4.setEnabled(false);
		l4.setBounds(6, 152, 215, 23);
		getContentPane().add(l4);

		JCheckBox l3 = new JCheckBox("Lesson 3 - Types of Numbers");
		l3.setSelected(true);
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l3.setEnabled(false);
		l3.setBounds(6, 128, 215, 23);
		getContentPane().add(l3);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Solving Equations\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(551, 64, 150, 32);
		getContentPane().add(ae);

		JLabel descrip = new JLabel(
				"<html>Solving an equation is a very important skill to know in Algebra. The process is solving follows the GOLDEN RULE. WHATEVER YOU DO TO THE RIGHT HAND SIDE, DO TO THE LEFT HAND SIDE. Once again the goal is to isolate for the value. ");
		descrip.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		descrip.setBounds(329, 99, 615, 53);
		getContentPane().add(descrip);

		JButton btnNewButton = new JButton("Lesson Review\r\n");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(724, 391, 215, 36);
		getContentPane().add(btnNewButton);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(5, 175, 215, 23);
		getContentPane().add(checkBox_1);

		JLabel mini = new JLabel(
				"<html>First, you want to simplify all the variables, make sure that you have only one term with the variable");
		mini.setForeground(Color.BLUE);
		mini.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mini.setBounds(329, 156, 615, 23);
		getContentPane().add(mini);

		JLabel lblsecondMakeSure = new JLabel(
				"<html>Second, make sure all the constants are simplified and whenever an operation is done on the right, change on the left");
		lblsecondMakeSure.setForeground(Color.BLUE);
		lblsecondMakeSure.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblsecondMakeSure.setBounds(329, 179, 615, 32);
		getContentPane().add(lblsecondMakeSure);

		JLabel lblthirdIfYou = new JLabel(
				"<html>Third, if you have a coeffecient with the variable, divide, multiply, add, or subtract to isolate for it");
		lblthirdIfYou.setForeground(Color.BLUE);
		lblthirdIfYou.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblthirdIfYou.setBounds(329, 216, 615, 23);
		getContentPane().add(lblthirdIfYou);

		JLabel lbltheseStepsAre = new JLabel(
				"<html>These steps are the basic outline on how to solve it, however based on the layout of the equation, the order of the steps might change and you might have to do some additional steps. Solving an equation is like a puzzle you need to solve.");
		lbltheseStepsAre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lbltheseStepsAre.setBounds(25, 244, 919, 53);
		getContentPane().add(lbltheseStepsAre);

		JLabel lblExamples = new JLabel("EXAMPLES:");
		lblExamples.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblExamples.setBounds(25, 293, 919, 23);
		getContentPane().add(lblExamples);

		JLabel lblx = new JLabel("-3x + 15 = 12");
		lblx.setForeground(Color.RED);
		lblx.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblx.setBounds(21, 319, 121, 16);
		getContentPane().add(lblx);

		JLabel label = new JLabel("-15\r\n");
		label.setForeground(Color.RED);
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(54, 334, 26, 16);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("-15\r\n");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(87, 334, 26, 16);
		getContentPane().add(label_1);

		JLabel lblx_1 = new JLabel("-3x=-3");
		lblx_1.setForeground(Color.BLUE);
		lblx_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblx_1.setBounds(50, 351, 43, 16);
		getContentPane().add(lblx_1);

		JLabel label_2 = new JLabel("__");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(54, 355, 26, 16);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("__");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(80, 355, 26, 16);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("3");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_4.setBounds(85, 373, 15, 16);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("3");
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_5.setBounds(57, 373, 15, 16);
		getContentPane().add(label_5);

		JLabel lblX = new JLabel("x=1");
		lblX.setForeground(Color.MAGENTA);
		lblX.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblX.setBounds(21, 391, 121, 16);
		getContentPane().add(lblX);

		JLabel lbltheFirstStep = new JLabel(
				"<html>The first step is to get rid of the constants by subbtracting 15. Then the -3 has to be removed from the x by dividing by -3 using the Division Identity. Finally, YOU ARE DONE");
		lbltheFirstStep.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheFirstStep.setBounds(134, 319, 207, 80);
		getContentPane().add(lbltheFirstStep);

		JLabel lblx_2 = new JLabel("2x - 15 = 16 - 2x");
		lblx_2.setForeground(Color.RED);
		lblx_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblx_2.setBounds(379, 319, 121, 16);
		getContentPane().add(lblx_2);

		JLabel lblx_3 = new JLabel("+2x");
		lblx_3.setForeground(Color.RED);
		lblx_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblx_3.setBounds(370, 334, 26, 16);
		getContentPane().add(lblx_3);

		JLabel label_6 = new JLabel("+2x");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_6.setBounds(461, 334, 26, 16);
		getContentPane().add(label_6);

		JLabel lblx_4 = new JLabel("4x - 15 = 16");
		lblx_4.setForeground(Color.BLUE);
		lblx_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblx_4.setBounds(379, 351, 121, 16);
		getContentPane().add(lblx_4);

		JLabel label_7 = new JLabel("+15\r\n");
		label_7.setForeground(Color.BLUE);
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_7.setBounds(399, 367, 26, 16);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("+15\r\n");
		label_8.setForeground(Color.BLUE);
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_8.setBounds(432, 367, 26, 16);
		getContentPane().add(label_8);

		JLabel lblx_5 = new JLabel("4x = 31");
		lblx_5.setForeground(Color.MAGENTA);
		lblx_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblx_5.setBounds(379, 385, 121, 16);
		getContentPane().add(lblx_5);

		JLabel lblX_1 = new JLabel("x = 31/4");
		lblX_1.setForeground(Color.MAGENTA);
		lblX_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblX_1.setBounds(379, 402, 121, 16);
		getContentPane().add(lblX_1);

		JLabel lblinThisScenario = new JLabel(
				"<html>In this scenario we have 2 terms that are of the same variable, so we combine the two together. Then we need to combine the constants by addition, then divide. ");
		lblinThisScenario.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinThisScenario.setBounds(507, 321, 207, 80);
		getContentPane().add(lblinThisScenario);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(982, 491);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
