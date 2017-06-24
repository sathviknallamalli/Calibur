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

public class Lesson2 extends JFrame {
	public Lesson2() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 2");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(270, 11, 450, 42);
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

		JButton btnNewButton = new JButton("Practice Probelms");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson2PracticeProblems l2p = new Lesson2PracticeProblems();
				l2p.newClass();
				close();

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(783, 553, 190, 36);
		getContentPane().add(btnNewButton);

		JLabel ae = new JLabel("Properties of Equations");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(511, 64, 202, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>To solve an equation, certain properties that make equations equal and balanced allow this to happen. To isolate variables and simplify equations properties of equality allow you to isolate properly. Distributive property can simplify equations and properties such as Addition Property of Equality, Subbtraction Property of Equality, Mulitplucation Property of Equality,and Division Property of Equality. We will identify some properties and discuss properties for the ARRANGMENT OF EQUATIONS.");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(253, 97, 702, 80);
		getContentPane().add(lblinOrderFor);

		JLabel lblEquationsArrangment = new JLabel("Equations Arrangment\r\n");
		lblEquationsArrangment.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblEquationsArrangment.setBounds(253, 188, 147, 23);
		getContentPane().add(lblEquationsArrangment);

		JLabel lblCommutativeProperty = new JLabel("Commutative Property: (a+b) = (b+a)\r\n\r\n");
		lblCommutativeProperty.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblCommutativeProperty.setBounds(253, 213, 232, 16);
		getContentPane().add(lblCommutativeProperty);

		JLabel lblto = new JLabel(
				"<html>The Commutative property states that if you swap the order of the variable or numbers in an equation then the equation will still have the same output and theory.");
		lblto.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblto.setBounds(253, 237, 299, 48);
		getContentPane().add(lblto);

		JLabel lblAssociativePropertyab = new JLabel("Associative Property: (a+b) +c = a+(b+c)\r\n\r\n");
		lblAssociativePropertyab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblAssociativePropertyab.setBounds(566, 210, 249, 16);
		getContentPane().add(lblAssociativePropertyab);

		JLabel lbltheAssociativeProperty = new JLabel(
				"<html>The Associative Property states that if you group numbers using parantheses differently in the same equation it will be the same and will not matter.");
		lbltheAssociativeProperty.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheAssociativeProperty.setBounds(566, 237, 376, 48);
		getContentPane().add(lbltheAssociativeProperty);

		JLabel lblDescriptivePropertyAbc = new JLabel("Distributive Property: a(b+c) = (a*b) + (a*c) = ab+ac");
		lblDescriptivePropertyAbc.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblDescriptivePropertyAbc.setBounds(253, 296, 313, 16);
		getContentPane().add(lblDescriptivePropertyAbc);

		JLabel lbltheAssociativeProperty_1 = new JLabel(
				"<html>The Associative Property allows you to simplify equaions where something is getting multiplied by a parantheses set and states that you multiply anything outside of parantheses to inside the parantheses. ");
		lbltheAssociativeProperty_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheAssociativeProperty_1.setBounds(253, 323, 720, 32);
		getContentPane().add(lbltheAssociativeProperty_1);

		JLabel lblExamples = new JLabel("EXAMPLES:");
		lblExamples.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblExamples.setBounds(21, 362, 147, 23);
		getContentPane().add(lblExamples);

		JLabel label = new JLabel("Commutative Property: (a+b) = (b+a)\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label.setBounds(21, 396, 232, 16);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("<html>2*7 = 7*2 ==== 14 = 14");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(21, 423, 127, 16);
		getContentPane().add(label_1);

		JLabel lblhoweverThisProperty = new JLabel(
				"<html>HOWEVER, THIS PROPERTY DOES NOT APPLY TO DIVISION OR SUBBTRACTION HERE IS WHY:\r\n2/7 does not equal 7/2.\r\n7-2 does not equal 2-7.");
		lblhoweverThisProperty.setForeground(Color.BLUE);
		lblhoweverThisProperty.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblhoweverThisProperty.setBounds(253, 396, 681, 32);
		getContentPane().add(lblhoweverThisProperty);

		JLabel label_2 = new JLabel("Associative Property: (a+b) +c = a+(b+c)\r\n\r\n");
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label_2.setBounds(21, 450, 249, 16);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("<html>(2+7) + 3 = 2 + (7+3) ==== 12 = 12");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_3.setBounds(21, 477, 183, 16);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("<html>(3*4) * 7 = 3 * (4*7) === 84 = 84");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_4.setBounds(21, 500, 183, 16);
		getContentPane().add(label_4);

		JLabel lblhoweverThisProperty_1 = new JLabel("<html>HOWEVER, THIS PROPERTY DOES NOT APPLY TO DIVISION");
		lblhoweverThisProperty_1.setForeground(Color.BLUE);
		lblhoweverThisProperty_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblhoweverThisProperty_1.setBounds(253, 474, 468, 23);
		getContentPane().add(lblhoweverThisProperty_1);

		JLabel lblDescriptivePropertyAbc_1 = new JLabel("Descriptive Property: a(b+c) = (a*b) + (a*c) = ab+ac");
		lblDescriptivePropertyAbc_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblDescriptivePropertyAbc_1.setBounds(21, 527, 313, 16);
		getContentPane().add(lblDescriptivePropertyAbc_1);

		JLabel lbla = new JLabel("<html>3(2+a) = (3*2) + (3*a) == 6+3a");
		lbla.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbla.setBounds(21, 554, 183, 16);
		getContentPane().add(lbla);

		JLabel lbltheOutsideNumber = new JLabel(
				"<html>THE OUTSIDE NUMBER WILL BE MULTIPLIES BY ALL CONTENTS OF PARANTHESES\r\n ");
		lbltheOutsideNumber.setForeground(Color.BLUE);
		lbltheOutsideNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheOutsideNumber.setBounds(344, 524, 492, 23);
		getContentPane().add(lbltheOutsideNumber);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 180, 215, 23);
		getContentPane().add(checkBox_1);
	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(999,639);
		setLocation(200, 0);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
