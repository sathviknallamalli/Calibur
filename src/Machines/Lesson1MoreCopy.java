package Machines;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson1MoreCopy extends JFrame {
	public Lesson1MoreCopy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 1 - In - Depth About Simple Machines\r\n");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(207, 11, 543, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Work ");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Wheel and Axle\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 135, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>Lets go back to our bicycle example, it is made up of a wheel and axle which allows the wheel to turn and let you move forward. The wheel revolves around the axle and can be connected to a massive object ot let it movie. Below are some examples of wheel and axle. The axle can convert its force to a large output\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 615, 48);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Levers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LeversCopy l = new LeversCopy();
				l.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setBounds(688, 593, 245, 67);
		getContentPane().add(btnNewButton);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JLabel lblDoorKnob = new JLabel("Record Player\r\n");
		lblDoorKnob.setForeground(Color.BLUE);
		lblDoorKnob.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDoorKnob.setBounds(329, 153, 86, 23);
		getContentPane().add(lblDoorKnob);

		JLabel lblCeilingFans = new JLabel("Ceiling Fans");
		lblCeilingFans.setForeground(Color.BLUE);
		lblCeilingFans.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCeilingFans.setBounds(488, 153, 86, 23);
		getContentPane().add(lblCeilingFans);

		JLabel lblRollingPins = new JLabel("Rolling Pins");
		lblRollingPins.setForeground(Color.BLUE);
		lblRollingPins.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRollingPins.setBounds(643, 153, 74, 23);
		getContentPane().add(lblRollingPins);

		JLabel lbltheStickThat = new JLabel(
				"<html>The stick that attaches to the record player, allows the record to play and revolves around, thus creating a wheel and axle.");
		lbltheStickThat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheStickThat.setBounds(311, 177, 129, 96);
		getContentPane().add(lbltheStickThat);

		JLabel lbltheRodFrom = new JLabel(
				"<html>The rod from ceiling to the fan rotates and it is connected to the blades on the wheel and rotate a big wheel, causing the big breeze. ");
		lbltheRodFrom.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheRodFrom.setBounds(470, 177, 129, 96);
		getContentPane().add(lbltheRodFrom);

		JLabel lblthePushpinHas = new JLabel(
				"<html>The pushpin, has a small metal end attached to the plastic end and acts as the axle to attach to the wall. ");
		lblthePushpinHas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthePushpinHas.setBounds(621, 177, 129, 80);
		getContentPane().add(lblthePushpinHas);

		JLabel lblRopeAndPulley = new JLabel("Rope and Pulley");
		lblRopeAndPulley.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblRopeAndPulley.setBounds(21, 276, 135, 32);
		getContentPane().add(lblRopeAndPulley);

		JLabel lblitIsBasically = new JLabel(
				"<html>It is basically a wheel and axle that has a rope attached to it that powers it and the rope allows the pulley to pull the object on the end of the rope and is used to lift heavy things or far below.\r\n");
		lblitIsBasically.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblitIsBasically.setBounds(21, 310, 507, 32);
		getContentPane().add(lblitIsBasically);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\WheelandAxle.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(474, 68, 132, 23);
		getContentPane().add(button);

		JLabel lblElevator = new JLabel("Elevator\r\n");
		lblElevator.setForeground(Color.BLUE);
		lblElevator.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblElevator.setBounds(31, 345, 58, 23);
		getContentPane().add(lblElevator);

		JLabel lblWells = new JLabel("Wells");
		lblWells.setForeground(Color.BLUE);
		lblWells.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWells.setBounds(174, 345, 58, 23);
		getContentPane().add(lblWells);

		JLabel lblanElevatorHas = new JLabel(
				"<html>An elevator has a heavy metal cable from the top that uses a pulley and can lift the elevator box to different floors.");
		lblanElevatorHas.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblanElevatorHas.setBounds(21, 370, 123, 96);
		getContentPane().add(lblanElevatorHas);

		JLabel lbltoGetWater = new JLabel(
				"<html>To get water from the bottom of wells, a bucket is on the end of the rope and by pulling on the pulley, the bucket will fill ");
		lbltoGetWater.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltoGetWater.setBounds(163, 370, 123, 96);
		getContentPane().add(lbltoGetWater);

		JLabel lblGears = new JLabel("Gears");
		lblGears.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblGears.setBounds(571, 284, 135, 32);
		getContentPane().add(lblGears);

		JLabel lblaWheelThat = new JLabel(
				"<html>A wheel that has teeth and using its force can alter the speed of a machine. A combination of gears power the wheels together and can make it go faster.\r\n");
		lblaWheelThat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaWheelThat.setBounds(571, 312, 362, 48);
		getContentPane().add(lblaWheelThat);

		JLabel lblBicycle = new JLabel("Bicycle\r\n");
		lblBicycle.setForeground(Color.BLUE);
		lblBicycle.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBicycle.setBounds(571, 368, 58, 23);
		getContentPane().add(lblBicycle);

		JLabel lblClocks = new JLabel("Clocks\r\n");
		lblClocks.setForeground(Color.BLUE);
		lblClocks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblClocks.setBounds(753, 367, 58, 23);
		getContentPane().add(lblClocks);

		JLabel lblaGearBike = new JLabel(
				"<html>A gear bike can change its gears that will make the wheel go faster but you need to work harder, and vice versa. ");
		lblaGearBike.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblaGearBike.setBounds(571, 390, 123, 96);
		getContentPane().add(lblaGearBike);

		JLabel lbltheHandsOn = new JLabel(
				"<html>The hands on the clock move based on gears, as each tooth of the gear moves, the second hand, minute, and hour hand move. ");
		lbltheHandsOn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheHandsOn.setBounds(753, 390, 123, 96);
		getContentPane().add(lbltheHandsOn);

		JLabel lblRamp = new JLabel("Ramp - Inclined Plane\r\n");
		lblRamp.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblRamp.setBounds(21, 475, 200, 32);
		getContentPane().add(lblRamp);

		JLabel lblitWillAllow = new JLabel(
				"<html>It will allow an object to be slid across and go another level rather than being lifted and requires less work. ");
		lblitWillAllow.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblitWillAllow.setBounds(21, 506, 578, 16);
		getContentPane().add(lblitWillAllow);

		JLabel lblWedge = new JLabel("Wedge");
		lblWedge.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblWedge.setBounds(21, 527, 200, 32);
		getContentPane().add(lblWedge);

		JLabel lblbasicallyARamp = new JLabel(
				"<html>Basically a ramp turned to its side and allows things to be lifted and taken to a higher level ");
		lblbasicallyARamp.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblbasicallyARamp.setBounds(21, 558, 479, 16);
		getContentPane().add(lblbasicallyARamp);

		JLabel lblLeverClass = new JLabel("Lever - Class 1, Class 2, Class 3");
		lblLeverClass.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblLeverClass.setBounds(21, 579, 279, 32);
		getContentPane().add(lblLeverClass);

		JLabel lblthisIsBy = new JLabel(
				"<html>This is by far the most complex. There are 3 parts to a lever, the load, which is what is being lifted, the fulcrum which is what the plane rests on, and the effort is where force is applied to. The different classes of the levers change based on the arrangment and different uses. Continue to the next page for more information on the lever.");
		lblthisIsBy.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisIsBy.setBounds(21, 609, 637, 60);
		getContentPane().add(lblthisIsBy);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\RopeandPulley.wav");
				Audio.PlaySound(Clap);

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(168, 284, 132, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Gear.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(632, 284, 132, 23);
		getContentPane().add(button_2);

		JButton button_3 = new JButton("Activate Calibur!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Ramp.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(219, 483, 132, 23);
		getContentPane().add(button_3);

		JButton button_4 = new JButton("Activate Calibur!");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Wedge.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(97, 533, 132, 23);
		getContentPane().add(button_4);

		JButton button_5 = new JButton("Activate Calibur!");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Lever.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_5.setBounds(295, 585, 132, 23);
		getContentPane().add(button_5);

		JCheckBox checkBox = new JCheckBox("Lesson 4 - Evaluating Machines");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 154, 215, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Energy & Machines\r\n");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 180, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 6 - Practice Problems\r\n");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(6, 208, 215, 23);
		getContentPane().add(checkBox_2);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(973, 719);
		setLocation(300, 0);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
