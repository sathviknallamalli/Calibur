package Machines;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class MAPP extends JFrame {
	public MAPP() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Mechanical Advantage - Practice Problems");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(147, 11, 550, 42);
		getContentPane().add(title);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MA1.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(258, 90, 132, 23);
		getContentPane().add(button);

		JLabel lblIdentifyWhich = new JLabel(
				"<html>1.) Which type of advantage will be able to calculate when given two distances\r\n");
		lblIdentifyWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyWhich.setBounds(10, 60, 430, 23);
		getContentPane().add(lblIdentifyWhich);

		JRadioButton op1 = new JRadioButton("Mechanical Advantage");
		op1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op1.setBounds(31, 90, 158, 23);
		getContentPane().add(op1);

		JRadioButton op2 = new JRadioButton("Ideal Mechanical Advantage");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 116, 169, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Determintal Mechanical Advantage");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 142, 199, 23);
		getContentPane().add(op3);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(op3);
		bg1.add(op2);
		bg1.add(op1);

		JLabel lblWhichPart = new JLabel("<html>2.) Calculate the mechanical advantage of this lever");
		lblWhichPart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichPart.setBounds(10, 172, 356, 23);
		getContentPane().add(lblWhichPart);

		JRadioButton op23 = new JRadioButton("3.3");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 254, 113, 23);
		getContentPane().add(op23);

		JRadioButton op22 = new JRadioButton("3");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 228, 113, 23);
		getContentPane().add(op22);

		JRadioButton op21 = new JRadioButton(".3");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 202, 137, 23);
		getContentPane().add(op21);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\ex.PNG"));
		p.setBounds(303, 153, 137, 207);
		getContentPane().add(p);

		JLabel lblIdentifyAll = new JLabel(
				"<html>3.) In which of the following scenarios is work being done?Select all\r\n ");
		lblIdentifyAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyAll.setBounds(10, 294, 281, 43);
		getContentPane().add(lblIdentifyAll);

		JLabel lblSelectAll = new JLabel("<html>4.) What is the user of mechanical advantage?");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(10, 449, 434, 23);
		getContentPane().add(lblSelectAll);

		JRadioButton op41 = new JRadioButton("<html>Compare machines to determine effectiveness");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(10, 481, 146, 34);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("<html>Manipulate the distance and force of machine");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(161, 479, 146, 36);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("<html>Calculate the real world advantage of the machine");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(323, 479, 151, 32);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel lblWhatIs = new JLabel(
				"<html>5.) What is the output distance length if the MA of a lever is 4/3 and the input is 16M");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(450, 60, 394, 34);
		getContentPane().add(lblWhatIs);

		JRadioButton op51 = new JRadioButton("12M");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(483, 101, 63, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("21M");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(483, 127, 95, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("8M");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(483, 153, 101, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIdentifyThe = new JLabel("<html>7.) What are the units for mechanical advantage?");
		lblIdentifyThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyThe.setBounds(460, 294, 352, 23);
		getContentPane().add(lblIdentifyThe);

		JRadioButton op71 = new JRadioButton("Newtons");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(493, 324, 85, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Coulumbs");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(493, 345, 85, 23);
		getContentPane().add(op72);

		JRadioButton op73 = new JRadioButton("No units");
		op73.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op73.setBounds(493, 371, 85, 23);
		getContentPane().add(op73);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op73);
		bg7.add(op72);
		bg7.add(op71);

		JButton btnCheckAnswers = new JButton("Check Answers");

		btnCheckAnswers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCheckAnswers.setBounds(483, 401, 158, 37);
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

		JRadioButton op63 = new JRadioButton("<html>How much the output speed is multiplied by output force\r\n");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(483, 262, 305, 25);
		getContentPane().add(op63);

		JRadioButton op62 = new JRadioButton("<html> A correlation between force and distance\r\n");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(483, 234, 315, 25);
		getContentPane().add(op62);

		JRadioButton op61 = new JRadioButton("<html>How much the input multiplies the output by");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(483, 206, 315, 25);
		getContentPane().add(op61);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JLabel lblWhatIs_1 = new JLabel("<html>6.) What does the result of mechanical advantage mean?\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(450, 175, 362, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op31 = new JRadioButton("<html> AMA is the ratio of distance and IMA is the ratio of forces ");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(10, 338, 222, 32);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton(
				"<html> AMA applies only to levers and IMA is solely for ramps and other simple machines");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(10, 374, 212, 49);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("<html> AMA accounts for friction and IMA doesnt account for friction");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(222, 374, 191, 33);
		getContentPane().add(op33);

		btnCheckAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans1.setBounds(238, 141, 191, 23);
				ans1.setText("Ideal Mechanical Advantage");
				ans2.setBounds(147, 227, 101, 23);
				ans2.setText("3");
				ans3.setBounds(189, 418, 53, 23);
				ans3.setText("2 and 3");
				ans4.setBounds(323, 449, 151, 23);
				ans4.setText("1");
				ans5.setBounds(589, 115, 146, 23);
				ans5.setText("250 Centimeters");
				ans6.setBounds(756, 213, 56, 50);
				ans6.setText("1\r\n");
				ans7.setBounds(617, 341, 201, 23);
				ans7.setText("No units");

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

		setSize(861, 570);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
