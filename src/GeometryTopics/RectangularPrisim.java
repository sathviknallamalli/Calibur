package GeometryTopics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.MathCalculators.BasicGeometryCalcs;
public class RectangularPrisim extends JFrame {
	private JTextField length;
	private JTextField width;
	private JTextField height;
	public RectangularPrisim() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Surface Area - Rectangular Prisim");
		title.setFont(new Font("Castellar", Font.PLAIN, 18));
		title.setBounds( 16,11, 396, 42);
		getContentPane().add(title);
		
		JLabel info = new JLabel("Enter the length,width, and height");
		info.setFont(new Font("Times New Roman",Font.ITALIC,12));
		info.setBounds(130, 52, 169, 14);
		getContentPane().add(info);
		
		JLabel lblBaseLength = new JLabel("Length");
		lblBaseLength.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblBaseLength.setBounds(40, 96, 85, 19);
		getContentPane().add(lblBaseLength);
		
		length = new JTextField();
		length.setBounds(173, 97, 86, 20);
		getContentPane().add(length);
		length.setColumns(10);
		
		JLabel lblTallLeg = new JLabel("Width");
		lblTallLeg.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTallLeg.setBounds(40, 126, 109, 19);
		getContentPane().add(lblTallLeg);
		
		width = new JTextField();
		width.setColumns(10);
		width.setBounds(173, 128, 86, 20);
		getContentPane().add(width);
		
		JLabel label = new JLabel("Result");
		label.setBounds(40, 201, 354, 23);
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Calculate!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BasicGeometryCalcs b = new BasicGeometryCalcs();
				double sa = b.surfacePrisim(Double.parseDouble(length.getText()), Double.parseDouble(width.getText()), Double.parseDouble(height.getText()));
				label.setText("Surface area of this prisim is " + sa + " units");
				
			}
		});
		btnNewButton.setBounds(291, 140, 109, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblHeight.setBounds(40, 156, 109, 19);
		getContentPane().add(lblHeight);
		
		height = new JTextField();
		height.setColumns(10);
		height.setBounds(173, 159, 86, 20);
		getContentPane().add(height);
		
		
		
		
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
