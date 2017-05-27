package FundamentalsOfAlgebraContents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson1Copy extends JFrame {
	public Lesson1Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 1");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(186, 11, 450, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Anatomy of an Equation");
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

		JCheckBox l4 = new JCheckBox("Lesson 4 - Solving Equations");
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l4.setEnabled(false);
		l4.setBounds(6, 154, 215, 23);
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

		JLabel ae = new JLabel("Anatomy of an Equation");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(437, 64, 202, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>In order for something to be classified as an equation you must need an equals sign, which justifies symmetry to an equation. It is generally composed of variables, coeffecients, and constants. The purpose of an equation is to solve for a variable. Below are some common formats of equations and what constituent is. The purpose of an equation is to solver a variable and isolate it and gain the numerical value for it. Equations are commonly used to represent general trends and to generalize data such as experimental, statistics, and historical data.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(255, 96, 568, 107);
		getContentPane().add(lblinOrderFor);

		JLabel example1 = new JLabel("x+1=10");
		example1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		example1.setBounds(342, 209, 63, 16);
		getContentPane().add(example1);

		JLabel lbla = new JLabel("8a - 8=72");
		lbla.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbla.setBounds(342, 230, 63, 16);
		getContentPane().add(lbla);

		JLabel lblYmxb = new JLabel("30=10x+3y");
		lblYmxb.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblYmxb.setBounds(450, 209, 63, 16);
		getContentPane().add(lblYmxb);

		JLabel lblx = new JLabel("8(a-1)=72");
		lblx.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblx.setBounds(342, 251, 63, 16);
		getContentPane().add(lblx);

		JLabel lblxy = new JLabel("7x + 7y = 12");
		lblxy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblxy.setBounds(450, 231, 71, 16);
		getContentPane().add(lblxy);

		JLabel lblxy_1 = new JLabel("3(x+y) = 24");
		lblxy_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblxy_1.setBounds(450, 252, 71, 16);
		getContentPane().add(lblxy_1);

		JLabel lblEquationsCanHave = new JLabel(
				"<html>Equations can have AS MANY VARIABLES as they want, however to solve them you need as many equations as there are variables which creates a system of equations. Equations with parantheses can be solved using the Distributive Property which we will discuss later in the chapter\r\n");
		lblEquationsCanHave.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblEquationsCanHave.setBounds(426, 269, 397, 71);
		getContentPane().add(lblEquationsCanHave);

		JLabel lblCloserLook = new JLabel("Closer Look\r\n");
		lblCloserLook.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblCloserLook.setBounds(101, 219, 112, 32);
		getContentPane().add(lblCloserLook);

		JLabel lblx_1 = new JLabel("2x + 18 = 34\r\n\r\n");
		lblx_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblx_1.setBounds(101, 251, 104, 32);
		getContentPane().add(lblx_1);

		JLabel label = new JLabel("<html>2 - 2 is a COEFFECIENT that multiplies x\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label.setBounds(34, 282, 232, 16);
		getContentPane().add(label);

		JLabel lblxX = new JLabel("<html>X - X is a VARIABLE that represents a number\r\n");
		lblxX.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblxX.setBounds(34, 303, 262, 16);
		getContentPane().add(lblxX);

		JLabel label_1 = new JLabel("<html>18 - 18 is a CONSTANT \r\n");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_1.setBounds(34, 324, 262, 16);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel(
				"<html>34 is also a CONSTANT that can be added,subtracted,multiplied,or divided to other constants \r\n");
		label_2.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_2.setBounds(34, 345, 568, 16);
		getContentPane().add(label_2);

		JLabel lblIsAn = new JLabel("<html>+ is an OPERATOR\r\n");
		lblIsAn.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblIsAn.setBounds(34, 366, 112, 16);
		getContentPane().add(lblIsAn);

		JLabel label_3 = new JLabel("<html>= sets the two sides of an equation, IT MAKES AN EQUATION AN EQUATION\r\n");
		label_3.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_3.setBounds(34, 387, 506, 16);
		getContentPane().add(label_3);

		JButton btnNewButton = new JButton("Take the Lesson Review");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(586, 378, 215, 36);
		getContentPane().add(btnNewButton);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(5, 175, 215, 23);
		getContentPane().add(checkBox_1);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(839, 468);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
