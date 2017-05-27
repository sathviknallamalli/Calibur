package AlgebraTopics;
import java.awt.Font;

import javax.swing.*;
public class Inequalities extends JFrame {
	public Inequalities() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Inequalities");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(118, 11, 198, 42);
		getContentPane().add(title);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
