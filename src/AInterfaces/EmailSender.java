package AInterfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class EmailSender {
	private JTextField email;
	private JTextField to;
	private JTextField subject;
	private JPasswordField pword;
	private JFrame frame;
	Connection connection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailSender window = new EmailSender();
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
	public EmailSender() {
		initialize();
		connection = sqliteConnection.c();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame("Email Sender");
		frame.getContentPane().setBackground(new Color(51, 255, 0));
		frame.setSize(738, 383);
		frame.setLocation(300, 150);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Connect!");
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 13));

		btnNewButton.setBounds(59, 185, 130, 23);
		frame.getContentPane().add(btnNewButton);

		JLabel lblSendAnEmail = new JLabel("Email Sender");
		lblSendAnEmail.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblSendAnEmail.setBounds(224, 11, 279, 42);
		frame.getContentPane().add(lblSendAnEmail);

		JLabel lblyouCanSign = new JLabel(
				"<html>You can sign in to your email from Calibur and compose an email to any reciever you would like");
		lblyouCanSign.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblyouCanSign.setBounds(97, 52, 535, 23);
		frame.getContentPane().add(lblyouCanSign);

		JLabel lblBeforeYouCcan = new JLabel("Before you can compose the email, sign into your current email");
		lblBeforeYouCcan.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblBeforeYouCcan.setBounds(10, 86, 357, 23);
		frame.getContentPane().add(lblBeforeYouCcan);

		JLabel lab = new JLabel("Email:");
		lab.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lab.setBounds(20, 117, 78, 23);
		frame.getContentPane().add(lab);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(20, 151, 78, 23);
		frame.getContentPane().add(lblPassword);

		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		email.setColumns(10);
		email.setBounds(108, 119, 147, 20);
		frame.getContentPane().add(email);

		to = new JTextField();
		to.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		to.setColumns(10);

		frame.getContentPane().add(to);

		JLabel lblCompseTheEmail = new JLabel("Compose the Email");
		lblCompseTheEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));

		frame.getContentPane().add(lblCompseTheEmail);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\arrow.png"));

		frame.getContentPane().add(pic);

		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 14));

		frame.getContentPane().add(lblTo);

		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 14));

		frame.getContentPane().add(lblSubject);

		subject = new JTextField("Subject here");
		subject.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		subject.setColumns(10);
		frame.getContentPane().add(subject);

		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblMessage);

		JScrollPane scrollPane_1 = new JScrollPane();

		scrollPane_1.setBounds(495, 191, 201, 65);

		JTextPane message = new JTextPane();
		message.setText("(Enter your message here)");
		message.setFont(new Font("Times New Roman", Font.PLAIN, 13));

		JButton send = new JButton("Send!");
		send.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		frame.getContentPane().add(send);

		pword = new JPasswordField();
		pword.setBounds(108, 153, 147, 20);
		frame.getContentPane().add(pword);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					pic.setBounds(377, 86, 29, 246);
					lblCompseTheEmail.setBounds(420, 86, 113, 23);
					lblTo.setBounds(420, 117, 29, 23);
					send.setBounds(420, 278, 113, 33);
					to.setBounds(475, 117, 147, 23);
					lblSubject.setBounds(420, 151, 60, 23);
					subject.setBounds(485, 153, 147, 23);
					lblMessage.setBounds(420, 189, 60, 23);
					frame.getContentPane().add(scrollPane_1);
					scrollPane_1.setViewportView(message);
					JOptionPane.showMessageDialog(null, "Sucessfully connected!");

				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Connection Error");
				}

			}
		});

		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Properties props = new Properties();
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.port", "465");
				props.put("mail.smtp.password", pword.getText());
				props.put("mail.smtp.username", email.getText());

				Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentification() {
						return new PasswordAuthentication(email.getText(), pword.getText());
					}
				});
				try {
					Message mess = new MimeMessage(session);
					mess.setFrom(new InternetAddress(email.getText()));
					mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to.getText()));
					mess.setSubject(subject.getText());
					mess.setText(message.getText());
					Transport transport = session.getTransport("smtp");

					transport.connect("smtp.gmail.com", email.getText(), pword.getText());

					Transport.send(mess, email.getText(), pword.getText());
					transport.close();
					JOptionPane.showMessageDialog(null, "Your email has been successfully sent!!");

					// insert email to table
					try {
						String query = "insert into EmailSender (CaliburUsername,FromEmail,ReceiverEmail,Subject,Message) values (?, ?, ?, ?, ?)";
						PreparedStatement pst = connection.prepareStatement(query);
						pst.setString(1, Home.username);
						pst.setString(2, email.getText());
						pst.setString(3, to.getText());
						pst.setString(4, subject.getText());
						pst.setString(5, message.getText());

						pst.execute();
						pst.close();
					} catch (Exception b) {
						JOptionPane.showMessageDialog(null, b);
					}
					// email to excel
					Workbook wb = new HSSFWorkbook();
					CreationHelper createHelper = wb.getCreationHelper();
					Sheet sheet = wb.createSheet("Emails");
					Row row = sheet.createRow((short) 0);

					row.createCell(0).setCellValue(createHelper.createRichTextString("From Email"));
					row.createCell(1).setCellValue(createHelper.createRichTextString("Recieiver Email"));
					row.createCell(2).setCellValue(createHelper.createRichTextString("Subject"));
					row.createCell(3).setCellValue(createHelper.createRichTextString("Message"));

					FileOutputStream fileOut;
					try {
						fileOut = new FileOutputStream(
								"C:\\Users\\sathv\\Desktop\\" + Home.username + "_Calibur\\SentEmails\\Emails.xls");

						// retrieve email info drom table
						try {
							String query = "select * from EmailSender";
							PreparedStatement pst = connection.prepareStatement(query);
							ResultSet rs = pst.executeQuery();
							int count = 0;
							while (rs.next()) {
								if (rs.getString("CaliburUsername").equals(Home.username)) {
									count++;
									String fromEmail = rs.getString("FromEmail");
									String rEmail = rs.getString("ReceiverEmail");
									String rSubject = rs.getString("Subject");
									String rMessage = rs.getString("Message");
									Row r = sheet.createRow((short) count);

									r.createCell(0).setCellValue(createHelper.createRichTextString(fromEmail));
									r.createCell(1).setCellValue(createHelper.createRichTextString(rEmail));
									r.createCell(2).setCellValue(createHelper.createRichTextString(rSubject));
									r.createCell(3).setCellValue(createHelper.createRichTextString(rMessage));
								}
							}
						} catch (Exception a) {
							JOptionPane.showMessageDialog(null, a);
						}
						wb.write(fileOut);
						fileOut.close();
					} catch (FileNotFoundException b) {
						b.printStackTrace();
					} catch (IOException c) {
						c.printStackTrace();
					}

				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Error");
				}

			}
		});
	}

	public void newClass() {

		frame.setSize(803, 383);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
