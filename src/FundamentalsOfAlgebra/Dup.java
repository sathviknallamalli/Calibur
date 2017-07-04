package FundamentalsOfAlgebra;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import AInterfaces.TACALIBUR;
import LinearEquationsContents.LinearEquations;

public class Dup extends JFrame {

	public Dup() {

		String name = FinalTest.textField.getText();
		getContentPane().setLayout(null);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Certificates\\FundamentalsofAlgCer.PNG"));
		pic.setBounds(0, 0, 581, 425);
		getContentPane().add(pic);

		JLabel lab = new JLabel(name);
		lab.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		lab.setBackground(Color.RED);
		lab.setForeground(Color.BLACK);
		lab.setBounds(191, 166, 218, 23);
		pic.add(lab);

		JButton btnNewButton = new JButton("Course Database");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(225, 430, 117, 40);
		getContentPane().add(btnNewButton);

		JButton save = new JButton("Save!!");
		save.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		save.setBounds(10, 430, 117, 40);
		getContentPane().add(save);

		JButton btnNextCourse = new JButton("Next Course!!>>");
		btnNextCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinearEquations l = new LinearEquations();
				l.newClass();
				close();
			}
		});
		btnNextCourse.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNextCourse.setBounds(456, 430, 117, 40);
		getContentPane().add(btnNextCourse);

		JLabel lbltheNextCourse = new JLabel(
				"<html>The next course is Linear Equations. This course will include theory about how you can graph equations and will detail the anatomy of standard form equations and different methods to make you solve anything very quickly, with rigorous practice.");
		lbltheNextCourse.setForeground(Color.RED);
		lbltheNextCourse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lbltheNextCourse.setBounds(10, 481, 563, 51);
		getContentPane().add(lbltheNextCourse);

		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs = new JFileChooser(new File("C:\\"));
				fs.setDialogTitle("Save Certificate");
				fs.setFileFilter(new FileTypeFilter(".jpg", "JPEG File"));
				int result = fs.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					File fi = fs.getSelectedFile();
					try {

						FileWriter fw = new FileWriter(fi.getPath());

					} catch (Exception a) {
						JOptionPane.showMessageDialog(null, a);
					}
				}
			}
		});

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(599, 582);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

}
