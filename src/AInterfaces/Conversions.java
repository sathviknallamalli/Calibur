package AInterfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Machines.Audio;
import studentHub.Conversions.LengthConversions;

public class Conversions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversions window = new Conversions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	Connection connection1 = null;
	private JTable table;
	String s;
	String m;
	private JTextField l1;
	private JTextField m1;
	private JTextField t1;
	private JTextField v1;
	private JComboBox length1;
	private JTextField c1;

	/**
	 * Create the application.
	 */
	public Conversions() {
		connection = sqliteConnection.c();
		connection1 = sqliteConnection.c();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calibur Converter");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 812, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		JLabel label_2 = new JLabel("Conversions\r\n");
		label_2.setFont(new Font("Castellar", Font.PLAIN, 34));
		label_2.setBounds(253, 11, 274, 42);
		frame.getContentPane().add(label_2);

		JLabel lbldetermineIfYou = new JLabel(
				"<html>Determine if you want to convert length, mass, volume, etc and begin in that area. From there enter the parameters.");
		lbldetermineIfYou.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lbldetermineIfYou.setBounds(69, 52, 642, 23);
		frame.getContentPane().add(lbldetermineIfYou);

		JLabel label_1 = new JLabel("Length Converter");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_1.setBounds(23, 86, 115, 23);
		frame.getContentPane().add(label_1);

		l1 = new JTextField();
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		l1.setColumns(10);
		l1.setBounds(23, 120, 115, 32);
		frame.getContentPane().add(l1);

		String[] length = { "Inches", "Feet", "Yard", "Furlong", "Mile", "Millimeter", "Centimeter", "Decimeter",
				"Meter", "Decameter", "Hectameter", "Kilometer" };

		length1 = new JComboBox(length);
		length1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		length1.setBounds(23, 161, 87, 23);
		frame.getContentPane().add(length1);

		JLabel label_3 = new JLabel("-->");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_3.setBounds(120, 160, 24, 23);
		frame.getContentPane().add(label_3);

		JComboBox length2 = new JComboBox(length);
		length2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		length2.setBounds(156, 161, 87, 23);
		frame.getContentPane().add(length2);

		JLabel label_4 = new JLabel("FROM");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_4.setBounds(23, 195, 51, 23);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("TO");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_5.setBounds(156, 195, 51, 23);
		frame.getContentPane().add(label_5);

		JLabel lengthResult = new JLabel("");
		lengthResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		lengthResult.setBounds(10, 253, 272, 32);
		frame.getContentPane().add(lengthResult);

		JButton button = new JButton("Convert!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String param1 = (String) length1.getSelectedItem();
				String param2 = (String) length2.getSelectedItem();

				double a = Double.parseDouble(l1.getText());

				if (param1 == "Feet" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Feet" && param2 == "Yard") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Inches" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Yard" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.YardsToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Yard" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.YardsToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Inches" && param2 == "Yard") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Mile" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Mile" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Mile" && param2 == "Yard") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Yard" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.YardsToMile(a);
					lengthResult.setText(result + " Mile");
				} else if (param1 == "Feet" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToMile(a);
					lengthResult.setText(result + " Mile");
				} else if (param1 == "Inches" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToMile(a);
					lengthResult.setText(result + " Mile");
				} else if (param1 == "Furlong" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Furlong" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Furlong" && param2 == "Yard") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Inches" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToFurlong(a);
					lengthResult.setText(result + " Furlong");
				} else if (param1 == "Feet" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToFurlong(a);
					lengthResult.setText(result + " Furlong");
				} else if (param1 == "Yard" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.YardsToFurlong(a);
					lengthResult.setText(result + " Furlong");
				}
				// METER
				else if (param1 == "Meter" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Meter" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Meter" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Meter" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Meter" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Meter" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				}
				// DECIEMETER
				else if (param1 == "Decimeter" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Decimeter" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Decimeter" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Decimeter" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == "Decimeter" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Decimeter" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				}
				// CENTIMETER
				else if (param1 == "Centimeter" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Centimeter" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Centimeter" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Centimeter" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Centimeter" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == "Centimeter" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				}
				// MILLIMETER
				else if (param1 == "Millimeter" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Millimeter" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Millimeter" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Millimeter" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Millimeter" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Millimeter" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				}
				// DECAMETER
				else if (param1 == "Decameter" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Decameter" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Decameter" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Decameter" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Decameter" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Decameter" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				}
				// HECTAMETER
				else if (param1 == "Hectameter" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Hectameter" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Hectameter" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Hectameter" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Hectameter" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToDecameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Hectameter" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				}
				// KILOMETER
				else if (param1 == "Kilometer" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Kilometer" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Kilometer" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Kilometer" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Kilometer" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Kilometer" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				}

				else if (param1 == "Kilometer" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToFeet(a);
					lengthResult.setText(result + " Feets");
				} else if (param1 == "Kilometer" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Kilometer" && param2 == "Yard") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Kilometer" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToFurlong(a);
					lengthResult.setText(result + " Furlongs");
				} else if (param1 == "Hectameter" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToFeet(a);
					lengthResult.setText(result + " Feets");
				} else if (param1 == "Hectameter" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Hectameter" && param2 == "Yards") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Hectameter" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToFurlong(a);
					lengthResult.setText(result + " Furlongs");
				} else if (param1 == "Decameter" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToFeet(a);
					lengthResult.setText(result + " Feets");
				} else if (param1 == "Decameter" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Decameter" && param2 == "Yards") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Decameter" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToFurlong(a);
					lengthResult.setText(result + " Furlongs");
				} else if (param1 == "Meter" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Meter" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Meter" && param2 == "Yards") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Meter" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToFurlong(a);
					lengthResult.setText(result + " Furlong");
				} else if (param1 == "Decimeter" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Decimeter" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Decimeter" && param2 == "Yards") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Centimeter" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Centimeter" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Centimeter" && param2 == "Yard") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Centimeter" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToFurlong(a);
					lengthResult.setText(result + " Furlongs");
				} else if (param1 == "Millimeter" && param2 == "Feet") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToFeet(a);
					lengthResult.setText(result + " Feet");
				} else if (param1 == "Millimeter" && param2 == "Inches") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToInches(a);
					lengthResult.setText(result + " Inches");
				} else if (param1 == "Millimeter" && param2 == "Yards") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToYards(a);
					lengthResult.setText(result + " Yards");
				} else if (param1 == "Millimeter" && param2 == "Furlong") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToFurlong(a);
					lengthResult.setText(result + " Furlongs");
				} else if (param1 == "Kilometer" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.KilometerToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Hectameter" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.HectameterToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Decameter" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.DecameterToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Meter" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.MeterToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Decimeter" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.DecimeterToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Centimeter" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.CentimeterToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Millimeter" && param2 == "Mile") {
					LengthConversions s = new LengthConversions();
					double result = s.MillimeterToMile(a);
					lengthResult.setText(result + " Miles");
				} else if (param1 == "Inches" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToMillimeter(a);
					lengthResult.setText(result + " Millimeter");
				} else if (param1 == "Inches" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Inches" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Inches" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Inches" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Inches" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Inches" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.InchesToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == "Feet" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Feet" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Feet" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Feet" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Feet" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Feet" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Feet" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.FeetToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == "Yard" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Yard" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Yard" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Yard" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Yard" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Yard" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Yard" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.YardToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == "Furlong" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Furlong" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Furlong" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Furlong" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Furlong" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Furlong" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Furlong" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.FurlongToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == "Mile" && param2 == "Millimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToMillimeter(a);
					lengthResult.setText(result + " Millimeters");
				} else if (param1 == "Mile" && param2 == "Centimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToCentimeter(a);
					lengthResult.setText(result + " Centimeters");
				} else if (param1 == "Mile" && param2 == "Decimeter") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToDecimeter(a);
					lengthResult.setText(result + " Decimeters");
				} else if (param1 == "Mile" && param2 == "Meter") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToMeter(a);
					lengthResult.setText(result + " Meters");
				} else if (param1 == "Mile" && param2 == "Decameter") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToDecameter(a);
					lengthResult.setText(result + " Decameters");
				} else if (param1 == "Mile" && param2 == "Hectameter") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToHectameter(a);
					lengthResult.setText(result + " Hectameters");
				} else if (param1 == "Mile" && param2 == "Kilometer") {
					LengthConversions s = new LengthConversions();
					double result = s.MileToKilometer(a);
					lengthResult.setText(result + " Kilometers");
				} else if (param1 == param2) {
					lengthResult.setText("Invalid parameters");
				}

			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button.setBounds(69, 218, 115, 32);
		frame.getContentPane().add(button);

		JLabel label_6 = new JLabel("Mass Converter");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_6.setBounds(501, 86, 115, 23);
		frame.getContentPane().add(label_6);

		m1 = new JTextField();
		m1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		m1.setColumns(10);
		m1.setBounds(501, 120, 115, 32);
		frame.getContentPane().add(m1);

		String[] weight = { "Pound", "Ounce", "Gram", "Kilograms", "Milligram", "Decagram", "Ton" };

		JComboBox mass1 = new JComboBox(weight);
		mass1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mass1.setBounds(501, 161, 87, 23);
		frame.getContentPane().add(mass1);

		JLabel label_7 = new JLabel("-->");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_7.setBounds(598, 160, 24, 23);
		frame.getContentPane().add(label_7);

		JComboBox mass2 = new JComboBox(weight);
		mass2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		mass2.setBounds(632, 161, 80, 23);
		frame.getContentPane().add(mass2);

		JLabel label_8 = new JLabel("FROM");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_8.setBounds(501, 195, 51, 23);
		frame.getContentPane().add(label_8);

		JLabel label_9 = new JLabel("TO");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_9.setBounds(632, 195, 51, 23);
		frame.getContentPane().add(label_9);

		JLabel massResult = new JLabel("");
		massResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		massResult.setBounds(488, 253, 272, 32);
		frame.getContentPane().add(massResult);

		JButton button_1 = new JButton("Convert!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String param1 = (String) mass1.getSelectedItem();
				String param2 = (String) mass2.getSelectedItem();

				double a = Double.parseDouble(m1.getText());

				// POUND TO ANYTHING
				if (param1 == "Pound" && param2 == "Ounce") {
					double result = a * 16;
					massResult.setText(result + " Ounces");
				} else if (param1 == "Pound" && param2 == "Gram") {
					double result = a * 453.592;
					massResult.setText(result + " Gram");
				} else if (param1 == "Pound" && param2 == "Kilograms") {
					double result = a * .453592;
					massResult.setText(result + " Kilograms");
				} else if (param1 == "Pound" && param2 == "Milligram") {
					double result = a * 453592;
					massResult.setText(result + " Milligrams");
				} else if (param1 == "Pound" && param2 == "Decagram") {
					double result = a * 45.3592;
					massResult.setText(result + " Decagrams");
				} else if (param1 == "Pound" && param2 == "Ton") {
					double result = a / 2000;
					massResult.setText(result + " Tons");
				}
				// OUNCE TO ANYTHING
				else if (param1 == "Ounce" && param2 == "Pound") {
					double result = a * 0.0625;
					massResult.setText(result + " Pounds");
				} else if (param1 == "Ounce" && param2 == "Gram") {
					double result = a * 28.3495;
					massResult.setText(result + " Grams");
				} else if (param1 == "Ounce" && param2 == "Kilograms") {
					double result = a * .0283495;
					massResult.setText(result + " Kilograms");
				} else if (param1 == "Ounce" && param2 == "Milligram") {
					double result = a * 28349.5;
					massResult.setText(result + " Milligrams");
				} else if (param1 == "Ounce" && param2 == "Decagram") {
					double result = a * 2.83495;
					massResult.setText(result + " Decagrams");
				} else if (param1 == "Ounce" && param2 == "Ton") {
					double result = a * .00003125;
					massResult.setText(result + " Tons");
				}
				// GRAM TO ANYTHING
				else if (param1 == "Gram" && param2 == "Pound") {
					double result = a * 0.00220462;
					massResult.setText(result + " Pounds");
				} else if (param1 == "Gram" && param2 == "Ounce") {
					double result = a * 0.035274;
					massResult.setText(result + " Ounces");
				} else if (param1 == "Gram" && param2 == "Kilograms") {
					double result = a * 0.001;
					massResult.setText(result + " Kilograms");
				} else if (param1 == "Gram" && param2 == "Milligram") {
					double result = a * 1000;
					massResult.setText(result + " Milligrams");
				} else if (param1 == "Gram" && param2 == "Decagram") {
					double result = a * .1;
					massResult.setText(result + " Decagrams");
				} else if (param1 == "Gram" && param2 == "Ton") {
					double result = a * 1.1023e-6;
					massResult.setText(result + " Tons");
				}
				// KILOGRAMS TO ANYTHING
				else if (param1 == "Kilograms" && param2 == "Pound") {
					double result = a * 2.20462;
					massResult.setText(result + " Pounds");
				} else if (param1 == "Kilograms" && param2 == "Ounce") {
					double result = a * 35.274;
					massResult.setText(result + " Ounces");
				} else if (param1 == "Kilograms" && param2 == "Gram") {
					double result = a * 1000;
					massResult.setText(result + " Grams");
				} else if (param1 == "Kilograms" && param2 == "Milligram") {
					double result = a * 1000000;
					massResult.setText(result + " Milligrams");
				} else if (param1 == "Kilograms" && param2 == "Decagram") {
					double result = a * 100;
					massResult.setText(result + " Decagrams");
				} else if (param1 == "Kilograms" && param2 == "Ton") {
					double result = a * 0.00110231;
					massResult.setText(result + " Tons");
				}
				// MILLIGRAM TO ANYTHING
				else if (param1 == "Milligram" && param2 == "Pound") {
					double result = a * 2.2046e-6;
					massResult.setText(result + " Pounds");
				} else if (param1 == "Milligram" && param2 == "Ounce") {
					double result = a * 3.5274e-5;
					massResult.setText(result + " Ounces");
				} else if (param1 == "Milligram" && param2 == "Gram") {
					double result = a * .001;
					massResult.setText(result + " Grams");
				} else if (param1 == "Milligram" && param2 == "Kilograms") {
					double result = a * 1e-6;
					massResult.setText(result + " Kilograms");
				} else if (param1 == "Milligram" && param2 == "Decagram") {
					double result = a * 1e-4;
					massResult.setText(result + " Decagrams");
				} else if (param1 == "Milligram" && param2 == "Ton") {
					double result = a * 1.1023e-9;
					massResult.setText(result + " Tons");
				}
				// DECAGRAM TO ANYTHING
				else if (param1 == "Decagram" && param2 == "Pound") {
					double result = a * 0.0220462;
					massResult.setText(result + " Pounds");
				} else if (param1 == "Decagram" && param2 == "Ounce") {
					double result = a * 0.35274;
					massResult.setText(result + " Ounces");
				} else if (param1 == "Decagram" && param2 == "Gram") {
					double result = a * 10;
					massResult.setText(result + " Grams");
				} else if (param1 == "Decagram" && param2 == "Kilograms") {
					double result = a * .01;
					massResult.setText(result + " Kilograms");
				} else if (param1 == "Decagram" && param2 == "Milligram") {
					double result = a * 10000;
					massResult.setText(result + " Milligrams");
				} else if (param1 == "Decagram" && param2 == "Ton") {
					double result = a * 1.1023e-5;
					massResult.setText(result + " Tons");
				}
				// TON TO ANYTHING
				else if (param1 == "Ton" && param2 == "Pound") {
					double result = a * 2000;
					massResult.setText(result + " Pounds");
				} else if (param1 == "Ton" && param2 == "Ounce") {
					double result = a * 32000;
					massResult.setText(result + " Ounces");
				} else if (param1 == "Ton" && param2 == "Gram") {
					double result = a * 907185;
					massResult.setText(result + " Grams");
				} else if (param1 == "Ton" && param2 == "Kilograms") {
					double result = a * 907.185;
					massResult.setText(result + " Kilograms");
				} else if (param1 == "Ton" && param2 == "Milligram") {
					double result = a * 907185003.0836;
					massResult.setText(result + " Milligrams");
				} else if (param1 == "Ton" && param2 == "Decagram") {
					double result = a * 90718.5;
					massResult.setText(result + " Decagrams");
				} else if (param1 == param2) {
					massResult.setText("Invalid parameters");
				}

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_1.setBounds(547, 218, 115, 32);
		frame.getContentPane().add(button_1);

		JLabel label_10 = new JLabel("Temperature Converter");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_10.setBounds(23, 296, 153, 23);
		frame.getContentPane().add(label_10);

		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		t1.setColumns(10);
		t1.setBounds(23, 326, 115, 32);
		frame.getContentPane().add(t1);

		String[] temps = { "Faranheit", "Celsius", "Kelvin" };

		JComboBox temp1 = new JComboBox(temps);
		temp1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		temp1.setBounds(23, 367, 87, 23);
		frame.getContentPane().add(temp1);

		JLabel label_11 = new JLabel("FROM");
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_11.setBounds(23, 401, 51, 23);
		frame.getContentPane().add(label_11);

		JComboBox temp2 = new JComboBox(temps);
		temp2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		temp2.setBounds(156, 367, 80, 23);
		frame.getContentPane().add(temp2);

		JLabel tempResult = new JLabel("");
		tempResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		tempResult.setBounds(10, 463, 296, 32);
		frame.getContentPane().add(tempResult);

		JButton button_2 = new JButton("Convert!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String param1 = (String) temp1.getSelectedItem();
				String param2 = (String) temp2.getSelectedItem();

				double a = Double.parseDouble(t1.getText());

				if (param1 == param2) {
					tempResult.setText("Invalid Parameters");
				}
				// FARANHEIT TO ANYTHING
				else if (param1 == "Faranheit" && param2 == "Celsius") {
					double result = (a - 32) * (5.0 / 9);
					tempResult.setText(result + " Degrees Celsius");
				} else if (param1 == "Faranheit" && param2 == "Kelvin") {
					double result = (a + 459.67) * (5.0 / 9);
					tempResult.setText(result + " Degrees Kelvin");
				}
				// CELSIUS TO ANYTHING
				else if (param1 == "Celsius" && param2 == "Faranheit") {
					double result = (a * (9.0 / 5)) + 32;
					tempResult.setText(result + " Degrees Faranheit");
				} else if (param1 == "Celsius" && param2 == "Kelvin") {
					double result = a + 273.15;
					tempResult.setText(result + " Degrees Kelvin");
				}
				// KELVIN TO ANYTHING
				else if (param1 == "Kelvin" && param2 == "Faranheit") {
					double result = (a * (9.0 / 5)) - 459.67;
					tempResult.setText(result + " Degrees Faranheit");
				} else if (param1 == "Kelvin" && param2 == "Celsius") {
					double result = a - 273.15;
					tempResult.setText(result + " Degrees Celsius");
				}
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_2.setBounds(69, 423, 115, 32);
		frame.getContentPane().add(button_2);

		JLabel label_12 = new JLabel("TO");
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_12.setBounds(156, 401, 51, 23);
		frame.getContentPane().add(label_12);

		JLabel label_13 = new JLabel("-->");
		label_13.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_13.setBounds(120, 366, 24, 23);
		frame.getContentPane().add(label_13);

		JLabel label_14 = new JLabel("Volume Converter");
		label_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_14.setBounds(501, 296, 125, 23);
		frame.getContentPane().add(label_14);

		v1 = new JTextField();
		v1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		v1.setColumns(10);
		v1.setBounds(501, 330, 115, 32);
		frame.getContentPane().add(v1);

		String volumes[] = { "Liter", "Gallon", "Pint", "Cup", "Fluid Ounces", "Quart", "Milliliter" };

		JComboBox vol1 = new JComboBox(volumes);
		vol1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		vol1.setBounds(501, 371, 87, 23);
		frame.getContentPane().add(vol1);

		JLabel label_15 = new JLabel("-->");
		label_15.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_15.setBounds(598, 371, 24, 23);
		frame.getContentPane().add(label_15);

		JComboBox vol2 = new JComboBox(volumes);
		vol2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		vol2.setBounds(632, 371, 80, 23);
		frame.getContentPane().add(vol2);

		JLabel label_16 = new JLabel("TO");
		label_16.setForeground(Color.RED);
		label_16.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_16.setBounds(632, 405, 51, 23);
		frame.getContentPane().add(label_16);

		JLabel label_17 = new JLabel("FROM");
		label_17.setForeground(Color.RED);
		label_17.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_17.setBounds(501, 405, 51, 23);
		frame.getContentPane().add(label_17);

		JLabel volResult = new JLabel("");
		volResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		volResult.setBounds(488, 471, 272, 32);
		frame.getContentPane().add(volResult);

		JButton button_3 = new JButton("Convert!");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String param1 = (String) vol1.getSelectedItem();
				String param2 = (String) vol2.getSelectedItem();

				double a = Double.parseDouble(v1.getText());

				if (param1 == param2) {
					volResult.setText("Invalid Parameters");
				}
				// LITER TO ANYTHING
				else if (param1 == "Liter" && param2 == "Gallon") {
					double result = a * 0.264172;
					volResult.setText(result + " Gallons");
				} else if (param1 == "Liter" && param2 == "Pint") {
					double result = a * 2.11338;
					volResult.setText(result + " Pints");
				} else if (param1 == "Liter" && param2 == "Cup") {
					double result = a * 4.16667;
					volResult.setText(result + " Cups");
				} else if (param1 == "Liter" && param2 == "Fluid Ounces") {
					double result = a * 33.814;
					volResult.setText(result + " Fluid Ounces");
				} else if (param1 == "Liter" && param2 == "Quart") {
					double result = a * 1.05669;
					volResult.setText(result + " Quarts");
				} else if (param1 == "Liter" && param2 == "Milliliter") {
					double result = a * 1000;
					volResult.setText(result + " Milliliters");
				}
				// GALLON TO ANYTHING
				else if (param1 == "Gallon" && param2 == "Liter") {
					double result = a * 3.78541;
					volResult.setText(result + " Liters");
				} else if (param1 == "Gallon" && param2 == "Pint") {
					double result = a * 8;
					volResult.setText(result + " Pints");
				} else if (param1 == "Gallon" && param2 == "Cup") {
					double result = a * 15.7725;
					volResult.setText(result + " Cups");
				} else if (param1 == "Gallon" && param2 == "Fluid Ounces") {
					double result = a * 128;
					volResult.setText(result + " Fluid Ounces");
				} else if (param1 == "Gallon" && param2 == "Quart") {
					double result = a * 4;
					volResult.setText(result + " Quarts");
				} else if (param1 == "Gallon" && param2 == "Milliliter") {
					double result = a * 3785.41;
					volResult.setText(result + " Milliliters");
				}
				// PINT TO ANYTHING
				else if (param1 == "Pint" && param2 == "Liter") {
					double result = a * 0.473176;
					volResult.setText(result + " Liters");
				} else if (param1 == "Pint" && param2 == "Gallon") {
					double result = a * 0.125;
					volResult.setText(result + " Pints");
				} else if (param1 == "Pint" && param2 == "Cup") {
					double result = a * 1.97157;
					volResult.setText(result + " Cups");
				} else if (param1 == "Pint" && param2 == "Fluid Ounces") {
					double result = a * 16;
					volResult.setText(result + " Fluid Ounces");
				} else if (param1 == "Pint" && param2 == "Quart") {
					double result = a * 0.5;
					volResult.setText(result + " Quarts");
				} else if (param1 == "Pint" && param2 == "Milliliter") {
					double result = a * 473.176;
					volResult.setText(result + " Milliliters");
				}
				// CUP TO ANYTHING
				else if (param1 == "Cup" && param2 == "Liter") {
					double result = a * 0.24;
					volResult.setText(result + " Liters");
				} else if (param1 == "Cup" && param2 == "Gallon") {
					double result = a * 0.0634013;
					volResult.setText(result + " Gallons");
				} else if (param1 == "Cup" && param2 == "Pint") {
					double result = a * 0.50721;
					volResult.setText(result + " Pints");
				} else if (param1 == "Cup" && param2 == "Fluid Ounces") {
					double result = a * 8.11537;
					volResult.setText(result + " Fluid Ounces");
				} else if (param1 == "Cup" && param2 == "Quart") {
					double result = a * 0.253605;
					volResult.setText(result + " Quarts");
				} else if (param1 == "Cup" && param2 == "Milliliter") {
					double result = a * 240;
					volResult.setText(result + " Milliliters");
				}
				// FLUID OUNCES TO ANYTHING
				else if (param1 == "Fluid Ounces" && param2 == "Liter") {
					double result = a * 0.0295735;
					volResult.setText(result + " Liters");
				} else if (param1 == "Fluid Ounces" && param2 == "Gallon") {
					double result = a * 0.0078125;
					volResult.setText(result + " Gallons");
				} else if (param1 == "Fluid Ounces" && param2 == "Pint") {
					double result = a * 0.0625;
					volResult.setText(result + " Pints");
				} else if (param1 == "Fluid Ounces" && param2 == "Cup") {
					double result = a * 0.123223;
					volResult.setText(result + " Cup");
				} else if (param1 == "Fluid Ounces" && param2 == "Quart") {
					double result = a * 0.03125;
					volResult.setText(result + " Quarts");
				} else if (param1 == "Fluid Ounces" && param2 == "Milliliter") {
					double result = a * 29.5735;
					volResult.setText(result + " Milliliters");
				}
				// QUART TO ANYTHING
				else if (param1 == "Quart" && param2 == "Liter") {
					double result = a * 0.946353;
					volResult.setText(result + " Liters");
				} else if (param1 == "Quart" && param2 == "Gallon") {
					double result = a * 0.25;
					volResult.setText(result + " Gallons");
				} else if (param1 == "Quart" && param2 == "Pint") {
					double result = a * 2;
					volResult.setText(result + " Pints");
				} else if (param1 == "Quart" && param2 == "Cup") {
					double result = a * 3.94314;
					volResult.setText(result + " Cup");
				} else if (param1 == "Quart" && param2 == "Fluid Ounces") {
					double result = a * 32;
					volResult.setText(result + " Fluid Ounces");
				} else if (param1 == "Quart" && param2 == "Milliliter") {
					double result = a * 946.353;
					volResult.setText(result + " Milliliters");
				}
				// MILLITER TO ANYTHING
				else if (param1 == "Milliliter" && param2 == "Liter") {
					double result = a * 0.001;
					volResult.setText(result + " Liters");
				} else if (param1 == "Milliliter" && param2 == "Gallon") {
					double result = a * 0.000264172;
					volResult.setText(result + " Gallons");
				} else if (param1 == "Milliliter" && param2 == "Pint") {
					double result = a * 0.00211338;
					volResult.setText(result + " Pints");
				} else if (param1 == "Milliliter" && param2 == "Cup") {
					double result = a * 0.00416667;
					volResult.setText(result + " Cup");
				} else if (param1 == "Milliliter" && param2 == "Fluid Ounces") {
					double result = a * 0.033814;
					volResult.setText(result + " Fluid Ounces");
				} else if (param1 == "Milliliter" && param2 == "Quart") {
					double result = a * 0.00105669;
					volResult.setText(result + " Quarts");
				}
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_3.setBounds(564, 428, 115, 32);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("Activate Calibur!");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Conversions.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(541, 18, 132, 23);
		frame.getContentPane().add(button_4);

		JButton btnFormulasPage = new JButton("Formulas Page");
		btnFormulasPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Formulas f = new Formulas();
				f.newClass();
			}
		});
		btnFormulasPage.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnFormulasPage.setBounds(290, 463, 201, 32);
		frame.getContentPane().add(btnFormulasPage);

		JLabel lblCurrencyConverter = new JLabel("Currency Converter\r\n\r\n");
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblCurrencyConverter.setBounds(260, 204, 143, 23);
		frame.getContentPane().add(lblCurrencyConverter);

		c1 = new JTextField();
		c1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		c1.setColumns(10);
		c1.setBounds(260, 234, 115, 32);
		frame.getContentPane().add(c1);

		String[] currency = { "Dollar", "Euros", "Pounds", "Rupee", "Wons", "Renminbi", "Yen", "Peso" };

		JComboBox cur1 = new JComboBox(currency);
		cur1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		cur1.setBounds(260, 278, 87, 23);
		frame.getContentPane().add(cur1);

		JLabel label = new JLabel("-->");
		label.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label.setBounds(357, 277, 24, 23);
		frame.getContentPane().add(label);

		JComboBox cur2 = new JComboBox(currency);
		cur2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		cur2.setBounds(391, 278, 80, 23);
		frame.getContentPane().add(cur2);

		JLabel label_18 = new JLabel("FROM");
		label_18.setForeground(Color.RED);
		label_18.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_18.setBounds(260, 312, 51, 23);
		frame.getContentPane().add(label_18);

		JLabel curResult = new JLabel("strhstehsrt");
		curResult.setFont(new Font("Tahoma", Font.BOLD, 14));
		curResult.setBounds(260, 378, 272, 32);
		frame.getContentPane().add(curResult);

		JButton button_5 = new JButton("Convert!");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String param1 = (String) cur1.getSelectedItem();
				String param2 = (String) cur2.getSelectedItem();

				double a = Double.parseDouble(c1.getText());

				if (param1 == param2) {
					curResult.setText("Invalid Parameters");
				}
				// String[] currency = { "Dollar", "Euros", "Pounds", "Rupee",
				// "Wons", "Renminbi", "Yen", "Peso" };
				// DOLLAR TO ANYTHING
				else if (param1 == "Dollar" && param2 == "Euros") {
					double result = a * .94;
					curResult.setText(result + " Euros");
				} else if (param1 == "Dollar" && param2 == "Pounds") {
					double result = a * .8;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Dollar" && param2 == "Rupee") {
					double result = a * 64.47;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Dollar" && param2 == "Wons") {
					double result = a * 1136.34;
					curResult.setText(result + " Wons");
				} else if (param1 == "Dollar" && param2 == "Renminbi") {
					double result = a * 6.89;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Dollar" && param2 == "Yen") {
					double result = a * 108.64;
					curResult.setText(result + " Yen");
				} else if (param1 == "Dollar" && param2 == "Peso") {
					double result = a * 18.51;
					curResult.setText(result + " Pesos");
				}
				// EUROS TO ANYTHING
				else if (param1 == "Euros" && param2 == "Dollar") {
					double result = a * 1.06;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Euros" && param2 == "Pounds") {
					double result = a * .85;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Euros" && param2 == "Rupee") {
					double result = a * 68.42;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Euros" && param2 == "Wons") {
					double result = a * 1206.05;
					curResult.setText(result + " Wons");
				} else if (param1 == "Euros" && param2 == "Renminbi") {
					double result = a * 7.31;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Euros" && param2 == "Yen") {
					double result = a * 115.31;
					curResult.setText(result + " Yen");
				} else if (param1 == "Euros" && param2 == "Peso") {
					double result = a * 19.65;
					curResult.setText(result + " Pesos");
				}
				// POUNDS TO ANYTHING
				else if (param1 == "Pounds" && param2 == "Dollar") {
					double result = a * 1.25;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Pounds" && param2 == "Euros") {
					double result = a * 1.18;
					curResult.setText(result + " Euros");
				} else if (param1 == "Pounds" && param2 == "Rupee") {
					double result = a * 80.73;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Pounds" && param2 == "Wons") {
					double result = a * 1422.93;
					curResult.setText(result + " Wons");
				} else if (param1 == "Pounds" && param2 == "Renminbi") {
					double result = a * 8.62;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Pounds" && param2 == "Yen") {
					double result = a * 136.04;
					curResult.setText(result + " Yen");
				} else if (param1 == "Pounds" && param2 == "Peso") {
					double result = a * 23.18;
					curResult.setText(result + " Pesos");
				}
				// RUPEE TO ANYTHING
				else if (param1 == "Rupee" && param2 == "Dollar") {
					double result = a * .016;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Rupee" && param2 == "Euros") {
					double result = a * .015;
					curResult.setText(result + " Euros");
				} else if (param1 == "Rupee" && param2 == "Pounds") {
					double result = a * .012;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Rupee" && param2 == "Wons") {
					double result = a * 17.63;
					curResult.setText(result + " Wons");
				} else if (param1 == "Rupee" && param2 == "Renminbi") {
					double result = a * .11;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Rupee" && param2 == "Yen") {
					double result = a * 1.69;
					curResult.setText(result + " Yen");
				} else if (param1 == "Rupee" && param2 == "Peso") {
					double result = a * .29;
					curResult.setText(result + " Pesos");
				}
				// WON TO ANYTHING
				else if (param1 == "Wons" && param2 == "Dollar") {
					double result = a * 0.00088;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Wons" && param2 == "Euros") {
					double result = a * 0.00083;
					curResult.setText(result + " Euros");
				} else if (param1 == "Wons" && param2 == "Pounds") {
					double result = a * 0.00070;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Wons" && param2 == "Rupee") {
					double result = a * 0.057;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Wons" && param2 == "Renminbi") {
					double result = a * 0.0061;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Wons" && param2 == "Yen") {
					double result = a * 0.096;
					curResult.setText(result + " Yen");
				} else if (param1 == "Wons" && param2 == "Peso") {
					double result = a * 0.016;
					curResult.setText(result + " Pesos");
				}
				// Renminbi TO ANYTHING
				else if (param1 == "Renminbi" && param2 == "Dollar") {
					double result = a * 0.15;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Renminbi" && param2 == "Euros") {
					double result = a * 0.14;
					curResult.setText(result + " Euros");
				} else if (param1 == "Renminbi" && param2 == "Pounds") {
					double result = a * 0.12;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Renminbi" && param2 == "Rupee") {
					double result = a * 9.36;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Renminbi" && param2 == "Wons") {
					double result = a * 165.04;
					curResult.setText(result + " Wons");
				} else if (param1 == "Renminbi" && param2 == "Yen") {
					double result = a * 15.78;
					curResult.setText(result + " Yen");
				} else if (param1 == "Renminbi" && param2 == "Peso") {
					double result = a * 2.69;
					curResult.setText(result + " Pesos");
				}
				// YEN TO ANYTHING
				else if (param1 == "Yen" && param2 == "Dollar") {
					double result = a * 0.0092;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Yen" && param2 == "Euros") {
					double result = a * 0.0087;
					curResult.setText(result + " Euros");
				} else if (param1 == "Yen" && param2 == "Pounds") {
					double result = a * 0.0074;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Yen" && param2 == "Rupee") {
					double result = a * 0.59;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Yen" && param2 == "Wons") {
					double result = a * 10.46;
					curResult.setText(result + " Wons");
				} else if (param1 == "Yen" && param2 == "Renminbi") {
					double result = a * 0.063;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Yen" && param2 == "Peso") {
					double result = a * 0.17;
					curResult.setText(result + " Pesos");
				}
				// PESO TO ANYTHING
				else if (param1 == "Peso" && param2 == "Dollar") {
					double result = a * 0.054;
					curResult.setText(result + " Dollars");
				} else if (param1 == "Peso" && param2 == "Euros") {
					double result = a * 0.051;
					curResult.setText(result + " Euros");
				} else if (param1 == "Peso" && param2 == "Pounds") {
					double result = a * 0.043;
					curResult.setText(result + " Pounds");
				} else if (param1 == "Peso" && param2 == "Rupee") {
					double result = a * 3.48;
					curResult.setText(result + " Rupees");
				} else if (param1 == "Peso" && param2 == "Wons") {
					double result = a * 61.39;
					curResult.setText(result + " Wons");
				} else if (param1 == "Peso" && param2 == "Renminbi") {
					double result = a * 0.37;
					curResult.setText(result + " Renminbis");
				} else if (param1 == "Peso" && param2 == "Yen") {
					double result = a * 5.87;
					curResult.setText(result + " Yens");
				}

			}
		});
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		button_5.setBounds(300, 335, 115, 32);
		frame.getContentPane().add(button_5);

		JLabel label_19 = new JLabel("TO");
		label_19.setForeground(Color.RED);
		label_19.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_19.setBounds(391, 312, 51, 23);
		frame.getContentPane().add(label_19);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\arrow.png"));
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_20.setBounds(239, 120, 24, 375);
		frame.getContentPane().add(label_20);

		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\arrow.png"));
		label_21.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_21.setBounds(467, 120, 24, 375);
		frame.getContentPane().add(label_21);

		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\harrow.png"));
		label_22.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_22.setBounds(0, 280, 250, 18);
		frame.getContentPane().add(label_22);

		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\harrow.png"));
		label_23.setFont(new Font("Times New Roman", Font.BOLD, 14));
		label_23.setBounds(476, 280, 250, 18);
		frame.getContentPane().add(label_23);

	}

	public void newClass() {

		frame.setSize(frame.getSize());
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
