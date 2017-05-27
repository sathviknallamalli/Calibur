package Simulations;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.ibm.icu.util.Calendar;
import javax.swing.JSlider;

public class HeadsTails {

	private JFrame frame;
	private ChartFrame f;
	private JFreeChart chart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeadsTails window = new HeadsTails();
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
	public HeadsTails() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setLayout(null);

		JLabel lblDiceRolling = new JLabel("Coin Flipping Simulation");
		lblDiceRolling.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblDiceRolling.setBounds(112, 11, 530, 42);
		frame.getContentPane().add(lblDiceRolling);

		JLabel lblClickRollAnd = new JLabel("Click flip!!! and you can graph the observations of the data");
		lblClickRollAnd.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblClickRollAnd.setBounds(214, 53, 328, 16);
		frame.getContentPane().add(lblClickRollAnd);
		frame.setBounds(100, 100, 752, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\coin.png"));
		pt.setBounds(29, 11, 45, 72);
		frame.getContentPane().add(pt);

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\coin.png"));
		label.setBounds(671, 11, 55, 72);
		frame.getContentPane().add(label);

		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		result.setBounds(332, 104, 98, 35);
		frame.getContentPane().add(result);

		JButton save = new JButton("Save Chart!");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int width = 500;
				int height = 300;
				try {
					ChartUtilities.saveChartAsPNG(new File("C:\\Users\\sathv\\Desktop\\CoinBarChart.PNG"), chart, width,
							height);
				} catch (IOException e) {
				}
			}

		});
		save.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().add(save);

		JButton flip = new JButton("Flip!");
		flip.addActionListener(new ActionListener() {
			int num = 0;
			int count = 0;
			int headCount = 0;
			int tailCount = 0;
			int windcount = 0;

			DefaultCategoryDataset ds = new DefaultCategoryDataset();

			public void actionPerformed(ActionEvent e) {
				save.setBounds(421, 110, 89, 23);
				count++;
				windcount++;
				Random r = new Random();
				num = r.nextInt(3 - 1) + 1;

				if (num == 1) {
					result.setText("Tails");
				} else {
					result.setText("Heads");
				}
				if (count > 0) {
					if (num == 1) {
						tailCount++;
						ds.addValue(tailCount, "frequency", "Tails");
					} else {
						headCount++;
						ds.addValue(headCount, "frequency", "Heads");
					}
				}
				if (windcount > 1) {

					chart = ChartFactory.createBarChart("Heads or Tails?", "Side of Coin", "frequency", ds,
							PlotOrientation.VERTICAL, false, true, false);

					CategoryPlot p = chart.getCategoryPlot();
					p.setRangeGridlinePaint(Color.BLACK);
					f = new ChartFrame("Coin Bar Chart", chart);
					f.setVisible(true);
					f.setSize(450, 350);
					f.setLocation(300, 300);

					close();
				} else {
					chart = ChartFactory.createBarChart("Heads or Tails?", "Side of Coin", "frequency", ds,
							PlotOrientation.VERTICAL, false, true, false);
					CategoryPlot p = chart.getCategoryPlot();
					p.setRangeGridlinePaint(Color.BLACK);
					f = new ChartFrame("Coin Bar Chart", chart);
					f.setVisible(true);
					f.setSize(450, 350);

					f.setLocation(300, 300);
				}
			}

		});

		flip.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		flip.setBounds(318, 80, 89, 23);
		frame.getContentPane().add(flip);

	}

	public void close() {
		WindowEvent w = new WindowEvent(f, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		frame.setSize(752, 210);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
