
import javax.swing.*;

import PhysicsTopics.*;
import AlgebraTopics.*;
import GeometryTopics.*;
import java.awt.*;

import java.awt.event.*;

import java.io.IOException;
import java.net.URISyntaxException;

import ProbabilityTopics.*;
import TrigTopics.LawOfSines;

public class HWHELP {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private final Action action_7 = new SwingAction_7();
	private final Action action_8 = new SwingAction_8();
	private final Action action_9 = new SwingAction_9();
	private final Action action_10 = new SwingAction_10();
	private final Action action_11 = new SwingAction_11();
	private final Action action_12 = new SwingAction_12();
	private final Action action_13 = new SwingAction_13();
	private final Action action_14 = new SwingAction_14();
	private final Action action_15 = new SwingAction_15();
	private final Action action_16 = new SwingAction_16();
	private final Action action_17 = new SwingAction_17();
	private final Action action_19 = new SwingAction_18();
	private final Action action_18 = new SwingAction_19();
	private final Action action_20 = new SwingAction_20();
	private final Action action_21 = new SwingAction_21();
	private final Action action_22 = new SwingAction_22();
	private final Action action_23 = new SwingAction_23();
	private final Action action_25 = new SwingAction_25();
	private final Action action_26 = new SwingAction_26();
	private final Action action_27 = new SwingAction_27();
	private final Action action_28 = new SwingAction_28();
	private final Action action_29 = new SwingAction_29();
	private final Action action_30 = new SwingAction_30();
	private final Action action_31 = new SwingAction_31();
	private final Action action_32 = new SwingAction_32();
	private final Action action_33 = new SwingAction_33();
	private final Action action_34 = new SwingAction_34();
	private final Action action_35 = new SwingAction_35();
	private final Action action_36 = new SwingAction_36();
	private final Action action_37 = new SwingAction_37();
	private final Action action_38 = new SwingAction_38();
	private final Action action_39 = new SwingAction_39();
	private final Action action_40 = new SwingAction_40();
	private final Action action_41 = new SwingAction_41();
	private final Action action_42 = new SwingAction_42();
	private final Action action_24 = new SwingAction_24();

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HWHELP window = new HWHELP();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HWHELP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Homework Help and Resources");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 50, 800, 643);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel title = new JLabel("Homework Help / Resources");
		title.setFont(new Font("Castellar", Font.PLAIN, 34));
		title.setBounds(97, 9, 593, 47);
		frame.getContentPane().add(title);

		JLabel info = new JLabel(
				"Above in the menu list are the subjects that have calculators and you can choose the topic of interest. Below are some common topics that are difficult.");
		info.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		info.setBounds(31, 56, 720, 23);
		frame.getContentPane().add(info);

		JLabel rInfo = new JLabel(
				"There are also some common useful tools that can be used for subjects such as a trig table, unit circle, physics formula sheet and more");
		rInfo.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		rInfo.setBounds(31, 77, 780, 30);
		frame.getContentPane().add(rInfo);

		JLabel mRes = new JLabel("Math Resources");
		mRes.setBackground(new Color(0, 204, 0));
		mRes.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mRes.setBounds(43, 143, 113, 23);
		frame.getContentPane().add(mRes);

		JLabel lblPhysicsResources = new JLabel("Physics Resources");
		lblPhysicsResources.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPhysicsResources.setBackground(new Color(0, 204, 0));
		lblPhysicsResources.setBounds(247, 143, 113, 23);
		frame.getContentPane().add(lblPhysicsResources);

		JLabel lblChemistryResources = new JLabel("Chemistry Resources");
		lblChemistryResources.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblChemistryResources.setBackground(new Color(0, 204, 0));
		lblChemistryResources.setBounds(433, 143, 128, 23);
		frame.getContentPane().add(lblChemistryResources);

		JLabel lblConversionResources = new JLabel("Conversion Resources");
		lblConversionResources.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblConversionResources.setBackground(new Color(0, 204, 0));
		lblConversionResources.setBounds(615, 143, 136, 23);
		frame.getContentPane().add(lblConversionResources);

		JButton main = new JButton("Back to Main Page");
		main.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		main.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		main.setAction(action_27);

		main.setBounds(135, 549, 174, 23);
		frame.getContentPane().add(main);

		JButton btnFormulasPage = new JButton("Formulas Page\r\n");
		btnFormulasPage.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFormulasPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Formulas f = new Formulas();
				f.newClass();
			}
		});
		btnFormulasPage.setBounds(319, 549, 174, 23);
		frame.getContentPane().add(btnFormulasPage);

		JLabel lblLinksToHelp = new JLabel("Links to Help\r\n");
		lblLinksToHelp.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblLinksToHelp.setBackground(new Color(0, 204, 0));
		lblLinksToHelp.setBounds(10, 175, 79, 16);
		frame.getContentPane().add(lblLinksToHelp);

		JLabel lblUnitCircle = new JLabel(
				"<html>Unit Circle - This webpage will allow you to explore the Unit Circle more, and in  the Formulas Page there is some theory about it provided by Calibur.\r\n");
		lblUnitCircle.setForeground(Color.BLUE);
		lblUnitCircle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblUnitCircle.setBackground(new Color(0, 204, 0));
		lblUnitCircle.setBounds(20, 200, 219, 64);
		frame.getContentPane().add(lblUnitCircle);

		JButton btnUnitCircle = new JButton("Unit Circle\r\n");
		btnUnitCircle.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnUnitCircle.setAction(action_30);

		btnUnitCircle.setBounds(43, 270, 174, 23);
		frame.getContentPane().add(btnUnitCircle);

		JLabel lbltrigonometricFunction = new JLabel(
				"<html>Trigonometric Function - When you need to calculate the function of an angle and you dont have a calculator, the Trig Table will come in great need, which is also in the formulas page\r\n");
		lbltrigonometricFunction.setForeground(Color.BLUE);
		lbltrigonometricFunction.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltrigonometricFunction.setBackground(new Color(0, 204, 0));
		lbltrigonometricFunction.setBounds(20, 302, 219, 80);
		frame.getContentPane().add(lbltrigonometricFunction);

		JButton btnTrigTable = new JButton("Trig Table");
		btnTrigTable.setAction(action_31);
		btnTrigTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnTrigTable.setBounds(43, 387, 174, 23);
		frame.getContentPane().add(btnTrigTable);

		JLabel lblprimeNumbersCan = new JLabel(
				"<html>Prime Numbers can come in handy when solving word problems, so here is a list of all the prime numbers up to 1000");
		lblprimeNumbersCan.setForeground(Color.BLUE);
		lblprimeNumbersCan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblprimeNumbersCan.setBackground(new Color(0, 204, 0));
		lblprimeNumbersCan.setBounds(20, 421, 219, 47);
		frame.getContentPane().add(lblprimeNumbersCan);

		JButton button = new JButton("Trig Table");
		button.setAction(action_32);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button.setBounds(43, 472, 174, 23);
		frame.getContentPane().add(button);

		JButton btnConverterByCalibur = new JButton("Converter by Calibur");
		btnConverterByCalibur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Conversions s = new Conversions();
				s.newClass();
			}
		});
		btnConverterByCalibur.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnConverterByCalibur.setBounds(616, 177, 158, 23);
		frame.getContentPane().add(btnConverterByCalibur);

		JButton btnChartGenerator = new JButton("Chart Generator");
		btnChartGenerator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Chart c = new Chart();
				c.newClass();
			}
		});
		btnChartGenerator.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnChartGenerator.setBounds(505, 549, 174, 23);
		frame.getContentPane().add(btnChartGenerator);

		JLabel lblunitCircle = new JLabel(
				"<html>Periodic Table - All 118 Elements are expressed in this elegant Periodic Table and you can learn about the history here.\r\n");
		lblunitCircle.setForeground(Color.BLUE);
		lblunitCircle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblunitCircle.setBackground(new Color(0, 204, 0));
		lblunitCircle.setBounds(431, 175, 167, 89);
		frame.getContentPane().add(lblunitCircle);

		JButton btnPeriodicTable = new JButton("Periodic Table\r\n");
		btnPeriodicTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arguments = { "1", "2", "3" };
				String website = "https://en.wikipedia.org/wiki/Periodic_table";
				try {
					Browser.main(arguments, website);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPeriodicTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnPeriodicTable.setBounds(431, 270, 174, 23);
		frame.getContentPane().add(btnPeriodicTable);

		JLabel lblthisContainsCommon = new JLabel(
				"<html>This contains common tables regarding the formulas you would use and unit conversions that you need.");
		lblthisContainsCommon.setForeground(Color.BLUE);
		lblthisContainsCommon.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisContainsCommon.setBackground(new Color(0, 204, 0));
		lblthisContainsCommon.setBounds(244, 177, 167, 72);
		frame.getContentPane().add(lblthisContainsCommon);

		JButton btnPhsyicsReferences = new JButton("Phsyics References");
		btnPhsyicsReferences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arguments = { "1", "2", "3" };
				String website = "http://www.ncpublicschools.org/docs/accountability/common-exams/physics-reference.pdf";
				try {
					Browser.main(arguments, website);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPhsyicsReferences.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnPhsyicsReferences.setBounds(244, 249, 174, 23);
		frame.getContentPane().add(btnPhsyicsReferences);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		// contents of math
		JMenu math = new JMenu("Mathematics");
		math.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		menuBar.add(math);
		// algebra contents
		JMenu mnAlgebra = new JMenu("Algebra");
		mnAlgebra.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mnAlgebra);

		JMenuItem mntmSystemOfEquations = new JMenuItem("System of Equations");
		mntmSystemOfEquations.setAction(action_1);
		mntmSystemOfEquations.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmSystemOfEquations);

		JMenuItem mntmInequalities = new JMenuItem("Inequalities");
		mntmInequalities.setAction(action_2);
		mntmInequalities.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmInequalities);

		JMenuItem mntmWordProblems = new JMenuItem("Word Problems");
		mntmWordProblems.setAction(action_3);
		mntmWordProblems.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmWordProblems);

		JMenuItem mntmGraphing = new JMenuItem("Graphing");
		mntmGraphing.setAction(action_4);
		mntmGraphing.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmGraphing);

		JMenuItem mntmQuadratics = new JMenuItem("Quadratics");
		mntmQuadratics.setAction(action_5);
		mntmQuadratics.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmQuadratics);

		JMenuItem mntmExponentsPowers = new JMenuItem("Exponents & Powers");
		mntmExponentsPowers.setAction(action_6);
		mntmExponentsPowers.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmExponentsPowers);

		JMenuItem mntmRationalEquations = new JMenuItem("Rational Equations");
		mntmRationalEquations.setAction(action_7);
		mntmRationalEquations.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmRationalEquations);

		JMenuItem mntmPolynomials = new JMenuItem("Polynomials");
		mntmPolynomials.setAction(action_8);
		mntmPolynomials.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAlgebra.add(mntmPolynomials);

		JMenu mnGeometry = new JMenu("Geometry");
		mnGeometry.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mnGeometry);

		JMenuItem mntmHypotnuese = new JMenuItem("Hypotnuese Calculator");
		mntmHypotnuese.setAction(action_12);
		mntmHypotnuese.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnGeometry.add(mntmHypotnuese);

		JMenuItem mntmVolumeCalculator = new JMenuItem("Volume Calculator\r\n");
		mntmVolumeCalculator.setAction(action_33);
		mntmVolumeCalculator.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnGeometry.add(mntmVolumeCalculator);

		JMenu mnAreas = new JMenu("Areas");
		mnAreas.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnGeometry.add(mnAreas);

		JMenuItem mntmTriangle = new JMenuItem("Triangle");
		mntmTriangle.setAction(action_35);
		mntmTriangle.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAreas.add(mntmTriangle);

		JMenuItem mntmCircle = new JMenuItem("Circle");
		mntmCircle.setAction(action_36);
		mntmCircle.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnAreas.add(mntmCircle);

		JMenu mnSurfaceArea = new JMenu("Surface Area");
		mnSurfaceArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnGeometry.add(mnSurfaceArea);

		JMenuItem mntmSphere_1 = new JMenuItem("Sphere");
		mntmSphere_1.setAction(action_37);
		mntmSphere_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSurfaceArea.add(mntmSphere_1);

		JMenuItem mntmCylinder = new JMenuItem("Cylinder");
		mntmCylinder.setAction(action_38);
		mntmCylinder.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSurfaceArea.add(mntmCylinder);

		JMenuItem mntmCone = new JMenuItem("Cone");
		mntmCone.setAction(action_39);
		mntmCone.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSurfaceArea.add(mntmCone);

		JMenuItem mntmPrisim_1 = new JMenuItem("Rectangular Prisim");
		mntmPrisim_1.setAction(action_29);
		mntmPrisim_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSurfaceArea.add(mntmPrisim_1);

		JMenuItem mntmCube_1 = new JMenuItem("Cube");
		mntmCube_1.setAction(action_40);
		mntmCube_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSurfaceArea.add(mntmCube_1);
		// probability contents
		JMenu mnProbability = new JMenu("Probability");
		mnProbability.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mnProbability);

		JMenuItem mntmCombinations = new JMenuItem("Combinations");
		mntmCombinations.setAction(action_28);
		mntmCombinations.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnProbability.add(mntmCombinations);

		JMenuItem mntmPermutations = new JMenuItem("Permutations");
		mntmPermutations.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnProbability.add(mntmPermutations);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Chart and Data Generator");
		mntmNewMenuItem_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnProbability.add(mntmNewMenuItem_4);

		// precalc contents
		JMenuItem mntmPrecalculus = new JMenuItem("Pre-Calculus");
		mntmPrecalculus.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mntmPrecalculus);
		// algebra 2 contents
		JMenuItem mntmAlgebra = new JMenuItem("Algebra 2");
		mntmAlgebra.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mntmAlgebra);
		// calc contents
		JMenuItem mntmCalculus = new JMenuItem("Calculus");
		mntmCalculus.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mntmCalculus);
		// coord geo contents
		JMenu mnCoordinateGeometry = new JMenu("Coordinate Geometry");
		mnCoordinateGeometry.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mnCoordinateGeometry);

		JMenuItem mntmMidpoint = new JMenuItem("Midpoint");
		mntmMidpoint.setAction(action_9);
		mntmMidpoint.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnCoordinateGeometry.add(mntmMidpoint);

		JMenuItem mntmDistance = new JMenuItem("Distance");
		mntmDistance.setAction(action_21);
		mntmDistance.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnCoordinateGeometry.add(mntmDistance);

		JMenuItem mntmSlope = new JMenuItem("Slope");
		mntmSlope.setAction(action_22);
		mntmSlope.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnCoordinateGeometry.add(mntmSlope);

		JMenuItem mntmPerpendicularParallel = new JMenuItem("Perpendicular & Parallel Lines");
		mntmPerpendicularParallel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnCoordinateGeometry.add(mntmPerpendicularParallel);

		JMenuItem mntmMissingCoordinateFor = new JMenuItem("Missing Coordinate for Shapes");
		mntmMissingCoordinateFor.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnCoordinateGeometry.add(mntmMissingCoordinateFor);

		JMenuItem grapher = new JMenuItem("Graphing Utility");
		grapher.setAction(action_42);
		grapher.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnCoordinateGeometry.add(grapher);

		JMenu mnTrignometry = new JMenu("Trigonometry");
		mnTrignometry.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		math.add(mnTrignometry);

		JMenuItem mntmDegreesToRadians = new JMenuItem("Degrees To Radians Conversions");
		mntmDegreesToRadians.setAction(action_25);
		mntmDegreesToRadians.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnTrignometry.add(mntmDegreesToRadians);

		JMenuItem mntmLawOfSines = new JMenuItem("Law of Sines");
		mntmLawOfSines.setAction(action_34);
		mntmLawOfSines.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnTrignometry.add(mntmLawOfSines);

		JMenuItem mntmLawOfCosines = new JMenuItem("Law of Cosines");
		mntmLawOfCosines.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnTrignometry.add(mntmLawOfCosines);

		JMenuItem mntmRightTriangleRatios = new JMenuItem(
				"Right Triangle Ratios - SIN, COSINE, TANGENT, COSECANT, SECANT, COTANGENT");
		mntmRightTriangleRatios.setAction(action_23);
		mntmRightTriangleRatios.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnTrignometry.add(mntmRightTriangleRatios);

		JMenuItem mntmNewMenuItem = new JMenuItem("Unit Circle");
		mntmNewMenuItem.setAction(action_26);
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnTrignometry.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Trig Identities");
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnTrignometry.add(mntmNewMenuItem_1);

		// physics contents
		JMenu mnPhsyics = new JMenu("Phsyics");
		mnPhsyics.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		menuBar.add(mnPhsyics);
		// contents of Simple Machines
		JMenu mnSimpleMachines = new JMenu("Simple Machines");
		mnSimpleMachines.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnPhsyics.add(mnSimpleMachines);

		JMenuItem mntmMechanicalAdvantage = new JMenuItem("Mechanical Advantage");
		mntmMechanicalAdvantage.setAction(action_18);
		mntmMechanicalAdvantage.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSimpleMachines.add(mntmMechanicalAdvantage);

		JMenuItem mntmIdealMechanicalAdvantage = new JMenuItem("Ideal Mechanical Advantage");
		mntmIdealMechanicalAdvantage.setAction(action_20);
		mntmIdealMechanicalAdvantage.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnSimpleMachines.add(mntmIdealMechanicalAdvantage);
		// contents of motion
		JMenu mnMotion = new JMenu("Motion");
		mnMotion.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnPhsyics.add(mnMotion);

		JMenuItem mntmWork = new JMenuItem("Work");
		mntmWork.setAction(action_10);
		mntmWork.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnMotion.add(mntmWork);

		JMenuItem mntmPower = new JMenuItem("Power");
		mntmPower.setAction(action_13);
		mntmPower.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnMotion.add(mntmPower);

		JMenuItem mntmEffeciency_1 = new JMenuItem("Effeciency");
		mntmEffeciency_1.setAction(action_14);
		mntmEffeciency_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnMotion.add(mntmEffeciency_1);
		// contents of newtons laws
		JMenu mnNewtonsLaws = new JMenu("Newtons Laws");
		mnNewtonsLaws.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnPhsyics.add(mnNewtonsLaws);

		JMenuItem mntmndLaw = new JMenuItem("2nd Law");
		mntmndLaw.setAction(action_15);
		mntmndLaw.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnNewtonsLaws.add(mntmndLaw);
		// momentum
		JMenuItem mntmMomentum = new JMenuItem("Momentum");
		mntmMomentum.setAction(action_11);
		mntmMomentum.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnPhsyics.add(mntmMomentum);

		JMenu mnEnergyCalculation = new JMenu("Energy Calculation");
		mnEnergyCalculation.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		mnPhsyics.add(mnEnergyCalculation);

		JMenuItem mntmKineticEnergy = new JMenuItem("Kinetic Energy");
		mntmKineticEnergy.setAction(action_16);
		mntmKineticEnergy.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnEnergyCalculation.add(mntmKineticEnergy);

		JMenuItem mntmPotentialEnergy = new JMenuItem("Potential Energy");
		mntmPotentialEnergy.setAction(action_17);
		mntmPotentialEnergy.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnEnergyCalculation.add(mntmPotentialEnergy);

		JMenuItem mntmMechanicalEnergy = new JMenuItem("Mechanical Energy");
		mntmMechanicalEnergy.setAction(action_19);
		mntmMechanicalEnergy.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnEnergyCalculation.add(mntmMechanicalEnergy);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ohms Law");
		mntmNewMenuItem_2.setAction(action_41);
		mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnEnergyCalculation.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Parallel Circuit Resistance");
		mntmNewMenuItem_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mnEnergyCalculation.add(mntmNewMenuItem_3);

		// chemistry contents
		JMenu mnChemistry = new JMenu("Chemistry");
		mnChemistry.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		menuBar.add(mnChemistry);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Periodic Table");
		mntmNewMenuItem_5.setAction(action_24);
		mntmNewMenuItem_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mnChemistry.add(mntmNewMenuItem_5);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Equation Solver");

		}

		public void actionPerformed(ActionEvent e) {
			EquationSolver f1 = new EquationSolver();
			f1.newClass();
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "System of Equations");

		}

		public void actionPerformed(ActionEvent e) {
			SystemOfEquationsSolver f1 = new SystemOfEquationsSolver();
			f1.newClass();
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Inequalities");

		}

		public void actionPerformed(ActionEvent e) {
			Inequalities f1 = new Inequalities();
			f1.newClass();
		}
	}

	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Word Problems");

		}

		public void actionPerformed(ActionEvent e) {
			WordProblems f1 = new WordProblems();
			f1.newClass();
		}
	}

	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Graphing");

		}

		public void actionPerformed(ActionEvent e) {
			Graphing f1 = new Graphing();
			f1.newClass();
		}
	}

	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Quadratics");

		}

		public void actionPerformed(ActionEvent e) {
			Quadratics q1 = new Quadratics();
			q1.newClass();
		}
	}

	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Exponents & Powers");

		}

		public void actionPerformed(ActionEvent e) {
			ExponentsAndPowers f1 = new ExponentsAndPowers();
			f1.newClass();
		}
	}

	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Rational Equations");

		}

		public void actionPerformed(ActionEvent e) {
			RationalEquations f1 = new RationalEquations();
			f1.newClass();
		}
	}

	private class SwingAction_8 extends AbstractAction {
		public SwingAction_8() {
			putValue(NAME, "Polynomials");

		}

		public void actionPerformed(ActionEvent e) {
			Polynomials f1 = new Polynomials();
			f1.newClass();
		}
	}

	private class SwingAction_9 extends AbstractAction {
		public SwingAction_9() {
			putValue(NAME, "Midpoint");

		}

		public void actionPerformed(ActionEvent e) {
			Midpoint f1 = new Midpoint();
			f1.newClass();
		}
	}

	private class SwingAction_10 extends AbstractAction {
		public SwingAction_10() {
			putValue(NAME, "Work");

		}

		public void actionPerformed(ActionEvent e) {
			Work w = new Work();
			w.newClass();
		}
	}

	private class SwingAction_11 extends AbstractAction {
		public SwingAction_11() {
			putValue(NAME, "Momentum");

		}

		public void actionPerformed(ActionEvent e) {
			Momentum m = new Momentum();
			m.newClass();
		}
	}

	private class SwingAction_12 extends AbstractAction {
		public SwingAction_12() {
			putValue(NAME, "Hypotnuese");

		}

		public void actionPerformed(ActionEvent e) {
			Hypotnuese h = new Hypotnuese();
			h.newClass();
		}
	}

	private class SwingAction_13 extends AbstractAction {
		public SwingAction_13() {
			putValue(NAME, "Power");

		}

		public void actionPerformed(ActionEvent e) {
			Power p = new Power();
			p.newClass();
		}
	}

	private class SwingAction_14 extends AbstractAction {
		public SwingAction_14() {
			putValue(NAME, "Effeciency");

		}

		public void actionPerformed(ActionEvent e) {
			Effeciency ef = new Effeciency();
			ef.newClass();
		}
	}

	private class SwingAction_15 extends AbstractAction {
		public SwingAction_15() {
			putValue(NAME, "2nd Law");

		}

		public void actionPerformed(ActionEvent e) {
			FMA f = new FMA();
			f.newClass();
		}
	}

	private class SwingAction_16 extends AbstractAction {
		public SwingAction_16() {
			putValue(NAME, "Kinetic Energy");

		}

		public void actionPerformed(ActionEvent e) {
			KineticEnergy ke = new KineticEnergy();
			ke.newClass();
		}
	}

	private class SwingAction_17 extends AbstractAction {
		public SwingAction_17() {
			putValue(NAME, "Potential Energy");

		}

		public void actionPerformed(ActionEvent e) {
			PotentialEnergy pe = new PotentialEnergy();
			pe.newClass();
		}
	}

	private class SwingAction_18 extends AbstractAction {
		public SwingAction_18() {
			putValue(NAME, "Mechanical Energy");

		}

		public void actionPerformed(ActionEvent e) {
			MechanicalEnergy me = new MechanicalEnergy();
			me.newClass();
		}
	}

	private class SwingAction_19 extends AbstractAction {
		public SwingAction_19() {
			putValue(NAME, "Mechanical Advantage");

		}

		public void actionPerformed(ActionEvent e) {
			MechanicalAdvantage ma = new MechanicalAdvantage();
			ma.newClass();
		}
	}

	private class SwingAction_20 extends AbstractAction {
		public SwingAction_20() {
			putValue(NAME, "Ideal Mechanical Advantage");

		}

		public void actionPerformed(ActionEvent e) {
			IdealMechanicalAdvantage ima = new IdealMechanicalAdvantage();
			ima.newClass();
		}
	}

	private class SwingAction_21 extends AbstractAction {
		public SwingAction_21() {
			putValue(NAME, "Distance");

		}

		public void actionPerformed(ActionEvent e) {
			Distance d = new Distance();
			d.newClass();
		}
	}

	private class SwingAction_22 extends AbstractAction {
		public SwingAction_22() {
			putValue(NAME, "Slope");

		}

		public void actionPerformed(ActionEvent e) {
			Slope s = new Slope();
			s.newClass();
		}
	}

	private class SwingAction_23 extends AbstractAction {
		public SwingAction_23() {
			putValue(NAME, "Right Triangle Ratios - SIN, COSINE, TANGENT, COSECANT, SECANT, COTANGENT");

		}

		public void actionPerformed(ActionEvent e) {
			TrigRatios tr = new TrigRatios();
			tr.newClass();
		}
	}

	private class SwingAction_25 extends AbstractAction {
		public SwingAction_25() {
			putValue(NAME, "Degrees To Radians Conversions");

		}

		public void actionPerformed(ActionEvent e) {
			DegreesToRadiansConversions d = new DegreesToRadiansConversions();
			d.newClass();
		}
	}

	private class SwingAction_26 extends AbstractAction {
		public SwingAction_26() {
			putValue(NAME, "Unit Circle");

		}

		public void actionPerformed(ActionEvent e) {
			UnitCircle uc = new UnitCircle();
			uc.pack();
			uc.newClass();
		}
	}

	private class SwingAction_27 extends AbstractAction {
		public SwingAction_27() {
			putValue(NAME, "Back to Main Page");

		}

		public void actionPerformed(ActionEvent e) {
			Main m = new Main();
			m.setVisible(true);
			m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			m.setSize(800, 600);
		}
	}

	private class SwingAction_28 extends AbstractAction {
		public SwingAction_28() {
			putValue(NAME, "Combinations");

		}

		public void actionPerformed(ActionEvent e) {
			Combinations c = new Combinations();
			c.newClass();
		}
	}

	private class SwingAction_29 extends AbstractAction {
		public SwingAction_29() {
			putValue(NAME, "Rectangular Prisim");

		}

		public void actionPerformed(ActionEvent e) {
			RectangularPrisim rp = new RectangularPrisim();
			rp.newClass();
		}
	}

	private class SwingAction_30 extends AbstractAction {
		public SwingAction_30() {
			putValue(NAME, "Unit Circle Browser");

		}

		public void actionPerformed(ActionEvent e) {
			String[] arguments = { "1", "2", "3" };
			String website = "https://en.wikipedia.org/wiki/Unit_circle";
			try {
				Browser.main(arguments, website);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private class SwingAction_31 extends AbstractAction {
		public SwingAction_31() {
			putValue(NAME, "Trig Table");

		}

		public void actionPerformed(ActionEvent e) {
			String[] arguments = { "1", "2", "3" };
			String website = "http://math2.org/math/trig/tables.htm";
			try {
				Browser.main(arguments, website);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private class SwingAction_32 extends AbstractAction {
		public SwingAction_32() {
			putValue(NAME, "Prime Numbers");

		}

		public void actionPerformed(ActionEvent e) {
			String[] arguments = { "1", "2", "3" };
			String website = "http://www.miniwebtool.com/list-of-prime-numbers/?to=1000";
			try {
				Browser.main(arguments, website);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private class SwingAction_33 extends AbstractAction {
		public SwingAction_33() {
			putValue(NAME, "Volume Calculator");

		}

		public void actionPerformed(ActionEvent e) {
			Volumes v = new Volumes();
			v.newClass();
		}
	}

	private class SwingAction_34 extends AbstractAction {
		public SwingAction_34() {
			putValue(NAME, "Law of Sines");

		}

		public void actionPerformed(ActionEvent e) {
			LawOfSines ls = new LawOfSines();
			ls.newClass();
		}
	}

	private class SwingAction_35 extends AbstractAction {
		public SwingAction_35() {
			putValue(NAME, "Triangle");

		}

		public void actionPerformed(ActionEvent e) {
			Triangle t = new Triangle();
			t.newClass();
		}
	}

	private class SwingAction_36 extends AbstractAction {
		public SwingAction_36() {
			putValue(NAME, "Circle");

		}

		public void actionPerformed(ActionEvent e) {
			Circle c = new Circle();
			c.newClass();
		}
	}

	private class SwingAction_37 extends AbstractAction {
		public SwingAction_37() {
			putValue(NAME, "Sphere");

		}

		public void actionPerformed(ActionEvent e) {
			SphereSA s = new SphereSA();
			s.newClass();
		}
	}

	private class SwingAction_38 extends AbstractAction {
		public SwingAction_38() {
			putValue(NAME, "Cylinder");

		}

		public void actionPerformed(ActionEvent e) {
			CylinderSA c = new CylinderSA();
			c.newClass();
		}
	}

	private class SwingAction_39 extends AbstractAction {
		public SwingAction_39() {
			putValue(NAME, "Cone");

		}

		public void actionPerformed(ActionEvent e) {
			ConeSA c = new ConeSA();
			c.newClass();
		}
	}

	private class SwingAction_40 extends AbstractAction {
		public SwingAction_40() {
			putValue(NAME, "Cube");

		}

		public void actionPerformed(ActionEvent e) {
			CubeSA c = new CubeSA();
			c.newClass();
		}
	}

	private class SwingAction_41 extends AbstractAction {
		public SwingAction_41() {
			putValue(NAME, "Ohms Law");

		}

		public void actionPerformed(ActionEvent e) {
			OhmsLaw o = new OhmsLaw();
			o.newClass();
		}
	}

	private class SwingAction_42 extends AbstractAction {
		public SwingAction_42() {
			putValue(NAME, "Graphing Utility");

		}

		public void actionPerformed(ActionEvent e) {
			GraphingUtility g = new GraphingUtility();
			g.newClass();
		}
	}

	private class SwingAction_24 extends AbstractAction {
		public SwingAction_24() {
			putValue(NAME, "Periodic Table");

		}

		public void actionPerformed(ActionEvent e) {
			PTable p = new PTable();
			p.newClass();
		}
	}
}
