package GraphTemplates;

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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class ScienceFair {

	private JFrame frame;
	private JTextField col1;
	private JTextField col2;
	private JTextField col3;
	private JTextField newCol;
	private JTextField title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScienceFair window = new ScienceFair();
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
	public ScienceFair() {

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
		frame.setSize(680, 315);
		frame.setLocation(300, 150);
		frame.getContentPane().setLayout(null);

		JTable jt = new JTable();
		JScrollPane js = new JScrollPane(jt);
		js.setBounds(10, 84, 385, 181);

		DefaultTableModel model = new DefaultTableModel();
		jt.setModel(model);
		jt.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		frame.getContentPane().add(js);

		JButton btnInsertNewTrial = new JButton("Insert New Trial");

		btnInsertNewTrial.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnInsertNewTrial.setBounds(405, 84, 147, 25);
		frame.getContentPane().add(btnInsertNewTrial);

		JButton button_1 = new JButton("Delete Row");

		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(405, 120, 147, 25);
		frame.getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("Insert Your Test Labels\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 28, 163, 14);
		frame.getContentPane().add(lblNewLabel);

		col1 = new JTextField();
		col1.setBounds(10, 53, 86, 20);
		frame.getContentPane().add(col1);
		col1.setColumns(10);

		col2 = new JTextField();
		col2.setColumns(10);
		col2.setBounds(106, 53, 86, 20);
		frame.getContentPane().add(col2);

		String ras[] = { "Auto", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		JLabel lblenterAllThe = new JLabel("<html>Enter all the data values and choose your type of graph");
		lblenterAllThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblenterAllThe.setBounds(492, 36, 172, 37);
		frame.getContentPane().add(lblenterAllThe);

		JButton btnInsertColumn = new JButton("Insert Column");
		btnInsertColumn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnInsertColumn.setBounds(405, 156, 147, 25);
		frame.getContentPane().add(btnInsertColumn);

		newCol = new JTextField();
		newCol.setColumns(10);
		frame.getContentPane().add(newCol);

		JButton btnDeleteColumn = new JButton("Delete Column");
		btnDeleteColumn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnDeleteColumn.setBounds(405, 192, 147, 25);
		frame.getContentPane().add(btnDeleteColumn);

		JButton add = new JButton("Add!");
		add.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(add);

		JButton button = new JButton("Go!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String one = col1.getText();
				String two = col2.getText();
				String three = col3.getText();

				model.addColumn("");
				model.addColumn(one);
				model.addColumn(two);
				model.addColumn(three);

				model.addRow(new Object[] { "Trial 1" });
				model.addRow(new Object[] { "Trial 2" });
				model.addRow(new Object[] { "Trial 3" });

				btnInsertNewTrial.addActionListener(new ActionListener() {
					int count = 3;

					public void actionPerformed(ActionEvent e) {

						count++;
						model.addRow(new Object[] { "Trial " + count });
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
				btnInsertColumn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						newCol.setBounds(561, 158, 86, 20);
						add.setBounds(569, 179, 76, 20);
						add.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent a) {
								model.addColumn(newCol.getText());
								add.setBounds(0, 0, 0, 0);
								newCol.setBounds(0, 0, 0, 0);
							}
						});

					}
				});

			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(392, 53, 91, 20);
		frame.getContentPane().add(button);

		col3 = new JTextField();
		col3.setColumns(10);
		col3.setBounds(202, 53, 86, 20);
		frame.getContentPane().add(col3);

		JLabel lblYouCanAdd = new JLabel("<html>You can add more columns if needed");
		lblYouCanAdd.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblYouCanAdd.setBounds(161, 11, 114, 37);
		frame.getContentPane().add(lblYouCanAdd);

		String ops[] = { "Bar Chart", "Histogram", "Scatterplot" };

		JComboBox charts = new JComboBox(ops);
		charts.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		charts.setBounds(405, 228, 147, 25);
		frame.getContentPane().add(charts);

		JButton create = new JButton("Create!");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosen = (String) charts.getSelectedItem();
				switch (chosen) {
				case "Bar Chart":
					try {
						int rowCount = model.getRowCount();
						int columnCount = model.getColumnCount();

						DefaultCategoryDataset ds = new DefaultCategoryDataset();

						String tit = title.getText(); 
						String x = col1.getText();
						String y = col2.getText();

						for (int i = 0; i < rowCount; i++) {

							for (int j = 0; j < columnCount - 1; j++) {
								String name = (String) model.getValueAt(i, j);
								int a = Integer.parseInt((String) model.getValueAt(i, 1));
								ds.setValue(a, y, name);

							}
						}

						JFreeChart chart = ChartFactory.createBarChart(tit, x, y, ds, PlotOrientation.VERTICAL, false,
								true, false);
						CategoryPlot p = chart.getCategoryPlot();
						p.setRangeGridlinePaint(Color.BLACK);
						ChartFrame f = new ChartFrame("Bar Chart", chart);
						f.setVisible(true);
						f.setSize(450, 350);
					} catch (Exception a) {
						JOptionPane.showMessageDialog(null, col2.getText() + " needs to be numerical");
					}
					break;
				}
			}
		});
		create.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		create.setBounds(562, 230, 78, 20);
		frame.getContentPane().add(create);
		
		title = new JTextField();
		title.setColumns(10);
		title.setBounds(298, 53, 86, 20);
		frame.getContentPane().add(title);
		
		JLabel lblEnterTitle = new JLabel("Enter Title");
		lblEnterTitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblEnterTitle.setBounds(311, 35, 69, 14);
		frame.getContentPane().add(lblEnterTitle);

	}

	public void newClass() {

		frame.setSize(938, 543);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
