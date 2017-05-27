import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.ibm.icu.util.Calendar;

import FundamentalsOfAlgebraContents.FileTypeFilter;
import Machines.Audio;
import studentHub.Conversions.*;
import java.awt.SystemColor;
import java.awt.List;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Editor {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextPane text;
	private JLabel picpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
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
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Text Editor");
		frame.getContentPane().setBackground(new Color(204, 204, 0));
		frame.setSize(769, 423);
		frame.setLocation(300, 150);
		frame.getContentPane().setLayout(null);
		JButton sCheck = new JButton("Spell Check");
		sCheck.setBounds(622, 85, 119, 27);

		sCheck.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(sCheck);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(351, 263, 261, -163);
		frame.getContentPane().add(scrollPane);

		JLabel lblChartGenerator = new JLabel("Text Editor");
		lblChartGenerator.setBounds(252, 11, 250, 42);
		lblChartGenerator.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(lblChartGenerator);

		JLabel lblinitializeTheSize = new JLabel(
				"<html>Enter the text and you can perform any action with font or review you want.");
		lblinitializeTheSize.setBounds(172, 52, 419, 23);
		lblinitializeTheSize.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(lblinitializeTheSize);

		JLabel lblEnterTheCategory = new JLabel("<html>Enter the category names of each column");
		lblEnterTheCategory.setBounds(0, 0, 0, 0);
		lblEnterTheCategory.setForeground(Color.RED);
		lblEnterTheCategory.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		frame.getContentPane().add(lblEnterTheCategory);

		JButton btnImportPicture_1 = new JButton("Import Picture");
		btnImportPicture_1.setBounds(622, 123, 119, 27);

		btnImportPicture_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(btnImportPicture_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 85, 602, 288);
		frame.getContentPane().add(scrollPane_1);

		text = new JTextPane();
		text.setFont(new Font("Arial", Font.PLAIN, 11));
		scrollPane_1.setViewportView(text);

		JMenuBar menuBar = new JMenuBar();
		scrollPane_1.setColumnHeaderView(menuBar);

		JMenu fonttype = new JMenu("Arial");
		fonttype.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(fonttype);

		JMenu size = new JMenu("Font Size: ");
		size.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(size);

		JMenuItem calib = new JMenuItem("Calibri");
		calib.setFont(new Font("Calibri", Font.PLAIN, 12));
		calib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text.setFont(new Font("Calibri", Font.PLAIN, 11));
				fonttype.setText("Calibri");
				fonttype.setFont(new Font("Calibri", Font.PLAIN, 12));

			}
		});

		JMenuItem mntmNewMenuItem = new JMenuItem("Arial");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Arial", Font.PLAIN, 11));
				fonttype.setText("Arial");
				fonttype.setFont(new Font("Arial", Font.PLAIN, 12));
			}
		});
		fonttype.add(mntmNewMenuItem);
		fonttype.add(calib);

		JMenuItem tnew = new JMenuItem("Times New Roman");
		tnew.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tnew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Times New Roman", Font.PLAIN, 11));
				fonttype.setText("Times New Roman");
				fonttype.setFont(new Font("Times New Roman", Font.PLAIN, 12));
			}
		});
		fonttype.add(tnew);

		JMenuItem camb = new JMenuItem("Cambria");
		camb.setFont(new Font("Cambria", Font.PLAIN, 12));
		camb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Cambria", Font.PLAIN, 11));
				fonttype.setText("Cambria");
				fonttype.setFont(new Font("Cambria", Font.PLAIN, 12));
			}
		});
		fonttype.add(camb);

		JMenuItem cast = new JMenuItem("Castellar");
		cast.setFont(new Font("Castellar", Font.PLAIN, 12));
		cast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Castellar", Font.PLAIN, 11));
				fonttype.setText("Castellar");
				fonttype.setFont(new Font("Castellar", Font.PLAIN, 12));
			}
		});
		fonttype.add(cast);

		JMenuItem bh = new JMenuItem("Bradley Hand ITC");
		bh.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 12));
		bh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 11));
				fonttype.setText("Bradley Hand ITC");
				fonttype.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 12));
			}
		});
		fonttype.add(bh);

		JMenuItem cs = new JMenuItem("Comic Sans MS");
		cs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
				fonttype.setText("Comic Sans MS");
				fonttype.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			}
		});
		cs.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		fonttype.add(cs);

		JMenuItem ver = new JMenuItem("Verdana");
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Verdana", Font.PLAIN, 11));
				fonttype.setText("Verdana");
				fonttype.setFont(new Font("Verdana", Font.PLAIN, 12));
			}
		});
		ver.setFont(new Font("Verdana", Font.PLAIN, 12));
		fonttype.add(ver);

		JMenuItem eight = new JMenuItem("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("", Font.PLAIN, 8));
			}
		});
		eight.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(eight);

		JMenuItem nine = new JMenuItem("9");
		nine.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(nine);

		JMenuItem ten = new JMenuItem("10");
		ten.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(ten);

		JMenuItem eleven = new JMenuItem("11");
		eleven.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(eleven);

		JMenuItem twelve = new JMenuItem("12");
		twelve.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(twelve);

		JMenuItem fifteen = new JMenuItem("14");
		fifteen.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(fifteen);

		JMenuItem menuItem = new JMenuItem("16");
		menuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem);

		JMenuItem menuItem_1 = new JMenuItem("18");
		menuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_1);

		JMenuItem menuItem_2 = new JMenuItem("20");
		menuItem_2.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_2);

		JMenuItem menuItem_3 = new JMenuItem("22");
		menuItem_3.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_3);

		JMenuItem menuItem_4 = new JMenuItem("24");
		menuItem_4.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_4);

		JMenuItem menuItem_5 = new JMenuItem("26");
		menuItem_5.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_5);

		JMenuItem menuItem_6 = new JMenuItem("30");
		menuItem_6.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_6);

		JMenuItem menuItem_7 = new JMenuItem("36");
		menuItem_7.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_7);

		JMenuItem menuItem_8 = new JMenuItem("48");
		menuItem_8.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_8);

		JMenuItem menuItem_9 = new JMenuItem("72");
		menuItem_9.setFont(new Font("Arial", Font.PLAIN, 12));
		size.add(menuItem_9);

		JMenu color = new JMenu("Font Color");
		color.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\font.png"));
		color.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(color);

		JMenuItem red = new JMenuItem("Red");
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "Red");
				text.setForeground(Color.RED);
			}
		});
		red.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\red.PNG"));
		red.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(red);

		JMenuItem orange = new JMenuItem("Orange");
		orange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "Orange");
				text.setForeground(Color.ORANGE);
			}
		});
		orange.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\orange.PNG"));
		orange.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(orange);

		JMenuItem yellow = new JMenuItem("Yellow");
		yellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "Yellow");
				text.setForeground(Color.YELLOW);
			}
		});
		yellow.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\yellow.PNG"));
		yellow.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(yellow);

		JMenuItem green = new JMenuItem("Green");
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "Green");
				text.setForeground(Color.GREEN);
			}
		});
		green.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\green.PNG"));
		green.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(green);

		JMenuItem blue = new JMenuItem("Blue");
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "Blue");
				text.setForeground(Color.BLUE);
			}
		});
		blue.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\blue.PNG"));
		blue.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(blue);

		JMenuItem black = new JMenuItem("Black");
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "Black");
				text.setForeground(Color.BLACK);
			}
		});
		black.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\black.PNG"));
		black.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(black);

		JMenuItem white = new JMenuItem("White");
		white.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				color.setText("Font Color: " + "White");
				text.setForeground(Color.WHITE);
			}
		});
		white.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\white.PNG"));
		white.setFont(new Font("Arial", Font.PLAIN, 12));
		color.add(white);

		JMenu bold = new JMenu("Bold");
		bold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setFont(new Font("Arial", Font.BOLD, 12));
			}
		});
		bold.setFont(new Font("Arial", Font.BOLD, 13));
		bold.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\bold.png"));
		menuBar.add(bold);

		JMenu mnItalics = new JMenu("Italics");
		mnItalics.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\italics.png"));
		mnItalics.setFont(new Font("Arial", Font.ITALIC, 13));
		menuBar.add(mnItalics);

		JMenu mnUnderline = new JMenu("Underline");
		mnUnderline.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\underline.png"));
		mnUnderline.setFont(new Font("Arial", Font.PLAIN, 13));
		menuBar.add(mnUnderline);

		JButton saveas = new JButton("Save As...");
		saveas.setBounds(622, 161, 119, 27);
		saveas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs = new JFileChooser(new File("C:\\"));
				fs.setDialogTitle("Save a file");
				fs.setFileFilter(new FileTypeFilter(".txt", "Text File"));
				fs.setFileFilter(new FileTypeFilter(".docx", "Word Document"));
				int result = fs.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String content = text.getText();
					File fi = fs.getSelectedFile();
					try {
						FileWriter fw = new FileWriter(fi.getPath());
						fw.write(content);
						fw.flush();
						fw.close();
					} catch (Exception a) {
						JOptionPane.showMessageDialog(null, a);
					}
				}
			}
		});
		saveas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(saveas);

		JButton save = new JButton("Save");
		save.setBounds(622, 199, 119, 27);
		save.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(save);

		JButton open = new JButton("Open File");
		open.setBounds(622, 237, 119, 27);
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs = new JFileChooser(new File("C:\\"));
				fs.setDialogTitle("Open a file");
				fs.setFileFilter(new FileTypeFilter(".txt", "Text File"));
				fs.setFileFilter(new FileTypeFilter(".docx", "Word File"));
				fs.setFileFilter(new FileTypeFilter(".jpg", "JPEG File"));
				int result = fs.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {

					try {
						File fi = fs.getSelectedFile();
						BufferedReader b = new BufferedReader(new FileReader(fi.getPath()));
						String line = "";
						String s = "";
						while ((line = b.readLine()) != null) {
							s += line;

						}
						text.setText(s);
						if (b != null) {
							b.close();
						}
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1);
					}

				}
			}
		});
		open.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(open);

		JButton btnGrammarReview = new JButton("Grammar Review");
		btnGrammarReview.setBounds(622, 271, 119, 27);
		btnGrammarReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enter = text.getText();

				String[] words = enter.split(" ");

				for (int i = 0; i < words.length; i++) {
					ArrayList a = new ArrayList();
					a.add(words[i]);
				}
			}
		});
		btnGrammarReview.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.getContentPane().add(btnGrammarReview);

		sCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enter = text.getText();

				String[] words = enter.split(" ");

				for (int i = 0; i < words.length; i++) {
					ArrayList a = new ArrayList();
					a.add(words[i]);

				}
			}
		});

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
}
