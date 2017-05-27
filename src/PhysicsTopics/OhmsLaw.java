package PhysicsTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OhmsLaw extends JFrame {
	private JButton calc;

	private JLabel work;
	private JLabel label;
	private JTextField param1;
	private JTextField param2;

	public OhmsLaw() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Ohms Law");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(135, 11, 166, 42);
		getContentPane().add(title);

		JLabel lblNewLabel_1 = new JLabel("Enter the necessary parameters for your desired result");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(78, 52, 267, 14);
		getContentPane().add(lblNewLabel_1);

		calc = new JButton("Calculate");

		calc.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		calc.setBounds(317, 158, 89, 23);
		getContentPane().add(calc);

		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				param1.setText("");
				param2.setText("");
			}
		});
		btnReset.setBounds(317, 192, 89, 23);
		getContentPane().add(btnReset);

		param1 = new JTextField();
		getContentPane().add(param1);
		param1.setColumns(10);

		String[] ohms = { "Voltage", "Current", "Resistance" };

		JComboBox ops = new JComboBox(ohms);
		ops.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ops.setBounds(150, 88, 105, 23);
		getContentPane().add(ops);

		JLabel lab1 = new JLabel();
		lab1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab1.setBounds(78, 125, 97, 17);
		getContentPane().add(lab1);

		JLabel lab2 = new JLabel();
		lab2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab2.setBounds(78, 153, 97, 17);
		getContentPane().add(lab2);

		param2 = new JTextField();
		param2.setColumns(10);
		getContentPane().add(param2);

		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman", Font.BOLD, 14));
		result.setBounds(79, 192, 199, 32);
		getContentPane().add(result);

		if (ops.getSelectedItem() == "Voltage") {
			param2.setBounds(185, 150, 86, 20);
			param1.setBounds(185, 122, 86, 20);
			lab2.setText("Current");
			lab1.setText("Resistance");
			param2.setText("");
			param1.setText("");

			calc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int cur = Integer.parseInt(param2.getText());
					int res = Integer.parseInt(param1.getText());

					int vol = cur * res;

					result.setText(res + " Volts");
				}
			});
		} else if (ops.getSelectedItem() == "Current") {
			param2.setBounds(185, 150, 86, 20);
			param1.setBounds(185, 122, 86, 20);
			lab2.setText("Voltage");
			lab1.setText("Resistance");
			param2.setText("");
			param1.setText("");

			calc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int vol = Integer.parseInt(param2.getText());
					int res = Integer.parseInt(param1.getText());

					int cur = vol / res;
					result.setText(cur + " Amps");
				}
			});
		} else if (ops.getSelectedItem() == "Resistance") {
			param2.setBounds(185, 150, 86, 20);
			param1.setBounds(185, 122, 86, 20);
			param2.setText("");
			param1.setText("");
			lab2.setText("Current");
			lab1.setText("Voltage");

			calc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int cur = Integer.parseInt(param2.getText());
					int vol = Integer.parseInt(param1.getText());

					int res = vol / cur;

					result.setText(res + " Ohms");
				}
			});
		}

	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
