package FundamentalsOfAlgebraContents;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson5Copy extends JFrame {
	public Lesson5Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Fundamentals of Algebra - Lesson 5");
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
		l4.setSelected(true);
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

		JLabel ae = new JLabel("Order of Operations\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(507, 64, 194, 32);
		getContentPane().add(ae);

		JLabel descrip = new JLabel(
				"<html>When it comes to solving equations, you can go in any order you want. However when you need to substitute or solve multiple equations at once, order of operations is very important. Order of operations is a method in which things are simplified and follows the pneumonic rule of PEMDAS.");
		descrip.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		descrip.setBounds(329, 99, 615, 52);
		getContentPane().add(descrip);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Order of Operations");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(5, 175, 215, 23);
		getContentPane().add(checkBox_1);

		JLabel lblExamples = new JLabel("\"Please excuse my dear aunt Sally\"");
		lblExamples.setForeground(Color.MAGENTA);
		lblExamples.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblExamples.setBounds(724, 273, 196, 16);
		getContentPane().add(lblExamples);

		JLabel lblinThisScenario = new JLabel("APPLICATIONS\r\n");
		lblinThisScenario.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblinThisScenario.setBounds(21, 273, 94, 23);
		getContentPane().add(lblinThisScenario);

		JLabel lblPParantheses = new JLabel("P = Parantheses\r\n");
		lblPParantheses.setForeground(Color.BLUE);
		lblPParantheses.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPParantheses.setBounds(329, 162, 92, 16);
		getContentPane().add(lblPParantheses);

		JLabel lblEExponents = new JLabel("E = Exponents\r\n");
		lblEExponents.setForeground(Color.BLUE);
		lblEExponents.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEExponents.setBounds(329, 180, 92, 16);
		getContentPane().add(lblEExponents);

		JLabel lblMMultiplucation = new JLabel("M = Multiplucation\r\n");
		lblMMultiplucation.setForeground(Color.BLUE);
		lblMMultiplucation.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblMMultiplucation.setBounds(329, 198, 112, 16);
		getContentPane().add(lblMMultiplucation);

		JLabel lblDDivison = new JLabel("D = Divison\r\n");
		lblDDivison.setForeground(Color.BLUE);
		lblDDivison.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDDivison.setBounds(329, 216, 112, 16);
		getContentPane().add(lblDDivison);

		JLabel lblAAddition = new JLabel("A = Addition\r\n");
		lblAAddition.setForeground(Color.BLUE);
		lblAAddition.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAAddition.setBounds(329, 234, 112, 16);
		getContentPane().add(lblAAddition);

		JLabel lblSSubbtraction = new JLabel("S = Subbtraction\r\n");
		lblSSubbtraction.setForeground(Color.BLUE);
		lblSSubbtraction.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSSubbtraction.setBounds(329, 252, 112, 16);
		getContentPane().add(lblSSubbtraction);

		JLabel lblaGoodWay = new JLabel(
				"<html>A good way of remembering this method is by a memory trick that have the same abbretions but form a cool sentence thats easy to remember");
		lblaGoodWay.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaGoodWay.setBounds(478, 175, 207, 72);
		getContentPane().add(lblaGoodWay);

		JLabel lblPPlease = new JLabel("P = Please\r\n");
		lblPPlease.setForeground(Color.RED);
		lblPPlease.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPPlease.setBounds(727, 162, 92, 16);
		getContentPane().add(lblPPlease);

		JLabel lblEExcuse = new JLabel("E = Excuse");
		lblEExcuse.setForeground(Color.RED);
		lblEExcuse.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEExcuse.setBounds(727, 180, 92, 16);
		getContentPane().add(lblEExcuse);

		JLabel lblMMy = new JLabel("M = My");
		lblMMy.setForeground(Color.RED);
		lblMMy.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblMMy.setBounds(727, 198, 92, 16);
		getContentPane().add(lblMMy);

		JLabel lblDDear = new JLabel("D = Dear\r\n");
		lblDDear.setForeground(Color.RED);
		lblDDear.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblDDear.setBounds(727, 216, 92, 16);
		getContentPane().add(lblDDear);

		JLabel lblAAunt = new JLabel("A = Aunt\r\n");
		lblAAunt.setForeground(Color.RED);
		lblAAunt.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAAunt.setBounds(727, 234, 92, 16);
		getContentPane().add(lblAAunt);

		JLabel lblSSally = new JLabel("S = Sally\r\n");
		lblSSally.setForeground(Color.RED);
		lblSSally.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSSally.setBounds(727, 252, 92, 16);
		getContentPane().add(lblSSally);

		JLabel lblx = new JLabel("<html>What is \"6x - 8 + 4x / 3 * (8 + 3)\" when x = 3");
		lblx.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblx.setBounds(44, 297, 328, 23);
		getContentPane().add(lblx);

		JLabel label = new JLabel("P = Parantheses\r\n");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(54, 322, 92, 16);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("(8+3) = 11");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(175, 323, 92, 16);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("E = Exponents\r\n");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_2.setBounds(54, 339, 92, 16);
		getContentPane().add(label_2);

		JLabel lblNone = new JLabel("NONE\r\n");
		lblNone.setForeground(Color.BLACK);
		lblNone.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNone.setBounds(175, 340, 92, 16);
		getContentPane().add(lblNone);

		JLabel label_3 = new JLabel("M = Multiplucation\r\n");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_3.setBounds(54, 356, 112, 16);
		getContentPane().add(label_3);

		JLabel lblwhenAProbelm = new JLabel(
				"<html>When a probelm requires you to substitute a value in for a variable, then you plug it in and solve. In order to simplify, when operations are in sequence, follow these categories in order and solve. Sometimes, when you have ONLY MULTIPLUCATION AND DIVISION or ONLY ADDITION AND SUBBTRACTIONS, you can solve from left to right. ");
		lblwhenAProbelm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblwhenAProbelm.setBounds(329, 279, 372, 114);
		getContentPane().add(lblwhenAProbelm);

		JLabel lblNoLessonReview = new JLabel("NO LESSON REVIEW!!");
		lblNoLessonReview.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNoLessonReview.setBounds(598, 387, 152, 42);
		getContentPane().add(lblNoLessonReview);

		JButton btnNewButton = new JButton("MOVE ON!!\r\n");

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(791, 387, 139, 42);
		getContentPane().add(btnNewButton);

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
