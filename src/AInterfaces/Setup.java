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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Setup extends JFrame {
	private JTextField untf;
	Connection connection = null;
	private JPasswordField pdtf;
	private JTextField email;

	public Setup() {
		getContentPane().setLayout(null);

		connection = sqlConnection.sqlExpress();

		JLabel lblSignUp = new JLabel("Setup Pin Code");
		lblSignUp.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblSignUp.setBounds(251, 11, 307, 47);
		getContentPane().add(lblSignUp);

		JLabel username = new JLabel("Username");
		username.setFont(new Font("Times New Roman", Font.BOLD, 18));
		username.setBounds(165, 91, 86, 20);
		getContentPane().add(username);

		JLabel password = new JLabel("Password");
		password.setFont(new Font("Times New Roman", Font.BOLD, 18));
		password.setBounds(165, 122, 86, 20);

		getContentPane().add(password);

		untf = new JTextField();
		untf.setFont(new Font("Arial", Font.PLAIN, 13));
		untf.setColumns(10);
		untf.setBounds(338, 85, 188, 26);
		getContentPane().add(untf);

		JLabel lblPasswordsAreNot = new JLabel("<html> Passwords are not the same\r\n");
		lblPasswordsAreNot.setForeground(Color.RED);
		lblPasswordsAreNot.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		getContentPane().add(lblPasswordsAreNot);

		pdtf = new JPasswordField();
		pdtf.setFont(new Font("Arial", Font.PLAIN, 13));
		pdtf.setBounds(338, 116, 188, 26);
		getContentPane().add(pdtf);

		JLabel lblToContinueWith = new JLabel(
				"To continue with the setup, please enter your current log in information to confirm your profile and we can save your pin code");
		lblToContinueWith.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblToContinueWith.setBounds(85, 51, 609, 23);
		getContentPane().add(lblToContinueWith);

		email = new JTextField();
		email.setFont(new Font("Arial", Font.PLAIN, 13));
		getContentPane().add(email);

		JLabel lblEnterEmailTo = new JLabel("Enter email to send verificaton");
		lblEnterEmailTo.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		getContentPane().add(lblEnterEmailTo);

		JButton send = new JButton("Send");
		send.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		getContentPane().add(send);

		JButton ver = new JButton("Verify!");
		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "select * from UserData where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, untf.getText());
					pst.setString(2, pdtf.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0;

					while (rs.next()) {
						count++;
					}
					if (count == 1) {
						String temp = untf.getText();
						untf.setText("");
						pdtf.setText("");
						username.setBounds(0, 0, 0, 0);
						password.setBounds(0, 0, 0, 0);

						JLabel code = new JLabel("Enter a 4-digit pin code of your choice");
						code.setFont(new Font("Times New Roman", Font.ITALIC, 14));
						code.setBounds(261, 158, 229, 20);
						getContentPane().add(code);

						JLabel enter = new JLabel("Pin code: ");
						enter.setFont(new Font("Times New Roman", Font.BOLD, 18));
						enter.setBounds(165, 91, 86, 20);
						getContentPane().add(enter);

						JLabel confirm = new JLabel("Confirm the code: ");
						confirm.setFont(new Font("Times New Roman", Font.BOLD, 18));
						confirm.setBounds(165, 122, 160, 20);
						getContentPane().add(confirm);

						ver.setBounds(0, 0, 0, 0);

						JButton save = new JButton("Save Code");
						save.setFont(new Font("Times New Roman", Font.PLAIN, 13));
						save.setBounds(566, 91, 117, 34);
						getContentPane().add(save);

						save.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent s) {
								String one = untf.getText();
								String two = pdtf.getText();
								boolean exists = false;
								if (one.length() == 4) {

									if (one.equals(two)) {
										try {
											String query = "select * from Pin";
											PreparedStatement pst = connection.prepareStatement(query);
											ResultSet rs = pst.executeQuery();
											while (rs.next()) {
												if (rs.getString("Code").equals(one)) {
													JOptionPane.showMessageDialog(null,
															"This Pin Code already exists, please make a different one.");
													exists = true;
												}
											}

											if (exists == false) {
												try {
													String query1 = "insert into Pin (Username,Code) values (?,?)";
													PreparedStatement pst1 = connection.prepareStatement(query1);
													pst1.setString(1, temp);
													pst1.setString(2, one);

													pst1.execute();

													pst1.close();
													close();

													String sql = "update UserData " + " set Pincode= '" + one + "'"
															+ " where Username= '" + temp + "'";

													PreparedStatement pst2 = connection.prepareStatement(sql);

													pst2.execute();

													JOptionPane.showMessageDialog(null,
															"Your code has been saved, it can now be used to login to Calibur. You can send a verification email");
													email.setBounds(307, 188, 188, 26);
													lblEnterEmailTo.setBounds(324, 166, 151, 23);
													send.setBounds(505, 190, 89, 23);

													send.addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {

															SignUp.sendEmail(email.getText(), "", username.getText(),
																	"Pin Code Setup", "Hello, " + username.getText()
																			+ "\nWe are glad that you would like to set up a pin code. Your pin code has been saved and it can be used to login to Calibur, along with your regular login information. This email is to ensure that the code has been saved and you are aware of this matter. You may now go back to the Home Page of Calibur and continue with your learning experience. ");

														}
													});

												} catch (Exception a) {
													JOptionPane.showMessageDialog(null, a);
												}
											}
										} catch (Exception e) {
											e.printStackTrace();
										}

									} else {
										JOptionPane.showMessageDialog(null,
												"The pin codes you entered are not the same");
									}
								} else if (one.length() != 4) {
									JOptionPane.showMessageDialog(null, "Code isnt 4 digits");
								}
							}
						});

					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "Username and password is duplicated");
					}

					else {
						JOptionPane.showMessageDialog(null, "Username or password is not correct. Try again");
					}
				} catch (Exception c) {
					JOptionPane.showMessageDialog(null, c);
				}
			}
		});
		ver.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ver.setBounds(566, 91, 117, 34);
		getContentPane().add(ver);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(801, 301);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}