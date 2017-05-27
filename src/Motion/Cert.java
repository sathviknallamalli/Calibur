package Motion;

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
import javax.swing.filechooser.FileFilter;

public class Cert {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cert window = new Cert();
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
	public Cert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 599, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String name = FinalTest.textField.getText();
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Course Database");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(437, 430, 117, 40);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("Save!!");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(10, 430, 117, 40);
		frame.getContentPane().add(button);
		
		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Certificates\\MotionCer.png"));
		pic.setBounds(0, 0, 581, 425);
		frame.getContentPane().add(pic);
		
		JLabel lab = new JLabel(name);

		lab.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 20));
		lab.setBackground(Color.RED);
		lab.setForeground(Color.BLACK);
		lab.setBounds(191, 166, 218, 23);
		pic.add(lab);

		JLabel label = new JLabel("This will take you back to the Course Database");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		label.setBounds(147, 436, 280, 27);
		frame.getContentPane().add(label);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs = new JFileChooser(new File("C:\\"));
				fs.setDialogTitle("Save a file");

			}
		});
	}
}
