package ColorGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import com.ibm.icu.util.Calendar;

public class Driver {

	private JFrame frame;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver window = new Driver();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JLabel lblGamesByCalibur;
	private JButton hit;
	private JLabel colorShown;
	String s;
	int sec = 4;

	public void clock() {
		Thread clock = new Thread() {
			public void run() {
				try {
					for (;;) {

						sec++;

						if (sec % 3 == 0) {
							s = ":02";
						} else if (sec % 3 == 2) {
							s = ":03";
						} else if (sec % 3 == 1) {
							s = ":01";
						}
						label.setText(s);

						sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}

	/**
	 * Create the application.
	 */
	public Driver() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 752, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		frame.getContentPane().add(scrollPane);

		lblGamesByCalibur = new JLabel("Color Changer!! - Stroop Test\r\n");
		lblGamesByCalibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblGamesByCalibur.setBounds(52, 11, 631, 42);
		frame.getContentPane().add(lblGamesByCalibur);

		hit = new JButton("Start!!");

		hit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		hit.setBounds(316, 55, 89, 30);
		frame.getContentPane().add(hit);

		Color[] colors = { Color.BLACK, Color.WHITE, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
				Color.MAGENTA };

		String[] words = { "BLACK", "WHITE", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "MAGENTA" };

		Random r = new Random();

		colorShown = new JLabel();
		colorShown.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		colorShown.setBounds(316, 96, 110, 17);
		frame.getContentPane().add(colorShown);

		JRadioButton BLACK = new JRadioButton("Black");
		BLACK.setBackground(Color.LIGHT_GRAY);
		BLACK.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BLACK.setBounds(103, 120, 53, 23);
		frame.getContentPane().add(BLACK);

		JRadioButton BLUE = new JRadioButton("Blue");
		BLUE.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		BLUE.setBackground(Color.LIGHT_GRAY);
		BLUE.setBounds(496, 120, 53, 23);
		frame.getContentPane().add(BLUE);

		JRadioButton WHITE = new JRadioButton("White");
		WHITE.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		WHITE.setBackground(Color.LIGHT_GRAY);
		WHITE.setBounds(165, 120, 67, 23);
		frame.getContentPane().add(WHITE);

		JRadioButton RED = new JRadioButton("Red");
		RED.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		RED.setBackground(Color.LIGHT_GRAY);
		RED.setBounds(234, 120, 53, 23);
		frame.getContentPane().add(RED);

		JRadioButton ORANGE = new JRadioButton("Orange");
		ORANGE.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		ORANGE.setBackground(Color.LIGHT_GRAY);
		ORANGE.setBounds(289, 120, 67, 23);
		frame.getContentPane().add(ORANGE);

		JRadioButton YELLOW = new JRadioButton("Yellow");
		YELLOW.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		YELLOW.setBackground(Color.LIGHT_GRAY);
		YELLOW.setBounds(358, 120, 67, 23);
		frame.getContentPane().add(YELLOW);

		JRadioButton GREEN = new JRadioButton("Green");
		GREEN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		GREEN.setBackground(Color.LIGHT_GRAY);
		GREEN.setBounds(427, 120, 67, 23);
		frame.getContentPane().add(GREEN);

		JRadioButton MAGENTA = new JRadioButton("Magenta");
		MAGENTA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		MAGENTA.setBackground(Color.LIGHT_GRAY);
		MAGENTA.setBounds(551, 120, 67, 23);
		frame.getContentPane().add(MAGENTA);

		ButtonGroup bg = new ButtonGroup();
		bg.add(BLUE);
		bg.add(BLACK);
		bg.add(WHITE);
		bg.add(RED);
		bg.add(ORANGE);
		bg.add(YELLOW);
		bg.add(GREEN);
		bg.add(MAGENTA);

		Calendar calendar = Calendar.getInstance();

		hit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int colWord = r.nextInt(8 - 0) + 0;
				int surrColor = r.nextInt(8 - 0) + 0;
				colorShown.setText(words[colWord]);
				colorShown.setForeground(colors[surrColor]);

				if (colorShown.getText() == "BLACK" && BLACK.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTBLACK");
				} else if (colorShown.getText() == "WHITE" && WHITE.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTWHITE");
				} else if (colorShown.getText() == "RED" && RED.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTRED");
				} else if (colorShown.getText() == "ORANGE" && ORANGE.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTORANGE");
				} else if (colorShown.getText() == "YELLOW" && YELLOW.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTYELLOW");
				} else if (colorShown.getText() == "GREEN" && GREEN.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTGREEN");
				} else if (colorShown.getText() == "BLUE" && BLUE.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTBLUE");
				} else if (colorShown.getText() == "MAGENTA" && MAGENTA.isSelected()) {
					JOptionPane.showMessageDialog(null, "RIGHTMAGENTA");
				}
				clock();

			}
		});
		JLabel lab4 = new JLabel();
		lab4.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\spectrum.PNG"));
		lab4.setBounds(269, 150, 188, 51);
		frame.getContentPane().add(lab4);

		label = new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(446, 90, 110, 23);
		frame.getContentPane().add(label);

	}

	public void newClass() {

		frame.setSize(959, 456);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
