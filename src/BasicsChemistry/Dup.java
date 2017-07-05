package BasicsChemistry;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import PeriodicTable.PeriodicTable;

public class Dup {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dup window = new Dup();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Certification");
		frame.setBounds(100, 100, 600, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String name = FinalTest.textField.getText();
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Course Database");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 430, 117, 40);
		frame.getContentPane().add(btnNewButton);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Certificates\\BasicsChemistry.png"));
		pic.setBounds(0, 0, 581, 425);
		frame.getContentPane().add(pic);

		JLabel lab = new JLabel(name);
		lab.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		lab.setBackground(Color.RED);
		lab.setForeground(Color.BLACK);
		lab.setBounds(191, 166, 218, 23);
		pic.add(lab);

		JLabel lbltheNextCourse = new JLabel(
				"<html>The next course is Perioidic Table. In this course you will learn about each element in the periodic table along with what each part is including the atomic number and mass. You will also learn why it is arranged in this such way along with some fun excercises.");
		lbltheNextCourse.setForeground(Color.RED);
		lbltheNextCourse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lbltheNextCourse.setBounds(10, 481, 563, 51);
		frame.getContentPane().add(lbltheNextCourse);

		JButton button_1 = new JButton("Next Course!!>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PeriodicTable p = new PeriodicTable();
				p.newClass();

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(456, 430, 117, 40);
		frame.getContentPane().add(button_1);

		JLabel lblThisCertificateHas = new JLabel("This certificate has been saved in the 'Calibur' folder on your PC");
		lblThisCertificateHas.setForeground(Color.BLUE);
		lblThisCertificateHas.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblThisCertificateHas.setBounds(137, 443, 315, 27);
		frame.getContentPane().add(lblThisCertificateHas);

	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
