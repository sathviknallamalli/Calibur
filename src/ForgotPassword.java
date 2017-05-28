
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ForgotPassword {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	Connection conn = null;

	private JTable table_1;
	String s;
	String m;
	String h;
	private JTextField email;
	private JTextField enter;
	private JTextField uname;
	String randCode = "";
	int count = 0;
	private JPasswordField orig;
	private JPasswordField confirm;

	/**
	 * Create the application.
	 */
	public ForgotPassword() {
		connection = sqliteConnection.c();
		conn = sqliteConnection.c();
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	public String concat(String one, String two, String three) {
		String end = one + two + three;
		return end;
	}

	public int getInt(int val) {
		return val;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 779, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblForgotPassword = new JLabel("Forgot Password\r\n");
		lblForgotPassword.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblForgotPassword.setBounds(192, 11, 377, 47);
		frame.getContentPane().add(lblForgotPassword);

		JLabel lblOhNoYou = new JLabel(
				"Oh no! You forgot your password, its ok! We can reset your password from here. Please enter the necessary information");
		lblOhNoYou.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblOhNoYou.setBounds(92, 54, 586, 23);
		frame.getContentPane().add(lblOhNoYou);

		JLabel lblEnterEmailTo = new JLabel("Enter Email to send reset steps");
		lblEnterEmailTo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEnterEmailTo.setBounds(412, 88, 190, 23);
		frame.getContentPane().add(lblEnterEmailTo);

		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		email.setBounds(412, 117, 178, 28);
		frame.getContentPane().add(email);
		email.setColumns(10);

		String lettersCapital[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		String lettersLowerCase[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

		String numbers[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		JLabel lblEnterYourUsername = new JLabel("Enter your username");
		lblEnterYourUsername.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEnterYourUsername.setBounds(138, 88, 190, 23);
		frame.getContentPane().add(lblEnterYourUsername);

		uname = new JTextField();
		uname.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		uname.setColumns(10);
		uname.setBounds(138, 117, 178, 28);
		frame.getContentPane().add(uname);

		JLabel lblPleaseEnterThe = new JLabel("Please enter the verification code sent to your email");
		lblPleaseEnterThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblPleaseEnterThe.setBounds(10, 184, 308, 23);
		frame.getContentPane().add(lblPleaseEnterThe);

		enter = new JTextField();
		enter.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		enter.setColumns(10);
		enter.setBounds(10, 212, 178, 23);
		frame.getContentPane().add(enter);

		JButton btnVerify = new JButton("Verify");

		btnVerify.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnVerify.setBounds(62, 246, 89, 23);
		frame.getContentPane().add(btnVerify);

		JButton btnNewButton = new JButton("Send!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = uname.getText();
				if (user.equals("") && email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Username and email are required, please enter.");
				} else if (user.equals("")) {
					JOptionPane.showMessageDialog(null, "Username is a required field, please enter");
				} else if (email.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Email is a required field, please enter");
				} else {
					try {
						String query = "select * from EmployeeInfo where username=?";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.setString(1, uname.getText());

						ResultSet rs = pst.executeQuery();
						int count = 0;

						while (rs.next()) {
							count++;
						}
						if (count == 1) {
							if (email.getText().contains("@")) {

								// generate code

								String em = email.getText();
								int UPL = 0 + (int) (Math.random() * 25);
								int LWL = 0 + (int) (Math.random() * 25);
								int num = 0 + (int) (Math.random() * 9);

								String random = (lettersCapital[UPL]) + (lettersLowerCase[LWL]) + (numbers[num]);

								int UPL2 = 0 + (int) (Math.random() * 25);
								int LWL2 = 0 + (int) (Math.random() * 25);
								int num2 = 0 + (int) (Math.random() * 9);

								String random2 = (lettersLowerCase[LWL2]) + (numbers[num2]) + (lettersCapital[UPL2]);

								int UPL3 = 0 + (int) (Math.random() * 25);
								int LWL3 = 0 + (int) (Math.random() * 25);
								int num3 = 0 + (int) (Math.random() * 9);

								String random3 = (numbers[num3]) + (lettersCapital[UPL3]) + (lettersLowerCase[LWL3]);

								randCode = concat(random, random2, random3);

								SignUp.sendEmail(email.getText(), "", uname.getText(), "Vericiation Code", "Hello, "
										+ uname.getText()
										+ " \nSorry you have forgotten your password, but we will try to help reset your password through this process. Calibur has sent this verification code. "
										+ randCode
										+ "\nPlease enter this code into the Application and proceed with the Reset process.");
								JOptionPane.showMessageDialog(null, "Verification email has been sent");
							} else {
								JOptionPane.showMessageDialog(null, "The email you entered is an invalid domain");
							}

						} else if (count > 1) {
							JOptionPane.showMessageDialog(null, "Username duplicated");
						}

						else {
							JOptionPane.showMessageDialog(null, "Username doesnt exist");
						}

					} catch (Exception b) {
						JOptionPane.showMessageDialog(null, b);

					}
				}

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(323, 154, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblResetPassword = new JLabel("Reset Password: Enter a new password and please confirm it.");
		lblResetPassword.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		frame.getContentPane().add(lblResetPassword);

		orig = new JPasswordField();
		orig.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		orig.setColumns(10);
		frame.getContentPane().add(orig);

		confirm = new JPasswordField();
		confirm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		confirm.setColumns(10);
		frame.getContentPane().add(confirm);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblPassword);

		JLabel lblConfirm = new JLabel("Confirm");
		lblConfirm.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblConfirm);

		JButton reset = new JButton("Reset Password");

		reset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(reset);

		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = enter.getText();

				if (randCode.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Error: No verification code was sent, enter the username and email");
				} else if (count == 3) {
					JOptionPane.showMessageDialog(null, "Sorry. We will send another email with a DIFFERENT CODE");
					String em = email.getText();
					int UPL = 0 + (int) (Math.random() * 25);
					int LWL = 0 + (int) (Math.random() * 25);
					int num = 0 + (int) (Math.random() * 9);

					String random = (lettersCapital[UPL]) + (lettersLowerCase[LWL]) + (numbers[num]);

					int UPL2 = 0 + (int) (Math.random() * 25);
					int LWL2 = 0 + (int) (Math.random() * 25);
					int num2 = 0 + (int) (Math.random() * 9);

					String random2 = (lettersLowerCase[LWL2]) + (numbers[num2]) + (lettersCapital[UPL2]);

					int UPL3 = 0 + (int) (Math.random() * 25);
					int LWL3 = 0 + (int) (Math.random() * 25);
					int num3 = 0 + (int) (Math.random() * 9);

					String random3 = (numbers[num3]) + (lettersCapital[UPL3]) + (lettersLowerCase[LWL3]);

					randCode = concat(random, random2, random3);

					SignUp.sendEmail(email.getText(), "", uname.getText(), "Vericiation Code", "Hello, "
							+ uname.getText()
							+ " \nSorry you have forgotten your password, but we will try to help reset your password through this process. Calibur has sent this verification code. "
							+ randCode
							+ "\nPlease enter this code into the Application and proceed with the Reset process.");
					JOptionPane.showMessageDialog(null, "Verification email has been sent");
				} else if (input.equals(randCode)) {
					JOptionPane.showMessageDialog(null, "The verification codes matched!!");

					lblResetPassword.setBounds(394, 184, 358, 23);
					orig.setBounds(394, 212, 178, 23);
					confirm.setBounds(394, 242, 178, 23);
					lblPassword.setBounds(582, 212, 153, 23);
					lblConfirm.setBounds(582, 240, 153, 23);
					reset.setBounds(412, 272, 143, 23);

					reset.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String en1 = orig.getText();
							String en2 = confirm.getText();
							if (en1.equals(en2)) {

								try {
									String sql = "update EmployeeInfo " + " set Password= '" + en1 + "'"
											+ " where Username= '" + uname.getText() + "'";

									PreparedStatement pst = connection.prepareStatement(sql);

									pst.execute();

									String sql1 = "update EmployeeInfo " + " set ConfirmPassword= '" + en2 + "'"
											+ " where Username= '" + uname.getText() + "'";

									PreparedStatement pst1 = connection.prepareStatement(sql1);

									pst1.execute();
									JOptionPane.showMessageDialog(null,
											"Your password has been reset and we have sent an email as verification. Try logging in now!");

									SignUp.sendEmail(email.getText(), "", uname.getText(), "Password Reset", "Hello ,"
											+ uname.getText()
											+ "\nWe have successfully reset your password and you can now login to Calibur with this password. This email can be used as a verification and keep it with you as reference.");
								} catch (Exception a) {
									JOptionPane.showMessageDialog(null, a);
								}

							} else {
								JOptionPane.showMessageDialog(null, "The passwords you entered do not match");
							}
						}
					});

				} else {
					JOptionPane.showMessageDialog(null, "The code you entered doesnt match the verification code sent");
					count += 1;

				}

			}
		});

	}

	public void newClass() {

		frame.setSize(779, 349);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
