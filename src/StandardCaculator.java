import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class StandardCaculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public  void newClass() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StandardCaculator window = new StandardCaculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StandardCaculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Standard Calculator");
		frame.setBounds(100, 100, 279, 320);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 237, 27);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton clear = new JButton("CE");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		clear.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		clear.setBounds(57, 44, 45, 34);
		frame.getContentPane().add(clear);
		
		JButton clearAll = new JButton("C");
		clearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		clearAll.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		clearAll.setBounds(105, 44, 45, 34);
		frame.getContentPane().add(clearAll);
		
		JButton plusMinus = new JButton("\u00B1");
		plusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		plusMinus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		plusMinus.setBounds(154, 44, 45, 34);
		frame.getContentPane().add(plusMinus);
		
		JButton sqrt = new JButton("\u221A");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		sqrt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sqrt.setBounds(202, 44, 53, 34);
		frame.getContentPane().add(sqrt);
		
		JButton backspace = new JButton("\uF0E7");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				
				if(txtDisplay.getText().length() >0){
					StringBuilder sb = new StringBuilder(txtDisplay.getText());
					sb.deleteCharAt(txtDisplay.getText().length() - 1);
					back = sb.toString();
					txtDisplay.setText(back);
				}
				
			}
		});
		backspace.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		backspace.setBounds(10, 44, 45, 34);
		frame.getContentPane().add(backspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn7.setBounds(10, 82, 45, 34);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn8.setBounds(57, 82, 45, 34);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn9.setBounds(105, 82, 45, 34);
		frame.getContentPane().add(btn9);
		
		JButton divi = new JButton("/");
		divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		divi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		divi.setBounds(154, 82, 45, 34);
		frame.getContentPane().add(divi);
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		percent.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		percent.setBounds(202, 82, 53, 34);
		frame.getContentPane().add(percent);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn4.setBounds(10, 120, 45, 34);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn5.setBounds(57, 120, 45, 34);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn6.setBounds(105, 120, 45, 34);
		frame.getContentPane().add(btn6);
		
		JButton button = new JButton("*");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(154, 120, 45, 34);
		frame.getContentPane().add(button);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn1.setBounds(10, 160, 45, 34);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn2.setBounds(57, 160, 45, 34);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn3.setBounds(105, 160, 45, 34);
		frame.getContentPane().add(btn3);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		minus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		minus.setBounds(154, 160, 45, 34);
		frame.getContentPane().add(minus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(iNum);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btn0.setBounds(10, 200, 92, 34);
		frame.getContentPane().add(btn0);
		
		JButton decpoint = new JButton(".");
		decpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = ".";
				
			}
		});
		decpoint.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		decpoint.setBounds(105, 200, 45, 34);
		frame.getContentPane().add(decpoint);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		plus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		plus.setBounds(154, 200, 45, 34);
		frame.getContentPane().add(plus);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum = Double.parseDouble(txtDisplay.getText());
				if(operations=="+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		equals.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		equals.setBounds(202, 160, 53, 74);
		frame.getContentPane().add(equals);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = 1 / firstNum;
				answer = String.format("%.2f", result);
				txtDisplay.setText(answer);
			}
		});
		btnx.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnx.setBounds(202, 120, 53, 34);
		frame.getContentPane().add(btnx);
		
		JButton btnNewButton = new JButton("Back to Main Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				m.setVisible(true);
				m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				m.setSize(800,600);
			}
		});
		btnNewButton.setBounds(40, 251, 166, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
