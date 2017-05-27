package FundamentalsOfAlgebraContents;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Test4 extends JFrame {
	public Test4() {
		getContentPane().setLayout(null);
		
	
		JLabel intro = new JLabel("<html>The commutative is where the variables are swapped and the Associative is when the groups of the parantheses are switched around, so the correct ANSWER IS OPTION 2");
		intro.setFont(new Font("Times New Roman",Font.PLAIN,13));
		intro.setBounds(10, 11, 388, 72);
		getContentPane().add(intro);
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
