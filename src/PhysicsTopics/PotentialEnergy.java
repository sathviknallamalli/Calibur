package PhysicsTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.PhysicsCalculators.Motion;

public class PotentialEnergy extends JFrame {
	private JTextField ma;
	private JLabel velo;
	private JTextField v;
	private JButton btnHi;

	private JLabel work;
	private JLabel label;

	public PotentialEnergy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Potential Energy");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(79, 11, 276, 42);
		getContentPane().add(title);

		JLabel lblNewLabel_1 = new JLabel("Enter the mass and height");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(145, 52, 136, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel mass = new JLabel("Mass (kg)");
		mass.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mass.setBounds(30, 88, 86, 19);
		getContentPane().add(mass);

		ma = new JTextField();
		ma.setBounds(181, 89, 86, 20);
		getContentPane().add(ma);
		ma.setColumns(10);

		velo = new JLabel("Height (m)");
		velo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		velo.setBounds(30, 146, 95, 19);
		getContentPane().add(velo);

		v = new JTextField();
		v.setColumns(10);
		v.setBounds(181, 147, 86, 20);
		getContentPane().add(v);

		btnHi = new JButton("Calculate");

		btnHi.setBounds(307, 134, 89, 23);
		getContentPane().add(btnHi);

		JLabel mom = new JLabel("Result");
		mom.setBounds(232, 64, 192, 23);
		getContentPane().add(mom);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.setText("");
				ma.setText("");
			}
		});
		btnReset.setBounds(307, 183, 89, 23);
		getContentPane().add(btnReset);

		btnHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motion m = new Motion();
				String ef = m.PE(Double.parseDouble(ma.getText()), Double.parseDouble(v.getText()));

				mom.setText("Potential Energy is " + ef);

			}
		});

	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
