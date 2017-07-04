package CRUDOps;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import AInterfaces.sqlConnection;
import net.proteanit.sql.DbUtils;
import javax.swing.JButton;

public class TableView {

	JFrame frame;
	JLabel lblCurrentTimeIs;
	static String tempe = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableView window = new TableView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;

	private JTable table;

	/**
	 * Create the application.
	 */
	public TableView() {
		connection = sqlConnection.sqlExpress();

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame("Table view");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 777, 268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 550, 207);
		scrollPane.setFont(new Font("Arial", Font.PLAIN, 14));

		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		try {
			String query = "select * from PersonDetails";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet rs = pst.executeQuery();

			DefaultTableModel model = (DefaultTableModel) DbUtils.resultSetToTableModel(rs);
			table.setFont(new Font("Arial", Font.PLAIN, 12));
			table.setModel(model);
			// add del buttons
			ArrayList<JButton> delButtons = new ArrayList<JButton>();
			for (int i = 0; i < model.getRowCount(); i++) {

				delButtons.add(new JButton("Delete"));
				int pos = 31 + (19 * i);
				delButtons.get(i).setBounds(658, pos, 83, 17);
				delButtons.get(i).setFont(new Font("Arial", Font.PLAIN, 11));
				frame.getContentPane().add(delButtons.get(i));
			}
			// add edit buttoms
			ArrayList<JButton> editButtons = new ArrayList<JButton>();
			for (int i = 0; i < model.getRowCount(); i++) {

				editButtons.add(new JButton("Edit"));
				int pos = 31 + (19 * i);
				editButtons.get(i).setBounds(565, pos, 83, 17);
				editButtons.get(i).setFont(new Font("Arial", Font.PLAIN, 11));
				frame.getContentPane().add(editButtons.get(i));
			}
			// actions for del button
			for (int i = 0; i < model.getRowCount(); i++) {
				int j = i;
				delButtons.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your information",
								"", JOptionPane.YES_NO_OPTION);
						if (p == 0) {
							try {
								String sql = "delete from PersonDetails where SSID= ?";
								PreparedStatement stmt = connection.prepareStatement(sql);
								stmt.setInt(1, (int) table.getValueAt(j, 1));
								stmt.execute();
							} catch (Exception a) {
								JOptionPane.showMessageDialog(null, a);
							}
							delButtons.get(j).setBounds(0, 0, 0, 0);
							editButtons.get(j).setBounds(0, 0, 0, 0);
							model.removeRow(j);
						}

					}
				});
			}
			// actions for edit bytton
			for (int i = 0; i < model.getRowCount(); i++) {
				int j = i;
				editButtons.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						UpdateDelete ud = new UpdateDelete();
						ud.newClass();
						UpdateDelete.ssid.setText((String) table.getValueAt(j, 2));
					}
				});
			}

		} catch (Exception a) {
			JOptionPane.showMessageDialog(null, a);
		}

		JButton refresh = new JButton("Refresh");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from PersonDetails";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();

					DefaultTableModel model = (DefaultTableModel) DbUtils.resultSetToTableModel(rs);
					table.setFont(new Font("Arial", Font.PLAIN, 12));
					table.setModel(model);
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a);
				}
			}
		});
		refresh.setBounds(565, 12, 83, 17);
		refresh.setFont(new Font("Arial", Font.PLAIN, 11));
		frame.getContentPane().add(refresh);

		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateRecord cr = new CreateRecord();
				cr.newClass();
			}
		});
		btnCreateNew.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCreateNew.setBounds(658, 12, 83, 17);
		frame.getContentPane().add(btnCreateNew);
	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
