package GeometryTopics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.MathCalculators.CoordinateGridGeometryCalcs;
public class Slope extends JFrame {
	private JTextField x1;
	private JTextField y1;
	private JTextField x2;
	private JTextField y2;
	public Slope() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Slope");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(172, 11, 86, 42);
		getContentPane().add(title);
		
		JLabel info = new JLabel("Enter the two coordinates you want to find the slope of");
		info.setFont(new Font("Times New Roman",Font.ITALIC,12));
		info.setBounds(83, 50, 267, 14);
		getContentPane().add(info);
		
		JLabel label = new JLabel("Result");
		label.setBounds(29, 205, 354, 23);
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Calculate!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CoordinateGridGeometryCalcs c = new CoordinateGridGeometryCalcs();
				double s = c.slopeCalc(Double.parseDouble(x1.getText()),Double.parseDouble(y1.getText()), Double.parseDouble(x2.getText()), Double.parseDouble(y2.getText()));
				label.setText("The slope is " + s);	
			}
		});
		btnNewButton.setBounds(291, 140, 109, 23);
		getContentPane().add(btnNewButton);
		
		x1 = new JTextField();
		x1.setBounds(35, 89, 86, 20);
		getContentPane().add(x1);
		x1.setColumns(10);
		
		y1 = new JTextField();
		y1.setBounds(183, 89, 86, 20);
		getContentPane().add(y1);
		y1.setColumns(10);
		
		x2 = new JTextField();
		x2.setBounds(35, 141, 86, 20);
		getContentPane().add(x2);
		x2.setColumns(10);
		
		y2 = new JTextField();
		y2.setBounds(183, 141, 86, 20);
		getContentPane().add(y2);
		y2.setColumns(10);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x2.setText("");
				x1.setText("");
				y2.setText("");
				y1.setText("");
				label.setText("");
			}
		});
		reset.setBounds(291, 174, 109, 23);
		getContentPane().add(reset);
		
		JLabel lblNewLabel = new JLabel(",");
		lblNewLabel.setBounds(153, 80, 9, 39);
		getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel(",");
		label_1.setBounds(153, 144, 9, 39);
		getContentPane().add(label_1);
		
		
		
		
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
