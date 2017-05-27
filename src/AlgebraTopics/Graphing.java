package AlgebraTopics;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Graphing extends JFrame {
	public Graphing() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Graphing");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(139, 11, 159, 42);
		getContentPane().add(title);
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}

}
