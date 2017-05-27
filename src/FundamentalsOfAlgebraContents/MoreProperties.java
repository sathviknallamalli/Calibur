package FundamentalsOfAlgebraContents;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
public class MoreProperties extends JFrame {
	public MoreProperties() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 2");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(283, 11, 450, 42);
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
		
		JLabel ae = new JLabel("Properties of Equations\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(524, 47, 203, 32);
		getContentPane().add(ae);
		
		JLabel lblinOrderFor = new JLabel("<html>When solving equations you may want to re arrange the way the equation looks to make it easier. There are some properties that allow you to do so and have the same equation\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(253, 83, 729, 42);
		getContentPane().add(lblinOrderFor);
		
		JLabel lblAssociativePropertyab = new JLabel("Symmetric Property");
		lblAssociativePropertyab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblAssociativePropertyab.setBounds(227, 183, 249, 16);
		getContentPane().add(lblAssociativePropertyab);
		
		JLabel lbltheseAreThe = new JLabel("<html>These are the most basic and commonly used properties\r\n");
		lbltheseAreThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheseAreThe.setBounds(253, 127, 560, 23);
		getContentPane().add(lbltheseAreThe);
		
		JLabel lbltheAdditionProperty = new JLabel("<html>This property allows you to swap arround things next to the equals sign to put it into standard form. The STANDARD FORM of AN ANSWER is to have the VARIABLE ON THE LEFT SIDE OF THE EQUALS SIGN, AND THE NUMBER ON THE RIGHT SIDE. \r\n");
		lbltheAdditionProperty.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lbltheAdditionProperty.setBounds(227, 201, 388, 78);
		getContentPane().add(lbltheAdditionProperty);
		
		JLabel lblSubbtractionPropertyOf = new JLabel("Reflexive Property\r\n\r\n");
		lblSubbtractionPropertyOf.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblSubbtractionPropertyOf.setBounds(671, 183, 249, 16);
		getContentPane().add(lblSubbtractionPropertyOf);
		
		JLabel lbltheSubbtractionProperty = new JLabel("<html>Remember if you can set anything equal to itsef. You can use this property to do so");
		lbltheSubbtractionProperty.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lbltheSubbtractionProperty.setBounds(671, 213, 347, 42);
		getContentPane().add(lbltheSubbtractionProperty);
		
		JCheckBox checkBox = new JCheckBox("Lesson 6 - Word Problems");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 206, 215, 23);
		getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 181, 215, 23);
		getContentPane().add(checkBox_1);
		
		JLabel lblexampleARemember = new JLabel("<html>\r\nFor all real numbers x\u2009\u2009and\u2009y\r\n");
		lblexampleARemember.setForeground(Color.BLUE);
		lblexampleARemember.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblexampleARemember.setBounds(227, 280, 318, 23);
		getContentPane().add(lblexampleARemember);
		
		JLabel lblIfXy = new JLabel("<html>\r\nif x=y , then y=x.");
		lblIfXy.setForeground(Color.BLUE);
		lblIfXy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIfXy.setBounds(227, 303, 318, 23);
		getContentPane().add(lblIfXy);
		
		JLabel lblOrderOfEquality = new JLabel("<html>\r\n\r\n\r\nOrder of equality does not matter.");
		lblOrderOfEquality.setForeground(Color.BLUE);
		lblOrderOfEquality.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblOrderOfEquality.setBounds(227, 325, 318, 23);
		getContentPane().add(lblOrderOfEquality);
		
		JLabel lblForAllReal = new JLabel("<html>\r\n\t\r\nFor all real numbers x , x=x.");
		lblForAllReal.setForeground(Color.BLUE);
		lblForAllReal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblForAllReal.setBounds(671, 266, 318, 23);
		getContentPane().add(lblForAllReal);
		
		JLabel lblANumberEquals = new JLabel("<html>\r\nA number equals itself.");
		lblANumberEquals.setForeground(Color.BLUE);
		lblANumberEquals.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblANumberEquals.setBounds(671, 292, 318, 23);
		getContentPane().add(lblANumberEquals);
		
		JLabel lblTransitiveProperty = new JLabel("Transitive Property\r\n\r\n");
		lblTransitiveProperty.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblTransitiveProperty.setBounds(561, 368, 128, 16);
		getContentPane().add(lblTransitiveProperty);
		
		JLabel lblifYouKnow = new JLabel("<html>If you know that two things are equal to each other, and another variable is equal to one of those two, that means that it will also equal the 2nd variable in the first statement");
		lblifYouKnow.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblifYouKnow.setBounds(253, 395, 729, 42);
		getContentPane().add(lblifYouKnow);
		
		JLabel lblForAllReal_1 = new JLabel("<html>\r\nFor all real numbers x,y,\u2009\u2009and\u2009z");
		lblForAllReal_1.setForeground(Color.BLUE);
		lblForAllReal_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblForAllReal_1.setBounds(253, 438, 318, 23);
		getContentPane().add(lblForAllReal_1);
		
		JLabel lblIfXyAnd = new JLabel("<html>\r\nif x=y and y=z , then x=z .");
		lblIfXyAnd.setForeground(Color.BLUE);
		lblIfXyAnd.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIfXyAnd.setBounds(253, 461, 318, 23);
		getContentPane().add(lblIfXyAnd);
		
		JLabel lblInALiteral = new JLabel("<html>\r\nIn a literal sense, if an orange is a citrus and a citrus is a fruit, then an orange is a fruit by the Transitive Property. \r\n\r\nif x=5 and 5=y, then x=y\r\n\r\n(notice the beginning variable is equal to the end variable");
		lblInALiteral.setForeground(Color.BLUE);
		lblInALiteral.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblInALiteral.setBounds(253, 485, 412, 64);
		getContentPane().add(lblInALiteral);
		
		JButton btnTakeTheLesson = new JButton("Take the Lesson Review");
		btnTakeTheLesson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson2Review l2 = new Lesson2Review();
				l2.newClass();
				close();
			}
		});
		btnTakeTheLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnTakeTheLesson.setBounds(785, 506, 215, 36);
		getContentPane().add(btnTakeTheLesson);
		
		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(762, 485, 256, 16);
		getContentPane().add(label);
	}

	public void close() {
		WindowEvent w = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}
	
	public void newClass(){
	
	setSize(1044,592);
	setLocation(200,0);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
