package FundamentalsOfAlgebra;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Lesson2Review extends JFrame {
	private JRadioButton op81;

	public Lesson2Review() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Lesson 2 Review");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(333, 11, 200, 42);
		getContentPane().add(title);
		
		JLabel quizIntro = new JLabel("This review is used to see how well you understood the material do not use any outside resources.");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(145, 49, 558, 16);
		getContentPane().add(quizIntro);
		
		JLabel q1 = new JLabel("1.) Using which property can I solve the following equation: 3x=54");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 357, 25);
		getContentPane().add(q1);
		
		JRadioButton op1 = new JRadioButton("Multiplucation Property of Equality");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 224, 23);
		getContentPane().add(op1);
		
		JRadioButton op2 = new JRadioButton("Division Property of Equality");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 192, 23);
		getContentPane().add(op2);
		
		JRadioButton op3 = new JRadioButton("Transitive Property");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 176, 23);
		getContentPane().add(op3);
		
		JLabel lblWhatIs = new JLabel("2.) Which of the following represents the Symmetrical Property");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 357, 25);
		getContentPane().add(lblWhatIs);
		
		JRadioButton op21 = new JRadioButton("6x=6x   so   6x=6x");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 176, 23);
		getContentPane().add(op21);
		
		JRadioButton op22 = new JRadioButton("x=y    so   y=x");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);
		
		JRadioButton op23 = new JRadioButton("if x=y and y=z, so x=z");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 176, 23);
		getContentPane().add(op23);
		
		JLabel lblSolveThis = new JLabel("3.) What is the Associative Property, check all that apply");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 322, 25);
		getContentPane().add(lblSolveThis);
		
		JRadioButton op31 = new JRadioButton("(c-d) + b = (c) - (d+b)");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 159, 23);
		getContentPane().add(op31);
		
		JRadioButton op32 = new JRadioButton("(6*8) * 4 = 6 * (8*4)\r\n");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 133, 23);
		getContentPane().add(op32);
		
		JRadioButton op33 = new JRadioButton("(8/9)/10 = 8/(9/10)");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 133, 23);
		getContentPane().add(op33);
		
		JLabel lblWhatIs_1 = new JLabel("4.) For which of the following properties does Subbtraction not work?\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 382, 375, 25);
		getContentPane().add(lblWhatIs_1);
		
		JRadioButton op41 = new JRadioButton("Commutative AND Associative\r\n");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 404, 192, 23);
		getContentPane().add(op41);
		
		JRadioButton op42 = new JRadioButton("Associative AND Distributive");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 431, 192, 23);
		getContentPane().add(op42);
		
		JRadioButton op43 = new JRadioButton("Not Listed Above");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 457, 176, 23);
		getContentPane().add(op43);
		
		JLabel lblSolveThe = new JLabel("5.) Solve the following equation using the properties of equality:  4x-5 =19");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(437, 83, 404, 25);
		getContentPane().add(lblSolveThe);
		
		JRadioButton op51 = new JRadioButton("x=14/4");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(482, 107, 109, 23);
		getContentPane().add(op51);
		
		JRadioButton op52 = new JRadioButton("x=56");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(482, 133, 146, 23);
		getContentPane().add(op52);
		
		JRadioButton op53 = new JRadioButton("x=4");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(482, 159, 109, 23);
		getContentPane().add(op53);
		
		JRadioButton op54 = new JRadioButton("x=6");
		op54.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op54.setBounds(482, 183, 109, 23);
		getContentPane().add(op54);
		
		JLabel lblAStudentSolved = new JLabel("6.) What is the standard form of an answer once an equation is solved");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(437, 206, 392, 25);
		getContentPane().add(lblAStudentSolved);
		
		JRadioButton op71 = new JRadioButton("x=0");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(472, 307, 301, 23);
		getContentPane().add(op71);
		
		JRadioButton op72 = new JRadioButton("x=12");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(472, 333, 315, 23);
		getContentPane().add(op72);
		
		JRadioButton op73 = new JRadioButton("x=24");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(472, 359, 348, 23);
		getContentPane().add(op73);
		
		JButton btnNewButton = new JButton("Submit");
		
	
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(749, 450, 109, 37);
		getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnYes = new JRadioButton("variable = constant");
		rdbtnYes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnYes.setBounds(482, 234, 159, 23);
		getContentPane().add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("coeffecient = variable");
		rdbtnNo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnNo.setBounds(482, 260, 159, 23);
		getContentPane().add(rdbtnNo);
		
		JLabel lblWhichOf = new JLabel("7.) Solve the following equation using the Distributive Property:  4(x+3) = 12\r\n");
		lblWhichOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichOf.setBounds(437, 285, 421, 25);
		getContentPane().add(lblWhichOf);
		
		JLabel lblAcoordingTo = new JLabel("<html>8.) Acoording to the transitive property what is the value of B: if   9a-12 = 6 AND a=c AND c=B\r\n");
		lblAcoordingTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAcoordingTo.setBounds(437, 387, 443, 25);
		getContentPane().add(lblAcoordingTo);
		
		op81 = new JRadioButton("x=12");
		op81.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op81.setBounds(472, 419, 301, 23);
		getContentPane().add(op81);
		
		JRadioButton op82 = new JRadioButton("x=2");
		op82.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op82.setBounds(472, 441, 315, 23);
		getContentPane().add(op82);
		
		JRadioButton rdbtnX = new JRadioButton("x=-3");
		rdbtnX.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		rdbtnX.setBounds(472, 463, 315, 23);
		getContentPane().add(rdbtnX);
		
		
	
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348,145);
				frame.setLocation(600,300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;
				if(op2.isSelected()) {
					maxScore++;
				}
				if(op22.isSelected()) {
					maxScore++;
				}
				if(op31.isSelected() && op32.isSelected()) {
					maxScore++;
				}
				if(op43.isSelected()) {
					maxScore++;
				}
				if(op54.isSelected()) {
					maxScore++;
				}
				if(rdbtnYes.isSelected()) {
					maxScore++;
				}
				if(op73.isSelected()) {
					maxScore++;
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
						Lesson3 w = new Lesson3();
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
	
	setSize(906,549);
	setLocation(300,100);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
