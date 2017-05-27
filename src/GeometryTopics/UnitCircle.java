package GeometryTopics;

import java.awt.Font;
import studentHub.MathCalculators.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import java.awt.TextField;

public class UnitCircle extends JFrame {
	public UnitCircle() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Unit Circle Theory");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(62, 11, 310, 42);
		getContentPane().add(title);

		ImageIcon img1;
		JLabel lab1;
		
		img1 = new ImageIcon(getClass().getResource("momentum.jpg"));
		lab1 = new JLabel(img1);
		getContentPane().add(lab1);

	}

	public void newClass() {

		setSize(600, 600);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
