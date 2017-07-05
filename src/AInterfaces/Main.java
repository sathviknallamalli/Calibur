package AInterfaces;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main extends JFrame {
	JLabel sh;
	JLabel tagLineOne;
	JLabel instruct;
	JButton HW;
	JTextField input;

	private JTextField website;
	private Desktop desktop;
	private String path = "C:\\Users\\sathv\\Desktop\\Saahore Baahubali Video Song Promo - Baahubali 2 Songs  Prabhas SS Rajamouli.mp4";

	public Main() {
		super("Calibur Home");
		getContentPane().setBackground(new Color(0, 153, 255));

		HW = new JButton("Homework Help / Resources");
		HW.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		HW.setBounds(10, 111, 209, 30);
		HW.setAlignmentX(CENTER_ALIGNMENT);
		HW.setAlignmentY(CENTER_ALIGNMENT);

		HW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HWHELP hw = new HWHELP();
				hw.newClass();
			}
		});

		JButton btnNewButton = new JButton("Teacher Assistant - CALIBUR");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TACALIBUR.NewScreen();
			}
		});
		btnNewButton.setBounds(266, 112, 218, 29);
		getContentPane().add(btnNewButton);

		getContentPane().setLayout(null);

		JLabel calibur = new JLabel("Calibur");
		calibur.setBounds(305, 11, 175, 42);
		calibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		getContentPane().add(calibur);

		tagLineOne = new JLabel(
				"Calibur is a virtual classroom that has built-in calculators and a teacher assistant. Subjects including math, physics, chemistry, and more!");
		tagLineOne.setBounds(10, 53, 764, 23);
		tagLineOne.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		getContentPane().add(tagLineOne);

		instruct = new JLabel("Below are options for assistance with common homework issues or crash courses!");
		instruct.setBounds(167, 76, 449, 25);
		instruct.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		getContentPane().add(instruct);

		JLabel HWInstructP1 = new JLabel(
				"<html>Homework Help has built-in calculators for a variety of subjects and explanations for diffcult topics.");
		HWInstructP1.setBounds(20, 143, 199, 64);
		HWInstructP1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		getContentPane().add(HWInstructP1);

		getContentPane().add(HW);

		JLabel tagP1 = new JLabel(
				"<html>Calibur includes a speech to text recognition feature and allows you to interact with a virtual teacher");
		tagP1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		tagP1.setBounds(276, 143, 202, 64);
		getContentPane().add(tagP1);

		JLabel tagRand = new JLabel("                          Test your luck!");
		tagRand.setFont(new Font("Times New Roman", Font.BOLD, 13));
		tagRand.setBounds(531, 152, 199, 16);
		getContentPane().add(tagRand);

		JButton randomNum = new JButton("Random Number Genrator");
		randomNum.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		randomNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int num = r.nextInt(100 - 1) + 1;
				tagRand.setFont(new Font("Times New Roman", Font.BOLD, 14));

				tagRand.setText("The random number is..." + num);
				tagRand.setBounds(562, 151, 199, 16);

			}
		});

		randomNum.setBounds(540, 112, 218, 30);
		getContentPane().add(randomNum);

		JButton btnScientificCalulator = new JButton("Scientific Calulator");
		btnScientificCalulator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScientificCaculator sc = new ScientificCaculator();
				sc.newClass();
			}
		});
		btnScientificCalulator.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnScientificCalulator.setAlignmentY(0.5f);
		btnScientificCalulator.setAlignmentX(0.5f);
		btnScientificCalulator.setBounds(266, 224, 218, 30);
		getContentPane().add(btnScientificCalulator);

		JLabel browser = new JLabel(
				"<html>If you want to look something up or need more help, this will take you to Google.com");
		browser.setFont(new Font("Times New Roman", Font.BOLD, 12));
		browser.setBounds(540, 261, 234, 42);
		getContentPane().add(browser);

		JButton btnIndepthTheory = new JButton("Alarms & Clock");
		btnIndepthTheory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reminders r = new Reminders();
				r.newClass();
			}
		});
		btnIndepthTheory.setIcon(null);
		btnIndepthTheory.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnIndepthTheory.setAlignmentY(0.5f);
		btnIndepthTheory.setAlignmentX(0.5f);
		btnIndepthTheory.setBounds(10, 227, 209, 30);
		getContentPane().add(btnIndepthTheory);

		JLabel scdescrip = new JLabel(
				"<html>A full-fledged scientific calculator that does advanced triginometric calculations and allows you to convert from scientific to standard calculator mode");
		scdescrip.setFont(new Font("Times New Roman", Font.BOLD, 12));
		scdescrip.setBounds(266, 261, 218, 64);
		getContentPane().add(scdescrip);

		JButton btnFormulas = new JButton("Formulas");
		btnFormulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Formulas f = new Formulas();
				f.newClass();
			}
		});
		btnFormulas.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFormulas.setAlignmentY(0.5f);
		btnFormulas.setAlignmentX(0.5f);
		btnFormulas.setBounds(10, 332, 209, 30);
		getContentPane().add(btnFormulas);

		JButton btnConversions = new JButton("Conversions");
		btnConversions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conversions c = new Conversions();
				c.newClass();
			}
		});
		btnConversions.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnConversions.setAlignmentY(0.5f);
		btnConversions.setAlignmentX(0.5f);
		btnConversions.setBounds(266, 332, 218, 30);
		getContentPane().add(btnConversions);

		JButton btnAnyWebBrowser = new JButton("Any Web Browser");
		btnAnyWebBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		website = new JTextField();
		website.setForeground(Color.GRAY);
		website.setText("Enter site here");
		website.setFont(new Font("Arial", Font.PLAIN, 12));
		getContentPane().add(website);
		website.setColumns(10);
		website.setBounds(562, 373, 184, 23);

		JButton go = new JButton("GO!!");
		go.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		getContentPane().add(go);
		go.setBounds(610, 407, 89, 23);
		btnAnyWebBrowser.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		website.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					String site = "www." + website.getText();
					String[] arguments = { "1", "2", "3" };
					try {
						Browser.main(arguments, site);
						website.setText("");
					} catch (IOException e1) {

						e1.printStackTrace();
					} catch (URISyntaxException e1) {

						e1.printStackTrace();
					}
				}
			}
		});

		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String site = "www." + website.getText();
				if (site.contains(".com") || site.contains(".org") || site.contains(".net")) {
					String[] arguments = { "1", "2", "3" };
					try {
						Browser.main(arguments, site);
						website.setText("");
					} catch (IOException e1) {

						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Invalid website");
				}

			}
		});

		btnAnyWebBrowser.setAlignmentY(0.5f);
		btnAnyWebBrowser.setAlignmentX(0.5f);
		btnAnyWebBrowser.setBounds(540, 332, 218, 30);
		getContentPane().add(btnAnyWebBrowser);

		JLabel lblaConverterThat = new JLabel(
				"<html>A converter that deals with length, mass, volume, and even currency. In the airport and wanting to convert for money, this part of the app will allow ease for that. ");
		lblaConverterThat.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblaConverterThat.setBounds(266, 367, 218, 64);
		getContentPane().add(lblaConverterThat);

		JLabel lblanEntireResource = new JLabel(
				"<html>An entire resource bank that has formulas for all subjects and can be accessed anytime ");
		lblanEntireResource.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblanEntireResource.setBounds(10, 373, 218, 50);
		getContentPane().add(lblanEntireResource);

		JLabel lbllifeAsA = new JLabel(
				"<html>Life as a student can be busy, so to make sure you are organized and planned, use this tool to set reminders");
		lbllifeAsA.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lbllifeAsA.setBounds(10, 265, 218, 42);
		getContentPane().add(lbllifeAsA);

		JButton btnGoogleWebBrowser = new JButton("Google Web Browser\r\n");
		btnGoogleWebBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String site = "https://google.com";
				String[] arguments = { "1", "2", "3" };
				try {
					Browser.main(arguments, site);
				} catch (IOException e1) {

					e1.printStackTrace();
				} catch (URISyntaxException e1) {

					e1.printStackTrace();
				}
			}
		});
		btnGoogleWebBrowser.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnGoogleWebBrowser.setAlignmentY(0.5f);
		btnGoogleWebBrowser.setAlignmentX(0.5f);
		btnGoogleWebBrowser.setBounds(540, 224, 218, 30);
		getContentPane().add(btnGoogleWebBrowser);

		JButton btnChartAndData = new JButton("Chart and Data \r\n");
		btnChartAndData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChartGenerator c = new ChartGenerator();
				c.newClass();
			}
		});
		btnChartAndData.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnChartAndData.setAlignmentY(0.5f);
		btnChartAndData.setAlignmentX(0.5f);
		btnChartAndData.setBounds(10, 449, 209, 30);
		getContentPane().add(btnChartAndData);

		JButton btnEmailDomainSender = new JButton("Email Sender");
		btnEmailDomainSender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmailSender se = new EmailSender();
				se.newClass();
			}
		});

		btnEmailDomainSender.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnEmailDomainSender.setAlignmentY(0.5f);
		btnEmailDomainSender.setAlignmentX(0.5f);
		btnEmailDomainSender.setBounds(540, 445, 218, 30);
		getContentPane().add(btnEmailDomainSender);

		JLabel lblenterInThe = new JLabel(
				"<html>Enter in the data you would like to convert and then select from a wide range of graphs; bar, pie, scatter, x,y,z. ");
		lblenterInThe.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblenterInThe.setBounds(10, 491, 218, 42);
		getContentPane().add(lblenterInThe);

		JLabel lblyouCanSend = new JLabel(
				"<html>You can send an email from your account and is a complete interface including a subject, message, and reciever. ");
		lblyouCanSend.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblyouCanSend.setBounds(540, 487, 218, 57);
		getContentPane().add(lblyouCanSend);

		JButton btnWordDocument = new JButton("Word Document / Text Editor");
		btnWordDocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editor b = new Editor();
				b.newClass();
			}
		});
		btnWordDocument.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnWordDocument.setAlignmentY(0.5f);
		btnWordDocument.setAlignmentX(0.5f);
		btnWordDocument.setBounds(266, 449, 209, 30);
		getContentPane().add(btnWordDocument);

		JLabel lblyouCanType = new JLabel(
				"<html>You can type up a speech, essay, or any piece of writing and do a review along with font adjusments");
		lblyouCanType.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblyouCanType.setBounds(266, 491, 218, 42);
		getContentPane().add(lblyouCanType);

		desktop = Desktop.getDesktop();

		JButton bb = new JButton("Baahubali");
		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Object source = e.getSource();
				if (source == bb) {
					try {
						desktop.open(new File(path));
					} catch (IOException a) {
						JOptionPane.showMessageDialog(null, a);
					}
				}
			}
		});
		bb.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		bb.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		bb.setAlignmentX(0.5f);
		bb.setBounds(511, 179, 110, 23);
		getContentPane().add(bb);

		String path2 = "C:\\Users\\sathv\\Desktop\\Trailer.mp4";

		JButton t = new JButton("Trailer");
		t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				if (source == t) {
					try {
						desktop.open(new File(path2));
					} catch (IOException a) {
						JOptionPane.showMessageDialog(null, a);
					}
				}
			}
		});
		t.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		t.setAlignmentY(1.0f);
		t.setAlignmentX(0.5f);
		t.setBounds(652, 179, 110, 23);
		getContentPane().add(t);

		JButton btnFunGames = new JButton("Fun Games!");
		btnFunGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Games g = new Games();
				g.newClass();
			}
		});
		btnFunGames.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnFunGames.setBounds(638, 11, 136, 29);
		getContentPane().add(btnFunGames);

		JLabel welcome = new JLabel("Welcome " + Home.username + ",");
		welcome.setForeground(Color.RED);
		welcome.setFont(new Font("Arial", Font.BOLD, 19));
		welcome.setBounds(10, 11, 234, 23);
		getContentPane().add(welcome);

	}

	public void newClass() {

		setSize(800, 594);
		setLocation(300, 100);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
