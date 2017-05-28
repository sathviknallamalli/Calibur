import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class FormSurvey {

	private JFrame frame;
	private JTextField title;
	JTextPane description;
	private JTextField txtQuestion;
	private JRadioButton op1;
	private JLabel add;
	private JRadioButton op2;
	private JTextField sanswer;
	private JLabel newquestion;
	private JLabel lblQuestion;
	private JTextField ques2;
	private JButton send;

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
		frame.setSize(700, 419);
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
		txtQuestion.setHorizontalAlignment(SwingConstants.LEFT);
		txtQuestion.setText("Question title");
		txtQuestion.setFont(new Font("Arial", Font.BOLD, 13));
		txtQuestion.setColumns(10);
		txtQuestion.setBackground(Color.WHITE);
		txtQuestion.setBounds(5, 173, 203, 23);
		frame.getContentPane().add(txtQuestion);

		String ops[] = { "Multiple Choice", "Short Answer", "Paragraph", "Checkboxes", "Dropdown", "Linear Scale" };

		op1 = new JRadioButton("Option 1");
		op1.setEnabled(false);
		op1.setFont(new Font("Arial", Font.PLAIN, 12));
		op1.setBackground(new Color(255, 204, 0));
		frame.getContentPane().add(op1);

		ButtonGroup bg = new ButtonGroup();

		op2 = new JRadioButton("Option 1");
		op2.setFont(new Font("Arial", Font.PLAIN, 12));
		op2.setEnabled(false);
		op2.setBackground(new Color(255, 204, 0));
		frame.getContentPane().add(op2);

		sanswer = new JTextField();
		sanswer.setHorizontalAlignment(SwingConstants.LEFT);
		sanswer.setFont(new Font("Arial", Font.PLAIN, 13));
		sanswer.setColumns(10);
		sanswer.setBackground(Color.WHITE);
		frame.getContentPane().add(sanswer);

		JScrollPane scrollPane_2 = new JScrollPane();
		frame.getContentPane().add(scrollPane_2);

		JTextPane para = new JTextPane();
		para.setFont(new Font("Arial", Font.PLAIN, 13));
		scrollPane_2.setViewportView(para);

		JCheckBox check1 = new JCheckBox("New check box");
		check1.setBackground(new Color(255, 204, 0));
		frame.getContentPane().add(check1);

		JComboBox questionOptions = new JComboBox(ops);
		questionOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosen = (String) questionOptions.getSelectedItem();

				switch (chosen) {
				case ("Multiple Choice"):
					op1.setBounds(5, 203, 259, 23);
					sanswer.setBounds(0, 0, 0, 0);
					para.setBounds(0, 0, 0, 0);
					check1.setBounds(0, 0, 0, 0);
					bg.add(op1);
					break;
				case ("Short Answer"):
					sanswer.setBounds(5, 207, 203, 23);
					op1.setBounds(0, 0, 0, 0);
					para.setBounds(0, 0, 0, 0);
					check1.setBounds(0, 0, 0, 0);
					break;
				case ("Paragraph"):
					scrollPane_2.setBounds(5, 207, 251, 46);
					op1.setBounds(0, 0, 0, 0);
					sanswer.setBounds(0, 0, 0, 0);
					check1.setBounds(0, 0, 0, 0);
					break;
				case ("Checkboxes"):
					check1.setBounds(15, 203, 148, 23);
					op1.setBounds(0, 0, 0, 0);
					sanswer.setBounds(0, 0, 0, 0);
					para.setBounds(0, 0, 0, 0);
					break;
				}
			}
		});
		questionOptions.setFont(new Font("Verdana", Font.BOLD, 12));
		questionOptions.setBackground(Color.WHITE);
		questionOptions.setBounds(231, 173, 138, 23);
		frame.getContentPane().add(questionOptions);

		add = new JLabel("");
		add.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\add.png"));
		add.setBounds(286, 199, 26, 33);
		frame.getContentPane().add(add);

		newquestion = new JLabel("");
		newquestion.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\add.png"));
		newquestion.setBounds(286, 243, 26, 33);
		frame.getContentPane().add(newquestion);

		lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblQuestion.setBounds(319, 250, 66, 18);
		frame.getContentPane().add(lblQuestion);

		ques2 = new JTextField();
		ques2.setText("Question title");
		ques2.setHorizontalAlignment(SwingConstants.LEFT);
		ques2.setFont(new Font("Arial", Font.BOLD, 13));
		ques2.setColumns(10);
		ques2.setBackground(Color.WHITE);

		frame.getContentPane().add(ques2);

		JComboBox ops2 = new JComboBox(ops);
		ops2.setFont(new Font("Verdana", Font.BOLD, 12));
		ops2.setBackground(Color.WHITE);

		frame.getContentPane().add(ops2);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\add.png"));

		frame.getContentPane().add(label);

		send = new JButton("Send This Form!");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String email = JOptionPane.showInputDialog(null, "Please enter the email of who you want to send it",
						"Send Form!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		send.setFont(new Font("Arial", Font.PLAIN, 13));
		send.setBounds(536, 336, 138, 33);
		frame.getContentPane().add(send);

		add.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				op2.setBounds(5, 229, 259, 23);
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		newquestion.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				label.setBounds(286, 302, 26, 33);
				ops2.setBounds(231, 276, 138, 23);
				ques2.setBounds(5, 276, 203, 23);
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
