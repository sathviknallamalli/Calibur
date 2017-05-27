package LinearEquationsContents;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Lesson1 extends JFrame {
	public Lesson1() {
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
		
		JCheckBox l5 = new JCheckBox("Lesson 5 - Word Problems");
		l5.setForeground(Color.RED);
		l5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l5.setEnabled(false);
		l5.setBounds(6, 180, 215, 23);
		getContentPane().add(l5);
		
		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);
		
		JLabel ae = new JLabel("Anatomy of an Equation");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(437, 64, 202, 32);
		getContentPane().add(ae);
		
		JLabel lblinOrderFor = new JLabel("<html>In order for something to be classified as an equation you must need an equals sign, which justifies symmetry to an equation. It is generally composed of variables, coeffecients, and constants. The purpose of an equation is to solve for a variable. Below are some common formats of equations and what constituent is. ");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(255, 96, 568, 80);
		getContentPane().add(lblinOrderFor);
	
	}

	
	
	public void newClass(){
	
	setSize(840,418);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
