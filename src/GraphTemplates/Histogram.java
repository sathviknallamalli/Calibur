package GraphTemplates;

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
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.xy.IntervalXYDataset;

import com.ibm.icu.util.Calendar;

import Machines.Audio;
import studentHub.Conversions.*;
import java.awt.SystemColor;
import GraphTemplates.*;

public class Histogram {

	private JFrame frame;
	private JTextField col1;
	private JTextField col2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Histogram window = new Histogram();
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
	public Histogram() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	public JTable table() {
		JTable jt = null;
		return jt;
	}

	private void initialize() {

		frame = new JFrame();
		frame.setSize(578, 315);
		frame.setLocation(300, 150);
		frame.getContentPane().setLayout(null);

		JTable jt = new JTable();
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(10, 84, 385, 181);
		frame.getContentPane().add(js);

		DefaultTableModel model = new DefaultTableModel();
		jt.setModel(model);
		jt.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		model.addColumn("");
		model.addColumn("");
		model.addColumn("");
		model.addColumn("");
		model.addColumn("");

		model.addRow(new Object[] {});
		model.addRow(new Object[] {});
		model.addRow(new Object[] {});
		model.addRow(new Object[] {});
		

		JButton button = new JButton("Insert New Row");

		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(405, 84, 147, 25);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("Delete Row");

		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(405, 120, 147, 25);
		frame.getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("Insert Axes Labels\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 28, 163, 14);
		frame.getContentPane().add(lblNewLabel);

		col1 = new JTextField();
		col1.setBounds(10, 53, 86, 20);
		frame.getContentPane().add(col1);
		col1.setColumns(10);

		col2 = new JTextField();
		col2.setColumns(10);
		col2.setBounds(118, 53, 86, 20);
		frame.getContentPane().add(col2);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[] {});
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					model.removeRow(jt.getSelectedRow());
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Please select a row to delete");
				}
			}
		});

		String ras[] = { "Auto", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		JComboBox ranges = new JComboBox(ras);
		ranges.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		ranges.setBounds(405, 217, 147, 20);
		frame.getContentPane().add(ranges);

		JButton btnCreateChart = new JButton("Create Chart");
		btnCreateChart.addActionListener(new ActionListener() {
			int rowCount = model.getRowCount();
			int columnCount = model.getColumnCount();
			ArrayList al = new ArrayList();

			public void actionPerformed(ActionEvent e) {

				int a = 0;

				double[] value = new double[100];
				for (int i = 0; i < rowCount; i++) {
					for (int j = 0; j < columnCount; j++) {
						value[a] = Double.parseDouble((String) model.getValueAt(1, j));
						a++;
					}
				}

				int number = Integer.parseInt((String) ranges.getSelectedItem());
				HistogramDataset ds = new HistogramDataset();

				ds.setType(HistogramType.FREQUENCY);
				String title = col1.getText() + " and " + col2.getText();
				String x = col1.getText();
				String y = col2.getText();

				ds.addSeries("HISTOGRAM", value, number);

				PlotOrientation orientation = PlotOrientation.VERTICAL;

				JFreeChart chart = ChartFactory.createHistogram(title, x, y, ds, orientation, false, false, false);

				int width = 500;
				int height = 300;
				try {
					ChartUtilities.saveChartAsPNG(new File("C:\\Users\\sathv\\Desktop\\" + title + ".PNG"), chart,
							width, height);
				} catch (IOException b) {
				}

			}
		});
		btnCreateChart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCreateChart.setBounds(405, 156, 147, 25);
		frame.getContentPane().add(btnCreateChart);

		JLabel lblenterAllThe = new JLabel("<html>Enter all the data values and choose your Ranges");
		lblenterAllThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblenterAllThe.setBounds(214, 36, 214, 37);
		frame.getContentPane().add(lblenterAllThe);

		JLabel lblSetRanges = new JLabel("Set Number of Bars");
		lblSetRanges.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblSetRanges.setBounds(405, 192, 147, 14);
		frame.getContentPane().add(lblSetRanges);

		String[] vals = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };

		String ops[] = { "Choose a Chart: ", "Bar Chart", "Histogram", "Pie Chart", "Scatterplot",
				"Box and Whisker Plot", "3D Bar Chart", "Line Chart", "Bubble Chart" };

		String dataTableOps[] = { "Bar Chart Data Table", "Histogram Data Table", "Two-Way Data Table",
				"Triple Axis Data Table" };

	}

	public void newClass() {

		frame.setSize(938, 543);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
