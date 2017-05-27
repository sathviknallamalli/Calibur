package GeometryTopics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DegreesToRadiansConversions extends JFrame {
	private JTextField input;
	
	public DegreesToRadiansConversions() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Radians & Degrees Conversions");
		title.setFont(new Font("Castellar",Font.PLAIN,20));
		title.setBounds(23, 11, 388, 42);
		getContentPane().add(title);
		
		JLabel info = new JLabel("Enter your conversion and enter the variables");
		info.setFont(new Font("Times New Roman",Font.ITALIC,12));
		info.setBounds(105, 49, 226, 14);
		getContentPane().add(info);
		
		JButton btnNewButton = new JButton("Calculate!");
		
		btnNewButton.setBounds(283, 199, 109, 23);
		getContentPane().add(btnNewButton);
		
		String[] options = {"Degrees","Radians"};
		JComboBox one = new JComboBox(options);
		one.setFont(new Font("Times New Roman",Font.BOLD,14));
		one.setBounds(41, 97, 96, 23);
		getContentPane().add(one);
		
		JComboBox two = new JComboBox(options);
		
		two.setFont(new Font("Times New Roman",Font.BOLD,14));
		two.setBounds(235, 98, 96, 23);
		getContentPane().add(two);
		
		input = new JTextField();
		
		getContentPane().add(input);
		input.setColumns(10);
		
		JLabel instr = new JLabel();
		instr.setFont(new Font("Times New Roman",Font.PLAIN,14));
		instr.setBounds(41, 180, 206, 14);
		getContentPane().add(instr);
		
		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman",Font.BOLD,14));
		result.setBounds(41, 233, 351, 14);
		getContentPane().add(result);
		
		JLabel extra = new JLabel();
		extra.setFont(new Font("Times New Roman",Font.PLAIN,14));
		extra.setBounds(173,160,193,20);
		getContentPane().add(extra);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(one.getSelectedItem() == options[0]) {
					input.setBounds(41, 149, 96, 20);
					instr.setText("Please enter the number of degrees");
				}
				else if(one.getSelectedItem() == options[1]){
					input.setBounds(41, 149, 96, 20);
					instr.setText("Please enter the number of radians");
					extra.setText("Please enter in the form of ___pi");
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(one.getSelectedItem() == options[0] && two.getSelectedItem() == options[1]){
					double num = (Double.parseDouble(input.getText()))/180;
					double rads = num * Math.PI;
					result.setText("The number of radians is " + num + "radians or " + num + "pi");
				}
				else if(one.getSelectedItem() == options[1] && two.getSelectedItem() == options[0]){
					double deg = Double.parseDouble(input.getText()) * 180;
					result.setText("The number of degrees is " + deg);
				}
				
			}
		});
		
		
		
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
