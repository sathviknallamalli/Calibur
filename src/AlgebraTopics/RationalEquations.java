package AlgebraTopics;
import java.awt.Font;

import javax.swing.*;
public class RationalEquations extends JFrame {
	public RationalEquations() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Rational Equations");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(57, 11, 327, 42);
		getContentPane().add(title);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
