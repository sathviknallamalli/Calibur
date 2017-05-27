package Simulations;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class DiceRolling {

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
					DiceRolling window = new DiceRolling();
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
	public DiceRolling() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.getContentPane().setLayout(null);

		JLabel lblDiceRolling = new JLabel("Dice Rolling Simulation");
		lblDiceRolling.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblDiceRolling.setBounds(112, 11, 528, 42);
		frame.getContentPane().add(lblDiceRolling);

		JLabel lblClickRollAnd = new JLabel("Click roll! and you can even graph the results of the die");
		lblClickRollAnd.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblClickRollAnd.setBounds(214, 53, 308, 16);
		frame.getContentPane().add(lblClickRollAnd);
		frame.setBounds(100, 100, 752, 208);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\dice.png"));
		pt.setBounds(10, 11, 92, 72);
		frame.getContentPane().add(pt);

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\dice.png"));
		label.setBounds(634, 11, 92, 72);
		frame.getContentPane().add(label);

		JLabel result = new JLabel();
		result.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		result.setBounds(349, 104, 98, 35);
		frame.getContentPane().add(result);

		JButton save = new JButton("Save Chart!");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int width = 500;
				int height = 300;
				try {
					ChartUtilities.saveChartAsPNG(new File("C:\\Users\\sathv\\Desktop\\DiceBarChart.PNG"), chart, width,
							height);
				} catch (IOException e) {
				}
			}

		});
		save.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().add(save);

		JButton btnNewButton = new JButton("Roll!");
		btnNewButton.addActionListener(new ActionListener() {
			int num = 0;
			int count = 0;
			int colcount1 = 0;
			int colcount2 = 0;
			int colcount3 = 0;
			int colcount4 = 0;
			int colcount5 = 0;
			int colcount6 = 0;
			int windcount = 0;

			DefaultCategoryDataset ds = new DefaultCategoryDataset();

			public void actionPerformed(ActionEvent e) {
				save.setBounds(421, 110, 89, 23);
				count++;
				windcount++;
				Random r = new Random();
				num = r.nextInt(7 - 1) + 1;
				result.setText("" + num);
				if (count > 0) {

					if (num == 1) {
						colcount1++;
						ds.addValue(colcount1, "frequency", "1 roll");
					} else if (num == 2) {
						colcount2++;
						ds.addValue(colcount2, "frequency", "2 roll");
					} else if (num == 3) {
						colcount3++;
						ds.addValue(colcount3, "frequency", "3 roll");
					} else if (num == 4) {
						colcount4++;
						ds.addValue(colcount4, "frequency", "4 roll");
					} else if (num == 5) {
						colcount5++;
						ds.addValue(colcount5, "frequency", "5 roll");
					} else if (num == 6) {
						colcount6++;
						ds.addValue(colcount6, "frequency", "6 roll");
					}

				}
				if (windcount > 1) {

					chart = ChartFactory.createBarChart("Dice Frequency", "Dice number", "frequency", ds,
							PlotOrientation.VERTICAL, false, true, false);

					CategoryPlot p = chart.getCategoryPlot();
					p.setRangeGridlinePaint(Color.BLACK);
					f = new ChartFrame("Dice Bar Chart", chart);
					f.setVisible(true);
					f.setSize(450, 350);
					f.setLocation(300, 300);

					close();
				} else {
					chart = ChartFactory.createBarChart("Dice Frequency", "Dice number", "frequency", ds,
							PlotOrientation.VERTICAL, false, true, false);
					CategoryPlot p = chart.getCategoryPlot();
					p.setRangeGridlinePaint(Color.BLACK);
					f = new ChartFrame("Dice Bar Chart", chart);
					f.setVisible(true);
					f.setSize(450, 350);

					f.setLocation(300, 300);
				}
			}

		});

		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(318, 80, 89, 23);
		frame.getContentPane().add(btnNewButton);

	}

	public void close() {
		WindowEvent w = new WindowEvent(f, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		frame.setSize(752, 208);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
