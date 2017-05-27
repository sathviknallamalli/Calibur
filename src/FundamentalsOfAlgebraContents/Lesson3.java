package FundamentalsOfAlgebraContents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson3 extends JFrame {
	public Lesson3() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 3");
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
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l3.setEnabled(false);
		l3.setBounds(6, 128, 215, 23);
		getContentPane().add(l3);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Types of Numbers");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(551, 64, 150, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>There are all types of numbers we use. We use decimals, integers, negative numbers and more but we just dont know it. All these kinds of numbers are what make up our way of communication. You dont say you have 2.0 sisters. There is an overlapping diagram of numbers and how we classify them. You must know how to distinguish these numbers and determine when to use the right number.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 99, 615, 74);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Next Lesson");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson3Review lr = new Lesson3Review();
				lr.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(724, 391, 215, 36);
		getContentPane().add(btnNewButton);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(5, 175, 215, 23);
		getContentPane().add(checkBox_1);
		
		JLabel lblNewLabel = new JLabel("Natural Numbers - In short, these are basically the positive counting numbers\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblNewLabel.setBounds(329, 178, 421, 17);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("1,2,3,4,5,6,7...");
		label.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label.setBounds(329, 196, 112, 17);
		getContentPane().add(label);
		
		JLabel lblWholeNumbers = new JLabel("Whole Numbers - All of the natural numbers includng 0");
		lblWholeNumbers.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblWholeNumbers.setBounds(329, 224, 306, 17);
		getContentPane().add(lblWholeNumbers);
		
		JLabel label_2 = new JLabel("0,1,2,3,4,5,6,7...");
		label_2.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_2.setBounds(329, 241, 112, 17);
		getContentPane().add(label_2);
		
		JLabel lblIntegers = new JLabel("Integers - All of the above numbers including negative numbers");
		lblIntegers.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblIntegers.setBounds(329, 269, 351, 17);
		getContentPane().add(lblIntegers);
		
		JLabel label_3 = new JLabel("-3,-2,-1,0,1,2...");
		label_3.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_3.setBounds(329, 287, 112, 17);
		getContentPane().add(label_3);
		
		JLabel lblRationalNumbers = new JLabel("Rational Numbers - All of the above numbers including repeating and terminating decimals");
		lblRationalNumbers.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblRationalNumbers.setBounds(329, 323, 511, 17);
		getContentPane().add(lblRationalNumbers);
		
		JLabel label_1 = new JLabel("-6,.25,.3333333,-.6,12,0");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_1.setBounds(329, 338, 215, 17);
		getContentPane().add(label_1);
		
		JLabel lblIrrationalNumbers = new JLabel("Irrational Numbers - Ususally decimals that go on forever and dont repeat ");
		lblIrrationalNumbers.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblIrrationalNumbers.setBounds(329, 366, 406, 17);
		getContentPane().add(lblIrrationalNumbers);
		
		JLabel label_4 = new JLabel("\u03C0" + " and e");
		label_4.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		label_4.setBounds(329, 384, 215, 17);
		getContentPane().add(label_4);
		
		JLabel lblallOfThese = new JLabel("<html>All of these types of numbers come under 1 single set of REAL NUMBERS. Likewise, there is another set called IMAGINARY NUMBERS too.");
		lblallOfThese.setForeground(Color.BLUE);
		lblallOfThese.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblallOfThese.setBounds(690, 218, 249, 74);
		getContentPane().add(lblallOfThese);
		
		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\rational.PNG"));
		pic.setBounds(21,244,249,183);
		getContentPane().add(pic);
		
		JLabel lblNewLabel_1 = new JLabel("<html>You cannot access this page during the review\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(750, 360, 194, 29);
		getContentPane().add(lblNewLabel_1);
	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(971,480);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
