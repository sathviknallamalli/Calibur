package Simulations;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class RandomGuessing {

	private JFrame frame;
	JLabel lblCurrentTimeIs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomGuessing window = new RandomGuessing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JLabel lblGamesByCalibur;
	private JLabel label;
	private JTextField guess;

	/**
	 * Create the application.
	 */
	public RandomGuessing() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 752, 204);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		frame.getContentPane().add(scrollPane);

		lblGamesByCalibur = new JLabel("Random Guessing");
		lblGamesByCalibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblGamesByCalibur.setBounds(180, 11, 377, 42);
		frame.getContentPane().add(lblGamesByCalibur);

		lblCurrentTimeIs = new JLabel();
		lblCurrentTimeIs.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCurrentTimeIs.setBounds(498, 170, 350, 23);
		frame.getContentPane().add(lblCurrentTimeIs);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\qmark.png"));
		pt.setBounds(53, 11, 46, 67);
		frame.getContentPane().add(pt);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\qmark.png"));
		p.setBounds(634, 11, 46, 67);
		frame.getContentPane().add(p);

		JLabel lblGenerateARandom = new JLabel("Generate a random number and start guessing!!");
		lblGenerateARandom.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblGenerateARandom.setBounds(210, 62, 293, 16);
		frame.getContentPane().add(lblGenerateARandom);

		JButton btnVerify = new JButton("Verify!!");
		btnVerify.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnVerify.setBounds(331, 123, 89, 23);
		frame.getContentPane().add(btnVerify);

		JLabel result = new JLabel("<html>");
		result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		result.setBounds(444, 99, 265, 38);
		frame.getContentPane().add(result);

		JButton btnNewButton = new JButton("Generate!");
		btnNewButton.addActionListener(new ActionListener() {
			int num = 0;

			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				num = r.nextInt(100 - 1) + 1;

				btnVerify.addActionListener(new ActionListener() {
					int count = 0;

					public void actionPerformed(ActionEvent e) {
						count++;
						if (count == 5) {
							result.setText("<html>Sorry, you have tried beyond the limit, the number is " + num);
						} else if (Integer.parseInt(guess.getText()) == num) {
							result.setText("YAY!!!! THATS CORRECT!!!");
						} else {
							if (Integer.parseInt(guess.getText()) > num) {
								guess.setText("");
								result.setText("<html>Whoops sorry, you guessed a little too high. Try lower");
							} else {
								guess.setText("");
								result.setText("<html>Whoops sorry, you guessed a little too low. Try higher");
							}
						}
					}
				});
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(297, 89, 89, 23);
		frame.getContentPane().add(btnNewButton);

		guess = new JTextField();
		guess.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		guess.setBounds(218, 126, 103, 20);
		frame.getContentPane().add(guess);
		guess.setColumns(10);

	}

	public void newClass() {

		frame.setSize(752, 204);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
