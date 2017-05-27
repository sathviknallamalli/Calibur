package GeometryTopics;

import java.awt.Font;
import studentHub.MathCalculators.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Circle extends JFrame {
	private JTextField param1;
	private JTextField param2;
	private JTextField radius;

	public Circle() {
		getContentPane().setLayout(null);
		JLabel result = new JLabel("");
		result.setFont(new Font("Times New Roman", Font.BOLD, 14));
		result.setBounds(62, 223, 318, 41);
		getContentPane().add(result);
		JLabel title = new JLabel("Circle Area");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(137, 11, 190, 42);
		getContentPane().add(title);

		JLabel info = new JLabel("Enter in the following parameters to calculate the area");
		info.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		info.setBounds(99, 51, 265, 14);
		getContentPane().add(info);

		param1 = new JTextField();
		getContentPane().add(param1);
		param1.setColumns(10);

		JLabel lab1 = new JLabel();
		lab1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab1.setBounds(241, 144, 118, 14);
		getContentPane().add(lab1);

		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		getContentPane().add(reset);

		param2 = new JTextField();
		param2.setColumns(10);
		getContentPane().add(param2);

		JTextField param3 = new JTextField();
		param3.setColumns(10);
		getContentPane().add(param3);

		JLabel lab3 = new JLabel();
		lab3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lab3.setBounds(241, 206, 118, 14);
		getContentPane().add(lab3);

		JButton btnNewButton_1 = new JButton("CALCULATE!");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Radius");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(164, 92, 46, 14);
		getContentPane().add(lblNewLabel);

		radius = new JTextField();
		radius.setBounds(220, 90, 86, 20);
		getContentPane().add(radius);
		radius.setColumns(10);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = Integer.parseInt(radius.getText());
			

				double area = Math.PI * r * r;

				result.setText("The area of the given circle is " + area);
			}
		});
		btnNewButton.setBounds(164, 121, 138, 23);
		getContentPane().add(btnNewButton);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radius.setText("");
				result.setText("");
			}
		});
		btnReset.setBounds(164, 155, 138, 23);
		getContentPane().add(btnReset);

	}

	public void newClass() {

		setSize(792, 283);
		setLocation(400, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
