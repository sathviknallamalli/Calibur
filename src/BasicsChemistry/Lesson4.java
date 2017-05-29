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

public class Lesson4 extends JFrame {
	public Lesson4() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 4 - Phases of Matter");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(409, 11, 340, 42);
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

		JLabel ae = new JLabel("Matter's Journey");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 148, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>All the matter we see can be classified into different categories, but they can also come in different forms. Everything we see isnt hard and soft, nor is it invisible. Matter can transform to different forms and is called a phase. We will learn about the different phases of matter and how to differentiate them.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 724, 48);
		getContentPane().add(lblinOrderFor);

		JCheckBox chckbxLesson = new JCheckBox("Lesson 5 - Phase Changes");
		chckbxLesson.setForeground(Color.RED);
		chckbxLesson.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson.setEnabled(false);
		chckbxLesson.setBounds(6, 177, 215, 23);
		getContentPane().add(chckbxLesson);

		JLabel lblTypesOfSimple = new JLabel("Kinetic Theory of Matter");
		lblTypesOfSimple.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblTypesOfSimple.setBounds(329, 214, 203, 32);
		getContentPane().add(lblTypesOfSimple);

		JLabel lbltakeABicycle = new JLabel(
				"<html>This is the theory that states that all particles are moving, even in solids! They may be moving slowly, but they still are. The movement of particles is what we call TEMPERATURE. We will go more in depth to this later. But it is important to know that all particles move and how they move determines their phase.\r\n\r\n");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(331, 249, 706, 48);
		getContentPane().add(lbltakeABicycle);

		JLabel lab1 = new JLabel();
		lab1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\kt.png"));
		lab1.setBounds(329, 308, 148, 67);
		getContentPane().add(lab1);

		JLabel lab2 = new JLabel();
		lab2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\book.png"));
		lab2.setBounds(6, 430, 107, 67);
		getContentPane().add(lab2);

		JLabel lab3 = new JLabel();
		lab3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\fruit.png"));
		lab3.setBounds(123, 430, 98, 67);
		getContentPane().add(lab3);

		JLabel lab4 = new JLabel();
		lab4.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\sparticle.png"));
		lab4.setBounds(183, 497, 81, 67);
		getContentPane().add(lab4);

		JLabel lab7 = new JLabel();
		lab7.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\liquid.png"));
		lab7.setBounds(575, 524, 81, 78);
		getContentPane().add(lab7);

		JLabel lab8 = new JLabel();
		lab8.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\gas.png"));
		lab8.setBounds(981, 535, 56, 67);
		getContentPane().add(lab8);

		JLabel lab5 = new JLabel();
		lab5.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\liquids.png"));
		lab5.setBounds(329, 508, 98, 42);
		getContentPane().add(lab5);

		JLabel lab9 = new JLabel();
		lab9.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\balloon.png"));
		lab9.setBounds(908, 489, 73, 42);
		getContentPane().add(lab9);

		JLabel lab10 = new JLabel();
		lab10.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\pollute.png"));
		lab10.setBounds(991, 484, 62, 47);
		getContentPane().add(lab10);

		JLabel lab6 = new JLabel();
		lab6.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\juices.png"));
		lab6.setBounds(437, 508, 68, 53);
		getContentPane().add(lab6);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		chckbxLesson_1.setSelected(true);
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 230, 23);
		getContentPane().add(chckbxLesson_1);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Phases.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(543, 159, 132, 23);
		getContentPane().add(button);

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson4Review l = new Lesson4Review();
				l.newClass();
				close();
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(821, 637, 215, 36);
		getContentPane().add(button_3);

		JLabel label = new JLabel("<html>You cannot access this page during the review\r\n\r\n");
		label.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label.setBounds(797, 610, 256, 16);
		getContentPane().add(label);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(6, 153, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\MatterJourney.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(487, 68, 132, 23);
		getContentPane().add(button_1);

		JLabel lblSolid = new JLabel("Solid");
		lblSolid.setForeground(Color.RED);
		lblSolid.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblSolid.setBounds(329, 159, 42, 23);
		getContentPane().add(lblSolid);

		JLabel lblLiquid = new JLabel("Liquid");
		lblLiquid.setForeground(Color.RED);
		lblLiquid.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblLiquid.setBounds(409, 159, 68, 23);
		getContentPane().add(lblLiquid);

		JLabel lblGas = new JLabel("Gas");
		lblGas.setForeground(Color.RED);
		lblGas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblGas.setBounds(500, 159, 68, 23);
		getContentPane().add(lblGas);

		JLabel lbltheseAreThe = new JLabel(
				"<html>These are the different forms matter can occur in, and they can all be converted from one to the other through phase changes. ");
		lbltheseAreThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheseAreThe.setBounds(329, 181, 724, 23);
		getContentPane().add(lbltheseAreThe);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\KineticTheory.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(543, 222, 132, 23);
		getContentPane().add(button_2);

		JLabel lblthisDiagramDepicts = new JLabel(
				"<html>This diagram depicts how the particles will move in the different phases of matter.");
		lblthisDiagramDepicts.setForeground(Color.BLUE);
		lblthisDiagramDepicts.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblthisDiagramDepicts.setBounds(500, 308, 120, 72);
		getContentPane().add(lblthisDiagramDepicts);

		JLabel lblsolidsAreWhat = new JLabel(
				"<html>Solids are what we see all over in the World, and as you have noticed solids dont move! They also dont change shape or volume, and this is what makes it a solid. SOLIDS HAVE FIXED SHAPE AND VOLUME. So this proves that the particles do not move, ONLY VIBRATE SLIGHTLY.");
		lblsolidsAreWhat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsolidsAreWhat.setBounds(8, 284, 265, 112);
		getContentPane().add(lblsolidsAreWhat);

		JLabel lblSolids = new JLabel("Solids");
		lblSolids.setForeground(Color.BLUE);
		lblSolids.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblSolids.setBounds(6, 249, 56, 32);
		getContentPane().add(lblSolids);

		JButton button_4 = new JButton("Activate Calibur!");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Solid.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_4.setBounds(77, 255, 132, 23);
		getContentPane().add(button_4);

		JLabel lblExamplesOfSome = new JLabel("Examples of some Solids:");
		lblExamplesOfSome.setForeground(Color.RED);
		lblExamplesOfSome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblExamplesOfSome.setBounds(6, 403, 203, 23);
		getContentPane().add(lblExamplesOfSome);

		JLabel lbltheParticlesOnly = new JLabel("<html>The particles only VIBRATE.");
		lbltheParticlesOnly.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheParticlesOnly.setBounds(6, 508, 162, 23);
		getContentPane().add(lbltheParticlesOnly);

		JLabel lblLiquids = new JLabel("Liquids");
		lblLiquids.setForeground(Color.BLUE);
		lblLiquids.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblLiquids.setBounds(329, 392, 68, 32);
		getContentPane().add(lblLiquids);

		JLabel lblliquidsAreA = new JLabel(
				"<html>Liquids are a straightforward topic, and the most common exmaple is water. It its something that flows and has NO FIXED SHAPE, BUT FIXED VOLUME. It has no fixed shape because of its ability to move. So this indicates that the particles that make the matter move, but not too fast so they move more rapidly. \r\n");
		lblliquidsAreA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblliquidsAreA.setBounds(331, 427, 706, 48);
		getContentPane().add(lblliquidsAreA);

		JButton button_5 = new JButton("Activate Calibur!");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Solid.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_5.setBounds(409, 399, 132, 23);
		getContentPane().add(button_5);

		JLabel lblExamplesOfSome_1 = new JLabel("Examples of some Liquids:");
		lblExamplesOfSome_1.setForeground(Color.RED);
		lblExamplesOfSome_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblExamplesOfSome_1.setBounds(329, 486, 203, 23);
		getContentPane().add(lblExamplesOfSome_1);

		JLabel lbltheParticlesWill = new JLabel("<html>The particles will move slightly more rapidly");
		lbltheParticlesWill.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheParticlesWill.setBounds(329, 561, 241, 23);
		getContentPane().add(lbltheParticlesWill);

		JButton btnOptionalAddtionalPhases = new JButton("Optional: Plasma & Bose-Einstein");
		btnOptionalAddtionalPhases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OptionalPhases l = new OptionalPhases();
				l.newClass();
				close();
			}
		});
		btnOptionalAddtionalPhases.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnOptionalAddtionalPhases.setBounds(593, 637, 215, 36);
		getContentPane().add(btnOptionalAddtionalPhases);

		JLabel lblGas_1 = new JLabel("Gas");
		lblGas_1.setForeground(Color.BLUE);
		lblGas_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblGas_1.setBounds(6, 589, 68, 32);
		getContentPane().add(lblGas_1);

		JLabel lblasTheTrend = new JLabel(
				"<html>As the trend progresses, a gas has no fixed volume or shape. Take air for example, it has no specific shape or volume, it can be fit in the entire world, or in a container. A gas will fill its container. The particles for gas move rapidly and very fast, which allows them to move and also flow.");
		lblasTheTrend.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblasTheTrend.setBounds(8, 625, 533, 48);
		getContentPane().add(lblasTheTrend);

		JButton button_6 = new JButton("Activate Calibur!");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Gas.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_6.setBounds(56, 597, 132, 23);
		getContentPane().add(button_6);

		JLabel lblExamplesOfSome_2 = new JLabel("Examples of some Gases:");
		lblExamplesOfSome_2.setForeground(Color.RED);
		lblExamplesOfSome_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblExamplesOfSome_2.setBounds(716, 487, 182, 23);
		getContentPane().add(lblExamplesOfSome_2);

		JLabel lbltheParticlesWill_1 = new JLabel(
				"<html>The particles will move FASTEST in this phase because of weak forces");
		lbltheParticlesWill_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltheParticlesWill_1.setBounds(733, 554, 241, 34);
		getContentPane().add(lbltheParticlesWill_1);

		JLabel lblIntermolecularForce = new JLabel("Intermolecular Force");
		lblIntermolecularForce.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblIntermolecularForce.setBounds(630, 308, 203, 32);
		getContentPane().add(lblIntermolecularForce);

		JLabel lblthisIsA = new JLabel(
				"<html>This is a force existing inside of matter that keeps particles together and the strength of the force is what determines the phase of matter and how it can be transformed\r\n");
		lblthisIsA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblthisIsA.setBounds(630, 339, 423, 53);
		getContentPane().add(lblthisIsA);

		JButton button_7 = new JButton("Activate Calibur!");
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_7.setBounds(813, 312, 132, 23);
		getContentPane().add(button_7);

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
