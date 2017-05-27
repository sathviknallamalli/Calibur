package PhysicsTopics;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import studentHub.PhysicsCalculators.Motion;

public class MechanicalEnergy extends JFrame {
	private JTextField ma;
	private JLabel velo;
	private JTextField v;
	private JButton btnHi;

	private JLabel work;
	private JLabel label;

	public MechanicalEnergy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Mechanical Energy");
		title.setFont(new Font("Castellar", Font.PLAIN, 25));
		title.setBounds(62, 11, 314, 42);
		getContentPane().add(title);

		JLabel lblNewLabel_1 = new JLabel(
				"Enter the potential and kinetic energy. If you need to calculate, click the buttons");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(26, 51, 381, 14);
		getContentPane().add(lblNewLabel_1);

		JLabel mass = new JLabel("Potential");
		mass.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mass.setBounds(30, 88, 86, 19);
		getContentPane().add(mass);

		ma = new JTextField();
		ma.setBounds(181, 89, 86, 20);
		getContentPane().add(ma);
		ma.setColumns(10);

		velo = new JLabel("Kinetic");
		velo.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		velo.setBounds(30, 146, 95, 19);
		getContentPane().add(velo);

		v = new JTextField();
		v.setColumns(10);
		v.setBounds(181, 147, 86, 20);
		getContentPane().add(v);

		btnHi = new JButton("Calculate");

		btnHi.setBounds(318, 134, 89, 23);
		getContentPane().add(btnHi);

		JLabel mom = new JLabel("Result");
		mom.setBounds(53, 203, 268, 23);
		getContentPane().add(mom);

		btnHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Motion m = new Motion();
				String ef = m.MA(Double.parseDouble(ma.getText()), Double.parseDouble(v.getText()));

				mom.setText("Mechaincal Energy is " + ef);

			}
		});

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v.setText("");
				ma.setText("");
				mom.setText("");
			}
		});
		btnReset.setBounds(318, 183, 89, 23);
		getContentPane().add(btnReset);

		JButton btnPotentialCalc = new JButton("Potential Calc");
		btnPotentialCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PotentialEnergy pe = new PotentialEnergy();
				pe.newClass();
			}
		});
		btnPotentialCalc.setBounds(178, 113, 107, 23);
		getContentPane().add(btnPotentialCalc);

		JButton btnKineticCalc = new JButton("Kinetic Calc.");
		btnKineticCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KineticEnergy ke = new KineticEnergy();
				ke.newClass();
			}
		});
		btnKineticCalc.setBounds(178, 178, 107, 23);
		getContentPane().add(btnKineticCalc);

	}

	public void newClass() {

		setSize(452, 300);
		setLocation(600, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

}
