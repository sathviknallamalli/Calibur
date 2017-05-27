package Machines;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class WorkPP extends JFrame {
	public WorkPP() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Work - Practice Problems");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(255, 11, 323, 42);
		getContentPane().add(title);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Work2.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(167, 206, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Work1.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(167, 90, 132, 23);
		getContentPane().add(button);

		JLabel lblIdentifyWhich = new JLabel(
				"<html>1.) Calculate the amount of work done when a box is pushed with 35N 100cm\r\n");
		lblIdentifyWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyWhich.setBounds(10, 60, 409, 23);
		getContentPane().add(lblIdentifyWhich);

		JRadioButton op1 = new JRadioButton("3500");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 90, 66, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("3.5");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 116, 66, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("350");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 142, 66, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhichPart = new JLabel("<html>2.) Which does 1 Joule equal?");
		lblWhichPart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichPart.setBounds(10, 172, 356, 23);
		getContentPane().add(lblWhichPart);

		JRadioButton op23 = new JRadioButton("Newton*Meter");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 254, 113, 23);
		getContentPane().add(op23);

		JRadioButton op22 = new JRadioButton("Gram*Second");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 228, 113, 23);
		getContentPane().add(op22);

		JRadioButton op21 = new JRadioButton("Newton*Gram\r\n");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 202, 137, 23);
		getContentPane().add(op21);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblIdentifyAll = new JLabel(
				"<html>3.) In which of the following scenarios is work being done?Select all\r\n ");
		lblIdentifyAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyAll.setBounds(10, 284, 404, 23);
		getContentPane().add(lblIdentifyAll);

		JRadioButton op31 = new JRadioButton(
				"<html>A force is being applied to the top of a box with 100 Newtons and it is 100Meters above");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(31, 314, 199, 46);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("<html>A box is being pushed 30centimeters with a force of 25Newtons");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(31, 363, 182, 49);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton(
				"<html>Movers are shifting a couch from an apartment to their truck that is 25 meters away  and they raise it up with 100Newtons");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(258, 342, 199, 65);
		getContentPane().add(op33);

		JLabel lblSelectAll = new JLabel(
				"<html>4.) How much force was applied to an object that is pushed 25 meters and 100Joules of work is done");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(14, 440, 434, 33);
		getContentPane().add(lblSelectAll);

		JRadioButton op41 = new JRadioButton("4M");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(31, 482, 95, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("2500M");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(128, 480, 93, 25);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("1250M");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(223, 480, 83, 27);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblWhatIs = new JLabel(
				"<html>5.) What is the distance across which the work was done if the work is 250 Joules and the force applied was 100N");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(450, 60, 394, 33);
		getContentPane().add(lblWhatIs);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Work3.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(259, 311, 132, 23);
		getContentPane().add(button_1);

		JRadioButton op51 = new JRadioButton("2.5cm");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(483, 100, 146, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("250cm");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(483, 126, 95, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("25cm");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(483, 152, 101, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIdentifyThe = new JLabel("<html>7.) What are SI units for Work?");
		lblIdentifyThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyThe.setBounds(460, 294, 241, 23);
		getContentPane().add(lblIdentifyThe);

		JRadioButton op71 = new JRadioButton("Newtons");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(493, 314, 85, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Joules");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(493, 340, 85, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("Watts");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(493, 366, 85, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Work6.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(676, 176, 132, 23);
		getContentPane().add(button_3);

		JButton btnCheckAnswers = new JButton("Check Answers");

		btnCheckAnswers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCheckAnswers.setBounds(483, 404, 158, 37);
		getContentPane().add(btnCheckAnswers);

		JLabel ans1 = new JLabel("");
		ans1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans1);

		JLabel ans2 = new JLabel("");
		ans2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans2);

		JLabel ans3 = new JLabel("");
		ans3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans3);

		JLabel ans4 = new JLabel("");
		ans4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans4);

		JLabel ans5 = new JLabel("");
		ans5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans5);

		JLabel ans6 = new JLabel("");
		ans6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans6);

		JLabel ans7 = new JLabel("\r\n");
		ans7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		getContentPane().add(ans7);

		JRadioButton op63 = new JRadioButton("<html> A correlation between force and mass\r\n");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(483, 262, 372, 25);
		getContentPane().add(op63);

		JRadioButton op62 = new JRadioButton("<html> A correlation between force and distance\r\n");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(483, 234, 315, 25);
		getContentPane().add(op62);

		JRadioButton op61 = new JRadioButton("<html>Being a hard worker and good student\r\n");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(483, 206, 315, 25);
		getContentPane().add(op61);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JLabel lblWhatIs_1 = new JLabel("<html>6.) What is work in terms of Physics\r\n\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(450, 175, 421, 25);
		getContentPane().add(lblWhatIs_1);

		btnCheckAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans1.setBounds(113, 124, 335, 23);
				ans1.setText("3.5 Joules");
				ans2.setBounds(177, 240, 101, 23);
				ans2.setText("Newton*Meter");
				ans3.setBounds(199, 414, 201, 23);
				ans3.setText("2 and 3");
				ans4.setBounds(322, 484, 53, 23);
				ans4.setText("4Meters");
				ans5.setBounds(624, 138, 256, 23);
				ans5.setText("250 Centimeters");
				ans6.setBounds(726, 213, 132, 50);
				ans6.setText("<html>Correlation of Force and Distance");
				ans7.setBounds(617, 341, 201, 23);
				ans7.setText("Joules");

			}
		});
	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(878, 549);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
