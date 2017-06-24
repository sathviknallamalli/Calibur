package AInterfaces;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import GraphTemplates.BarChart;
import GraphTemplates.Histogram;
import GraphTemplates.ScienceFair;

public class Chart {

	private JFrame frame;
	private JTextField newCol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chart window = new Chart();
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
	public Chart() {
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
		frame = new JFrame("Chart Generator");
		frame.getContentPane().setBackground(new Color(102, 204, 255));
		frame.getContentPane().setLayout(null);
		frame.setSize(891, 613);
		frame.setLocation(300, 150);

		JLabel lblChartGenerator = new JLabel("Chart Generator");
		lblChartGenerator.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblChartGenerator.setBounds(244, 11, 377, 42);
		frame.getContentPane().add(lblChartGenerator);

		JLabel lblinitializeTheSize = new JLabel(
				"<html>Initialize the size of your data table, then enter, and select the type of graph you would like. You can also get a template for certain charts you want to make.\r\n");
		lblinitializeTheSize.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblinitializeTheSize.setBounds(10, 53, 860, 23);
		frame.getContentPane().add(lblinitializeTheSize);

		JLabel lblSetSizeOf = new JLabel("Set size of Data Set:");
		lblSetSizeOf.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSetSizeOf.setBounds(11, 83, 142, 23);
		frame.getContentPane().add(lblSetSizeOf);

		JLabel col = new JLabel("Column");
		col.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		col.setBounds(21, 117, 59, 14);
		frame.getContentPane().add(col);

		String[] vals = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };

		JTextField tf1 = new JTextField();
		tf1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf1.setColumns(10);
		frame.getContentPane().add(tf1);

		JTextField tf2 = new JTextField();
		tf2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf2.setColumns(10);
		frame.getContentPane().add(tf2);

		JTextField tf3 = new JTextField();
		tf3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf3.setColumns(10);
		frame.getContentPane().add(tf3);

		JTextField tf4 = new JTextField();
		tf4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf4.setColumns(10);
		frame.getContentPane().add(tf4);

		JTextField tf5 = new JTextField();
		tf5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf5.setColumns(10);
		frame.getContentPane().add(tf5);

		JTextField tf6 = new JTextField();
		tf6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf6.setColumns(10);
		frame.getContentPane().add(tf6);

		JTextField tf7 = new JTextField();
		tf7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf7.setColumns(10);
		frame.getContentPane().add(tf7);

		JTextField tf8 = new JTextField();
		tf8.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf8.setColumns(10);
		frame.getContentPane().add(tf8);

		JTextField tf9 = new JTextField();
		tf9.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf9.setColumns(10);
		frame.getContentPane().add(tf9);

		JTextField tf10 = new JTextField();
		tf10.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf10.setColumns(10);
		frame.getContentPane().add(tf10);

		JTextField tf11 = new JTextField();
		tf11.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf11.setColumns(10);
		frame.getContentPane().add(tf11);

		JTextField tf12 = new JTextField();
		tf12.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf12.setColumns(10);
		frame.getContentPane().add(tf12);

		JTextField tf13 = new JTextField();
		tf13.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf13.setColumns(10);
		frame.getContentPane().add(tf13);

		JTextField tf14 = new JTextField();
		tf14.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf14.setColumns(10);
		frame.getContentPane().add(tf14);

		JTextField tf15 = new JTextField();
		tf15.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tf15.setColumns(10);
		frame.getContentPane().add(tf15);

		JLabel lblEnterTheCategory = new JLabel("<html>Enter the category names of each column");
		lblEnterTheCategory.setForeground(Color.RED);
		lblEnterTheCategory.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		frame.getContentPane().add(lblEnterTheCategory);

		JComboBox c = new JComboBox(vals);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int in = Integer.parseInt((String) c.getSelectedItem());

				switch (in) {
				case 1:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(0, 0, 0, 0);
					tf3.setBounds(0, 0, 0, 0);
					tf4.setBounds(0, 0, 0, 0);
					tf5.setBounds(0, 0, 0, 0);
					tf6.setBounds(0, 0, 0, 0);
					tf7.setBounds(0, 0, 0, 0);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 2:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(0, 0, 0, 0);
					tf4.setBounds(0, 0, 0, 0);
					tf5.setBounds(0, 0, 0, 0);
					tf6.setBounds(0, 0, 0, 0);
					tf7.setBounds(0, 0, 0, 0);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 3:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(0, 0, 0, 0);
					tf5.setBounds(0, 0, 0, 0);
					tf6.setBounds(0, 0, 0, 0);
					tf7.setBounds(0, 0, 0, 0);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 4:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(0, 0, 0, 0);
					tf6.setBounds(0, 0, 0, 0);
					tf7.setBounds(0, 0, 0, 0);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 5:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(0, 0, 0, 0);
					tf7.setBounds(0, 0, 0, 0);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 6:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(0, 0, 0, 0);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 7:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(0, 0, 0, 0);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 8:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(0, 0, 0, 0);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 9:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(0, 0, 0, 0);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 10:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(407, 128, 105, 23);
					tf11.setBounds(0, 0, 0, 0);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 11:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(407, 128, 105, 23);
					tf11.setBounds(407, 156, 105, 23);
					tf12.setBounds(0, 0, 0, 0);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 12:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(407, 128, 105, 23);
					tf11.setBounds(407, 156, 105, 23);
					tf12.setBounds(407, 184, 105, 23);
					tf13.setBounds(0, 0, 0, 0);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 13:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(407, 128, 105, 23);
					tf11.setBounds(407, 156, 105, 23);
					tf12.setBounds(407, 184, 105, 23);
					tf13.setBounds(526, 100, 105, 23);
					tf14.setBounds(0, 0, 0, 0);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 14:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(407, 128, 105, 23);
					tf11.setBounds(407, 156, 105, 23);
					tf12.setBounds(407, 184, 105, 23);
					tf13.setBounds(526, 100, 105, 23);
					tf14.setBounds(526, 128, 105, 23);
					tf15.setBounds(0, 0, 0, 0);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				case 15:
					tf1.setBounds(169, 100, 105, 23);
					tf2.setBounds(169, 128, 105, 23);
					tf3.setBounds(169, 156, 105, 23);
					tf4.setBounds(169, 184, 105, 23);
					tf5.setBounds(288, 100, 105, 23);
					tf6.setBounds(288, 128, 105, 23);
					tf7.setBounds(288, 156, 105, 23);
					tf8.setBounds(288, 184, 105, 23);
					tf9.setBounds(407, 100, 105, 23);
					tf10.setBounds(407, 128, 105, 23);
					tf11.setBounds(407, 156, 105, 23);
					tf12.setBounds(407, 184, 105, 23);
					tf13.setBounds(526, 100, 105, 23);
					tf14.setBounds(526, 128, 105, 23);
					tf15.setBounds(526, 156, 105, 23);
					lblEnterTheCategory.setBounds(21, 176, 125, 59);
					break;
				}

			}

		});

		c.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		c.setBounds(21, 142, 48, 23);
		frame.getContentPane().add(c);

		JButton ins = new JButton("Insert New Row");
		ins.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ins.setBounds(688, 172, 159, 31);
		frame.getContentPane().add(ins);

		JButton insc = new JButton("Insert New Column\r\n");

		insc.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		insc.setBounds(688, 130, 159, 31);
		frame.getContentPane().add(insc);

		newCol = new JTextField();
		newCol.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		frame.getContentPane().add(newCol);
		newCol.setColumns(10);

		JButton add = new JButton("Add!");
		add.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.getContentPane().add(add);

		JButton gen = new JButton("Generate!");

		gen.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gen.setBounds(713, 367, 117, 23);
		frame.getContentPane().add(gen);

		String ops[] = { "Choose a Chart: ", "Bar Chart", "Histogram", "Pie Chart", "Scatterplot",
				"Box and Whisker Plot", "3D Bar Chart", "Line Chart", "Bubble Chart" };

		JComboBox charts = new JComboBox(ops);
		charts.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		charts.setBounds(688, 325, 159, 31);
		frame.getContentPane().add(charts);

		JButton del = new JButton("Delete Row");

		del.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		del.setBounds(688, 257, 159, 31);
		frame.getContentPane().add(del);

		JTable jt = new JTable();
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(21, 272, 639, 221);

		DefaultTableModel model = new DefaultTableModel();
		jt.setModel(model);
		jt.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		frame.getContentPane().add(js);

		JButton go = new JButton("GO!");

		go.addActionListener(new ActionListener() {
			JTable jt = table();

			public void actionPerformed(ActionEvent e) {

				int a = c.getSelectedIndex();
				if (a == 1) {

					String cols[] = { tf1.getText() };
					int cc = 1;

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!" });

						}
					});

					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 97, 105, 23);
							add.setBounds(796, 97, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});

					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							} else if (selected.equals("Bar Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A Bar Chart can only be generated with 2 columns");
								} else {
									if (cc == 1) {
										int rowCount = model.getRowCount();
										int columnCount = model.getColumnCount();

										DefaultCategoryDataset ds = new DefaultCategoryDataset();

										String title = tf1.getText() + " V.S. " + newCol.getText();
										String x = tf1.getText();
										String y = newCol.getText();

										for (int i = 0; i < rowCount; i++) {

											for (int j = 0; j < columnCount - 1; j++) {
												String name = (String) model.getValueAt(i, j);
												int a = Integer.parseInt((String) model.getValueAt(i, 1));
												ds.setValue(a, y, name);

											}
										}

										JFreeChart chart = ChartFactory.createBarChart(title, x, y, ds,
												PlotOrientation.VERTICAL, false, true, false);
										CategoryPlot p = chart.getCategoryPlot();
										p.setRangeGridlinePaint(Color.BLACK);
										ChartFrame f = new ChartFrame("Bar Chart", chart);
										f.setVisible(true);
										f.setSize(450, 350);
									}

								}

							} else if (selected.equals("Pie Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A Pie Chart can only be generated with 2 columns");
								} else {
									if (cc == 1) {

										int rowCount = model.getRowCount();
										int columnCount = model.getColumnCount();

										String title = tf1.getText() + " and " + newCol.getText();
										String x = tf1.getText();
										String y = newCol.getText();

										DefaultPieDataset pie = new DefaultPieDataset();

										for (int i = 0; i < rowCount; i++) {

											String name = (String) model.getValueAt(i, 0);
											int a = Integer.parseInt((String) model.getValueAt(i, 1));
											pie.setValue(name, new Integer(a));

										}
										JFreeChart chart = ChartFactory.createPieChart(title, pie, true, true, true);
										PiePlot p = (PiePlot) chart.getPlot();
										ChartFrame f = new ChartFrame("Pie Chart", chart);
										f.setVisible(true);
										f.setSize(450, 500);
										f.setLocation(100, 100);
									}

								}

							} else if (selected.equals("3D Bar Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A 3D Bar Chart can only be generated with 2 columns");
								} else if (cc == 1) {
									int rowCount = model.getRowCount();
									int columnCount = model.getColumnCount();

									DefaultCategoryDataset ds = new DefaultCategoryDataset();

									String title = tf1.getText() + " V.S. " + newCol.getText();
									String x = tf1.getText();
									String y = newCol.getText();

									for (int i = 0; i < rowCount; i++) {

										for (int j = 0; j < columnCount - 1; j++) {
											String name = (String) model.getValueAt(i, j);
											int a = Integer.parseInt((String) model.getValueAt(i, 1));
											ds.setValue(a, y, name);

										}
									}

									JFreeChart chart = ChartFactory.createBarChart3D(title, x, y, ds,
											PlotOrientation.VERTICAL, false, true, false);

									CategoryPlot p = chart.getCategoryPlot();
									p.setRangeGridlinePaint(Color.BLACK);
									ChartFrame f = new ChartFrame("Bar Chart 3D", chart);
									f.setVisible(true);
									f.setSize(450, 350);
								}

							} else if (selected.equals("Line Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A Line Chart can only be generated with 2 columns");
								} else if (cc == 1) {
									int rowCount = model.getRowCount();
									int columnCount = model.getColumnCount();

									DefaultCategoryDataset ds = new DefaultCategoryDataset();

									String title = tf1.getText() + " V.S. " + newCol.getText();
									String x = tf1.getText();
									String y = newCol.getText();

									for (int i = 0; i < rowCount; i++) {

										for (int j = 0; j < columnCount - 1; j++) {
											String name = (String) model.getValueAt(i, j);
											int a = Integer.parseInt((String) model.getValueAt(i, 1));
											ds.setValue(a, y, name);

										}
									}

									JFreeChart chart = ChartFactory.createLineChart(title, x, y, ds,
											PlotOrientation.VERTICAL, false, true, false);

									CategoryPlot p = chart.getCategoryPlot();
									p.setRangeGridlinePaint(Color.BLACK);
									ChartFrame f = new ChartFrame("Line Chart", chart);
									f.setVisible(true);
									f.setSize(450, 350);
								}
							}
						}
					});

					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});

				} else if (a == 2) {
					newCol.setBounds(0, 0, 0, 0);
					add.setBounds(0, 0, 0, 0);
					String cols[] = { tf1.getText(), tf2.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}

					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});

					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							} else if (selected.equals("Bar Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A Bar Chart can only be generated with 2 columns");
								} else {

									int rowCount = model.getRowCount();
									int columnCount = model.getColumnCount();

									DefaultCategoryDataset ds = new DefaultCategoryDataset();

									String title = tf1.getText() + " V.S. " + tf2.getText();
									String x = tf1.getText();
									String y = tf2.getText();

									for (int i = 0; i < rowCount; i++) {

										for (int j = 0; j < columnCount - 1; j++) {
											String name = (String) model.getValueAt(i, j);
											int a = Integer.parseInt((String) model.getValueAt(i, 1));
											ds.setValue(a, y, name);

										}
									}

									JFreeChart chart = ChartFactory.createBarChart(title, x, y, ds,
											PlotOrientation.VERTICAL, false, true, false);
									CategoryPlot p = chart.getCategoryPlot();
									p.setRangeGridlinePaint(Color.BLACK);
									ChartFrame f = new ChartFrame("Bar Chart", chart);
									f.setVisible(true);
									f.setSize(450, 350);
								}

							} else if (selected.equals("Pie Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A Pie Chart can only be generated with 2 columns");
								} else {

									int rowCount = model.getRowCount();

									String title = tf1.getText() + " and " + tf2.getText();

									DefaultPieDataset pie = new DefaultPieDataset();

									for (int i = 0; i < rowCount; i++) {

										String name = (String) model.getValueAt(i, 0);
										int a = Integer.parseInt((String) model.getValueAt(i, 1));
										pie.setValue(name, new Integer(a));

									}
									JFreeChart chart = ChartFactory.createPieChart(title, pie, true, true, true);
									PiePlot p = (PiePlot) chart.getPlot();
									ChartFrame f = new ChartFrame("Pie Chart", chart);
									f.setVisible(true);
									f.setSize(450, 500);
									f.setLocation(100, 100);

								}

							} else if (selected.equals("3D Bar Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A 3D Bar Chart can only be generated with 2 columns");
								} else {

									int rowCount = model.getRowCount();
									int columnCount = model.getColumnCount();

									DefaultCategoryDataset ds = new DefaultCategoryDataset();

									String title = tf1.getText() + " V.S. " + tf2.getText();
									String x = tf1.getText();
									String y = tf2.getText();

									for (int i = 0; i < rowCount; i++) {

										for (int j = 0; j < columnCount - 1; j++) {
											String name = (String) model.getValueAt(i, j);
											int a = Integer.parseInt((String) model.getValueAt(i, 1));
											ds.setValue(a, y, name);

										}
									}

									JFreeChart chart = ChartFactory.createBarChart3D(title, x, y, ds,
											PlotOrientation.VERTICAL, false, true, false);

									CategoryPlot p = chart.getCategoryPlot();
									p.setRangeGridlinePaint(Color.BLACK);
									ChartFrame f = new ChartFrame("Bar Chart 3D", chart);
									f.setVisible(true);
									f.setSize(450, 350);
								}
							} else if (selected.equals("Line Chart")) {
								if (model.getColumnCount() != 2) {
									JOptionPane.showMessageDialog(null,
											"A Line Chart can only be generated with 2 columns");
								} else {

									int rowCount = model.getRowCount();
									int columnCount = model.getColumnCount();

									DefaultCategoryDataset ds = new DefaultCategoryDataset();

									String title = tf1.getText() + " V.S. " + tf2.getText();
									String x = tf1.getText();
									String y = tf2.getText();

									for (int i = 0; i < rowCount; i++) {

										for (int j = 0; j < columnCount - 1; j++) {
											String name = (String) model.getValueAt(i, j);
											int a = Integer.parseInt((String) model.getValueAt(i, 1));
											ds.setValue(a, y, name);

										}
									}

									JFreeChart chart = ChartFactory.createLineChart(title, x, y, ds,
											PlotOrientation.VERTICAL, false, true, false);

									CategoryPlot p = chart.getCategoryPlot();
									p.setRangeGridlinePaint(Color.BLACK);
									ChartFrame f = new ChartFrame("Line Chart", chart);
									f.setVisible(true);
									f.setSize(450, 350);
								}
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});

				} else if (a == 3) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});

					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}

						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});

				} else if (a == 4) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});

					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});

				} else if (a == 5) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 6) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 7) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText() };
					String stats[][] = {};

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 8) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 9) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 10) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText(), tf10.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 11) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText(), tf10.getText(),
							tf11.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 12) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText(), tf10.getText(), tf11.getText(),
							tf12.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 13) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText(), tf10.getText(),
							tf11.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 14) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText(), tf10.getText(), tf11.getText(),
							tf12.getText(), tf13.getText(), tf14.getText() };

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 184, 105, 23);
							add.setBounds(796, 184, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});

					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				} else if (a == 15) {

					String cols[] = { tf1.getText(), tf2.getText(), tf3.getText(), tf4.getText(), tf5.getText(),
							tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText(), tf10.getText(), tf11.getText(),
							tf12.getText(), tf13.getText(), tf14.getText(), tf15.getText() };
					String stats[][] = {};

					model.setColumnIdentifiers(cols);

					ins.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent a) {
							model.addRow(new Object[] { "Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!", "Enter the Data Value HERE!",
									"Enter the Data Value HERE!" });

						}
					});
					insc.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							newCol.setBounds(688, 206, 105, 23);
							add.setBounds(796, 206, 74, 23);
							add.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent a) {
									String nc = newCol.getText();
									model.addColumn(nc);
								}
							});
						}
					});
					gen.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							String selected = (String) charts.getSelectedItem();
							if (selected.equals("Choose a Chart: ")) {
								JOptionPane.showMessageDialog(null, "NO CHART WAS SELECTED");
							}
							if (selected.equals("Bar Chart")) {
								JOptionPane.showMessageDialog(null, "A Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Pie Chart")) {
								JOptionPane.showMessageDialog(null, "A Pie Chart can only be generated with 2 columns");
							} else if (selected.equals("3D Bar Chart")) {
								JOptionPane.showMessageDialog(null,
										"A 3D Bar Chart can only be generated with 2 columns");
							} else if (selected.equals("Line Chart")) {
								JOptionPane.showMessageDialog(null,
										"A Line Chart can only be generated with 2 columns");
							}
						}
					});
					del.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							model.removeRow(jt.getSelectedRow());
						}
					});
				}

			}

		});

		JLabel d = new JLabel("Enter the parameters for each column");
		d.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(d);

		go.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		go.setBounds(21, 237, 88, 23);
		frame.getContentPane().add(go);

		JLabel lblGenerateChart = new JLabel("Generate Chart");
		lblGenerateChart.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGenerateChart.setBounds(688, 299, 142, 23);
		frame.getContentPane().add(lblGenerateChart);

		JButton btnDeleteColumn = new JButton("Delete Column");
		btnDeleteColumn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnDeleteColumn.setBounds(688, 215, 159, 31);
		frame.getContentPane().add(btnDeleteColumn);

		JLabel lblDataTableTemplate = new JLabel("Data Table Template for Graphs");
		lblDataTableTemplate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblDataTableTemplate.setBounds(688, 396, 182, 23);
		frame.getContentPane().add(lblDataTableTemplate);

		String dataTableOps[] = { "Bar Chart Data Table", "Histogram Data Table", "Two-Way Data Table",
				"Triple Axis Data Table", "Science Fair Data" };

		JComboBox tabs = new JComboBox(dataTableOps);
		tabs.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tabs.setBounds(688, 421, 159, 23);
		frame.getContentPane().add(tabs);

		JButton create = new JButton("Create!");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sel = (String) tabs.getSelectedItem();
				if (sel.equals("Bar Chart Data Table")) {
					BarChart b = new BarChart();
					b.newClass();
				} else if (sel.equals("Histogram Data Table")) {
					Histogram b = new Histogram();
					b.newClass();
				} else if (sel.equals("Science Fair Data")) {
					ScienceFair b = new ScienceFair();
					b.newClass();
				}
			}
		});
		create.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		create.setBounds(713, 449, 117, 23);
		frame.getContentPane().add(create);

		JButton reset = new JButton("Reset Table");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cols[] = {};

				model.setColumnIdentifiers(cols);
			}
		});
		reset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		reset.setBounds(123, 237, 95, 23);
		frame.getContentPane().add(reset);

		JButton btnCreateAForm = new JButton("Create a Form or Survey!!");
		btnCreateAForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormSurvey fs = new FormSurvey();
				fs.newClass();
			}
		});
		btnCreateAForm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCreateAForm.setBounds(397, 515, 182, 42);
		frame.getContentPane().add(btnCreateAForm);

	}

	public void newClass() {

		frame.setSize(891, 613);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
