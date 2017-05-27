package FundamentalsOfAlgebraContents;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
public class Test2 extends JFrame {
	public Test2() {
		getContentPane().setLayout(null);
		
	
		JLabel intro = new JLabel("<html>The distributive property states that you multiply a number outside the parantheses with the values inside, if it is an ecpression it will remain as an expression");
		intro.setFont(new Font("Times New Roman",Font.PLAIN,13));
		intro.setBounds(10, 11, 388, 48);
		getContentPane().add(intro);
		
		JLabel r1 = new JLabel("<html>The first option represents the associative property and the only option that multiplies values is option 2, because option 3 is just adding random variables, so the ANSWER IS OPTION 2");
		r1.setFont(new Font("Times New Roman",Font.PLAIN,13));
		r1.setBounds(10, 70, 400, 48);
		getContentPane().add(r1);
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
