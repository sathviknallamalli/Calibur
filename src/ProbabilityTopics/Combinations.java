package ProbabilityTopics;
import java.awt.Font;
import studentHub.MathCalculators.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Combinations extends JFrame {
	private JTextField n;
	private JTextField r;
	public Combinations() {
		getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Combinations");
		title.setFont(new Font("Castellar",Font.PLAIN,25));
		title.setBounds(102, 11, 230, 42);
		getContentPane().add(title);
		
		JLabel info = new JLabel("Enter the total value of the set, and the number of items to combine from the set");
		info.setFont(new Font("Times New Roman",Font.ITALIC,12));
		info.setBounds(29, 49, 384, 14);
		getContentPane().add(info);
		
		JLabel result = new JLabel("Result");
		result.setFont(new Font("Times New Roman",Font.PLAIN,14));
		result.setBounds(29, 215, 303, 14);
		getContentPane().add(result);
		
		
		JButton btnNewButton = new JButton("Calculate!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num=1;
				for(int i = Integer.parseInt(n.getText()); i>0; i-- ) {
					num = i * num;
				}
				double rFact =1;
				for(int i = Integer.parseInt(r.getText()); i>0; i-- ) {
					rFact = i * rFact;
				}
				int diff = Integer.parseInt(n.getText()) - Integer.parseInt(r.getText());
				double diffFact = 1;
				for(int i = diff; i>0; i-- ) {
					diffFact = i * diffFact;
				}
				double ans = num/(diffFact * rFact);
				result.setText("The number of combinations are " + ans);
				
			}
		});
		btnNewButton.setBounds(291, 140, 109, 23);
		getContentPane().add(btnNewButton);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n.setText("");
				r.setText("");
				result.setText("Result");
				
			}
		});
		reset.setBounds(291, 174, 109, 23);
		getContentPane().add(reset);
		
		n = new JTextField();
		n.setBounds(142, 98, 86, 20);
		getContentPane().add(n);
		n.setColumns(10);
		
		r = new JTextField();
		r.setColumns(10);
		r.setBounds(142, 158, 86, 20);
		getContentPane().add(r);
		
		JLabel lblN = new JLabel("n");
		lblN.setFont(new Font("Times New Roman",Font.PLAIN,14));
		lblN.setBounds(96, 101, 19, 17);
		getContentPane().add(lblN);
		
		JLabel lblR = new JLabel("r");
		lblR.setFont(new Font("Times New Roman",Font.PLAIN,14));
		lblR.setBounds(96, 161, 19, 17);
		getContentPane().add(lblR);
		
		
		
		
		
		
	}

	
	
	public void newClass(){
	
	setSize(452,300);
	setLocation(600,300);
	setVisible(true);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
}
