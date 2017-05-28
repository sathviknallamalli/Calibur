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

public class Lesson6 extends JFrame {
	public Lesson6() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 6 - Temperature Conversions");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(232, 11, 442, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 2 - Classifying Matter");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 102, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 1 - Structure");
		l2.setSelected(true);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 76, 215, 23);
		getContentPane().add(l2);

		JCheckBox l4 = new JCheckBox("Lesson 6 - Temperature Conversions\r\n");
		l4.setForeground(Color.RED);
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l4.setEnabled(false);
		l4.setBounds(6, 203, 230, 23);
		getContentPane().add(l4);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Different Temperatures!!!! What????");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(315, 64, 304, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>Its 75 degrees Farenheit in America, you go to India, its 22 degrees Celsius. What?? Why all these different temperatures?? Well the answer to that is the same as why are there different units? There is a deep history behind this, however you need to learn about the scales first. Two main temperatures are FARENHEIT and CELSIUS. These DIFFER because they have DIFFERENT REFERENCE POINTS.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(315, 100, 561, 64);
		getContentPane().add(lblinOrderFor);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 5 - Phase Changes");
		chckbxLesson.setSelected(true);
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(6, 177, 215, 23);
		getContentPane().add(chckbxLesson);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		chckbxLesson_1.setSelected(true);
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 230, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		chckbxLesson_2.setSelected(true);
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(6, 153, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\PhaseChange.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(626, 68, 132, 23);
		getContentPane().add(button_1);

		JLabel lblWhenDoesThis = new JLabel("Different Scales");
		lblWhenDoesThis.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhenDoesThis.setBounds(315, 175, 215, 32);
		getContentPane().add(lblWhenDoesThis);

		JLabel lblaPhaseChange = new JLabel(
				"<html>Developed by Swedish astronomer Andres Celsius and it uses the reference point of 0 degrees to represent the FREEZING POINT OF WATER. From there he was able to develop the remaining scale. And 100 degrees as BOILING POINT OF WATER");
		lblaPhaseChange.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaPhaseChange.setBounds(11, 275, 272, 103);
		getContentPane().add(lblaPhaseChange);

		JLabel lblCondensation = new JLabel("Celsius");
		lblCondensation.setForeground(new Color(102, 204, 0));
		lblCondensation.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCondensation.setBounds(11, 244, 74, 32);
		getContentPane().add(lblCondensation);

		JLabel lbloppositeOfVaporization = new JLabel(
				"<html>Most commonly used in the world and has a scale from 0 to 100");
		lbloppositeOfVaporization.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbloppositeOfVaporization.setBounds(315, 230, 95, 73);
		getContentPane().add(lbloppositeOfVaporization);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(631, 586, 256, 16);
		getContentPane().add(label);

		JButton button = new JButton("Take the Lesson Review");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lesson6Review l = new Lesson6Review();
				l.newClass();
				close();
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(655, 613, 215, 36);
		getContentPane().add(button);

		JLabel lblCelsius = new JLabel("Celsius");
		lblCelsius.setForeground(Color.BLUE);
		lblCelsius.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblCelsius.setBounds(329, 207, 61, 23);
		getContentPane().add(lblCelsius);

		JLabel lblFarenheit = new JLabel("Farenheit");
		lblFarenheit.setForeground(Color.BLUE);
		lblFarenheit.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblFarenheit.setBounds(430, 207, 83, 23);
		getContentPane().add(lblFarenheit);

		JLabel lblKelvin = new JLabel("Kelvin");
		lblKelvin.setForeground(Color.BLUE);
		lblKelvin.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblKelvin.setBounds(542, 207, 83, 23);
		getContentPane().add(lblKelvin);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\scales.PNG"));
		lblNewLabel.setBounds(655, 175, 205, 227);
		getContentPane().add(lblNewLabel);

		JLabel lblmostCommonlyUsed = new JLabel(
				"<html>Most commonly used in the U.S.A. and has scale from 32 to 212\r\n");
		lblmostCommonlyUsed.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblmostCommonlyUsed.setBounds(420, 230, 95, 86);
		getContentPane().add(lblmostCommonlyUsed);

		JLabel lblmeasuresActualEnergy = new JLabel(
				"<html>Measures ACTUAL ENERGY of molecules and starts at 0 and no upper limit\r\n");
		lblmeasuresActualEnergy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblmeasuresActualEnergy.setBounds(530, 230, 118, 73);
		getContentPane().add(lblmeasuresActualEnergy);

		JLabel lblBoiling = new JLabel("<html>Freezing - 0\r\nBoiling - 100");
		lblBoiling.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBoiling.setBounds(315, 319, 95, 42);
		getContentPane().add(lblBoiling);

		JLabel lblfreezing = new JLabel("<html>Freezing - 32\r\nBoiling - 212");
		lblfreezing.setForeground(Color.RED);
		lblfreezing.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblfreezing.setBounds(420, 319, 95, 42);
		getContentPane().add(lblfreezing);

		JLabel lblfreezing_1 = new JLabel("<html>Freezing - 273\r\nBoiling - 373");
		lblfreezing_1.setForeground(Color.BLUE);
		lblfreezing_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblfreezing_1.setBounds(525, 314, 108, 42);
		getContentPane().add(lblfreezing_1);

		JLabel lbldevelopedByDaniel = new JLabel(
				"<html>Developed by Daniel Farenheit and he used the human body temperature as a reference point. However, he used the temperature of a sick person, so his scale had to be modified so the reference point is at 32. ");
		lbldevelopedByDaniel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbldevelopedByDaniel.setBounds(11, 410, 272, 86);
		getContentPane().add(lbldevelopedByDaniel);

		JLabel lblFarenheit_1 = new JLabel("Farenheit");
		lblFarenheit_1.setForeground(new Color(102, 204, 0));
		lblFarenheit_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblFarenheit_1.setBounds(11, 379, 101, 32);
		getContentPane().add(lblFarenheit_1);

		JLabel lblKelvin_1 = new JLabel("Kelvin");
		lblKelvin_1.setForeground(new Color(102, 204, 0));
		lblKelvin_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblKelvin_1.setBounds(11, 499, 101, 32);
		getContentPane().add(lblKelvin_1);

		JLabel lblitIsUsed = new JLabel(
				"<html>It is used to represent the ACTUAL ENERGY. The other 2 scales measure relative energy, compared to others, but Kelvin actually measures the molecules of an object. In an object if the molecules do not move, then it has 0Kelvin. It is very difficult to get to 0, so that means that there is nothing below 0Kelvin, but no upper limit");
		lblitIsUsed.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblitIsUsed.setBounds(11, 529, 272, 120);
		getContentPane().add(lblitIsUsed);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\cv.PNG"));
		label_1.setBounds(315, 518, 256, 64);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\fc.PNG"));
		label_2.setBounds(315, 410, 253, 64);
		getContentPane().add(label_2);

		JLabel lblFarenheitCelsius = new JLabel("Farenheit & Celsius");
		lblFarenheitCelsius.setForeground(Color.MAGENTA);
		lblFarenheitCelsius.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblFarenheitCelsius.setBounds(315, 372, 198, 32);
		getContentPane().add(lblFarenheitCelsius);

		JLabel lblCelsiusKelvin = new JLabel("Celsius & Kelvin\r\n");
		lblCelsiusKelvin.setForeground(Color.MAGENTA);
		lblCelsiusKelvin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblCelsiusKelvin.setBounds(315, 485, 198, 32);
		getContentPane().add(lblCelsiusKelvin);

		JLabel lblthereIsNo = new JLabel(
				"<html>There is no direct common formula that is used to convert from Farheneit to Kelvin, so you must convert from farenheit to celsius and then to kelvin. It is also great practice! You can mathematically extrapolate a formula from farenheit to kelvin, but it is not going to be pretty!");
		lblthereIsNo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthereIsNo.setBounds(602, 413, 272, 103);
		getContentPane().add(lblthereIsNo);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(83, 250, 132, 23);
		getContentPane().add(button_2);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(109, 383, 132, 23);
		getContentPane().add(button_3);

		JButton button_4 = new JButton("Activate Calibur!");
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(83, 500, 132, 23);
		getContentPane().add(button_4);

		JButton button_5 = new JButton("Activate Calibur!");
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_5.setBounds(381, 584, 132, 23);
		getContentPane().add(button_5);

		JLabel lblbewareOrderOf = new JLabel("<html>BEWARE, ORDER OF OPERATIONS");
		lblbewareOrderOf.setForeground(Color.RED);
		lblbewareOrderOf.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblbewareOrderOf.setBounds(315, 613, 272, 32);
		getContentPane().add(lblbewareOrderOf);

		JLabel lblabsoluteZero = new JLabel("<html>ABSOLUTE ZERO - NO MOTION OF MOLECULES, LOWEST");
		lblabsoluteZero.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblabsoluteZero.setBounds(602, 533, 285, 42);
		getContentPane().add(lblabsoluteZero);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(getSize());
		setLocation(300, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
