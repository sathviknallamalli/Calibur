import java.awt.EventQueue;

import javax.swing.*;

public class PTable {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTable window = new PTable();
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
	public PTable() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setTitle("Periodic Table");
		frame.setResizable(false);
		frame.setBounds(100, 100, 869, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lab5 = new JLabel();
		lab5.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\sample.PNG"));
		lab5.setBounds(10, 11, 837, 455);
		frame.getContentPane().add(lab5);
	}

	public void newClass() {

		frame.setSize(869, 506);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
