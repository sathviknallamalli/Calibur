package Machines;

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

public class Lesson5Copy extends JFrame {
	public Lesson5Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 5 - Energy & Machines\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(300, 11, 354, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Work ");
		l2.setSelected(true);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Quick Review of Law of Conservation of Energy");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(286, 64, 403, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>The Law of Conservation of Energy says that energy cannot be destroyed, only transformed from one form to another. So the reason for why the output is never greater than input is because, some of that energy will be converted into friction or heat.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(286, 100, 658, 51);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Next Lesson >>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(729, 308, 215, 42);
		getContentPane().add(btnNewButton);

		JLabel lbltakeABicycle = new JLabel(
				"<html>The way these machines operate has to have a source of energy and what type of energy is that? Mechanical Energy, which makes sense because it moves and it is a machine.");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(286, 197, 303, 70);
		getContentPane().add(lbltakeABicycle);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setSelected(true);
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JButton btnActivateCalibur = new JButton("Activate Calibur!");
		btnActivateCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Advantage.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnActivateCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivateCalibur.setBounds(699, 72, 132, 23);
		getContentPane().add(btnActivateCalibur);

		JLabel lblWhatIsWork = new JLabel("Mechanical Energy");
		lblWhatIsWork.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhatIsWork.setBounds(286, 162, 277, 32);
		getContentPane().add(lblWhatIsWork);

		JLabel lblIdealMechanicalAdvantage = new JLabel("Correlation \r\n");
		lblIdealMechanicalAdvantage.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblIdealMechanicalAdvantage.setBounds(629, 162, 277, 32);
		getContentPane().add(lblIdealMechanicalAdvantage);

		JLabel lblasLearntIn = new JLabel(
				"<html>So this energy that comes from the input, will be converted into friction, heat, sound, light, etc which is why machines have a lower work output because of this conversion. Efficiency can let us know how much will be converted and which machine is considered better");
		lblasLearntIn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblasLearntIn.setBounds(629, 199, 303, 80);
		getContentPane().add(lblasLearntIn);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\AMA.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(457, 170, 132, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\IMA.wav");
				Audio.PlaySound(clap);

				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\IMA2.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(741, 170, 132, 23);
		getContentPane().add(button_2);

		JCheckBox checkBox = new JCheckBox("Lesson 6 - Practice Problems\r\n");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 205, 215, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Energy & Machines\r\n");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 177, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Evaluating Machines");
		checkBox_2.setSelected(true);
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(6, 151, 215, 23);
		getContentPane().add(checkBox_2);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(979, 595);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
