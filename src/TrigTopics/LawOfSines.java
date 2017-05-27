package TrigTopics;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class LawOfSines extends JFrame {
	private JTextField a;
	private JTextField b;
	private JTextField c;
	public LawOfSines() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Quadratics");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(134, 11, 198, 42);
		getContentPane().add(title);
		
		JLabel lblNewLabel = new JLabel("Please enter in values a, b, c for the quadratic equation\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel.setBounds(82, 49, 273, 14);
		getContentPane().add(lblNewLabel);
		
		a = new JTextField();
		a.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		a.setBounds(48, 74, 29, 20);
		getContentPane().add(a);
		a.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("x^2");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(80, 80, 17, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblX = new JLabel("x\r\n");
		lblX.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblX.setBounds(164, 80, 17, 14);
		getContentPane().add(lblX);
		
		b = new JTextField();
		b.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		b.setColumns(10);
		b.setBounds(130, 74, 29, 20);
		getContentPane().add(b);
		
		JLabel label = new JLabel("+\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setBounds(107, 78, 17, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("+\r\n");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_1.setBounds(181, 78, 17, 14);
		getContentPane().add(label_1);
		
		c = new JTextField();
		c.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		c.setColumns(10);
		c.setBounds(202, 74, 29, 20);
		getContentPane().add(c);
		
		JLabel label_2 = new JLabel("=\r\n");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_2.setBounds(241, 78, 17, 14);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("0\r\n");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_3.setBounds(258, 78, 17, 14);
		getContentPane().add(label_3);
		
		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		result.setBounds(58, 171, 212, 42);
		getContentPane().add(result);
		
		
		
		JButton calc = new JButton("Calculate!");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a1 = Integer.parseInt(a.getText());
				int b1 = Integer.parseInt(b.getText());
				int c1 = Integer.parseInt(c.getText());
				
				double disc = (b1 * b1) - (4*a1*c1);
				int denom = 2*a1;
				double result1 = ((0-b1) + disc) / (denom);
				double result2 = ((0-b1) - disc) / (denom);
				
				if(disc<0) {
					String res = "<html> There are no real solutions to this equations";
				}
				
				String res = "<html> The solutions to this equation are " + result1 + " and " + result2;
				result.setText(res);
			}
		});
		calc.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		calc.setBounds(284, 107, 89, 23);
		getContentPane().add(calc);
		
		JButton reset = new JButton("Reset\r\n");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setText("");
				b.setText("");
				c.setText("");
				result.setText("");
			}
		});
		reset.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		reset.setBounds(284, 143, 89, 23);
		getContentPane().add(reset);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
