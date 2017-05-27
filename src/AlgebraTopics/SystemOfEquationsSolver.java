package AlgebraTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SystemOfEquationsSolver extends JFrame {
	private JTextField x1;
	private JTextField y1;
	private JTextField con1;
	private JTextField x2;
	private JTextField y2;
	private JTextField con2;

	public SystemOfEquationsSolver() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("System of Equations Solver");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(43, 11, 349, 42);
		getContentPane().add(title);

		x1 = new JTextField();
		x1.setBounds(43, 86, 63, 29);
		getContentPane().add(x1);
		x1.setColumns(10);

		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman", Font.BOLD, 14));
		result.setBounds(29, 209, 205, 29);
		getContentPane().add(result);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int xOne = Integer.parseInt(x1.getText());
				int xTwo = Integer.parseInt(x2.getText());
				int yOne = Integer.parseInt(y1.getText());
				int yTwo = Integer.parseInt(y2.getText());

				int newy1 = yOne * xTwo;
				int newy2 = yTwo * xOne;

				int yDiff = newy1 - newy2;

				int diff1 = Integer.parseInt(con1.getText()) * xTwo;
				int diff2 = Integer.parseInt(con2.getText()) * xOne;

				int conDiff = diff1 - diff2;

				final int Y = conDiff / yDiff;

				int tempX = Integer.parseInt(con2.getText()) - (Y * yTwo);

				final int X = tempX / xTwo;

				result.setText("The y value is " + Y + " and The x value is " + X);

				int commonDenom = xOne * xTwo;

			}
		});
		btnNewButton.setBounds(261, 214, 149, 37);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Equation 1");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 52, 74, 23);
		getContentPane().add(lblNewLabel);

		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblX.setBounds(108, 97, 9, 23);
		getContentPane().add(lblX);

		JLabel label = new JLabel("+");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label.setBounds(139, 89, 9, 23);
		getContentPane().add(label);

		y1 = new JTextField();
		y1.setColumns(10);
		y1.setBounds(171, 86, 63, 29);
		getContentPane().add(y1);

		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblY.setBounds(240, 97, 9, 23);
		getContentPane().add(lblY);

		JLabel label_1 = new JLabel("=");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(269, 86, 9, 23);
		getContentPane().add(label_1);

		con1 = new JTextField();
		con1.setColumns(10);
		con1.setBounds(299, 86, 63, 29);
		getContentPane().add(con1);

		x2 = new JTextField();
		x2.setColumns(10);
		x2.setBounds(43, 156, 63, 29);
		getContentPane().add(x2);

		JLabel lblEquation = new JLabel("Equation 2");
		lblEquation.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEquation.setBounds(43, 123, 74, 23);
		getContentPane().add(lblEquation);

		JLabel label_2 = new JLabel("X");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_2.setBounds(108, 168, 9, 23);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("+");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_3.setBounds(139, 156, 9, 23);
		getContentPane().add(label_3);

		y2 = new JTextField();
		y2.setColumns(10);
		y2.setBounds(171, 156, 63, 29);
		getContentPane().add(y2);

		JLabel label_4 = new JLabel("Y");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_4.setBounds(240, 168, 9, 23);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("=");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_5.setBounds(269, 163, 9, 23);
		getContentPane().add(label_5);

		con2 = new JTextField();
		con2.setColumns(10);
		con2.setBounds(299, 156, 63, 29);
		getContentPane().add(con2);

	}

	public void newClass() {

		setSize(453, 301);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
