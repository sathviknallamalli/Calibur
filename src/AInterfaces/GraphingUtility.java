package AInterfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GraphingUtility {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphingUtility window = new GraphingUtility();
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
	public GraphingUtility() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(781, 423);
		frame.setLocation(300, 150);
		frame.getContentPane().setLayout(null);

		JLabel lblChartGenerator = new JLabel("Graphing Utilities");
		lblChartGenerator.setBounds(180, 11, 405, 42);
		lblChartGenerator.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(lblChartGenerator);

		JLabel lblinitializeTheSize = new JLabel("You can draw any perfect shape or graph equations of any type");
		lblinitializeTheSize.setBounds(204, 52, 343, 23);
		lblinitializeTheSize.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(lblinitializeTheSize);

		JLabel lblOverview = new JLabel("Overview: How to Use This Tool");
		lblOverview.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblOverview.setBounds(10, 86, 210, 23);
		frame.getContentPane().add(lblOverview);

		JLabel lblShapeDrawer = new JLabel("Shape Drawer:");
		lblShapeDrawer.setForeground(Color.BLUE);
		lblShapeDrawer.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblShapeDrawer.setBounds(75, 114, 95, 23);
		frame.getContentPane().add(lblShapeDrawer);

		JLabel lblGrapher = new JLabel("Grapher:");
		lblGrapher.setForeground(Color.BLUE);
		lblGrapher.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblGrapher.setBounds(333, 114, 95, 23);
		frame.getContentPane().add(lblGrapher);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		menuBar.add(mnFile);

		JMenu mnNewMenu = new JMenu("Edit");
		mnNewMenu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("New...");
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_2 = new JMenu("New Document");
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu_1.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem = new JMenuItem("Shape Drawing");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewShapeDrawer n = new NewShapeDrawer();
				n.newClass();
			}
		});
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu_2.add(mntmNewMenuItem);

		JMenuItem mntmGrapher = new JMenuItem("Grapher");
		mntmGrapher.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu_2.add(mntmGrapher);

	}

	public void newClass() {

		frame.setSize(781, 423);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
