import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class FormSurvey {

	private JFrame frame;
	private JTextField title;
	JTextPane description;
	private JTextField txtQuestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormSurvey window = new FormSurvey();
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
	public FormSurvey() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame("Forms & Survey");
		frame.getContentPane().setBackground(new Color(255, 204, 51));
		frame.getContentPane().setLayout(null);
		frame.setSize(700, 400);
		frame.setLocation(300, 150);

		JLabel lblChartGenerator = new JLabel("Forms & Survey");
		lblChartGenerator.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblChartGenerator.setBounds(181, 11, 322, 42);
		frame.getContentPane().add(lblChartGenerator);

		JLabel lblinitializeTheSize = new JLabel(
				"<html>Create a list of all the questions you want to make and turn it into a survey that everyone can take here!");
		lblinitializeTheSize.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblinitializeTheSize.setBounds(56, 49, 571, 23);
		frame.getContentPane().add(lblinitializeTheSize);

		title = new JTextField();
		title.setBackground(Color.WHITE);
		title.setFont(new Font("Arial", Font.BOLD, 15));
		title.setText("Untitled Form");
		title.setBounds(5, 83, 148, 23);
		frame.getContentPane().add(title);
		title.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(5, 114, 253, 48);
		frame.getContentPane().add(scrollPane_1);

		description = new JTextPane();
		description.setText("(Form description)");
		description.setFont(new Font("Arial", Font.PLAIN, 13));
		scrollPane_1.setViewportView(description);

		txtQuestion = new JTextField();
		txtQuestion.setText("Question");
		txtQuestion.setFont(new Font("Arial", Font.BOLD, 13));
		txtQuestion.setColumns(10);
		txtQuestion.setBackground(Color.WHITE);
		txtQuestion.setBounds(5, 173, 203, 21);
		frame.getContentPane().add(txtQuestion);

		String ops[] = { "Multiple Choice", "Short Answer", "Paragraph", "Checkboxes", "Dropdown", "Linear Scale" };

		JComboBox questionOptions = new JComboBox(ops);
		questionOptions.setFont(new Font("Verdana", Font.BOLD, 12));
		questionOptions.setBackground(Color.WHITE);
		questionOptions.setBounds(231, 173, 138, 23);
		frame.getContentPane().add(questionOptions);

	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
