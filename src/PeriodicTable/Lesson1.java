package PeriodicTable;

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

public class Lesson1 extends JFrame {
	public Lesson1() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 - Arrangement and Structure");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(365, 11, 488, 42);
		getContentPane().add(title);

		JLabel ae = new JLabel("Subatomic Particles");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 201, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>You may have heard that atoms are the smallest thing, but there are even smaller things called SUBATOMIC PARTICLES. There are 3 primary ones that are very important to an atom, element, and the PERIODIC TABLE. They are the NEUTRON, PROTON, AND ELECTRON. ");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 724, 51);
		getContentPane().add(lblinOrderFor);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\proton.png"));
		p.setBounds(329, 177, 56, 56);
		getContentPane().add(p);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Atom.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(510, 70, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Lesson2Review l = new Lesson2Review();
				// l.newClass();
				close();
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(843, 376, 215, 36);
		getContentPane().add(button_3);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(819, 349, 256, 16);
		getContentPane().add(label);

		JCheckBox chckbxLesson_5 = new JCheckBox("Lesson 6 - Notable Families\r\n");
		chckbxLesson_5.setForeground(Color.RED);
		chckbxLesson_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_5.setEnabled(false);
		chckbxLesson_5.setBounds(10, 210, 230, 23);
		getContentPane().add(chckbxLesson_5);

		JCheckBox chckbxLesson_4 = new JCheckBox("Lesson 5 - Halogens & Noble Gases");
		chckbxLesson_4.setForeground(Color.RED);
		chckbxLesson_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_4.setEnabled(false);
		chckbxLesson_4.setBounds(10, 184, 230, 23);
		getContentPane().add(chckbxLesson_4);

		JCheckBox chckbxLesson_3 = new JCheckBox("Lesson 4 - Other metals, Metalloids, etc.");
		chckbxLesson_3.setForeground(Color.RED);
		chckbxLesson_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_3.setEnabled(false);
		chckbxLesson_3.setBounds(10, 160, 239, 23);
		getContentPane().add(chckbxLesson_3);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 3 - Transition Metals");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(10, 135, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 2 - Alkali Metals & Earth Metals");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(10, 109, 239, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 1 - Arrangement and Structure");
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(10, 83, 230, 23);
		getContentPane().add(chckbxLesson);

		JLabel label_1 = new JLabel("Chapter Progress");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_1.setBounds(25, 64, 112, 16);
		getContentPane().add(label_1);

		JButton btnPeriodictable = new JButton("Periodic Table");
		btnPeriodictable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PTable p = new PTable();
				p.newClass();
			}
		});
		btnPeriodictable.setFont(new Font("Arial", Font.PLAIN, 14));
		btnPeriodictable.setBounds(10, 14, 127, 40);
		getContentPane().add(btnPeriodictable);
		
		JLabel lblProton = new JLabel("Proton");
		lblProton.setForeground(new Color(0, 0, 255));
		lblProton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblProton.setBounds(329, 151, 56, 23);
		getContentPane().add(lblProton);
		
		JLabel lblNeutron = new JLabel("Neutron");
		lblNeutron.setForeground(Color.BLUE);
		lblNeutron.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNeutron.setBounds(407, 151, 56, 23);
		getContentPane().add(lblNeutron);
		
		JLabel lblElectron = new JLabel("Electron");
		lblElectron.setForeground(Color.BLUE);
		lblElectron.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblElectron.setBounds(490, 151, 56, 23);
		getContentPane().add(lblElectron);

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
