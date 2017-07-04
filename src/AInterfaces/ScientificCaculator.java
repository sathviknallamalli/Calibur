package AInterfaces;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class ScientificCaculator {

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
	public void newClass() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCaculator window = new ScientificCaculator();
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
	public ScientificCaculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Scientific Calculator");
		frame.setBounds(100, 100, 523, 303);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmStandardCalculator = new JMenuItem("Standard Calculator");
		mntmStandardCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StandardCalculator sc = new StandardCalculator();
				sc.newClass();
			}
		});
		mntmStandardCalculator.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnFile.add(mntmStandardCalculator);
		frame.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Arial", Font.PLAIN, 11));
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

				if (txtDisplay.getText().length() > 0) {
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
				if (operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if (operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if (operations == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				} else if (operations == "/") {
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

		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLog.setBounds(265, 44, 53, 34);
		frame.getContentPane().add(btnLog);

		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSin.setBounds(320, 44, 57, 34);
		frame.getContentPane().add(btnSin);

		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSinh.setBounds(378, 44, 57, 34);
		frame.getContentPane().add(btnSinh);

		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCos.setBounds(320, 82, 57, 34);
		frame.getContentPane().add(btnCos);

		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCosh.setBounds(378, 82, 57, 34);
		frame.getContentPane().add(btnCosh);

		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnTan.setBounds(320, 120, 57, 34);
		frame.getContentPane().add(btnTan);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnTanh.setBounds(378, 120, 57, 34);
		frame.getContentPane().add(btnTanh);

		JButton btnExp = new JButton("Exp");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnExp.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnExp.setBounds(437, 120, 57, 34);
		frame.getContentPane().add(btnExp);

		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Mod";

			}
		});
		btnMod.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnMod.setBounds(437, 44, 57, 34);
		frame.getContentPane().add(btnMod);

		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLnx.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnLnx.setBounds(437, 82, 57, 34);
		frame.getContentPane().add(btnLnx);

		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRund.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnRund.setBounds(378, 160, 57, 34);
		frame.getContentPane().add(btnRund);

		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCbr.setBounds(320, 159, 57, 34);
		frame.getContentPane().add(btnCbr);

		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a, 2));
			}
		});
		btnBin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBin.setBounds(320, 200, 57, 34);
		frame.getContentPane().add(btnBin);

		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a, 16));
			}
		});
		btnHex.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnHex.setBounds(378, 200, 57, 34);
		frame.getContentPane().add(btnHex);

		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a, 8));
			}
		});
		btnOctal.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnOctal.setBounds(437, 200, 57, 34);
		frame.getContentPane().add(btnOctal);

		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnXy.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnXy.setBounds(265, 120, 53, 34);
		frame.getContentPane().add(btnXy);

		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnX.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnX.setBounds(265, 160, 53, 34);
		frame.getContentPane().add(btnX);

		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, 3);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnX_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnX_1.setBounds(265, 200, 53, 34);
		frame.getContentPane().add(btnX_1);

		JButton button_3 = new JButton("2*\u03C0");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535) * 2;
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_3.setBounds(437, 160, 57, 34);
		frame.getContentPane().add(button_3);

		JButton pi = new JButton("\u03C0");
		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = 3.1415926535;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		pi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pi.setBounds(265, 83, 53, 34);
		frame.getContentPane().add(pi);
	}

}
