package PhysicsTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.PhysicsCalculators.Motion;

public class Work extends JFrame {
	private JTextField f;
	private JLabel dist;
	private JTextField d;
	private JButton btnHi;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel work;

	public Work() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Work");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(167, 11, 100, 42);
		getContentPane().add(title);
		
		lblNewLabel_1 = new JLabel("Enter the force and distance");
		lblNewLabel_1.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblNewLabel_1.setBounds(138, 52, 147, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel force = new JLabel("Force");
		force.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		force.setBounds(66, 88, 50, 19);
		getContentPane().add(force);

		f = new JTextField();
		f.setBounds(181, 89, 86, 20);
		getContentPane().add(f);
		f.setColumns(10);

		dist = new JLabel("Distance");
		dist.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dist.setBounds(66, 146, 59, 19);
		getContentPane().add(dist);

		d = new JTextField();
		d.setColumns(10);
		d.setBounds(181, 147, 86, 20);
		getContentPane().add(d);

		btnHi = new JButton("Calculate");

		btnHi.setBounds(307, 134, 89, 23);
		getContentPane().add(btnHi);

		JLabel work = new JLabel("Result");
		work.setBounds(277, 71, 147, 23);
		getContentPane().add(work);

		btnHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motion m = new Motion();
				
				String w = m.work(Double.parseDouble(f.getText()),Double.parseDouble(d.getText()));
				work.setText(w + " ");
			}
		});
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setText("");
				f.setText("");
			}
		});
		btnReset.setBounds(307, 183, 89, 23);
		getContentPane().add(btnReset);

	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

}
