package CRUDOps;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import AInterfaces.sqlConnection;

public class CreateRecord {

	private JFrame frame;
	private JTextField name;
	private JTextField ssid;
	Connection conn = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateRecord window = new CreateRecord();
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
	

	public CreateRecord() {
		initialize();
		conn = sqlConnection.sqlExpress();
		// System.out.println("Connection value in create Record===" + conn);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("CRUD Operators");
		frame.setBounds(100, 100, 395, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("Name");
		label.setFont(new Font("Arial", Font.PLAIN, 13));
		label.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(label);

		name = new JTextField();
	
		name.setFont(new Font("Arial", Font.PLAIN, 13));
		name.setColumns(10);
		name.setBounds(10, 28, 119, 20);
		frame.getContentPane().add(name);

		JLabel label_1 = new JLabel("Date of Birth");
		label_1.setFont(new Font("Arial", Font.PLAIN, 13));
		label_1.setBounds(10, 59, 107, 14);
		frame.getContentPane().add(label_1);

		JDateChooser jd = new JDateChooser();
		jd.getCalendarButton().setFont(new Font("Arial", Font.PLAIN, 13));
		jd.getCalendarButton().setText("Select a date");
		jd.setBounds(10, 76, 208, 28);
		frame.getContentPane().add(jd);

		JLabel lblSsid = new JLabel("SSID");
		lblSsid.setFont(new Font("Arial", Font.PLAIN, 13));
		lblSsid.setBounds(10, 115, 107, 14);
		frame.getContentPane().add(lblSsid);

		ssid = new JTextField();
		
		ssid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char c = evt.getKeyChar();
				if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {

					evt.consume();
				}
			}
		});
		ssid.setFont(new Font("Arial", Font.PLAIN, 13));
		ssid.setColumns(10);
		ssid.setBounds(10, 131, 119, 20);
		frame.getContentPane().add(ssid);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 13));
		lblGender.setBounds(10, 164, 107, 14);
		frame.getContentPane().add(lblGender);

		JRadioButton male = new JRadioButton("M");
		male.setFont(new Font("Arial", Font.PLAIN, 13));
		male.setBounds(10, 185, 109, 20);
		frame.getContentPane().add(male);

		JRadioButton female = new JRadioButton("F");
		female.setFont(new Font("Arial", Font.PLAIN, 13));
		female.setBounds(10, 208, 109, 20);
		frame.getContentPane().add(female);

		ButtonGroup bg = new ButtonGroup();
		bg.add(female);
		bg.add(male);

		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Arial", Font.PLAIN, 13));
		lblState.setBounds(142, 165, 107, 14);
		frame.getContentPane().add(lblState);

		String states[] = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA",
				"KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY",
				"NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
				"WY" };

		JComboBox st = new JComboBox(states);
		st.setFont(new Font("Arial", Font.PLAIN, 13));
		st.setBounds(142, 186, 76, 20);
		frame.getContentPane().add(st);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				DBOperations db= new DBOperations();
				
				PersonInfo person =new PersonInfo();
				person.setName(name.getText());
				person.setDob(jd.getDate());
				person.setSsid(Integer.parseInt(ssid.getText()));
				
				String personGender = "";
				if (male.isSelected()) {
					personGender = "M";
				} else {
					personGender = "F";
				}
				person.setGender(personGender);
				person.setState((String) st.getSelectedItem());
				
				// verify if ssid is already there - READ
				boolean exists = false;
				exists= db.isRecordExists(person.getSsid());
				
				// CREATE RECORD
				if (exists == false) {
					
					db.insertRecord(person);
				}

			}

		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton.setBounds(162, 222, 100, 28);
		frame.getContentPane().add(btnNewButton);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				name.setText("");
				ssid.setText("");
				bg.clearSelection();
				st.setSelectedIndex(0);
			}
		});
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 13));
		btnCancel.setBounds(269, 222, 100, 28);
		frame.getContentPane().add(btnCancel);
	}

	public void newClass() {
		frame.setSize(395, 300);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	}
