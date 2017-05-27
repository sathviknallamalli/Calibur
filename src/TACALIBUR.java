import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import BalancingEquations.BalancingEquations;
import BasicsChemistry.BasicsOfChemistry;
import FundamentalsOfAlgebraContents.FundamentalsAlg;
import LinearEquationsContents.LinearEquations;
import Machines.Machines;
import Motion.Motion;
import PeriodicTable.PeriodicTable;
import SegmentsAngleContents.SegmentsAngle;

public class TACALIBUR {

	JFrame frame;

	private JPanel panel_4;

	/**
	 * Launch the application.
	 */

	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TACALIBUR window = new TACALIBUR();
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
	public TACALIBUR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Teacher Assistant - Calibur");
		frame.getContentPane().setBackground(new Color(255, 0, 0));
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 113, 1009, 230);
		tabbedPane.setForeground(Color.BLACK);
		frame.getContentPane().add(tabbedPane);

		JPanel panel_1 = new JPanel();

		panel_1.setBackground(Color.WHITE);
		tabbedPane.addTab("Mathematics", null, panel_1, null);
		tabbedPane.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Phsyical Science", null, panel_2, null);
		panel_2.setLayout(null);

		JButton motion = new JButton("Motion\r\n");
		motion.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		motion.setBounds(10, 11, 116, 23);
		panel_2.add(motion);

		JButton energy = new JButton("Energy");
		energy.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		energy.setBounds(10, 43, 116, 23);
		panel_2.add(energy);

		JButton measure = new JButton("Measurment\r\n");
		measure.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		measure.setBounds(10, 73, 116, 23);
		panel_2.add(measure);

		JLabel descrip = new JLabel();
		panel_1.add(descrip);
		descrip.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		// algebra button clicked
		JButton alg = new JButton("Algebra");
		alg.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		alg.setBounds(10, 11, 116, 23);
		panel_1.add(alg);

		// geometry button clicked
		JButton geo = new JButton("Geometry");
		geo.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		geo.setBounds(10, 40, 116, 23);
		panel_1.add(geo);

		// trig button clikced
		JButton trig = new JButton("Triginometry");
		trig.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		trig.setBounds(10, 70, 116, 23);
		panel_1.add(trig);

		JButton prob = new JButton("Probability");
		prob.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		prob.setBounds(10, 99, 116, 23);
		panel_1.add(prob);

		// algebra2 button clicked
		JButton alg2 = new JButton("Algebra 2");
		alg2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		alg2.setBounds(10, 127, 116, 23);
		panel_1.add(alg2);

		JButton beginMath = new JButton("Begin Course!");
		beginMath.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		beginMath.setBounds(848, 168, 146, 23);
		panel_1.add(beginMath);
		// algebra comboBox
		String aTopic[] = { "", "Fundamentals of Algebra", "Linear Equations", "Inequalities", "Functions",
				"Solving Real World Problems", "System of Equations", "Radical Expressions" };
		JButton btnPrecalculus = new JButton("Pre-Calculus");
		btnPrecalculus.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnPrecalculus.setBounds(10, 157, 116, 23);
		panel_1.add(btnPrecalculus);
		JComboBox algtopics = new JComboBox(aTopic);

		panel_1.add(algtopics);
		algtopics.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		// geometry comboBox
		String gTopic[] = { "", "Segments and Angles", "Parallel Lines & Transversal", "Triangles", "Polygons",
				"Proofs & Mathematical Reasoning" };

		JLabel titleD = new JLabel();

		panel_1.add(titleD);
		titleD.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		JComboBox geotopics = new JComboBox(gTopic);

		panel_1.add(geotopics);
		geotopics.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		// trig comboBox
		String tTopic[] = { "Radian and Degree Measures", "Unit Circle", "Interval Solving", "Triginometric Equations",
				"Trignometric Identities", "Polar Coordinates", "Vector Calculations",
				"No calculator Test - Unit Circle" };

		JComboBox trigtopics = new JComboBox(tTopic);
		panel_1.add(trigtopics);
		trigtopics.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		String a2Topic[] = { "", "Equations and Inequalities", "Linear Relations and Functions",
				"Systems of Equations and Inequalities", "Matrices", "Polynomials", "Radical Expressions",
				"Quadratic Equations", "Conics", "Polynomial Functions", "Rational Functions", "Polynomial Expressions",
				"Exponential and Logarithmic Functions", "Sequence and Series", "Probability and Statistics",
				"Trigonometric Functions" };

		JComboBox alg2topics = new JComboBox(a2Topic);

		panel_1.add(alg2topics);
		alg2topics.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		// algebra 2 comBox clicked
		alg2topics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descrip.setText("");
				titleD.setText("");

				String a2Chosen = (String) alg2topics.getSelectedItem();
				titleD.setText(a2Chosen);
				titleD.setBounds(636, 11, 300, 23);
				switch (a2Chosen) {
				// sem 1
				case "Equations and Inequalities":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about using order of operations to solve equations, different types of numbers and learn the properties of equality. Solve absolute value equations and solve compound sentences and inequalities");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Linear Relations and Functions":
					descrip.setText("");
					descrip.setText(
							"<html>This course will detail theory about how to graph fucntions and the rules of functions. Extrapolate an equation from a graph and predict the next points from scatterplots. Even solve inequalities by graphing and detetrming unions of sets. ");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Systems of Equations and Inequalities":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include how to solve by graphing, use solving Cramers rule and the determinant. Learn linear programming and determine minimum and maximum. Solve equations with 3 variables.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Matricies":
					descrip.setText("");
					descrip.setText(
							"<html>This course will detail how to calculate the determniant of matricies and perform scalalr mulitiplucation and you will learn how to add and subtract matricies. Identitiy and Inverse will also be taught along with multiplucation rules. Cramers Rule can also be utilized to solve these.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Polynomials":
					descrip.setText("");
					descrip.setText(
							"<html>Determining the degree of polynomials and the anataomy of them is also detailed. Divide, Multiply, Add and subtract polynomials. You will learn to factor and use synthetic division to factor polynomials");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Radical Expressions":
					descrip.setText("");
					descrip.setText(
							"<html>This course will detail how to use a calculator to estimate some root values. Add, subtract, multiply, and divide radical expressions will also be explained along with rationalizing the expressions. Solving equations, imaginary roots, and complex numbers will be talked about.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Quadratic Equations":
					descrip.setText("");
					descrip.setText(
							"<html>All the methods of solving quadratics will be discussed, factoring, graphing, and completing the square will be utilized. The features of a parabola will be discussed, along with the quadratic formula and its theory. Real world problems such as interest will be used as common references");
					descrip.setBounds(636, 20, 266, 115);
					break;

				// sem 2
				case "Conics":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Polynomial Functions":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Rational Functions":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Polynomial Expressions":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Exponential and Logarithmic Functions":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Sequence and Series":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Probability and Statistics":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Trigonometric Functions":
					descrip.setText("");
					descrip.setText("");
					descrip.setBounds(636, 20, 266, 115);
					break;

				}
			}
		});

		// trig comBox selected
		trigtopics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descrip.setText("");
				titleD.setText("");

				String tChosen = (String) trigtopics.getSelectedItem();
				titleD.setText(tChosen);

				titleD.setBounds(636, 11, 287, 23);
				switch (tChosen) {
				case "Radian and Degree Measures":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about how degrees can be converted to radians and methods to convert to and from. The thery of radians and even GRADIANS will also be discussed, which is very important for future topics.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Unit Circle":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about the unit circle and the speicial triangles used to compose it and how finding the trig functions without a calculator can be alot easier. The symmetry and the patterns in this circle are very interesting.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Interval Solving":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about how the Unit Circle can be used to solve equations with limits on the quadrants on the coordinate grid");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Triginometric Equations":
					descrip.setText("");
					descrip.setText("<html>This course will include theory about ");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Triginometric Identities":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about how identities can be used to solve for missing trig functions and proofs using the pythagorean theorem. ");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Polar Coordinates":
					descrip.setText("");
					descrip.setText("<html>Polar Coordinate Description");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Vector Calculations":
					descrip.setText("");
					descrip.setText("<html>Vector Calculation Description");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "No calculator Test - Unit Circle":
					descrip.setText("");
					descrip.setText("<html>Get ready for the test! No calculator");
					descrip.setBounds(636, 20, 266, 115);
					break;
				}
			}
		});

		// geometry comBox clicked
		geotopics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descrip.setText("");
				titleD.setText("");

				String gChosen = (String) geotopics.getSelectedItem();
				titleD.setText(gChosen);
				titleD.setBounds(636, 11, 287, 23);
				switch (gChosen) {
				case "Segments and Angles":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about the correlation between segments and angles. Different types of angles and include topics about perpendicular and parallel lines. The intersection of these segments will form angles which we will detail about.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Parallel Lines & Transversal":
					descrip.setText("");
					descrip.setText(
							"<html>This course will detail theory about how angles will correlate when a line cuts through parallel lines and how angle calculations can be performed. When given side lengths and shapes are formed, you can use that information to solve missing sides. Quizzes and qestions will be included to ensure understanding");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Triangles":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include an abundant amount of vocabulary with lines and their features in triangles, different typrs of triangles, and many proofs that make the triangle a very important feature in all of geometry. Reasonings for these proofs are availables and will make tests a whole lot easier!  You will learn how to prove that triangles are congruent and postulates such as SAS, SSA, AAS");
					descrip.setBounds(636, 40, 266, 115);
					break;
				case "Polygons":
					descrip.setText("");
					descrip.setText(
							"<html>Transformations and angle patterns are all reflected in this theory and many formulas about all the polygons areas are all incorporated.");
					descrip.setBounds(636, 5, 266, 115);
					;
					break;
				case "Proofs & Mathematical Reasoning":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include the standard methods to prove things and how all simple things can be prooved and you will learn how to implement this by dealing with frequent quesitons. Congruency concepts will all be incorporated.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				}
			}
		});

		// algebra combo box selections
		algtopics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descrip.setText("");
				titleD.setText("");

				String aChosen = (String) algtopics.getSelectedItem();
				titleD.setText(aChosen);
				titleD.setBounds(636, 11, 287, 23);

				switch (aChosen) {
				case "Fundamentals of Algebra":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about the fundamentals of algebra such as variables, the anatomy of algebra, operations, and symbols you will be using throughout this entire course. This will also include an overview of order of operations");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Linear Equations":
					descrip.setText("");
					descrip.setText(
							"<html>This course will include theory about how you can graph equations and will detail the anatomy of standard form equations and different methods to make you solve anything very quickly, with rigorous practice.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Inequalities":
					descrip.setText("");
					;
					descrip.setText(
							"<html>This course will detail theory about solving inequalities and the proper form of solving and how to graph these on a coordinate grid. Even compound inequalities along with using inequalities to solve real world problems");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Functions":
					descrip.setText("");
					descrip.setText(
							"<html>This course will detail how to develop different types of functions and how to evaulate them through various techniques. Graphing different fuctions on a coordinate plan and as a table will alow you to understand better");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Solving Real World Problems":
					descrip.setText("");
					;
					descrip.setText(
							"<html>This course will detail theory about how you can use even simple algebra to solve the most complex word problems including percents, variable, equations, and how inequalities can set a threshold.");
					descrip.setBounds(636, 15, 266, 115);
					break;
				case "System of Equations":
					descrip.setText("");
					;
					descrip.setText(
							"<html>This course will detail theory about how to solve equations with multiple variables using two main methods, Elimination and Substitution. Also including a bonus method of graphing these equations to solve for the right variables. A built-in graphing utility is also included");
					descrip.setBounds(636, 20, 266, 115);
					break;
				case "Radical Expressions":
					descrip.setText("");
					;
					descrip.setText(
							"<html>This course will detail theory about how you can to solve radical expressions including things such as exponents and square roots and solving for even complex variables. Methods to even check your answer are also included so you can ensure the correct answer.");
					descrip.setBounds(636, 20, 266, 115);
					break;
				}
			}
		});
		beginMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String chosen = titleD.getText();
				if (chosen == "Fundamentals of Algebra") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Fundamentals of Algebra and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						FundamentalsAlg fa = new FundamentalsAlg();
						fa.newClass();
					}

				}
				if (chosen == "Linear Equations") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Linear Equations and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						LinearEquations fa = new LinearEquations();
						fa.newClass();
					}
				}
				if (chosen == "Segments and Angles") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Segments & Angles and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						SegmentsAngle s = new SegmentsAngle();
						s.newClass();
					}

				}

			}

		});

		JLabel title = new JLabel("Virtual Teacher - Calibur");
		title.setBounds(247, 11, 563, 32);
		title.setFont(new Font("Castellar", Font.PLAIN, 34));
		frame.getContentPane().add(title);

		JLabel info = new JLabel(
				"Calibur will teach any topic to you through speech and at the end of each lesson there will be a quiz for you to take and understand the concept");
		info.setBounds(185, 52, 688, 23);
		info.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.getContentPane().add(info);

		JLabel inst = new JLabel(
				"Select a subject, browse through the topics, and select your topic and begin the course. In some of the courses there are subtopics too!");
		inst.setBounds(207, 79, 644, 23);
		inst.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		frame.getContentPane().add(inst);

		JLabel cSpec = new JLabel("Course Specifications - Select your preference");
		cSpec.setBounds(24, 350, 287, 23);
		cSpec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frame.getContentPane().add(cSpec);

		JCheckBox caliv = new JCheckBox("Use voice-activated Calibur");
		caliv.setForeground(Color.BLACK);
		caliv.setBounds(31, 380, 157, 23);
		caliv.setEnabled(false);
		caliv.setSelected(true);
		caliv.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		caliv.setBackground(Color.RED);
		frame.getContentPane().add(caliv);

		JCheckBox quiz = new JCheckBox("Quiz");
		quiz.setEnabled(false);
		quiz.setForeground(Color.BLACK);
		quiz.setBounds(31, 406, 157, 23);
		quiz.setSelected(true);
		quiz.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		quiz.setBackground(Color.RED);
		frame.getContentPane().add(quiz);

		JCheckBox theory = new JCheckBox("Theory");
		theory.setForeground(Color.BLACK);
		theory.setBounds(31, 432, 157, 23);
		theory.setEnabled(false);
		theory.setSelected(true);
		theory.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		theory.setBackground(Color.RED);
		frame.getContentPane().add(theory);

		// algebra2 comboBox

		alg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alg2topics.setBounds(312, 18, 231, 23);
				// things to not
				algtopics.setBounds(0, 0, 0, 0);
				trigtopics.setBounds(0, 0, 0, 0);
				geotopics.setBounds(0, 0, 0, 0);
				descrip.setText("");
				titleD.setText("");

			}
		});
		trig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trigtopics.setBounds(312, 18, 231, 23);
				// things to not
				algtopics.setBounds(0, 0, 0, 0);
				alg2topics.setBounds(0, 0, 0, 0);
				geotopics.setBounds(0, 0, 0, 0);
				descrip.setText("");
				titleD.setText("");
			}
		});
		geo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				geotopics.setBounds(312, 18, 231, 23);
				// things to not
				algtopics.setBounds(0, 0, 0, 0);
				alg2topics.setBounds(0, 0, 0, 0);
				trigtopics.setBounds(0, 0, 0, 0);
				descrip.setText("");
				titleD.setText("");
			}
		});
		alg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				algtopics.setBounds(312, 18, 231, 23);
				// things to not
				geotopics.setBounds(0, 0, 0, 0);
				alg2topics.setBounds(0, 0, 0, 0);
				trigtopics.setBounds(0, 0, 0, 0);
				descrip.setText("");
				titleD.setText("");
			}
		});

		JCheckBox sol = new JCheckBox("Solutions");
		sol.setForeground(Color.BLACK);
		sol.setBounds(31, 458, 157, 23);
		sol.setEnabled(false);
		sol.setSelected(true);
		sol.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sol.setBackground(Color.RED);
		frame.getContentPane().add(sol);

		JLabel lblNewLabel = new JLabel("COURSE DASHBOARD");
		lblNewLabel.setBounds(490, 110, 201, 19);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Castellar", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);

		frame.setBounds(100, 100, 1074, 540);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// PHYSICS OPTIONS
		// energy button

		JLabel des = new JLabel();
		des.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_2.add(des);

		JLabel tit = new JLabel();
		tit.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel_2.add(tit);

		JButton machines = new JButton("Machines");
		machines.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		machines.setBounds(10, 102, 116, 23);
		panel_2.add(machines);

		JButton button = new JButton("Begin Course!");
		panel_2.add(button);

		JButton button1 = new JButton("Begin Course!");
		panel_2.add(button1);

		JButton button2 = new JButton("Begin Course!");
		panel_2.add(button2);

		JButton button3 = new JButton("Begin Course!");
		panel_2.add(button3);

		JButton magnetism = new JButton("Magentism");
		magnetism.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		magnetism.setBounds(10, 131, 116, 23);
		panel_2.add(magnetism);

		JButton physBegin = new JButton("Begin Course!");
		physBegin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		physBegin.setBounds(848, 168, 146, 23);
		panel_2.add(physBegin);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("Chemistry", null, panel_3, null);

		JButton btnPeriodicTable = new JButton("Periodic Table");

		btnPeriodicTable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnPeriodicTable.setBounds(10, 41, 138, 23);
		panel_3.add(btnPeriodicTable);

		JButton btnBalancingEquations = new JButton("Balancing Equations");

		btnBalancingEquations.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBalancingEquations.setBounds(10, 73, 138, 23);
		panel_3.add(btnBalancingEquations);

		JLabel description = new JLabel();
		description.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_3.add(description);

		JLabel title1 = new JLabel();
		title1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel_3.add(title1);

		btnBalancingEquations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				title1.setText("Balancing Equations");
				description.setBounds(383, 35, 242, 90);
				description.setText(
						"<html>In this course you will learn about how different compounds are formed and how scientists have to balance things to make sure they dont mess up!! You will learn how to use the atomic structure of elements to create new compounds too!");
				title1.setBounds(383, 11, 255, 23);
			}
		});

		btnPeriodicTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				title1.setText("Periodic Table");
				description.setBounds(383, 35, 242, 90);
				description.setText(
						"<html>In this course you will learn about each element in the periodic table along with what each part is including the atomic number and mass. You will also learn why it is arranged in this such way along with some fun excercises.");
				title1.setBounds(383, 11, 255, 23);
			}
		});

		JButton btnBasicChemistry = new JButton("Basics Of Chemistry");
		btnBasicChemistry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				title1.setText("Basics Of Chemistry");
				description.setBounds(383, 35, 242, 90);
				description.setText(
						"<html>In this chapter, basic theory ragarding chemistry will be discussed in order for you to understand more complex situations. Concepts of matter, structure, and chemistry will all be introduced. ");
				title1.setBounds(383, 11, 255, 23);

			}
		});
		btnBasicChemistry.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBasicChemistry.setBounds(10, 11, 138, 23);
		panel_3.add(btnBasicChemistry);

		JButton beginChem = new JButton("Begin Course!");
		beginChem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (title1.getText() == "Basics Of Chemistry") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Basics Of Chemistry and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						BasicsOfChemistry fa = new BasicsOfChemistry();
						fa.newClass();
					}
				} else if (title1.getText() == "Periodic Table") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Periodic Table and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						PeriodicTable fa = new PeriodicTable();
						fa.newClass();
					}
				} else if (title1.getText() == "Balancing Equations") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Balancing Equations and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						BalancingEquations fa = new BalancingEquations();
						fa.newClass();
					}
				}
			}
		});

		beginChem.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		beginChem.setBounds(848, 168, 146, 23);
		panel_3.add(beginChem);

		JLabel testOffer = new JLabel("Special - Test Offer!!");
		testOffer.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		testOffer.setBounds(10, 107, 184, 23);
		panel_3.add(testOffer);

		JLabel lblforThoseOf = new JLabel(
				"<html>For those of you high school student getting ready for college, for this particular subject, we are offering a special test preparation tool for you to use that will help you prepare for standardized test such as AP and SAT Exams. Click below for which exam you would like and Calibur will do the rest.");
		lblforThoseOf.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblforThoseOf.setBounds(10, 135, 524, 49);
		panel_3.add(lblforThoseOf);

		JButton btnSat = new JButton("SAT");
		btnSat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] arguments = { "1", "2", "3" };
				try {
					Browser.main(arguments,
							"https://subjecttestspractice.collegeboard.org/practice/sat-subject-test-preparation/chemistry");
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnSat.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSat.setBounds(216, 107, 75, 23);
		panel_3.add(btnSat);

		panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Biology", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel biod = new JLabel();
		biod.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_4.add(biod);

		JLabel biotit = new JLabel();
		biotit.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		panel_4.add(biotit);

		JButton btnGenetics = new JButton("Genetics");
		btnGenetics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				biotit.setText("Genetics");
				biod.setBounds(383, 35, 242, 90);
				biod.setText("<html>genetics descriprion");
				biotit.setBounds(383, 11, 255, 23);
			}
		});
		btnGenetics.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnGenetics.setBounds(10, 11, 143, 23);
		panel_4.add(btnGenetics);

		JButton btnCellularStructures = new JButton("Cellular Structures");
		btnCellularStructures.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				biotit.setText("Cellular Structures");
				biod.setBounds(383, 35, 242, 90);
				biod.setText("<html>");
				biotit.setBounds(383, 11, 255, 23);
			}
		});
		btnCellularStructures.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCellularStructures.setBounds(10, 45, 143, 23);
		panel_4.add(btnCellularStructures);

		JLabel label = new JLabel("Special - Test Offer!!");
		label.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		label.setBounds(10, 114, 184, 23);
		panel_4.add(label);

		JButton button_1 = new JButton("SAT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] arguments = { "1", "2", "3" };
				try {
					Browser.main(arguments,
							"https://collegereadiness.collegeboard.org/sat-subject-tests/subjects/science/biology-em");
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_1.setBounds(216, 114, 75, 23);
		panel_4.add(button_1);

		JLabel label_1 = new JLabel(
				"<html>For those of you high school student getting ready for college, for this particular subject, we are offering a special test preparation tool for you to use that will help you prepare for standardized test such as AP and SAT Exams. Click below for which exam you would like and Calibur will do the rest.");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		label_1.setBounds(10, 142, 524, 49);
		panel_4.add(label_1);

		JButton button_2 = new JButton("Begin Course!");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_2.setBounds(848, 168, 146, 23);
		panel_4.add(button_2);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("Earth & Space Science", null, panel_5, null);
		panel_5.setLayout(null);

		JButton btnChemistryOfThe = new JButton("Chemistry of the Earth");
		btnChemistryOfThe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnChemistryOfThe.setBounds(10, 35, 143, 23);
		panel_5.add(btnChemistryOfThe);

		JButton btnSignificantMatter = new JButton("Significant Matter");
		btnSignificantMatter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignificantMatter.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSignificantMatter.setBounds(10, 64, 143, 23);
		panel_5.add(btnSignificantMatter);

		JButton button_3 = new JButton("Begin Course!");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		button_3.setBounds(848, 168, 146, 23);
		panel_5.add(button_3);

		JButton btnBasicsOfEarth = new JButton("Basics of Earth Science");
		btnBasicsOfEarth.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBasicsOfEarth.setBounds(10, 6, 143, 23);
		panel_5.add(btnBasicsOfEarth);

		energy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tit.setText("Energy");
				des.setBounds(383, 35, 242, 90);
				des.setText(
						"<html>This course will include how to convert from different energy values and will give you a wide range of word problems and types of energies. The transformations of energy in different scenarios and all the possible energy applications are incorporated. Its a pretty lengthy course.");
				tit.setBounds(383, 11, 255, 23);

			}
		});

		motion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tit.setText("Motion");
				des.setBounds(383, 20, 242, 90);
				des.setText(
						"<html>In this chapter, Newtons Laws, momentum, and all the factors of any moving object. Things such as force wieight gravity and the properties of each of these variables are described. ");
				tit.setBounds(383, 11, 255, 23);

			}
		});

		machines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tit.setText("Machines");
				des.setBounds(383, 35, 242, 90);
				des.setText(
						"<html>In this chapter, there will be the properties of simple machines and we will go into intricate detail about how each part of the machines work and waht contribution they bring to the movement and energy of them. Many formulas to determine the facets of the machine are included. ");
				tit.setBounds(383, 11, 255, 23);

			}
		});

		measure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tit.setText("Measurment");
				des.setBounds(383, 35, 242, 90);
				des.setText(
						"<html>In this chapter you will learn about how things are measured and how to pracitcally speak regarding measurements and their correlation with data. Real life examples and how they will be applied and altered during furhter physical applications. ");
				tit.setBounds(383, 11, 255, 23);

			}
		});
		magnetism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tit.setText("Magnetism");
				des.setBounds(383, 35, 242, 90);
				des.setText(
						"<html>In this course you will learn about how magnets work and the practical applications about these wonderful creations. Topics such as poles, forces, and real world uses will all be talked about in this chapter.");
				tit.setBounds(383, 11, 255, 23);

			}
		});

		physBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tit.getText() == "Motion") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Motion and start now?", "", JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						Motion fa = new Motion();
						fa.newClass();
					}
				} else if (tit.getText() == "Energy") {

				} else if (tit.getText() == "Measurment") {

				} else if (tit.getText() == "Machines") {
					int p = JOptionPane.showConfirmDialog(null,
							"Are you sure you want this course: Machines and start now?", "",
							JOptionPane.YES_NO_OPTION);
					if (p == 0) {
						Machines fa = new Machines();
						fa.newClass();
					}
				} else if (tit.getText() == "Magnetism") {

				}
			}
		});

	}

	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Back To Main Page");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			Main m = new Main();
			m.setVisible(true);
			m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			m.setSize(1074, 540);
		}
	}
}
