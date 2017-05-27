package AlgebraTopics;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EquationSolver extends JFrame {
	private JTextField textField;

	public EquationSolver() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Equation Solver");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(81, 11, 273, 42);
		getContentPane().add(title);

		JLabel lblNewLabel = new JLabel("Please enter in the proper parameters according to the given format\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 11));
		lblNewLabel.setBounds(58, 50, 320, 14);
		getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(32, 84, 39, 27);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(74, 97, 46, 14);
		getContentPane().add(lblNewLabel_1);
	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
