package FundamentalsOfAlgebra;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Test extends JFrame {
	public Test() {
		getContentPane().setLayout(null);
		
	
		
		JLabel lblNewLabel = new JLabel("<html>Commutative property states that the values are same and you swap the order. Since Option 3 has three vairables and parantheses it is NOT THAT.\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(12, 11, 388, 48);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Option 1:\r\n");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(6, 75, 84, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lbltheSidesHave = new JLabel("<html>The sides have to be equal. 2-7=-5 and 7-2 is 5. They are not the same so it is an invalid equation");
		lbltheSidesHave.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheSidesHave.setBounds(12, 93, 388, 32);
		getContentPane().add(lbltheSidesHave);
		
		JLabel lblOption = new JLabel("Option 2:\r\n");
		lblOption.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblOption.setBounds(6, 136, 84, 14);
		getContentPane().add(lblOption);
		
		JLabel lblthisEquationWorks = new JLabel("<html>This equation works for addition, and if you substitue values. 2+7=9 and 7+2=9 They are equal");
		lblthisEquationWorks.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisEquationWorks.setBounds(12, 158, 388, 32);
		getContentPane().add(lblthisEquationWorks);
	}

	public void close() {
		WindowEvent w = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}
	
	public void newClass(){
	
	setSize(466,240);
	setLocation(300,100);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
