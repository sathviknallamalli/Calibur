package AlgebraTopics;
import java.awt.Font;

import javax.swing.*;
public class WordProblems extends JFrame {
	public WordProblems() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Word Problems");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(95, 11, 259, 42);
		getContentPane().add(title);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
