
import java.applet.Applet;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class NewShapeDrawer extends Applet {

	private JFrame frame;

	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewShapeDrawer window = new NewShapeDrawer();
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
	public NewShapeDrawer() {
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

		JLabel lblChartGenerator = new JLabel("Shape Drawer");
		lblChartGenerator.setBounds(236, 11, 293, 42);
		lblChartGenerator.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(lblChartGenerator);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Regular Polygons");
		mnNewMenu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Square");
		mntmNewMenuItem.setAction(action_1);
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmTriangle = new JMenuItem("Triangle");
		mntmTriangle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu.add(mntmTriangle);

		JMenuItem mntmCircle = new JMenuItem("Circle");
		mntmCircle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu.add(mntmCircle);

		JMenuItem mntmHexagon = new JMenuItem("Hexagon");
		mntmHexagon.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu.add(mntmHexagon);

		JMenuItem mntmPentagon = new JMenuItem("Pentagon");
		mntmPentagon.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu.add(mntmPentagon);

		JMenuItem mntmOctagon = new JMenuItem("Octagon");
		mntmOctagon.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnNewMenu.add(mntmOctagon);

		JMenu mnNewMenu_1 = new JMenu("Lines");
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		menuBar.add(mnNewMenu_1);

	}

	public void newClass() {

		frame.setSize(781, 423);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Shape Drawer");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {

		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Square");
			putValue(SHORT_DESCRIPTION, "Draw a Perfect Square");
		}

		public void actionPerformed(ActionEvent e) {

		}
	}
}
