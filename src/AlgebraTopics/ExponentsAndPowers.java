package AlgebraTopics;
import java.awt.Font;

import javax.swing.*;
public class ExponentsAndPowers extends JFrame {
	public ExponentsAndPowers() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Exponents & Powers");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(59, 11, 321, 42);
		getContentPane().add(title);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
