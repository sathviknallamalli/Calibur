package FundamentalsOfAlgebra;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson2Part2Copy extends JFrame {
	public Lesson2Part2Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 2");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(303, 11, 450, 42);
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

		JLabel ae = new JLabel("Properties To Solve an Equation");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(540, 64, 275, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>Solving equations doesnt happen magically! Certain properties allow you to manipulate the variables and constants to eventually isolate for the desired vairable. These properties will allow you to achieve the goal for isolation and make sure you follow the proper rules when performing the steps to solve. There are properties for each operation and other properties about rearranging which we will discuss after this topic\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(255, 96, 718, 64);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Move on!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MoreProperties mp = new MoreProperties();
				mp.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(863, 529, 181, 32);
		getContentPane().add(btnNewButton);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(5, 175, 215, 23);
		getContentPane().add(checkBox_1);

		JLabel label = new JLabel("<html>These are the most basic and commonly used properties\r\n");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label.setBounds(255, 171, 560, 23);
		getContentPane().add(label);

		JLabel lblAdditionPropertyOf = new JLabel("Addition Property of Equality\r\n");
		lblAdditionPropertyOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblAdditionPropertyOf.setBounds(21, 219, 249, 16);
		getContentPane().add(lblAdditionPropertyOf);

		JLabel lblExample = new JLabel("<html>\r\nEXAMPLE");
		lblExample.setForeground(Color.BLUE);
		lblExample.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblExample.setBounds(21, 280, 318, 23);
		getContentPane().add(lblExample);

		JLabel lblGivenX = new JLabel("<html>\r\nGIVEN : x-5 = 20");
		lblGivenX.setForeground(Color.BLUE);
		lblGivenX.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblGivenX.setBounds(21, 303, 318, 23);
		getContentPane().add(lblGivenX);

		JLabel lblsinceWeNeed = new JLabel(
				"<html>Since we need to get x by itself, we have to move the 5 to the right side. In order to neutralize the left side we need to add 5 using Addition Property of Equality");
		lblsinceWeNeed.setForeground(Color.BLUE);
		lblsinceWeNeed.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsinceWeNeed.setBounds(140, 283, 381, 48);
		getContentPane().add(lblsinceWeNeed);

		JLabel lblAdditionPropertyOf_1 = new JLabel("<html>\r\nADDITION PROPERTY OF EQUALITY : 5+(x-5) = 5 +(25)");
		lblAdditionPropertyOf_1.setForeground(Color.BLUE);
		lblAdditionPropertyOf_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAdditionPropertyOf_1.setBounds(21, 337, 318, 23);
		getContentPane().add(lblAdditionPropertyOf_1);

		JLabel lblSimplifyX = new JLabel("<html>\r\nSIMPLIFY: x = 25");
		lblSimplifyX.setForeground(Color.BLUE);
		lblSimplifyX.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSimplifyX.setBounds(21, 360, 318, 23);
		getContentPane().add(lblSimplifyX);

		JLabel lblSubbtractionPropertyOf = new JLabel("Subbtraction Property of Equality\r\n");
		lblSubbtractionPropertyOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblSubbtractionPropertyOf.setBounds(527, 219, 249, 16);
		getContentPane().add(lblSubbtractionPropertyOf);

		JLabel lblwhenIsolatingFor = new JLabel(
				"<html>When isolating for the desired variable you may need to subbtract things off to cancel out constants or variables, the S.P.E allows you to do so.");
		lblwhenIsolatingFor.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblwhenIsolatingFor.setBounds(527, 235, 485, 37);
		getContentPane().add(lblwhenIsolatingFor);

		JLabel lblsometimesYouMay = new JLabel(
				"<html>Sometimes you may need to add values to the constants or vairables to either cancel out or make the equation easier to solve, which is done by A.P.E.");
		lblsometimesYouMay.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblsometimesYouMay.setBounds(21, 238, 421, 42);
		getContentPane().add(lblsometimesYouMay);

		JLabel label_1 = new JLabel("<html>\r\nEXAMPLE");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(527, 280, 318, 23);
		getContentPane().add(label_1);

		JLabel lblGivenX_1 = new JLabel("<html>\r\nGIVEN : x+13 = 39");
		lblGivenX_1.setForeground(Color.BLUE);
		lblGivenX_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblGivenX_1.setBounds(527, 303, 318, 23);
		getContentPane().add(lblGivenX_1);

		JLabel lbltoIsolateFor = new JLabel(
				"<html>To isolate for x, the 13 must be subbtracted, so in this case using the Subbtraction Property of Equality it will move 13 to the left side");
		lbltoIsolateFor.setForeground(Color.BLUE);
		lbltoIsolateFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltoIsolateFor.setBounds(655, 279, 381, 40);
		getContentPane().add(lbltoIsolateFor);

		JLabel lblSubbtractionPropertyOf_1 = new JLabel(
				"<html>\r\nSUBBTRACTION PROPERTY OF EQUALITY : (x+13) - 13 = (39)-13");
		lblSubbtractionPropertyOf_1.setForeground(Color.BLUE);
		lblSubbtractionPropertyOf_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSubbtractionPropertyOf_1.setBounds(527, 324, 357, 23);
		getContentPane().add(lblSubbtractionPropertyOf_1);

		JLabel lblSimplifyX_1 = new JLabel("<html>\r\nSIMPLIFY: x = 26");
		lblSimplifyX_1.setForeground(Color.BLUE);
		lblSimplifyX_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSimplifyX_1.setBounds(528, 349, 318, 23);
		getContentPane().add(lblSimplifyX_1);

		JLabel lblMultiplucationPropertyOf = new JLabel("Multiplucation Property of Equality\r\n");
		lblMultiplucationPropertyOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblMultiplucationPropertyOf.setBounds(21, 389, 249, 16);
		getContentPane().add(lblMultiplucationPropertyOf);

		JLabel lblwhenYouHave = new JLabel(
				"<html>When you have fractions and you need to bring one variable out of the fraction or cancel some excess vairables the Multilpucation Property of Equality will come in handy\r\n");
		lblwhenYouHave.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblwhenYouHave.setBounds(21, 406, 438, 55);
		getContentPane().add(lblwhenYouHave);

		JLabel label_2 = new JLabel("<html>\r\nEXAMPLE");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_2.setBounds(21, 464, 318, 23);
		getContentPane().add(label_2);

		JLabel lblGivenX_2 = new JLabel("<html>\r\nGIVEN : x/3 = 12");
		lblGivenX_2.setForeground(Color.BLUE);
		lblGivenX_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblGivenX_2.setBounds(21, 485, 318, 23);
		getContentPane().add(lblGivenX_2);

		JLabel lblsinceWeNeed_1 = new JLabel(
				"<html>Since we need to get x by itself, we have to multiply by 3 to remain with only x");
		lblsinceWeNeed_1.setForeground(Color.BLUE);
		lblsinceWeNeed_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsinceWeNeed_1.setBounds(140, 467, 381, 32);
		getContentPane().add(lblsinceWeNeed_1);

		JLabel lblMultiplucationPropertyOf_1 = new JLabel(
				"<html>\r\nMULTIPLUCATION PROPERTY OF EQUALITY : 3*(x/3) = 3*(12)");
		lblMultiplucationPropertyOf_1.setForeground(Color.BLUE);
		lblMultiplucationPropertyOf_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblMultiplucationPropertyOf_1.setBounds(21, 508, 362, 23);
		getContentPane().add(lblMultiplucationPropertyOf_1);

		JLabel lblSimplifyX_2 = new JLabel("<html>\r\nSIMPLIFY: x = 36");
		lblSimplifyX_2.setForeground(Color.BLUE);
		lblSimplifyX_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSimplifyX_2.setBounds(21, 533, 318, 23);
		getContentPane().add(lblSimplifyX_2);

		JLabel lblDivisionPropertyOf = new JLabel("Division Property of Equality\r\n");
		lblDivisionPropertyOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblDivisionPropertyOf.setBounds(527, 389, 249, 16);
		getContentPane().add(lblDivisionPropertyOf);

		JLabel lblwhenYouAre = new JLabel(
				"<html>When you are given a coeffecient and variable in an equation and you need to isolate for the variable, you need to do the opposite of multiply which is divide, Disivision Property of Equality\r\n");
		lblwhenYouAre.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblwhenYouAre.setBounds(527, 411, 517, 48);
		getContentPane().add(lblwhenYouAre);

		JLabel label_3 = new JLabel("<html>\r\nEXAMPLE");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_3.setBounds(528, 464, 318, 23);
		getContentPane().add(label_3);

		JLabel lblGivenx = new JLabel("<html>\r\nGIVEN : 3x=39");
		lblGivenx.setForeground(Color.BLUE);
		lblGivenx.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblGivenx.setBounds(527, 485, 318, 23);
		getContentPane().add(lblGivenx);

		JLabel lblsinceWeNeed_2 = new JLabel(
				"<html>Since we need to get x by itself, we have to do the opposite of multiply which is divide and need to divide by 3, to get the x variable");
		lblsinceWeNeed_2.setForeground(Color.BLUE);
		lblsinceWeNeed_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsinceWeNeed_2.setBounds(628, 467, 381, 32);
		getContentPane().add(lblsinceWeNeed_2);

		JLabel lblDivisionPropertyOf_1 = new JLabel("<html>\r\nDIVISION PROPERTY OF EQUALITY : (3x)/3 = (39)/3");
		lblDivisionPropertyOf_1.setForeground(Color.BLUE);
		lblDivisionPropertyOf_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDivisionPropertyOf_1.setBounds(528, 508, 362, 23);
		getContentPane().add(lblDivisionPropertyOf_1);

		JLabel lblSimplifyX_3 = new JLabel("<html>\r\nSIMPLIFY: x = 13");
		lblSimplifyX_3.setForeground(Color.BLUE);
		lblSimplifyX_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSimplifyX_3.setBounds(527, 533, 318, 23);
		getContentPane().add(lblSimplifyX_3);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(1075, 614);
		setLocation(200, 10);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
