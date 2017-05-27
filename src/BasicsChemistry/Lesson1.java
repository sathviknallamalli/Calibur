package BasicsChemistry;

import java.awt.Font;
import javafx.scene.media.*;
import marytts.server.http.AudioStreamNHttpEntity;

import java.io.*;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

import com.sun.speech.freetts.audio.AudioPlayer;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import sun.audio.*;

public class Lesson1 extends JFrame {
	public Lesson1() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 - Atomic Structure");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(365, 11, 354, 42);
		getContentPane().add(title);

		JLabel ae = new JLabel("What is an Atom?");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 149, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>AN ATOM IS THE SMALLEST PART OF ANY MATTER. What is matter though? Matter is anything that takes up space and has mass. So all objects that you see are made up of some particles that all have atoms. These atoms can also move, which make different  substance.");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 724, 51);
		getContentPane().add(lblinOrderFor);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\atom.png"));
		p.setBounds(329, 153, 56, 58);
		getContentPane().add(p);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Atom.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(488, 67, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson2Review l = new Lesson2Review();
				l.newClass();
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

		JLabel lblTheCenterOf = new JLabel("The center of this particle is the ATOM, WHICH IS THE SMALLEST");
		lblTheCenterOf.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTheCenterOf.setBounds(395, 162, 368, 23);
		getContentPane().add(lblTheCenterOf);

		JLabel lblWhatIsA = new JLabel("What is a Molecule?");
		lblWhatIsA.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhatIsA.setBounds(329, 209, 181, 32);
		getContentPane().add(lblWhatIsA);

		JLabel lblaMoleculeIs = new JLabel(
				"<html>A MOLECULE IS A COMBINATION OF ATOMS. The same molecule is the same type of atoms. If you have only one molecule in matter, that is called a compound, you will learn more about this in Lesson 2 about classifying matter.");
		lblaMoleculeIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaMoleculeIs.setBounds(329, 245, 724, 42);
		getContentPane().add(lblaMoleculeIs);

		JLabel p1 = new JLabel();
		p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\molecule.png"));
		p1.setBounds(329, 297, 111, 77);
		getContentPane().add(p1);

		JLabel p3 = new JLabel();
		p3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\mat.png"));
		p3.setBounds(6, 297, 111, 77);
		getContentPane().add(p3);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Molecule.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(520, 212, 132, 23);
		getContentPane().add(button);

		JLabel lbltheAtomsThat = new JLabel(
				"<html>The atoms that make this molecule ar hydrogen and oxygen, which can make up water as the matter!");
		lbltheAtomsThat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheAtomsThat.setBounds(450, 313, 314, 42);
		getContentPane().add(lbltheAtomsThat);
		
		JLabel lblMatter = new JLabel("Matter");
		lblMatter.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblMatter.setBounds(10, 255, 181, 32);
		getContentPane().add(lblMatter);
		
		JLabel lblthisIsAn = new JLabel("<html>This is an indepth look at atoms and its nucleus. This is what the nucleus is composed of with electrons and protons. Matter have both atoms and molecules and that is what is called a MIXTURE. MIXTURES ARE THE MOST COMMON THINGS WE USE. ");
		lblthisIsAn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisIsAn.setBounds(122, 283, 208, 129);
		getContentPane().add(lblthisIsAn);
		
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
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(10, 160, 230, 23);
		getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(10, 135, 230, 23);
		getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Lesson 2 - Classifying Matter");
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_4.setEnabled(false);
		checkBox_4.setBounds(10, 109, 215, 23);
		getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Lesson 1 - Structure");
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(10, 83, 215, 23);
		getContentPane().add(checkBox_5);
		
		JLabel label_1 = new JLabel("Chapter Progress");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_1.setBounds(25, 64, 112, 16);
		getContentPane().add(label_1);

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
