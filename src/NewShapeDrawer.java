import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.ibm.icu.util.Calendar;

import Machines.Audio;
import studentHub.Conversions.*;
import java.awt.SystemColor;
import java.awt.List;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class NewShapeDrawer extends Applet {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private final Action action = new SwingAction();
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

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
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
