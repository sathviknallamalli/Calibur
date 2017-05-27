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

public class Lesson5 extends JFrame {
	public Lesson5() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 5 - Phase Changes");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(366, 11, 308, 42);
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

		JLabel ae = new JLabel("A Phase Change");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 148, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>We have ice, water, and vapor, but they are all liquid water, how is this possible? This is what we call a PHASE CHANGE. It is the same substance of water, but in a solid, liquid, and gas form. The conversion from one to another is called a phase change. We will learn about the different transformations and how they work");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 712, 51);
		getContentPane().add(lblinOrderFor);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 5 - Phase Changes");
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

		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson5More l = new Lesson5More();
				l.newClass();
				close();
			}
		});
		btnContinue.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnContinue.setBounds(885, 550, 156, 36);
		getContentPane().add(btnContinue);

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
		button_1.setBounds(487, 68, 132, 23);
		getContentPane().add(button_1);

		JLabel lblWhenDoesThis = new JLabel("When Does This Happen?");
		lblWhenDoesThis.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWhenDoesThis.setBounds(329, 157, 215, 32);
		getContentPane().add(lblWhenDoesThis);

		JLabel lblaPhaseChange = new JLabel(
				"<html>A phase change occurs when heat is added, but temeperature does not change. It is important to learn the difference between HEAT and TEMPERATURE");
		lblaPhaseChange.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaPhaseChange.setBounds(329, 193, 712, 33);
		getContentPane().add(lblaPhaseChange);

		JLabel lblHeat = new JLabel("Heat");
		lblHeat.setForeground(Color.BLUE);
		lblHeat.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblHeat.setBounds(329, 237, 61, 23);
		getContentPane().add(lblHeat);

		JLabel lblTemperature = new JLabel("Temperature");
		lblTemperature.setForeground(Color.BLUE);
		lblTemperature.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblTemperature.setBounds(628, 237, 277, 23);
		getContentPane().add(lblTemperature);

		JLabel lbltemperatureIsThe = new JLabel(
				"<html>Temperature is the average random kinetic motion of molecules in a substance, this will increase when the material also increases.");
		lbltemperatureIsThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltemperatureIsThe.setBounds(628, 265, 277, 51);
		getContentPane().add(lbltemperatureIsThe);

		JLabel lblheatIsThe = new JLabel(
				"<html>Heat is the energy flow between objects of different temperature. When heat increases, so does the temperature. Heat can also be called thermal energy");
		lblheatIsThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblheatIsThe.setBounds(329, 265, 289, 51);
		getContentPane().add(lblheatIsThe);

		JLabel lblFreezing = new JLabel("Freezing");
		lblFreezing.setForeground(Color.RED);
		lblFreezing.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblFreezing.setBounds(252, 327, 205, 32);
		getContentPane().add(lblFreezing);

		JLabel lblfreezingOccursWhen = new JLabel(
				"<html>Freezing occurs when liquid goes to a solid. The molecules will go from a free motion state to densely packed.");
		lblfreezingOccursWhen.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblfreezingOccursWhen.setBounds(252, 363, 205, 51);
		getContentPane().add(lblfreezingOccursWhen);

		JLabel lblLiquidSolid = new JLabel("Liquid -> Solid");
		lblLiquidSolid.setForeground(Color.BLUE);
		lblLiquidSolid.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblLiquidSolid.setBounds(278, 419, 179, 23);
		getContentPane().add(lblLiquidSolid);

		JLabel lblMelting = new JLabel("Melting");
		lblMelting.setForeground(Color.RED);
		lblMelting.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblMelting.setBounds(6, 327, 104, 32);
		getContentPane().add(lblMelting);

		JLabel lblaCommonChange = new JLabel(
				"<html>A common change we deal with, a solid will convert to liquid so the atoms become more mobile.");
		lblaCommonChange.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaCommonChange.setBounds(6, 363, 230, 51);
		getContentPane().add(lblaCommonChange);

		JLabel lblSolidLiquid = new JLabel("Solid -> Liquid\r\n");
		lblSolidLiquid.setForeground(Color.BLUE);
		lblSolidLiquid.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblSolidLiquid.setBounds(32, 419, 101, 23);
		getContentPane().add(lblSolidLiquid);

		JLabel lblVaporization = new JLabel("Vaporization");
		lblVaporization.setForeground(Color.RED);
		lblVaporization.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblVaporization.setBounds(467, 327, 132, 32);
		getContentPane().add(lblVaporization);

		JLabel lblaChangeFrom = new JLabel(
				"<html>A change from liquid to gas and it can come in two forms, evaporation or boiling. Atoms will become more free");
		lblaChangeFrom.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaChangeFrom.setBounds(467, 363, 230, 51);
		getContentPane().add(lblaChangeFrom);

		JLabel lblLiquidGas = new JLabel("Liquid -> Gas\r\n");
		lblLiquidGas.setForeground(Color.BLUE);
		lblLiquidGas.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblLiquidGas.setBounds(493, 419, 101, 23);
		getContentPane().add(lblLiquidGas);

		JLabel lab1 = new JLabel();
		lab1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\right.png"));
		lab1.setBounds(572, 441, 61, 51);
		getContentPane().add(lab1);

		JLabel lab2 = new JLabel();
		lab2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\left.png"));
		lab2.setBounds(455, 441, 49, 51);
		getContentPane().add(lab2);

		JLabel lblEvaporation = new JLabel("Evaporation");
		lblEvaporation.setForeground(Color.RED);
		lblEvaporation.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblEvaporation.setBounds(405, 492, 132, 32);
		getContentPane().add(lblEvaporation);

		JLabel lblBoiling = new JLabel("Boiling");
		lblBoiling.setForeground(Color.RED);
		lblBoiling.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblBoiling.setBounds(582, 492, 132, 32);
		getContentPane().add(lblBoiling);

		JLabel lblvaporizationAtSurface = new JLabel("<html>Vaporization at surface of liquid");
		lblvaporizationAtSurface.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblvaporizationAtSurface.setBounds(403, 521, 101, 42);
		getContentPane().add(lblvaporizationAtSurface);

		JLabel lblvaporizationAtSurface_1 = new JLabel("<html>Vaporization at surface of liquid as well as within");
		lblvaporizationAtSurface_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblvaporizationAtSurface_1.setBounds(572, 521, 101, 51);
		getContentPane().add(lblvaporizationAtSurface_1);

		JLabel lblCondensation = new JLabel("Condensation");
		lblCondensation.setForeground(Color.RED);
		lblCondensation.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblCondensation.setBounds(715, 327, 132, 32);
		getContentPane().add(lblCondensation);

		JLabel lbloppositeOfVaporization = new JLabel(
				"<html>Opposite of vaporization so from gas to liquid and occurs when less heat is added and molecules are more packed");
		lbloppositeOfVaporization.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbloppositeOfVaporization.setBounds(715, 363, 230, 51);
		getContentPane().add(lbloppositeOfVaporization);

		JLabel lblGasLiquid = new JLabel("Gas -> Liquid");
		lblGasLiquid.setForeground(Color.BLUE);
		lblGasLiquid.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblGasLiquid.setBounds(741, 419, 101, 23);
		getContentPane().add(lblGasLiquid);

		JLabel lblSublimation = new JLabel("Sublimation");
		lblSublimation.setForeground(Color.RED);
		lblSublimation.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblSublimation.setBounds(715, 453, 132, 32);
		getContentPane().add(lblSublimation);

		JLabel lblfromSolidTo = new JLabel(
				"<html>From solid to gas and skips the liquid phase and happens when it is heated to extreme temperartures.");
		lblfromSolidTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblfromSolidTo.setBounds(715, 489, 230, 51);
		getContentPane().add(lblfromSolidTo);

		JLabel lblSolidGas = new JLabel("Solid -> Gas");
		lblSolidGas.setForeground(Color.BLUE);
		lblSolidGas.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblSolidGas.setBounds(741, 545, 101, 23);
		getContentPane().add(lblSolidGas);

		JLabel lblDeposition = new JLabel("Deposition");
		lblDeposition.setForeground(Color.RED);
		lblDeposition.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblDeposition.setBounds(6, 453, 132, 32);
		getContentPane().add(lblDeposition);

		JLabel lblfromGasTo = new JLabel(
				"<html>From gas to solid and this is when the molecules go from extreme movement to densly packed and less heat should be added.");
		lblfromGasTo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblfromGasTo.setBounds(6, 489, 249, 51);
		getContentPane().add(lblfromGasTo);

		JLabel lblGasSolid = new JLabel("Gas -> Solid");
		lblGasSolid.setForeground(Color.BLUE);
		lblGasSolid.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblGasSolid.setBounds(32, 545, 101, 23);
		getContentPane().add(lblGasSolid);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(1067, 636);
		setLocation(300, 100);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
