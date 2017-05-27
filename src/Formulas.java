import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;
import java.util.*;
import java.util.logging.Handler;
import studentHub.PhysicsCalculators.*;

import java.net.URI;

public class Formulas extends JFrame {
	JLabel sh;
	JTextField input;

	public Formulas() {
		super("Formulas Bank");
		getContentPane().setBackground(Color.GREEN);

		getContentPane().setLayout(null);

		JLabel calibur = new JLabel("Formulas & Resources\r\n");
		calibur.setBounds(236, 5, 471, 42);
		calibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		getContentPane().add(calibur);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 45, 923, 361);
		getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Math Formulas", null, panel, null);
		panel.setLayout(null);

		JLabel lblVolumeOfSphere = new JLabel("<html>\r\nVolume of Sphere = (4/3)\r\n\r\n" + "\u03C0" + ("r^3"));
		lblVolumeOfSphere.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblVolumeOfSphere.setBounds(10, 11, 203, 18);
		panel.add(lblVolumeOfSphere);

		JLabel lblRRadius = new JLabel("<html>\r\nr = radius\r\n");
		lblRRadius.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblRRadius.setBounds(56, 31, 80, 18);
		panel.add(lblRRadius);

		JLabel lblNewLabel_1 = new JLabel("v = volume (units^3)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(56, 49, 114, 14);
		panel.add(lblNewLabel_1);

		JLabel lblSurfaceAreaOf = new JLabel("<html>\r\nSurface Area of Sphere = 4" + "\u03C0" + "r^2");
		lblSurfaceAreaOf.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSurfaceAreaOf.setBounds(10, 67, 213, 18);
		panel.add(lblSurfaceAreaOf);

		JLabel label_5 = new JLabel("<html>\r\nr = radius\r\n");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_5.setBounds(56, 87, 80, 18);
		panel.add(label_5);

		JLabel lblSaunits = new JLabel("SA = (units^2)\r\n");
		lblSaunits.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblSaunits.setBounds(56, 105, 114, 14);
		panel.add(lblSaunits);

		JLabel lblVolumeOfCylinder = new JLabel("<html>\r\nVolume of Cylinder = " + "\u03C0" + "(r^2)h");
		lblVolumeOfCylinder.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblVolumeOfCylinder.setBounds(10, 127, 213, 18);
		panel.add(lblVolumeOfCylinder);

		JLabel label_6 = new JLabel("<html>\r\nr = radius\r\n");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_6.setBounds(56, 146, 80, 18);
		panel.add(label_6);

		JLabel label_7 = new JLabel("v = volume (units^3)");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_7.setBounds(56, 164, 114, 14);
		panel.add(label_7);

		JLabel lblSurfaceAreaOf_1 = new JLabel(
				"<html>\r\nSurface Area of Cylinder = (2" + "\u03C0" + "(r^2)) + " + "((1/3)" + "\u03C0" + "rh");
		lblSurfaceAreaOf_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSurfaceAreaOf_1.setBounds(10, 184, 315, 18);
		panel.add(lblSurfaceAreaOf_1);

		JLabel label_8 = new JLabel("<html>\r\nr = radius\r\n");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_8.setBounds(56, 201, 80, 18);
		panel.add(label_8);

		JLabel lblHHeight_1 = new JLabel("<html>\r\nh = height\r\n\r\n");
		lblHHeight_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHHeight_1.setBounds(186, 156, 80, 18);
		panel.add(lblHHeight_1);

		JLabel label_9 = new JLabel("SA = (units^2)\r\n");
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_9.setBounds(56, 218, 114, 14);
		panel.add(label_9);

		JLabel label_10 = new JLabel("<html>\r\nh = height\r\n\r\n");
		label_10.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_10.setBounds(186, 215, 80, 18);
		panel.add(label_10);

		JLabel lblCombinationsFormula = new JLabel("<html>\r\nCombinations Formula = (n!) / ((n-r)! * (r!))\r\n");
		lblCombinationsFormula.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCombinationsFormula.setBounds(10, 240, 303, 18);
		panel.add(lblCombinationsFormula);

		JLabel lblNTotal = new JLabel("<html>\r\nn = total\r\n\r\n");
		lblNTotal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNTotal.setBounds(56, 258, 80, 18);
		panel.add(lblNTotal);

		JLabel lblRExtract = new JLabel("<html>\r\nr = extract\r\n");
		lblRExtract.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblRExtract.setBounds(56, 275, 80, 18);
		panel.add(lblRExtract);

		JLabel lblPermutationsFormula = new JLabel("<html>\r\nPermutations Formula = (n!) / ((n-r)! \r\n");
		lblPermutationsFormula.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPermutationsFormula.setBounds(291, 15, 244, 18);
		panel.add(lblPermutationsFormula);

		JLabel label_11 = new JLabel("<html>\r\nn = total\r\n\r\n");
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_11.setBounds(351, 34, 80, 18);
		panel.add(label_11);

		JLabel label_12 = new JLabel("<html>\r\nr = extract\r\n");
		label_12.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_12.setBounds(351, 49, 80, 18);
		panel.add(label_12);

		JLabel lblArithmeticSeries = new JLabel("<html>\r\nArithmetic Series = aN = a0 =(n-1)*d\r\n");
		lblArithmeticSeries.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblArithmeticSeries.setBounds(291, 71, 244, 18);
		panel.add(lblArithmeticSeries);

		JLabel lblAnTerm = new JLabel("<html>\r\naN = term \r\n\r\n");
		lblAnTerm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAnTerm.setBounds(351, 90, 80, 18);
		panel.add(lblAnTerm);

		JLabel lblNNumber = new JLabel("<html>\r\nn = number of terms\r\n\r\n");
		lblNNumber.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNNumber.setBounds(351, 105, 106, 18);
		panel.add(lblNNumber);

		JLabel lblDDifference = new JLabel("<html>\r\nd = difference\r\n\r\n\r\n");
		lblDDifference.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDDifference.setBounds(351, 119, 106, 18);
		panel.add(lblDDifference);

		JLabel lblGeometricSeries = new JLabel("<html>\r\nGeometric Series = a0 * r^(n-1)\r\n");
		lblGeometricSeries.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGeometricSeries.setBounds(331, 149, 244, 18);
		panel.add(lblGeometricSeries);

		JLabel label_13 = new JLabel("<html>\r\nn = number of terms\r\n\r\n");
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_13.setBounds(351, 164, 106, 18);
		panel.add(label_13);

		JLabel lblRRatio = new JLabel("<html>\r\nr = ratio\r\n\r\n\r\n");
		lblRRatio.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblRRatio.setBounds(351, 180, 106, 18);
		panel.add(lblRRatio);

		JLabel lblAFirst = new JLabel("<html>\r\na0 = first term\r\n\r\n\r\n\r\n");
		lblAFirst.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAFirst.setBounds(351, 195, 106, 18);
		panel.add(lblAFirst);

		JLabel lblSumOfArithmetic = new JLabel("<html>\r\nSum of Arithmetic Series = ((a1+aN)*n)/2\r\n");
		lblSumOfArithmetic.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSumOfArithmetic.setBounds(331, 218, 270, 18);
		panel.add(lblSumOfArithmetic);

		JLabel lblAFirst_1 = new JLabel("<html>\r\na1 = first term\r\n\r\n\r\n\r\n");
		lblAFirst_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAFirst_1.setBounds(351, 271, 106, 18);
		panel.add(lblAFirst_1);

		JLabel lblNNumber_1 = new JLabel("n = number of terms");
		lblNNumber_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNNumber_1.setBounds(351, 256, 106, 18);
		panel.add(lblNNumber_1);

		JLabel lblAnNth = new JLabel("<html>\r\naN = nth term\r\n\r\n");
		lblAnNth.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAnNth.setBounds(351, 240, 106, 18);
		panel.add(lblAnNth);

		JLabel lblMidpointFormula = new JLabel("<html>\r\nMidpoint Formula  = ((x1+x2)/2), ((y1+y2)/2)\r\n");
		lblMidpointFormula.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMidpointFormula.setBounds(568, 15, 293, 18);
		panel.add(lblMidpointFormula);

		JLabel lblDistanceFormula = new JLabel("<html>\r\nDistance Formula = sqrt((x2-x1)^2 + (y2-y1)^2)\r\n");
		lblDistanceFormula.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDistanceFormula.setBounds(568, 49, 340, 18);
		panel.add(lblDistanceFormula);

		JLabel lblQuadraticFormula = new JLabel("<html>\r\nQuadratic Formula = -b +/- sqrt(b^2-(4*a*c)) / 2a");
		lblQuadraticFormula.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblQuadraticFormula.setBounds(568, 90, 340, 18);
		panel.add(lblQuadraticFormula);

		JLabel lblLawOfSines = new JLabel("<html>\r\nLaw of Sines = sinA/a = sinB/b = sinC/c");
		lblLawOfSines.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLawOfSines.setBounds(568, 131, 340, 18);
		panel.add(lblLawOfSines);

		JLabel lblLawOfCosines = new JLabel("<html>\r\nLaw of Cosines = a^2 = b^2 + c^2 -2*b*c*cosA");
		lblLawOfCosines.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLawOfCosines.setBounds(568, 164, 340, 18);
		panel.add(lblLawOfCosines);

		JLabel lblPythagoreanIdentity = new JLabel("<html>\r\nPythagorean Identity = (sinA)^2 + (cosA)^2 = 1");
		lblPythagoreanIdentity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPythagoreanIdentity.setBounds(568, 244, 340, 18);
		panel.add(lblPythagoreanIdentity);

		tabbedPane.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		tabbedPane.setFont(new Font("Times New Roman", Font.ITALIC, 15));

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Physics", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel table = new JLabel();
		table.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\table.PNG"));
		table.setBounds(628, 168, 259, 150);
		panel_1.add(table);

		JLabel formula = new JLabel();
		formula.setForeground(Color.LIGHT_GRAY);
		formula.setBackground(Color.LIGHT_GRAY);
		formula.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\form.PNG"));
		formula.setBounds(268, 109, 77, 43);
		panel_1.add(formula);

		JLabel formula2 = new JLabel();
		formula2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\form2.PNG"));
		formula2.setBounds(268, 182, 77, 43);
		panel_1.add(formula2);

		JLabel formula3 = new JLabel();
		formula3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\form3.PNG"));
		formula3.setBounds(245, 256, 100, 43);
		panel_1.add(formula3);

		JLabel label = new JLabel("<html>\r\nVelocity = d / t\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(10, 11, 103, 18);
		panel_1.add(label);

		JLabel lblVmsD = new JLabel("<html>\r\nv=(m/s)\r\nd = (m)\r\nt = (s)\r\n");
		lblVmsD.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblVmsD.setBounds(31, 31, 45, 48);
		panel_1.add(lblVmsD);

		JLabel lblNewLabel = new JLabel("\u0394");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(123, 75, 14, 29);
		panel_1.add(lblNewLabel);

		JLabel lblAcceleration = new JLabel("Acceleration = ");
		lblAcceleration.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAcceleration.setBounds(10, 86, 103, 18);
		panel_1.add(lblAcceleration);

		JLabel lblV = new JLabel("v");
		lblV.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblV.setBounds(134, 76, 14, 29);
		panel_1.add(lblV);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(120, 100, 24, 11);
		panel_1.add(separator);

		JLabel lblT = new JLabel("t\r\n");
		lblT.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblT.setBounds(130, 98, 14, 29);
		panel_1.add(lblT);

		JLabel lblAms = new JLabel("<html>\r\na = (m/s^2)\r\n");
		lblAms.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAms.setBounds(31, 109, 77, 18);
		panel_1.add(lblAms);

		JLabel lblvVelocity_1 = new JLabel("<html>\r\n\u0394v = velocity change [v1-v2] (m/s)\r\n");
		lblvVelocity_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblvVelocity_1.setBounds(31, 127, 190, 18);
		panel_1.add(lblvVelocity_1);

		JLabel lblTs = new JLabel("<html>\r\n    v = velocity (m/s)\r\n");
		lblTs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTs.setBounds(31, 227, 103, 18);
		panel_1.add(lblTs);

		JLabel lblMomentum = new JLabel("Momentum = p =mv");
		lblMomentum.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMomentum.setBounds(10, 175, 138, 18);
		panel_1.add(lblMomentum);

		JLabel lblPMomentum = new JLabel(
				"<html>\r\np = momentum (kg*m/s)\r\nm = mass (kg)                               ");
		lblPMomentum.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPMomentum.setBounds(31, 196, 131, 29);
		panel_1.add(lblPMomentum);

		JLabel lblTs_1 = new JLabel("<html>\r\nt = (s)\r\n");
		lblTs_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTs_1.setBounds(31, 146, 31, 18);
		panel_1.add(lblTs_1);

		JLabel lblForceF = new JLabel("Force = F = ma");
		lblForceF.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblForceF.setBounds(10, 256, 138, 18);
		panel_1.add(lblForceF);

		JLabel lblFForce = new JLabel(
				"<html>\r\nF = force (N)\r\nm = mass (kg)\r\na = (m/s^2)                               ");
		lblFForce.setToolTipText("");
		lblFForce.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblFForce.setBounds(31, 275, 77, 43);
		panel_1.add(lblFForce);

		JLabel lblPowerWt = new JLabel("Power = W/t");
		lblPowerWt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPowerWt.setBounds(225, 15, 87, 18);
		panel_1.add(lblPowerWt);

		JLabel lblPowerInWatts = new JLabel("<html>\r\nPower in WATTS (W)\r\nW= work (J)\r\n");
		lblPowerInWatts.setToolTipText("");
		lblPowerInWatts.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPowerInWatts.setBounds(235, 33, 123, 29);
		panel_1.add(lblPowerInWatts);

		JLabel label_1 = new JLabel("<html>\r\nt = (s)\r\n");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(240, 61, 31, 18);
		panel_1.add(label_1);

		JLabel lblActualMechanicalAdvantage = new JLabel("Actual Mechanical Advantage");
		lblActualMechanicalAdvantage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblActualMechanicalAdvantage.setBounds(225, 86, 200, 18);
		panel_1.add(lblActualMechanicalAdvantage);

		JLabel lblIdealMechanicalAdvantage = new JLabel("Ideal Mechanical Advantage");
		lblIdealMechanicalAdvantage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblIdealMechanicalAdvantage.setBounds(225, 163, 200, 18);
		panel_1.add(lblIdealMechanicalAdvantage);

		JLabel lblEffeciency = new JLabel("Effeciency\r\n");
		lblEffeciency.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEffeciency.setBounds(225, 230, 200, 18);
		panel_1.add(lblEffeciency);

		JLabel lblKineticEnergy = new JLabel("Kinetic Energy = (1/2)*m*(v^2)");
		lblKineticEnergy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKineticEnergy.setBounds(429, 15, 215, 18);
		panel_1.add(lblKineticEnergy);

		JLabel lblKineticEnergy_1 = new JLabel("Kinetic Energy = J\r\n");
		lblKineticEnergy_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblKineticEnergy_1.setBounds(451, 33, 123, 18);
		panel_1.add(lblKineticEnergy_1);

		JLabel lblMMasskg = new JLabel("m = mass(kg)");
		lblMMasskg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblMMasskg.setBounds(451, 50, 77, 18);
		panel_1.add(lblMMasskg);

		JLabel lblVVelocity = new JLabel("<html>\r\nv = velocity (m/s)");
		lblVVelocity.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblVVelocity.setBounds(451, 67, 123, 18);
		panel_1.add(lblVVelocity);

		JLabel lblPotentialEnergy = new JLabel("Potential Energy = mgh");
		lblPotentialEnergy.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPotentialEnergy.setBounds(443, 93, 168, 18);
		panel_1.add(lblPotentialEnergy);

		JLabel label_2 = new JLabel("m = mass(kg)");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_2.setBounds(463, 109, 77, 18);
		panel_1.add(label_2);

		JLabel lblGGravity = new JLabel("<html>\r\ng = gravity (9.8m/s)");
		lblGGravity.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblGGravity.setBounds(463, 125, 123, 18);
		panel_1.add(lblGGravity);

		JLabel lblHHeight = new JLabel("<html>\r\nh = height (m)");
		lblHHeight.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHHeight.setBounds(463, 145, 123, 18);
		panel_1.add(lblHHeight);

		JLabel lblPressureP = new JLabel("Pressure = P = F/A");
		lblPressureP.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPressureP.setBounds(435, 175, 168, 18);
		panel_1.add(lblPressureP);

		JLabel lblPPressure = new JLabel("<html>\r\nP = pressure (Pa)\r\nF = force (N)                              ");
		lblPPressure.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPPressure.setBounds(455, 196, 94, 29);
		panel_1.add(lblPPressure);

		JLabel lblAArea = new JLabel("<html>\r\na = area (m^2)\r\n");
		lblAArea.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAArea.setBounds(455, 225, 77, 18);
		panel_1.add(lblAArea);

		JLabel lblWorkW = new JLabel("Work = w = Fd");
		lblWorkW.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblWorkW.setBounds(429, 250, 168, 18);
		panel_1.add(lblWorkW);

		JLabel lblWWork = new JLabel(
				"<html>\r\nw = work (J)\r\nF = force (N)\r\nd = dist. (m)                              ");
		lblWWork.setToolTipText("");
		lblWWork.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWWork.setBounds(458, 275, 70, 43);
		panel_1.add(lblWWork);

		JLabel lblDensity = new JLabel("Density = m / V");
		lblDensity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDensity.setBounds(664, 15, 110, 18);
		panel_1.add(lblDensity);

		JLabel lblDgml = new JLabel("D = (g/mL)");
		lblDgml.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDgml.setBounds(674, 33, 70, 18);
		panel_1.add(lblDgml);

		JLabel lblMMassg = new JLabel("m = mass(g)");
		lblMMassg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblMMassg.setBounds(674, 52, 77, 18);
		panel_1.add(lblMMassg);

		JLabel lblVVolumeml = new JLabel("<html>\r\nv = volume(mL)\r\n");
		lblVVolumeml.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblVVolumeml.setBounds(674, 67, 100, 18);
		panel_1.add(lblVVolumeml);

		JLabel lblWeightMg = new JLabel("Weight = mg");
		lblWeightMg.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblWeightMg.setBounds(631, 93, 110, 18);
		panel_1.add(lblWeightMg);

		JLabel label_3 = new JLabel("m = mass(g)");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_3.setBounds(651, 127, 77, 18);
		panel_1.add(label_3);

		JLabel lblWNewtonsn = new JLabel("w = newtons(N)");
		lblWNewtonsn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWNewtonsn.setBounds(651, 112, 87, 18);
		panel_1.add(lblWNewtonsn);

		JLabel label_4 = new JLabel("<html>\r\ng = gravity (9.8m/s)");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_4.setBounds(651, 140, 123, 18);
		panel_1.add(label_4);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Chemistry", null, panel_2, null);
		tabbedPane.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		panel_2.setLayout(null);

		JLabel label_15 = new JLabel();
		label_15.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\thing.PNG"));
		label_15.setBounds(10, 11, 498, 307);
		panel_2.add(label_15);

		JLabel label_16 = new JLabel();
		label_16.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\ions.PNG"));
		label_16.setBounds(532, 11, 173, 287);
		panel_2.add(label_16);

		JLabel lblNewLabel_2 = new JLabel("Periodic Table");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(12, 5, 95, 22);
		panel_2.add(lblNewLabel_2);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Trig Table", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel tt1 = new JLabel();
		tt1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\tt1.PNG"));
		tt1.setBounds(10, 0, 262, 310);
		panel_5.add(tt1);

		JLabel tt2 = new JLabel();
		tt2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\T.PNG"));
		tt2.setBounds(282, 9, 252, 301);
		panel_5.add(tt2);

		JLabel tt3 = new JLabel();
		tt3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\tt3.PNG"));
		tt3.setBounds(544, 9, 252, 301);
		panel_5.add(tt3);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Conversions", null, panel_3, null);
		tabbedPane.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		panel_3.setLayout(null);

		JLabel pic = new JLabel();
		pic.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\chart.jpg"));
		pic.setBounds(419, 37, 489, 244);
		panel_3.add(pic);

		JLabel lblNewLabel_3 = new JLabel("Mass");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(10, 11, 65, 19);
		panel_3.add(lblNewLabel_3);

		JLabel lblGrams = new JLabel("Grams");
		lblGrams.setForeground(Color.BLUE);
		lblGrams.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGrams.setBounds(10, 37, 65, 19);
		panel_3.add(lblGrams);

		JLabel lblKilograms = new JLabel("Kilograms");
		lblKilograms.setForeground(Color.BLUE);
		lblKilograms.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblKilograms.setBounds(109, 37, 65, 19);
		panel_3.add(lblKilograms);

		JLabel lblMilligrams = new JLabel("Milligrams");
		lblMilligrams.setForeground(Color.BLUE);
		lblMilligrams.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMilligrams.setBounds(10, 61, 65, 19);
		panel_3.add(lblMilligrams);

		JLabel lblPunds = new JLabel("Pounds");
		lblPunds.setForeground(Color.BLUE);
		lblPunds.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPunds.setBounds(109, 61, 65, 19);
		panel_3.add(lblPunds);

		JLabel lblOunces = new JLabel("Ounces");
		lblOunces.setForeground(Color.BLUE);
		lblOunces.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblOunces.setBounds(10, 86, 65, 19);
		panel_3.add(lblOunces);

		JButton btnNewButton = new JButton("Automatic Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Conversions c = new Conversions();
				c.newClass();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 264, 156, 34);
		panel_3.add(btnNewButton);

		JLabel lblThisIsA = new JLabel(
				"<html>This is a converter that can deal with mass, volume, temperature. This is by Calibur");
		lblThisIsA.setForeground(Color.BLUE);
		lblThisIsA.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblThisIsA.setBounds(176, 250, 232, 68);
		panel_3.add(lblThisIsA);

		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblVolume.setBounds(10, 116, 65, 19);
		panel_3.add(lblVolume);

		JLabel lblPints = new JLabel("Pints");
		lblPints.setForeground(Color.MAGENTA);
		lblPints.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPints.setBounds(10, 142, 65, 19);
		panel_3.add(lblPints);

		JLabel lblQuarts = new JLabel("Quarts");
		lblQuarts.setForeground(Color.MAGENTA);
		lblQuarts.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblQuarts.setBounds(10, 166, 65, 19);
		panel_3.add(lblQuarts);

		JLabel lblLiter = new JLabel("Liter");
		lblLiter.setForeground(Color.MAGENTA);
		lblLiter.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLiter.setBounds(10, 191, 65, 19);
		panel_3.add(lblLiter);

		JLabel lblCups = new JLabel("Cups");
		lblCups.setForeground(Color.MAGENTA);
		lblCups.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCups.setBounds(109, 142, 65, 19);
		panel_3.add(lblCups);

		JLabel lblGallon = new JLabel("Gallon");
		lblGallon.setForeground(Color.MAGENTA);
		lblGallon.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblGallon.setBounds(109, 166, 65, 19);
		panel_3.add(lblGallon);

		JLabel lblMilliliter = new JLabel("Milliliter");
		lblMilliliter.setForeground(Color.MAGENTA);
		lblMilliliter.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMilliliter.setBounds(109, 191, 65, 19);
		panel_3.add(lblMilliliter);

		JLabel lblLength = new JLabel("Length");
		lblLength.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblLength.setBounds(199, 73, 65, 19);
		panel_3.add(lblLength);

		JLabel lblFeet = new JLabel("Feet");
		lblFeet.setForeground(Color.RED);
		lblFeet.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFeet.setBounds(199, 99, 65, 19);
		panel_3.add(lblFeet);

		JLabel lblMiles = new JLabel("Miles");
		lblMiles.setForeground(Color.RED);
		lblMiles.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMiles.setBounds(199, 123, 65, 19);
		panel_3.add(lblMiles);

		JLabel lblKilometer = new JLabel("Kilometer");
		lblKilometer.setForeground(Color.RED);
		lblKilometer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblKilometer.setBounds(199, 148, 65, 19);
		panel_3.add(lblKilometer);

		JLabel lblMilimeter = new JLabel("Milimeter");
		lblMilimeter.setForeground(Color.RED);
		lblMilimeter.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMilimeter.setBounds(298, 148, 65, 19);
		panel_3.add(lblMilimeter);

		JLabel lblMeter = new JLabel("Meter");
		lblMeter.setForeground(Color.RED);
		lblMeter.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMeter.setBounds(298, 123, 65, 19);
		panel_3.add(lblMeter);

		JLabel lblInches = new JLabel("Inches");
		lblInches.setForeground(Color.RED);
		lblInches.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblInches.setBounds(298, 99, 65, 19);
		panel_3.add(lblInches);

		JLabel lblFurlong = new JLabel("Furlong");
		lblFurlong.setForeground(Color.RED);
		lblFurlong.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFurlong.setBounds(243, 169, 65, 19);
		panel_3.add(lblFurlong);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Unit Circle", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel uc = new JLabel();
		uc.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\uc.PNG"));
		uc.setBounds(58, 11, 366, 296);
		panel_4.add(uc);

	}

	public void newClass() {

		setSize(959, 456);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
