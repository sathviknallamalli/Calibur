package PhysicsTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.PhysicsCalculators.Motion;

public class FMA extends JFrame {
	private JButton btnHi;

	private JLabel work;
	private JLabel label;
	private JTextField in1;
	private JTextField in2;

	public FMA() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Newtons 2nd Law");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(75, 11, 285, 42);
		getContentPane().add(title);

		JLabel lblNewLabel_1 = new JLabel("Enter what you would like to calculate, then enter the required variables");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(35, 52, 349, 14);
		getContentPane().add(lblNewLabel_1);

		btnHi = new JButton("Calculate");

		btnHi.setBounds(313, 206, 89, 23);
		getContentPane().add(btnHi);

		String solveFor[] = { "Force", "Mass", "Acceleration" };

		JComboBox box = new JComboBox(solveFor);

		box.setFont(new Font("Times New Roman", Font.BOLD, 16));
		box.setBounds(46, 104, 114, 23);
		getContentPane().add(box);

		JLabel result = new JLabel("Result");
		result.setFont(new Font("Times New Roman", Font.BOLD, 14));
		result.setBounds(193, 109, 231, 14);
		getContentPane().add(result);

		in1 = new JTextField();

		getContentPane().add(in1);
		in1.setColumns(10);

		in2 = new JTextField();

		getContentPane().add(in2);
		in2.setColumns(10);

		JLabel param1 = new JLabel();
		param1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		param1.setBounds(33, 164, 77, 17);
		getContentPane().add(param1);

		JLabel param2 = new JLabel();
		param2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		param2.setBounds(35, 191, 121, 19);
		getContentPane().add(param2);

		box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == box) {
					JComboBox cb = (JComboBox) e.getSource();
					String msg = (String) cb.getSelectedItem();
					switch (msg) {
					case "Force":

						param1.setText("Mass (kg)");
						param2.setText("Acceleration (m/s/s)");
						in1.setBounds(181, 161, 86, 20);
						in2.setBounds(181, 192, 86, 20);
						btnHi.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Motion m = new Motion();
								String answerF = m.newton2LawForce(Double.parseDouble(in1.getText()),
										Double.parseDouble(in2.getText()));
								result.setText("force is " + answerF);
							}
						});
						break;
					case "Mass":
						param1.setText("Force (N)");
						param2.setText("Acceleration (m/s/s)");
						in1.setBounds(181, 161, 86, 20);
						in2.setBounds(181, 192, 86, 20);
						btnHi.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Motion m = new Motion();
								String answer = m.newton2LawMass(Double.parseDouble(in1.getText()),
										Double.parseDouble(in2.getText()));
								result.setText("mass is " + answer);
							}
						});
						break;
					}
				}
			}
		});

	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
