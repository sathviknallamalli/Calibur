package GeometryTopics;
import java.awt.Font;
import studentHub.MathCalculators.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Hypotnuese extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public Hypotnuese() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Hypotnuese");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(120, 11, 192, 42);
		getContentPane().add(title);
		
		JLabel info = new JLabel("Enter the lengths of the base and leg");
		info.setFont(new Font("Times New Roman",Font.ITALIC,12));
		info.setBounds(120, 52, 179, 14);
		getContentPane().add(info);
		
		JLabel lblBaseLength = new JLabel("Base Length");
		lblBaseLength.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBaseLength.setBounds(40, 96, 85, 19);
		getContentPane().add(lblBaseLength);
		
		textField = new JTextField();
		textField.setBounds(173, 97, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTallLeg = new JLabel("Tall Leg - Height");
		lblTallLeg.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTallLeg.setBounds(40, 140, 109, 19);
		getContentPane().add(lblTallLeg);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 141, 86, 20);
		getContentPane().add(textField_1);
		
		JLabel label = new JLabel("Result");
		label.setBounds(28, 75, 354, 23);
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Calculate!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BasicGeometryCalcs b = new BasicGeometryCalcs();
				double hyp = b.hypotneuse(Double.parseDouble(textField.getText()), Double.parseDouble(textField_1.getText()));
				label.setText("The hypotnuese of the triangle is " + hyp);
				
			}
		});
		btnNewButton.setBounds(291, 140, 109, 23);
		getContentPane().add(btnNewButton);
		
		
		
		
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
