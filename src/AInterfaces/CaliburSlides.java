package AInterfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xslf.usermodel.XMLSlideShow;

import com.ibm.icu.util.Calendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class CaliburSlides {

	static JFrame frame;
	static String tempe = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaliburSlides window = new CaliburSlides();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;

	String fromHome = Home.username;

	/**
	 * Create the application.
	 */
	public static JLabel blank() {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\blank.PNG"));
		label.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(label);
		return label;
	}

	public CaliburSlides() {
		connection = sqliteConnection.c();

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/*
		 * XMLSlideShow pptx = new XMLSlideShow(); File file = new
		 * File("C:\\Users\\sathv\\Desktop\\example.pptx"); try {
		 * FileOutputStream out = new FileOutputStream(file); pptx.write(out);
		 * System.out.println("document created"); out.close(); } catch
		 * (Exception e) { System.out.println(e); }
		 */
		frame = new JFrame("Calibur slides");
		frame.getContentPane().setBackground(UIManager.getColor("PopupMenu.background"));
		frame.setBounds(100, 100, 827, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\blank.PNG"));
		lblNewLabel.setBounds(20, 116, 171, 112);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Create New Slideshow");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 11, 181, 28);
		frame.getContentPane().add(btnNewButton);

		JButton btnOpenSlideshow = new JButton("Open Slideshow");
		btnOpenSlideshow.setFont(new Font("Arial", Font.PLAIN, 12));
		btnOpenSlideshow.setBounds(10, 45, 181, 28);
		frame.getContentPane().add(btnOpenSlideshow);

		JLabel slideVal = new JLabel("1.");
		slideVal.setForeground(new Color(210, 105, 30));
		slideVal.setFont(new Font("Arial", Font.BOLD, 14));
		slideVal.setBounds(5, 123, 18, 14);
		frame.getContentPane().add(slideVal);

		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			int count = 0;
			@Override
			public void mouseReleased(MouseEvent e) {
				count++;
				if(count==1) {
					
				}
			}
		});
		panel.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
		panel.setBounds(197, 120, 604, 269);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Click to add first slide\r\n");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(191, 117, 241, 41);
		panel.add(lblNewLabel_2);

		JLabel label = CaliburSlides.blank();

		JLabel lblNewLabel_1 = new JLabel("New Slide");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			int count = 0;

			@Override
			public void mouseReleased(MouseEvent arg0) {
				count++;
				int pos = 116 + (count * 112);
				label.setBounds(20, pos, 171, 112);

			}
		});
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 91, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);

	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
