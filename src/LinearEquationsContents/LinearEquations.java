package LinearEquationsContents;
import java.awt.Font;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LinearEquations extends JFrame {

	public LinearEquations() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Linear Equations");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(278, 11, 227, 42);
		getContentPane().add(title);
		
		JLabel quizIntro = new JLabel("Before beginning the real content of this course, please take a quick preview/quiz about the course");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(112, 49, 556, 16);
		getContentPane().add(quizIntro);
		
		JLabel q1 = new JLabel("1.) ");
		q1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		q1.setBounds(10, 83, 277, 25);
		getContentPane().add(q1);
		
		JRadioButton op1 = new JRadioButton("");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 107, 109, 23);
		getContentPane().add(op1);
		
		JRadioButton op2 = new JRadioButton("");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 133, 109, 23);
		getContentPane().add(op2);
		
		JRadioButton op3 = new JRadioButton("");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 159, 109, 23);
		getContentPane().add(op3);
		
		JLabel lblWhatIs = new JLabel("2.) ");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(10, 182, 287, 25);
		getContentPane().add(lblWhatIs);
		
		JRadioButton op21 = new JRadioButton();
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 206, 109, 23);
		getContentPane().add(op21);
		
		JRadioButton op22 = new JRadioButton();
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 234, 109, 23);
		getContentPane().add(op22);
		
		JRadioButton op23 = new JRadioButton();
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 260, 109, 23);
		getContentPane().add(op23);
		
		JLabel lblSolveThis = new JLabel("3.)");
		lblSolveThis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThis.setBounds(10, 285, 287, 25);
		getContentPane().add(lblSolveThis);
		
		JRadioButton op31 = new JRadioButton("");
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 307, 109, 23);
		getContentPane().add(op31);
		
		JRadioButton op32 = new JRadioButton("");
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 333, 109, 23);
		getContentPane().add(op32);
		
		JRadioButton op33 = new JRadioButton("");
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(31, 359, 109, 23);
		getContentPane().add(op33);
		
		JLabel lblWhatIs_1 = new JLabel("4.) ");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(10, 382, 277, 25);
		getContentPane().add(lblWhatIs_1);
		
		JRadioButton op41 = new JRadioButton("");
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 404, 109, 23);
		getContentPane().add(op41);
		
		JRadioButton op42 = new JRadioButton("");
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(31, 431, 109, 23);
		getContentPane().add(op42);
		
		JRadioButton op43 = new JRadioButton("");
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(31, 457, 109, 23);
		getContentPane().add(op43);
		
		JLabel lblSolveThe = new JLabel("5.) ");
		lblSolveThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSolveThe.setBounds(403, 88, 350, 25);
		getContentPane().add(lblSolveThe);
		
		JRadioButton op51 = new JRadioButton("");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(425, 107, 109, 23);
		getContentPane().add(op51);
		
		JRadioButton op52 = new JRadioButton("");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(425, 133, 109, 23);
		getContentPane().add(op52);
		
		JRadioButton op53 = new JRadioButton("");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(425, 159, 109, 23);
		getContentPane().add(op53);
		
		JLabel lblIsThisA = new JLabel("6.) ");
		lblIsThisA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIsThisA.setBounds(403, 187, 350, 25);
		getContentPane().add(lblIsThisA);
		
		JRadioButton op61 = new JRadioButton("");
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(425, 206, 109, 23);
		getContentPane().add(op61);
		
		JRadioButton op62 = new JRadioButton("");
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(425, 234, 109, 23);
		getContentPane().add(op62);
		
		JLabel lblAStudentSolved = new JLabel("<html>7.) ");
		lblAStudentSolved.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAStudentSolved.setBounds(403, 264, 370, 46);
		getContentPane().add(lblAStudentSolved);
		
		JRadioButton op71 = new JRadioButton("");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(424, 307, 185, 23);
		getContentPane().add(op71);
		
		JRadioButton op72 = new JRadioButton("");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(424, 333, 146, 23);
		getContentPane().add(op72);
		
		JRadioButton op73 = new JRadioButton("");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(424, 359, 172, 23);
		getContentPane().add(op73);
		
		JButton btnNewButton = new JButton("Submit");
		
	
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(664, 450, 109, 37);
		getContentPane().add(btnNewButton);
		
		
	
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348,145);
				frame.setLocation(600,300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 7;
				if(!op3.isSelected()) {
					maxScore--;
				}
				if(!op22.isSelected()) {
					maxScore--;
				}
				if(!op33.isSelected()) {
					maxScore--;
				}
				if(!op41.isSelected()) {
					maxScore--;
				}
				if(!op51.isSelected()) {
					maxScore--;
				}
				if(!op61.isSelected()) {
					maxScore--;
				}
				if(!op71.isSelected()) {
					maxScore--;
					System.out.println("hi");
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
						Lesson1 w = new Lesson1();
						w.newClass();
					}
				});
			}
		});
	}

	
	
	public void newClass(){
	
	setSize(800,540);
	setLocation(300,100);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
	
}
