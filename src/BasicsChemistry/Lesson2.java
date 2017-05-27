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

public class Lesson2 extends JFrame {
	public Lesson2() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 2 - Classifying Matter");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(364, 11, 388, 42);
		getContentPane().add(title);

		JLabel ae = new JLabel("Basic Theory");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 118, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>Matter is basically something that takes up space in the air and it has mass. Even the slightest mass is classified as matter, for example air. Matter is such a broad cateogry that it can be broked down into numerous categories and matter is a fascinating topic!!\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 724, 48);
		getContentPane().add(lblinOrderFor);

		JLabel lblTypesOfSimple = new JLabel("Types of Matter & Differences");
		lblTypesOfSimple.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblTypesOfSimple.setBounds(329, 155, 253, 32);
		getContentPane().add(lblTypesOfSimple);

		JLabel lbltakeABicycle = new JLabel(
				"<html>There are so many materials that are considered matter, so there are categories that have been developed to classify them. These categories are PURE SUBSTANCES & MIXTURES. These differ based on physical properties, atomic structures, and chemical features. \r\n\r\n");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(331, 190, 706, 48);
		getContentPane().add(lbltakeABicycle);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\matter.png"));
		p.setBounds(329, 239, 458, 147);
		getContentPane().add(p);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Matter.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(450, 70, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Types&Diffs.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(592, 163, 132, 23);
		getContentPane().add(button);

		JLabel lblElements = new JLabel("Elements");
		lblElements.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblElements.setBounds(10, 235, 81, 32);
		getContentPane().add(lblElements);

		JLabel lblinAnElement = new JLabel(
				"<html>In an element there is only 1 type of atom and all these atoms are the same as the element. There are 118 elements. Does this number look familiar? These are the elements in the Perioidic Table, they all have only ONE TYPE OF ATOM.\r\n");
		lblinAnElement.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinAnElement.setBounds(10, 268, 288, 87);
		getContentPane().add(lblinAnElement);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\pt.png"));
		pt.setBounds(6, 361, 245, 187);
		getContentPane().add(pt);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Elements.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(101, 243, 132, 23);
		getContentPane().add(button_1);

		JLabel lblCompounds = new JLabel("Compounds");
		lblCompounds.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblCompounds.setBounds(280, 397, 102, 32);
		getContentPane().add(lblCompounds);

		JLabel lblaCompoundIs = new JLabel(
				"<html>A compound is similar to an element, however a compound has only ONE TYPE OF MOLECULE. Remember that a molecule is multiple atoms joined together. This molecule is repeated throughout and it is represented THROUGH A FORMULA. Numerous elements make one atom, so a compound has numerous elements, but only those repeat");
		lblaCompoundIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaCompoundIs.setBounds(280, 433, 280, 115);
		getContentPane().add(lblaCompoundIs);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Compounds.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(387, 405, 132, 23);
		getContentPane().add(button_2);

		JLabel water = new JLabel();
		water.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\water.PNG"));
		water.setBounds(570, 485, 88, 63);
		getContentPane().add(water);

		JLabel lblhO = new JLabel("<html>H2 + O");
		lblhO.setForeground(Color.BLUE);
		lblhO.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblhO.setBounds(586, 463, 49, 23);
		getContentPane().add(lblhO);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson2Review l = new Lesson2Review();
				l.newClass();
				close();
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(838, 307, 215, 36);
		getContentPane().add(button_3);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(814, 280, 256, 16);
		getContentPane().add(label);

		JLabel lblMixtures = new JLabel("Mixtures");
		lblMixtures.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblMixtures.setBounds(697, 397, 102, 32);
		getContentPane().add(lblMixtures);

		JButton button_4 = new JButton("Activate Calibur!");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Mixtures.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(786, 405, 132, 23);
		getContentPane().add(button_4);

		JLabel lblaMixtureIs = new JLabel(
				"<html>A mixture is a combination of a COMPOUND AND ELEMENT. These combine into making daily things we use such as juice, food, and even materials such as metal. \r\n");
		lblaMixtureIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaMixtureIs.setBounds(697, 436, 156, 96);
		getContentPane().add(lblaMixtureIs);

		JLabel s = new JLabel();
		s.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\salsa.png"));
		s.setBounds(850, 449, 102, 77);
		getContentPane().add(s);

		JLabel salt = new JLabel();
		salt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\salt.png"));
		salt.setBounds(592, 386, 40, 77);
		getContentPane().add(salt);

		JLabel lblrememberTheseSubstances = new JLabel(
				"<html>REMEMBER THESE SUBSTANCES ARE NOT CHEMICALLY COMBINED AND THEY DONT HAVE UNIFORM PROPORTIONS.\r\n");
		lblrememberTheseSubstances.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblrememberTheseSubstances.setBounds(952, 412, 118, 136);
		getContentPane().add(lblrememberTheseSubstances);

		JCheckBox checkBox = new JCheckBox("Lesson 6 - Temperature Conversions\r\n");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(3, 210, 230, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Phase Changes");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(3, 184, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(3, 160, 230, 23);
		getContentPane().add(checkBox_2);

		JCheckBox checkBox_3 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(3, 135, 230, 23);
		getContentPane().add(checkBox_3);

		JCheckBox checkBox_4 = new JCheckBox("Lesson 2 - Classifying Matter");
		checkBox_4.setEnabled(false);
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_4.setBounds(3, 109, 215, 23);
		getContentPane().add(checkBox_4);

		JCheckBox checkBox_5 = new JCheckBox("Lesson 1 - Structure");
		checkBox_5.setSelected(true);
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(3, 83, 215, 23);
		getContentPane().add(checkBox_5);

		JLabel label_1 = new JLabel("Chapter Progress");
		label_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label_1.setBounds(18, 64, 112, 16);
		getContentPane().add(label_1);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(1096, 602);
		setLocation(300, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
