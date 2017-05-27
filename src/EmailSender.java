import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.mail.Message.*;
import javax.mail.PasswordAuthentication.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class EmailSender extends JFrame {
	private JTextField email;
	private JTextField to;
	private JTextField subject;
	private JTextField message;
	private JPasswordField pword;

	public EmailSender() {
		super("Email Sender");
		getContentPane().setBackground(new Color(51, 255, 0));
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Connect!");
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 13));

		btnNewButton.setBounds(59, 185, 130, 23);
		getContentPane().add(btnNewButton);

		JLabel lblSendAnEmail = new JLabel("Email Sender");
		lblSendAnEmail.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblSendAnEmail.setBounds(254, 11, 279, 42);
		getContentPane().add(lblSendAnEmail);

		JLabel lblyouCanSign = new JLabel(
				"<html>You can sign in to your email from Calibur and compose an email to any reciever you would like");
		lblyouCanSign.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblyouCanSign.setBounds(127, 52, 535, 23);
		getContentPane().add(lblyouCanSign);

		JLabel lblBeforeYouCcan = new JLabel("Before you can compose the email, sign into your current email");
		lblBeforeYouCcan.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblBeforeYouCcan.setBounds(10, 86, 357, 23);
		getContentPane().add(lblBeforeYouCcan);

		JLabel lab = new JLabel("Email:");
		lab.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lab.setBounds(20, 117, 78, 23);
		getContentPane().add(lab);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPassword.setBounds(20, 151, 78, 23);
		getContentPane().add(lblPassword);

		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		email.setColumns(10);
		email.setBounds(108, 119, 147, 20);
		getContentPane().add(email);

		to = new JTextField();
		to.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		to.setColumns(10);

		getContentPane().add(to);

		JLabel lblCompseTheEmail = new JLabel("Compose the Email");
		lblCompseTheEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));

		getContentPane().add(lblCompseTheEmail);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\arrow.png"));

		getContentPane().add(pic);

		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Times New Roman", Font.BOLD, 14));

		getContentPane().add(lblTo);

		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 14));

		getContentPane().add(lblSubject);

		subject = new JTextField();
		subject.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		subject.setColumns(10);

		getContentPane().add(subject);

		JLabel lblMessage = new JLabel("Message:");
		lblMessage.setFont(new Font("Times New Roman", Font.BOLD, 14));

		getContentPane().add(lblMessage);

		message = new JTextField();
		message.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		message.setColumns(10);

		getContentPane().add(message);

		JButton send = new JButton("Send!");
		send.setFont(new Font("Times New Roman", Font.ITALIC, 13));

		getContentPane().add(send);

		pword = new JPasswordField();
		pword.setBounds(108, 153, 147, 20);
		getContentPane().add(pword);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pic.setBounds(377, 86, 29, 246);
				lblCompseTheEmail.setBounds(420, 86, 113, 23);
				lblTo.setBounds(420, 117, 29, 23);
				send.setBounds(420, 278, 113, 33);
				to.setBounds(475, 117, 147, 23);
				lblSubject.setBounds(420, 151, 60, 23);
				subject.setBounds(485, 153, 147, 23);
				lblMessage.setBounds(420, 189, 60, 23);
				message.setBounds(495, 191, 201, 65);
				JOptionPane.showMessageDialog(null, "Sucessfully connected!");

			}
		});

		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String username = email.getText();
				final String password = pword.getText();
				final String receiver = to.getText();
				final String sub = subject.getText();
				final String mess = message.getText();

				Properties props = new Properties();
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.port", "465");
				props.put("mail.smtp.password", password);
				props.put("mail.smtp.username", username);

				Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentification() {
						return new PasswordAuthentication(username, password);
					}

				}

				);
				try {
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(username));
					message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
					message.setSubject(sub);
					message.setText(mess);
					Transport transport = session.getTransport("smtp");

					transport.connect("smtp.gmail.com", username, password);

					Transport.send(message, username, password);
					transport.close();

					JOptionPane.showMessageDialog(null, "Your email has been successfully sent!!");

				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a);
				}

			}
		});
	}

	public void newClass() {

		setSize(803, 383);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
