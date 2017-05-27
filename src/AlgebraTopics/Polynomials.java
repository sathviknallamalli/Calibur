package AlgebraTopics;
import java.awt.Font;

import javax.swing.*;
public class Polynomials extends JFrame {
	public Polynomials() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Polynomials");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(110, 11, 214, 42);
		getContentPane().add(title);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
