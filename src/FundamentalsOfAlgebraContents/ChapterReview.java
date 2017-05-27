package FundamentalsOfAlgebraContents;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
public class ChapterReview extends JFrame {

	public ChapterReview() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Lesson 1 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(300, 11, 185, 42);
		getContentPane().add(title);
		
		JLabel quizIntro = new JLabel("This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(112, 49, 558, 16);
		getContentPane().add(quizIntro);
		
		JLabel q1 = new JLabel("1.) Identify the coeffecient in this equation: 3+2y=18");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 277, 25);
		getContentPane().add(q1);
		
		JRadioButton op1 = new JRadioButton("3");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 109, 23);
		getContentPane().add(op1);
		
		JRadioButton op2 = new JRadioButton("2");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);
		
		JRadioButton op3 = new JRadioButton("y");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 109, 23);
		getContentPane().add(op3);
		
		JLabel lblWhatIs = new JLabel("2.) How many variables are in this equation: 3y + 4 + 6x + 8y?");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 323, 25);
		getContentPane().add(lblWhatIs);
		
		JRadioButton op21 = new JRadioButton("3");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 109, 23);
		getContentPane().add(op21);
		
		JRadioButton op22 = new JRadioButton("0");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);
		
		JRadioButton op23 = new JRadioButton("2");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);
		
		JLabel lblSolveThis = new JLabel("3.) What is the most important of an equation?\r\n");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 287, 25);
		getContentPane().add(lblSolveThis);
		
		JRadioButton op31 = new JRadioButton("+,-,*,/ Operations");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 159, 23);
		getContentPane().add(op31);
		
		JRadioButton op32 = new JRadioButton("=, equals sign\r\n");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 109, 23);
		getContentPane().add(op32);
		
		JRadioButton op33 = new JRadioButton("Variables");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 109, 23);
		getContentPane().add(op33);
		
		JLabel lblWhatIs_1 = new JLabel("4.) What is the limit on the number of variables in an equation?\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 382, 340, 25);
		getContentPane().add(lblWhatIs_1);
		
		JRadioButton op41 = new JRadioButton("ONLY 3");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 404, 109, 23);
		getContentPane().add(op41);
		
		JRadioButton op42 = new JRadioButton("ONLY 1");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 431, 109, 23);
		getContentPane().add(op42);
		
		JRadioButton op43 = new JRadioButton("No limit");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 457, 109, 23);
		getContentPane().add(op43);
		
		JLabel lblSolveThe = new JLabel("5.) What is the purpose of an equation?");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(403, 88, 350, 25);
		getContentPane().add(lblSolveThe);
		
		JRadioButton op51 = new JRadioButton("Solve for variable");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(425, 107, 109, 23);
		getContentPane().add(op51);
		
		JRadioButton op52 = new JRadioButton("Used for statistics\r\n");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(425, 133, 146, 23);
		getContentPane().add(op52);
		
		JRadioButton op53 = new JRadioButton("Represent trends\r\n");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(425, 159, 109, 23);
		getContentPane().add(op53);
		
		JRadioButton op54 = new JRadioButton("All the above\r\n");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(425, 183, 109, 23);
		getContentPane().add(op54);
		
		JLabel lblAStudentSolved = new JLabel("6.) Is an equation considered symmetrical or not?\r\n");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(403, 211, 370, 25);
		getContentPane().add(lblAStudentSolved);
		
		JRadioButton op71 = new JRadioButton("Constant is in front of variable and coeffecient is by itself");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(425, 307, 301, 23);
		getContentPane().add(op71);
		
		JRadioButton op72 = new JRadioButton("Coeffecient is in front of variable and Constant is by itself");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(425, 333, 315, 23);
		getContentPane().add(op72);
		
		JRadioButton op73 = new JRadioButton("Coeffecient is multiplied by variable, constant is same as variable");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(425, 359, 348, 23);
		getContentPane().add(op73);
		
		JButton btnNewButton = new JButton("Submit");
		
	
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(664, 450, 109, 37);
		getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes\r\n");
		rdbtnYes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnYes.setBounds(425, 234, 109, 23);
		getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnNo.setBounds(425, 260, 109, 23);
		getContentPane().add(rdbtnNo);
		
		JLabel lblWhichOf = new JLabel("7.) Which of the statments about CONSTANTS and COEFFECIENTS are TRUE\r\n");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(342, 285, 421, 25);
		getContentPane().add(lblWhichOf);
		
		
	
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348,145);
				frame.setLocation(600,300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 7;
				if(!op2.isSelected()) {
					maxScore--;
				}
				if(!op23.isSelected()) {
					maxScore--;
				}
				if(!op32.isSelected()) {
					maxScore--;
				}
				if(!op43.isSelected()) {
					maxScore--;
				}
				if(!op54.isSelected()) {
					maxScore--;
				}
				if(!rdbtnYes.isSelected()) {
					maxScore--;
				}
				if(!op72.isSelected()) {
					maxScore--;
				}
				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 7");
				result.setFont(new Font("Times New Roman",Font.BOLD,14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);
				
				JButton next = new JButton("Next Lesson >>>>");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);
				
				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Lesson2 w = new Lesson2();
						w.newClass();
						close();
					}
				});
			}
		});
	}

	public void close() {
		WindowEvent w = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}
	
	public void newClass(){
	
	setSize(800,540);
	setLocation(300,100);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
	
}
