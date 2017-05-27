package GeometryTopics;

import java.awt.Font;
import studentHub.MathCalculators.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrigRatios extends JFrame {
	private JTextField in1;
	private JTextField in2;

	public TrigRatios() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Right Triangle Ratios");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(35, 11, 365, 42);
		getContentPane().add(title);

		JLabel info = new JLabel("Choose your function, and enter the lengths of the legs");
		info.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		info.setBounds(83, 50, 267, 14);
		getContentPane().add(info);

		JLabel label = new JLabel("Result");
		label.setBounds(32, 227, 354, 23);
		getContentPane().add(label);

		String[] functions = { "Sin", "Cosine", "Tangent", "Cosecant", "Secant", "Cotangent" };

		JComboBox box = new JComboBox(functions);
		
		box.setFont(new Font("Times New Roman", Font.BOLD, 16));
		box.setBounds(22, 90, 120, 23);
		getContentPane().add(box);

		in1 = new JTextField();

		getContentPane().add(in1);
		in1.setColumns(10);

		in2 = new JTextField();

		getContentPane().add(in2);
		in2.setColumns(10);

		JLabel lblHypotnuese = new JLabel();
		lblHypotnuese.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblHypotnuese.setBounds(30, 187, 86, 19);
		getContentPane().add(lblHypotnuese);

		JLabel lblSide = new JLabel();
		lblSide.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSide.setBounds(30, 144, 86, 19);
		getContentPane().add(lblSide);
		JButton btnNewButton = new JButton("Calculate!");
		
		btnNewButton.setBounds(291, 140, 109, 23);
		getContentPane().add(btnNewButton);
		
		box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == box) {
					JComboBox cb = (JComboBox) e.getSource();
					String msg = (String) cb.getSelectedItem();
					switch (msg) {
					case "Sin":
						lblSide.setText("Opposite");
						lblHypotnuese.setText("Hypotnuese");

						in2.setBounds(126, 188, 86, 20);
						in1.setBounds(126, 145, 86, 20);
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								TrigGeometryCalcs tc = new TrigGeometryCalcs();
								double val = tc.sinA(Double.parseDouble(in1.getText()), Double.parseDouble(in2.getText()));
								label.setText("The sin value is " + val);
							}
						});
						break;
					case "Cosine":
				
						lblSide.setText("Adjacent");
						lblHypotnuese.setText("Hypotnuese");

						in2.setBounds(126, 188, 86, 20);
						in1.setBounds(126, 145, 86, 20);
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								TrigGeometryCalcs tc = new TrigGeometryCalcs();
								double val = tc.cosA(Double.parseDouble(in1.getText()), Double.parseDouble(in2.getText()));
								label.setText("The cosine value is " + val);
							}
						});
						break;
					case "Tangent":
						lblSide.setText("Opposite");
						lblHypotnuese.setText("Adjacent");

						in2.setBounds(126, 188, 86, 20);
						in1.setBounds(126, 145, 86, 20);
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								TrigGeometryCalcs tc = new TrigGeometryCalcs();
								double val = tc.sinA(Double.parseDouble(in1.getText()), Double.parseDouble(in2.getText()));
								label.setText("The tangent value is " + val);
							}
						});
						break;
					case "Cosecant":
						lblSide.setText("Opposite");
						lblHypotnuese.setText("Hypotnuese");

						in2.setBounds(126, 188, 86, 20);
						in1.setBounds(126, 145, 86, 20);
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								TrigGeometryCalcs tc = new TrigGeometryCalcs();
								double val = tc.sinA(Double.parseDouble(in2.getText()), Double.parseDouble(in1.getText()));
								label.setText("The cosecant value is " + val);
							}
						});
						break;
					case "Secant":
						lblSide.setText("Adjacent");
						lblHypotnuese.setText("Hypotnuese");

						in2.setBounds(126, 188, 86, 20);
						in1.setBounds(126, 145, 86, 20);
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								TrigGeometryCalcs tc = new TrigGeometryCalcs();
								double val = tc.sinA(Double.parseDouble(in2.getText()), Double.parseDouble(in1.getText()));
								label.setText("The secant value is " + val);
							}
						});
						break;
					case "Cotangent":
						lblSide.setText("Opposite");
						lblHypotnuese.setText("Adjacent");

						in2.setBounds(126, 188, 86, 20);
						in1.setBounds(126, 145, 86, 20);
						
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								TrigGeometryCalcs tc = new TrigGeometryCalcs();
								double val = tc.sinA(Double.parseDouble(in2.getText()), Double.parseDouble(in1.getText()));
								label.setText("The sin value is " + val);
							}
						});
						break;

					}
				}
			}
		});
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				label.setText("");
			}
		});
		reset.setBounds(291, 174, 109, 23);
		getContentPane().add(reset);

		JButton hyp = new JButton("Hypotnuese");
		hyp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hypotnuese h = new Hypotnuese();
				h.newClass();
			}
		});
		hyp.setBounds(291, 216, 109, 23);
		getContentPane().add(hyp);

	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

}
