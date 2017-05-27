package FundamentalsOfAlgebraContents;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
public class Test3 extends JFrame {
	public Test3() {
		getContentPane().setLayout(null);
		
	
		JLabel intro = new JLabel("<html>The equation -x+8 = 8-x. We know this equation is a negative x and the commutative property woudld technically make the equation...-x+8 = 8+(-x). However a positive times a negative is a negative so the equation will simplify to 8-x");
		intro.setFont(new Font("Times New Roman",Font.PLAIN,13));
		intro.setBounds(10, 11, 388, 72);
		getContentPane().add(intro);
		
		JLabel r1 = new JLabel("<html>The Additive Property is not real the Additive Identity is");
		r1.setFont(new Font("Times New Roman",Font.PLAIN,13));
		r1.setBounds(10, 94, 400, 48);
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
