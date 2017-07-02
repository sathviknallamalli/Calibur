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

import Machines.Audio;

public class Lesson3 extends JFrame {
	public Lesson3() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 - Alkaline Earth Metals");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(292, 11, 414, 42);
		getContentPane().add(title);

		JCheckBox chckbxLesson_4 = new JCheckBox("Lesson 6 - Halogens & Noble Gases");
		chckbxLesson_4.setForeground(Color.RED);
		chckbxLesson_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_4.setEnabled(false);
		chckbxLesson_4.setBounds(11, 244, 230, 23);
		getContentPane().add(chckbxLesson_4);

		JCheckBox chckbxLesson_3 = new JCheckBox("Lesson 5 - Other Families\r\n");
		chckbxLesson_3.setForeground(Color.RED);
		chckbxLesson_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_3.setEnabled(false);
		chckbxLesson_3.setBounds(11, 218, 239, 23);
		getContentPane().add(chckbxLesson_3);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 3 - Alkaline Earth Metals");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(11, 166, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 2 - Alkali Metals ");
		chckbxLesson_1.setSelected(true);
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(11, 140, 239, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 1 - Arrangement & Structure");
		chckbxLesson.setSelected(true);
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(11, 114, 230, 23);
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

		JLabel lblWhoWhatWhen = new JLabel("Alkaline Earth Metals\r\n");
		lblWhoWhatWhen.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhoWhatWhen.setBounds(256, 57, 187, 32);
		getContentPane().add(lblWhoWhatWhen);

		JLabel lblthisPeriodicTable = new JLabel(
				"<html>The alkali metals are in GROUP 1. HYDROGEN is in group 1, but IS NOT part of the Alkali Metals group. There are only 6 elements in this group that all end in the suffix 'IUM'. They are HIGHLY REACTIVE metals that are SOFT. If you have seen pure sodium, its very soft to cut. ");
		lblthisPeriodicTable.setForeground(Color.RED);
		lblthisPeriodicTable.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblthisPeriodicTable.setBounds(256, 90, 605, 58);
		getContentPane().add(lblthisPeriodicTable);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\AlkaliMetals.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(450, 62, 132, 23);
		getContentPane().add(button);

		JCheckBox chckbxLesson_5 = new JCheckBox("Lesson 4 - Transition Metals");
		chckbxLesson_5.setForeground(Color.RED);
		chckbxLesson_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_5.setEnabled(false);
		chckbxLesson_5.setBounds(11, 192, 239, 23);
		getContentPane().add(chckbxLesson_5);

		JCheckBox chckbxLesson_6 = new JCheckBox("Lesson 7 - Finish the Puzzle");
		chckbxLesson_6.setForeground(Color.RED);
		chckbxLesson_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_6.setEnabled(false);
		chckbxLesson_6.setBounds(10, 270, 230, 23);
		getContentPane().add(chckbxLesson_6);

		JCheckBox chckbxPreview = new JCheckBox("Preview");
		chckbxPreview.setSelected(true);
		chckbxPreview.setForeground(Color.RED);
		chckbxPreview.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxPreview.setEnabled(false);
		chckbxPreview.setBounds(11, 87, 230, 23);
		getContentPane().add(chckbxPreview);

		JLabel lblGroup = new JLabel("Electron Configuration- Bohr Model");
		lblGroup.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblGroup.setBounds(256, 210, 306, 32);
		getContentPane().add(lblGroup);

		JLabel lblaGroupRepresents = new JLabel(
				"<html>These elements has one ELECTRON ON THE OUTER SHELL. They want to be complete and get rid of it, so it makes them HIGHLY REACTIVE. All the elements will have this extra electron. ");
		lblaGroupRepresents.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaGroupRepresents.setBounds(256, 242, 297, 73);
		getContentPane().add(lblaGroupRepresents);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\ame.PNG"));
		label.setBounds(566, 165, 295, 229);
		getContentPane().add(label);

		JLabel lblLithium = new JLabel("Beryillium");
		lblLithium.setForeground(Color.BLUE);
		lblLithium.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblLithium.setBounds(256, 159, 96, 19);
		getContentPane().add(lblLithium);

		JLabel lblSodium = new JLabel("Strontium");
		lblSodium.setForeground(Color.BLUE);
		lblSodium.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSodium.setBounds(256, 182, 96, 19);
		getContentPane().add(lblSodium);

		JLabel lblPotassiu = new JLabel("Magnesium");
		lblPotassiu.setForeground(Color.BLUE);
		lblPotassiu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPotassiu.setBounds(338, 161, 96, 19);
		getContentPane().add(lblPotassiu);

		JLabel lblRubidium = new JLabel("Barium");
		lblRubidium.setForeground(Color.BLUE);
		lblRubidium.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblRubidium.setBounds(338, 184, 96, 19);
		getContentPane().add(lblRubidium);

		JLabel lblCesium = new JLabel("Calcium");
		lblCesium.setForeground(Color.BLUE);
		lblCesium.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblCesium.setBounds(417, 161, 96, 19);
		getContentPane().add(lblCesium);

		JLabel lblFrancium = new JLabel("Radium");
		lblFrancium.setForeground(Color.BLUE);
		lblFrancium.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblFrancium.setBounds(417, 184, 96, 19);
		getContentPane().add(lblFrancium);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\sodium.PNG"));
		label_2.setBounds(387, 405, 101, 85);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\left.png"));
		label_3.setBounds(479, 353, 53, 50);
		getContentPane().add(label_3);

		JLabel lblExtraElectron = new JLabel("Extra electron");
		lblExtraElectron.setForeground(Color.BLUE);
		lblExtraElectron.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblExtraElectron.setBounds(403, 358, 96, 19);
		getContentPane().add(lblExtraElectron);

		JButton button_1 = new JButton("Lesson Review");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson2Review l2 = new Lesson2Review();
				l2.newClass();
				close();
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(657, 477, 215, 36);
		getContentPane().add(button_1);

		JLabel label_5 = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_5.setBounds(621, 443, 261, 23);
		getContentPane().add(label_5);
		
		JLabel lblClassificationMetals = new JLabel("Classification - METALS");
		lblClassificationMetals.setForeground(Color.BLUE);
		lblClassificationMetals.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblClassificationMetals.setBounds(600, 58, 261, 28);
		getContentPane().add(lblClassificationMetals);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(898, 563);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
