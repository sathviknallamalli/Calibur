package AInterfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import PeriodicTable.PeriodicTable;

public class DeleteAccount extends JFrame {

	Connection connection = null;
	Connection conn2 = null;
	private JTextField username;
	private JPasswordField password;

	public DeleteAccount() {
		super("Rate");
		getContentPane().setBackground(new Color(240, 240, 240));
		
		connection = sqlConnection.sqlExpress();
		conn2 = sqlConnection.sqlExpressUserData();
		
		setBounds(100, 100, 613, 226);
		getContentPane().setLayout(null);

		JLabel lblLoginToCalibur = new JLabel("Delete Account");
		lblLoginToCalibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblLoginToCalibur.setBounds(130, 11, 336, 47);
		getContentPane().add(lblLoginToCalibur);

		JButton submit = new JButton("Verify");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "select * from UserData where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, username.getText());
					pst.setString(2, password.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;

					while (rs.next()) {
						count++;
					}
					if (count == 1) {
						JOptionPane.showMessageDialog(null, "Account exists");
						int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your account?", "",
								JOptionPane.YES_NO_OPTION);
						if (p == 0) {
							
							try {
								//delete from main userdata database
								String sql = "delete from UserData where username=? and password=?";
								PreparedStatement pst2 = connection.prepareStatement(sql);
								pst2.setString(1, username.getText());
								pst2.setString(2, password.getText());
								
								connection.close();

								//delete table userinfocompletion database
								
								String sql2 = "drop table " + username.getText();
								PreparedStatement pst3 = conn2.prepareStatement(sql2);
								pst3.execute();
								
								conn2.close();
								
								//delete file on desktop
								//need to implement code
							
								JOptionPane.showMessageDialog(null, "Account has been deleted");
							} catch (Exception b) {
								JOptionPane.showMessageDialog(null, b + "  account exists");
							}
						}

					} else {
						JOptionPane.showMessageDialog(null, "Account doesnt exist");
					}
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a);
				}
			}
		});
		submit.setFont(new Font("Arial", Font.PLAIN, 12));
		submit.setBounds(271, 150, 89, 25);
		getContentPane().add(submit);

		JLabel label = new JLabel("Username");
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(153, 70, 86, 20);
		getContentPane().add(label);

		username = new JTextField();
		username.setFont(new Font("Arial", Font.PLAIN, 13));
		username.setColumns(10);
		username.setBounds(249, 69, 188, 26);
		getContentPane().add(username);

		JLabel label_1 = new JLabel("Password");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_1.setBounds(153, 114, 86, 20);
		getContentPane().add(label_1);

		password = new JPasswordField();
		password.setFont(new Font("Arial", Font.PLAIN, 13));
		password.setBounds(249, 113, 188, 26);
		getContentPane().add(password);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(getSize());
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
