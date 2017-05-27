package GraphTemplates;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart {

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
					BarChart window = new BarChart();
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
	public BarChart() {
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
		frame.setSize(579, 316);
		frame.setLocation(300, 150);
		frame.getContentPane().setLayout(null);

		JTable jt = new JTable();
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(10, 84, 385, 181);
		frame.getContentPane().add(js);

		DefaultTableModel model = new DefaultTableModel();
		jt.setModel(model);
		jt.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		JButton button = new JButton("Insert New Row");

		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(405, 95, 147, 37);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("Delete Row");

		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(405, 143, 147, 37);
		frame.getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("Insert Name for Columns");
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

		JButton btnGo = new JButton("Go!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String one = col1.getText();
				String two = col2.getText();
				String cols[] = { one, two };
				model.setColumnIdentifiers(cols);
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[] { "Enter the Data Value HERE!" });
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
		btnGo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnGo.setBounds(214, 53, 91, 20);
		frame.getContentPane().add(btnGo);

		JButton btnCreateChart = new JButton("Create Chart");
		btnCreateChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int rowCount = model.getRowCount();
					int columnCount = model.getColumnCount();

					DefaultCategoryDataset ds = new DefaultCategoryDataset();

					String title = col1.getText() + " V.S. " + col2.getText();
					String x = col1.getText();
					String y = col2.getText();

					for (int i = 0; i < rowCount; i++) {

						for (int j = 0; j < columnCount - 1; j++) {
							String name = (String) model.getValueAt(i, j);
							int a = Integer.parseInt((String) model.getValueAt(i, 1));
							ds.setValue(a, y, name);

						}
					}

					JFreeChart chart = ChartFactory.createBarChart(title, x, y, ds, PlotOrientation.VERTICAL, false,
							true, false);
					CategoryPlot p = chart.getCategoryPlot();
					p.setRangeGridlinePaint(Color.BLACK);
					ChartFrame f = new ChartFrame("Bar Chart", chart);
					f.setVisible(true);
					f.setSize(450, 350);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, col2.getText() + " needs to be numerical");
				}
			}
		});
		btnCreateChart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCreateChart.setBounds(405, 191, 147, 37);
		frame.getContentPane().add(btnCreateChart);

		String[] vals = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };

		String ops[] = { "Choose a Chart: ", "Bar Chart", "Histogram", "Pie Chart", "Scatterplot",
				"Box and Whisker Plot", "3D Bar Chart", "Line Chart", "Bubble Chart" };

		String dataTableOps[] = { "Bar Chart Data Table", "Histogram Data Table", "Two-Way Data Table",
				"Triple Axis Data Table" };

	}

	public void newClass() {

		frame.setSize(579, 316);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
