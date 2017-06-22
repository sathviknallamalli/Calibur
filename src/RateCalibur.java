import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RateCalibur extends JFrame {

	Connection connection = null;
	private JTextField feedback;

	public RateCalibur() {
		super("Rate");
		getContentPane().setBackground(new Color(240, 240, 240));
		connection = sqliteConnection.c();

		setBounds(100, 100, 613, 324);
		getContentPane().setLayout(null);

		JTextField name;
		JTextField lname;
		JTextField email;
		JTextField un;
		JPasswordField pd;
		JPasswordField cpd;
		JButton sendemail;

		JLabel lblLoginToCalibur = new JLabel("Rate Calibur!");
		lblLoginToCalibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblLoginToCalibur.setBounds(168, 11, 283, 47);
		getContentPane().add(lblLoginToCalibur);

		JLabel lblNewLabel = new JLabel("Which topic did you use Calibur for?");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 82, 204, 20);
		getContentPane().add(lblNewLabel);

		JLabel lblIfYouDont = new JLabel(
				"Thank you for your frequent usage of Calibur, and we hope this survey reflects your experience accurately");
		lblIfYouDont.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		lblIfYouDont.setBounds(47, 54, 512, 23);
		getContentPane().add(lblIfYouDont);

		name = new JTextField();
		getContentPane().add(name);
		name.setColumns(10);

		JLabel n = new JLabel("Name\r\n");
		n.setFont(new Font("Times New Roman", Font.BOLD, 18));
		getContentPane().add(n);

		lname = new JTextField();
		lname.setColumns(10);
		getContentPane().add(lname);

		JLabel ln = new JLabel("Last name\r\n");
		ln.setFont(new Font("Times New Roman", Font.BOLD, 18));
		getContentPane().add(ln);

		email = new JTextField();
		email.setColumns(10);
		getContentPane().add(email);

		JLabel el = new JLabel("Email");
		el.setFont(new Font("Times New Roman", Font.BOLD, 18));
		getContentPane().add(el);

		un = new JTextField();
		un.setColumns(10);
		getContentPane().add(un);

		JLabel u = new JLabel("Username\r\n");
		u.setFont(new Font("Times New Roman", Font.BOLD, 18));
		getContentPane().add(u);

		JLabel p = new JLabel("Password");
		p.setFont(new Font("Times New Roman", Font.BOLD, 18));
		getContentPane().add(p);

		pd = new JPasswordField();
		getContentPane().add(pd);

		cpd = new JPasswordField();
		getContentPane().add(cpd);

		JLabel cp = new JLabel("<html>Confrim Pasword");
		cp.setFont(new Font("Times New Roman", Font.BOLD, 18));
		getContentPane().add(cp);

		sendemail = new JButton("Send Email!");
		sendemail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		getContentPane().add(sendemail);

		String helpTopics[] = { "", "Math", "Physical Science", "Chemistry", "Biology", "Earth Sciencee",
				"Literature" };

		JComboBox topics = new JComboBox(helpTopics);
		topics.setFont(new Font("Arial", Font.PLAIN, 12));
		topics.setBounds(10, 105, 125, 20);
		getContentPane().add(topics);

		JLabel lblWhatGradeWere = new JLabel("What grade were you in when you used Calibur?");
		lblWhatGradeWere.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatGradeWere.setBounds(10, 129, 283, 20);
		getContentPane().add(lblWhatGradeWere);

		String grades[] = { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

		JComboBox grade = new JComboBox(grades);
		grade.setFont(new Font("Arial", Font.PLAIN, 12));
		grade.setBounds(10, 150, 99, 20);
		getContentPane().add(grade);

		JLabel lblHowOftenDo = new JLabel("How often do you use Calibur?");
		lblHowOftenDo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHowOftenDo.setBounds(10, 175, 283, 20);
		getContentPane().add(lblHowOftenDo);

		String freqs[] = { "", "Everyday", "Once in a week", "Every now and then", "Rarely", "Never" };

		JComboBox frequency = new JComboBox(freqs);
		frequency.setFont(new Font("Arial", Font.PLAIN, 12));
		frequency.setBounds(10, 196, 112, 20);
		getContentPane().add(frequency);

		JLabel lblWhatAspectOf = new JLabel("What aspect of Calibur do you use most often?");
		lblWhatAspectOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatAspectOf.setBounds(293, 82, 258, 20);
		getContentPane().add(lblWhatAspectOf);

		String aspects[] = { "", "Homework help", "Teacher assistant", "Formulas", "Converter", "Reminder",
				"Web browser", "Chart and data", "Text editor", "Email sender" };

		JComboBox aspect = new JComboBox(aspects);
		aspect.setFont(new Font("Arial", Font.PLAIN, 12));
		aspect.setBounds(293, 102, 125, 20);
		getContentPane().add(aspect);

		JLabel lblWhatIsYour = new JLabel("What is your OVERALL RATING for Calibur?");
		lblWhatIsYour.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIsYour.setBounds(293, 129, 258, 20);
		getContentPane().add(lblWhatIsYour);

		String ratings[] = { "", "1", "2", "3", "4", "5" };

		JComboBox rating = new JComboBox(ratings);
		rating.setFont(new Font("Arial", Font.PLAIN, 12));
		rating.setBounds(293, 152, 66, 20);
		getContentPane().add(rating);

		JLabel lblDidCaliburHelp = new JLabel(
				"<html>Did Calibur help you learn a new topic or clarify your understanding of one?");
		lblDidCaliburHelp.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDidCaliburHelp.setBounds(293, 185, 303, 32);
		getContentPane().add(lblDidCaliburHelp);

		String clarifyOrNot[] = { "", "Yes", "No" };

		JComboBox yesNo = new JComboBox(clarifyOrNot);
		yesNo.setFont(new Font("Arial", Font.PLAIN, 12));
		yesNo.setBounds(293, 222, 66, 20);
		getContentPane().add(yesNo);

		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "insert into Ratings (Topic,Grade,Frequency,Aspect,Rating,HelpOrNot) values (?, ?, ?, ?, ?, ?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, (String) topics.getSelectedItem());
					pst.setString(2, (String) grade.getSelectedItem());
					pst.setString(3, (String) frequency.getSelectedItem());
					pst.setString(4, (String) aspect.getSelectedItem());
					pst.setString(5, (String) rating.getSelectedItem());
					pst.setString(6, (String) yesNo.getSelectedItem());
					pst.setString(7, (String) feedback.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Thank You! Your response has been recorded");

					pst.close();
					close();
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a);
				}
			}
		});
		submit.setFont(new Font("Arial", Font.PLAIN, 11));
		submit.setBounds(498, 248, 89, 25);
		getContentPane().add(submit);

		JLabel lbldoYouHave = new JLabel("<html>Do you have any feedback for Calibur?");
		lbldoYouHave.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbldoYouHave.setBounds(10, 227, 263, 20);
		getContentPane().add(lbldoYouHave);

		feedback = new JTextField();
		feedback.setFont(new Font("Arial", Font.PLAIN, 11));
		feedback.setBounds(10, 250, 204, 20);
		getContentPane().add(feedback);
		feedback.setColumns(10);

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
