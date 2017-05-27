package BasicsChemistry;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson5More extends JFrame {
	public Lesson5More() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 5 - Phase Change Examples and Diagrams");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(194, 14, 602, 42);
		getContentPane().add(title);

		JLabel lblinOrderFor = new JLabel(
				"<html>You can see that as heat is added the basic changes of melting and vaporization are present. If you go the other way where heat is removed then you get condensation and freezing.");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblinOrderFor.setBounds(649, 83, 305, 100);
		getContentPane().add(lblinOrderFor);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\phased.PNG"));
		p.setBounds(272, 67, 367, 185);
		getContentPane().add(p);

		JLabel p1 = new JLabel();
		p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\wcycle.png"));
		p1.setBounds(272, 264, 256, 185);
		getContentPane().add(p1);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Atom.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(649, 194, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson5Review l = new Lesson5Review();
				l.newClass();
				close();
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(747, 402, 215, 36);
		getContentPane().add(button_3);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(723, 375, 256, 16);
		getContentPane().add(label);

		JCheckBox checkBox = new JCheckBox("Lesson 6 - Temperature Conversions\r\n");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(10, 210, 230, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Phase Changes");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(10, 184, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		checkBox_2.setSelected(true);
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(10, 160, 230, 23);
		getContentPane().add(checkBox_2);

		JCheckBox checkBox_3 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		checkBox_3.setSelected(true);
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(10, 135, 230, 23);
		getContentPane().add(checkBox_3);

		JCheckBox checkBox_4 = new JCheckBox("Lesson 2 - Classifying Matter");
		checkBox_4.setSelected(true);
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_4.setEnabled(false);
		checkBox_4.setBounds(10, 109, 215, 23);
		getContentPane().add(checkBox_4);

		JCheckBox checkBox_5 = new JCheckBox("Lesson 1 - Structure");
		checkBox_5.setSelected(true);
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(10, 83, 215, 23);
		getContentPane().add(checkBox_5);

		JLabel label_1 = new JLabel("Chapter Progress");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_1.setBounds(25, 64, 112, 16);
		getContentPane().add(label_1);

		JLabel lblyouCanAll = new JLabel(
				"<html>You can all see the phase changes of water in real life during the water cycle.");
		lblyouCanAll.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblyouCanAll.setBounds(538, 288, 256, 60);
		getContentPane().add(lblyouCanAll);

		JButton button = new JButton("Activate Calibur!");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(538, 357, 132, 23);
		getContentPane().add(button);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(981, 570);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
