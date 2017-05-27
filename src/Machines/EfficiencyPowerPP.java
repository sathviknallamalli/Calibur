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

public class EfficiencyPowerPP extends JFrame {
	public EfficiencyPowerPP() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Efficiency & Power - Practice Problems");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(185, 11, 490, 42);
		getContentPane().add(title);

		JLabel lblIdentifyWhich = new JLabel(
				"<html>1.) Select the parameters needed to calculate efficiency and power?");
		lblIdentifyWhich.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyWhich.setBounds(10, 60, 430, 23);
		getContentPane().add(lblIdentifyWhich);

		JRadioButton Mass = new JRadioButton("Work input");
		Mass.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		Mass.setBounds(31, 90, 95, 23);
		getContentPane().add(Mass);

		JRadioButton op2 = new JRadioButton("Work output");
		op2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op2.setBounds(31, 116, 95, 23);
		getContentPane().add(op2);

		JRadioButton op3 = new JRadioButton("Total work");
		op3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op3.setBounds(31, 142, 95, 23);
		getContentPane().add(op3);

		JLabel lblWhichPart = new JLabel(
				"<html>2.) Calculate the power of this task: Mathew moves a box 10 centimeters using 50 newtons of force in 3 secs");
		lblWhichPart.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhichPart.setBounds(10, 172, 403, 34);
		getContentPane().add(lblWhichPart);

		JRadioButton op23 = new JRadioButton("16.6");
		op23.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op23.setBounds(31, 264, 113, 23);
		getContentPane().add(op23);

		JRadioButton op22 = new JRadioButton("1.6");
		op22.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op22.setBounds(31, 238, 113, 23);
		getContentPane().add(op22);

		JRadioButton op21 = new JRadioButton("166");
		op21.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op21.setBounds(31, 212, 137, 23);
		getContentPane().add(op21);

		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(op23);
		bg2.add(op22);
		bg2.add(op21);

		JLabel lblIdentifyAll = new JLabel(
				"<html>3.) Select all of the statments that are true about units and conversion\r\n ");
		lblIdentifyAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyAll.setBounds(10, 294, 386, 23);
		getContentPane().add(lblIdentifyAll);

		JLabel lblSelectAll = new JLabel("<html>4.) Calculate the efficiency of this machine given this information");
		lblSelectAll.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSelectAll.setBounds(10, 427, 434, 23);
		getContentPane().add(lblSelectAll);

		JRadioButton op41 = new JRadioButton("95%");
		op41.setVerticalAlignment(SwingConstants.TOP);
		op41.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op41.setBounds(252, 459, 63, 23);
		getContentPane().add(op41);

		JRadioButton op42 = new JRadioButton("85%");
		op42.setVerticalAlignment(SwingConstants.TOP);
		op42.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op42.setBounds(317, 459, 47, 23);
		getContentPane().add(op42);

		JRadioButton op43 = new JRadioButton("90%");
		op43.setVerticalAlignment(SwingConstants.TOP);
		op43.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op43.setBounds(288, 485, 63, 23);
		getContentPane().add(op43);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(op43);
		bg4.add(op42);
		bg4.add(op41);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\op1.PNG"));
		p.setBounds(10, 452, 236, 90);
		getContentPane().add(p);

		JLabel lblWhatIs = new JLabel(
				"<html>5.) Calculate the time it took to accomplish 60 Joules if power is 35 Watts");
		lblWhatIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs.setBounds(450, 60, 394, 23);
		getContentPane().add(lblWhatIs);

		JRadioButton op51 = new JRadioButton("1.7Min");
		op51.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op51.setBounds(483, 90, 63, 23);
		getContentPane().add(op51);

		JRadioButton op52 = new JRadioButton("102sec");
		op52.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op52.setBounds(483, 116, 95, 23);
		getContentPane().add(op52);

		JRadioButton op53 = new JRadioButton("2100");
		op53.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op53.setBounds(483, 142, 101, 23);
		getContentPane().add(op53);

		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(op53);
		bg5.add(op52);
		bg5.add(op51);

		JLabel lblIdentifyThe = new JLabel("<html>7.) Can the efficiency ever be greater than 100%");
		lblIdentifyThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIdentifyThe.setBounds(460, 294, 352, 23);
		getContentPane().add(lblIdentifyThe);

		JRadioButton op71 = new JRadioButton("No");
		op71.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op71.setBounds(493, 324, 85, 23);
		getContentPane().add(op71);

		JRadioButton op72 = new JRadioButton("Yes");
		op72.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op72.setBounds(590, 324, 85, 23);
		getContentPane().add(op72);

		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(op72);
		bg7.add(op71);

		JButton btnCheckAnswers = new JButton("Check Answers");

		btnCheckAnswers.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCheckAnswers.setBounds(507, 364, 158, 37);
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

		JRadioButton op63 = new JRadioButton("Both work and time increase simultaneously");
		op63.setVerticalAlignment(SwingConstants.TOP);
		op63.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op63.setBounds(483, 262, 305, 25);
		getContentPane().add(op63);

		JRadioButton op62 = new JRadioButton("The work done is lower");
		op62.setVerticalAlignment(SwingConstants.TOP);
		op62.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op62.setBounds(483, 234, 315, 25);
		getContentPane().add(op62);

		JRadioButton op61 = new JRadioButton("The time it takes decreases");
		op61.setVerticalAlignment(SwingConstants.TOP);
		op61.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op61.setBounds(483, 206, 315, 25);
		getContentPane().add(op61);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(op63);
		bg6.add(op62);
		bg6.add(op61);

		JLabel lblWhatIs_1 = new JLabel("<html>6.) When will the power of a task increase?\r\n");
		lblWhatIs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWhatIs_1.setBounds(450, 175, 362, 25);
		getContentPane().add(lblWhatIs_1);

		JRadioButton op31 = new JRadioButton("<html> 1 watt = Joule/Sec");
		op31.setVerticalAlignment(SwingConstants.TOP);
		op31.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op31.setBounds(10, 324, 113, 23);
		getContentPane().add(op31);

		JRadioButton op32 = new JRadioButton("<html> Efficiency has no units");
		op32.setVerticalAlignment(SwingConstants.TOP);
		op32.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op32.setBounds(10, 350, 146, 23);
		getContentPane().add(op32);

		JRadioButton op33 = new JRadioButton("<html> Work is a form of energy");
		op33.setVerticalAlignment(SwingConstants.TOP);
		op33.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op33.setBounds(10, 371, 191, 23);
		getContentPane().add(op33);

		JRadioButton op4 = new JRadioButton("Time");
		op4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op4.setBounds(155, 90, 95, 23);
		getContentPane().add(op4);

		JRadioButton op5 = new JRadioButton("Force");
		op5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op5.setBounds(155, 116, 95, 23);
		getContentPane().add(op5);

		JRadioButton op6 = new JRadioButton("Work input");
		op6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op6.setBounds(155, 142, 95, 23);
		getContentPane().add(op6);

		JRadioButton op34 = new JRadioButton("<html> Work = Force * Mass");
		op34.setVerticalAlignment(SwingConstants.TOP);
		op34.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		op34.setBounds(10, 397, 146, 23);
		getContentPane().add(op34);
		
		btnCheckAnswers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ans1.setBounds(249, 115, 191, 23);
				ans1.setText("Work output and input");
				ans2.setBounds(190, 233, 101, 23);
				ans2.setText("1.6 Watts");
				ans3.setBounds(197, 349, 151, 45);
				ans3.setText("<html>Eveything except Work = Force * Mass");
				ans4.setBounds(271, 515, 151, 23);
				ans4.setText("85%");
				ans5.setBounds(589, 115, 146, 23);
				ans5.setText("102secs");
				ans6.setBounds(668, 211, 113, 50);
				ans6.setText("Time decreases");
				ans7.setBounds(483, 354, 201, 23);
				ans7.setText("No");

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

		setSize(876, 592);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
