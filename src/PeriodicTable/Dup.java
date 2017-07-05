package PeriodicTable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import BalancingEquations.BalancingEquations;

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
		frame.setBounds(100, 100, 599, 582);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// String name = FinalTest.textField.getText();
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Course Database");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(225, 430, 117, 40);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("Save!!");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(10, 430, 117, 40);
		frame.getContentPane().add(button);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Certificates\\PeriodicTable.png"));
		pic.setBounds(0, 0, 581, 425);
		frame.getContentPane().add(pic);

		JLabel lab = new JLabel();
		lab.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		lab.setBackground(Color.RED);
		lab.setForeground(Color.BLACK);
		lab.setBounds(191, 166, 218, 23);
		pic.add(lab);

		JLabel lbltheNextCourse = new JLabel(
				"<html>The next course is Balancing Equations. In this course you will learn about how different compounds are formed and how scientists have to balance things to make sure they dont mess up!! You will learn how to use the atomic structure of elements to create new compounds too!");
		lbltheNextCourse.setForeground(Color.RED);
		lbltheNextCourse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lbltheNextCourse.setBounds(10, 481, 563, 51);
		frame.getContentPane().add(lbltheNextCourse);

		JButton button_1 = new JButton("Next Course!!>>");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BalancingEquations p = new BalancingEquations();
				p.newClass();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(456, 430, 117, 40);
		frame.getContentPane().add(button_1);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs = new JFileChooser(new File("C:\\"));
				fs.setDialogTitle("Save a file");

			}
		});
	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// String cName = TACALIBUR.verifyIfCourseComplete("Chemistry- Periodic
		// Table", "PeriodicTable");
		// TACALIBUR.saveCertificate(cName);
	}
}
