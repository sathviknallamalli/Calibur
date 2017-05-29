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

public class OptionalPhasesCopy extends JFrame {
	public OptionalPhasesCopy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Plasma & Bose- Einstein");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(376, 11, 295, 42);
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

		JLabel ae = new JLabel("Plasma");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 74, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>In the last lesson you learned that as you heat a substance to a higher temperature, then the phase will change. The hottest phase you learned was gas, however if you heat to a high enough temperature it becomes PLASMA. PLASMA IS A PHASE WHERE THE ATOMS BECOME SO LOOSE THAT ELECTRONS COME LOOSE. If someone asked you what is the most abundant type of matter, you might say gas, but its really PLASMA. PLASMA IS THE MOST ABUNDANT PHASE IN THE UNIVERSE BECUASE OF MATTER IN THE GALAXY. Lets go into more detail.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 101, 701, 86);
		getContentPane().add(lblinOrderFor);

		JLabel l = new JLabel();
		l.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\plasma.PNG"));
		l.setBounds(329, 195, 120, 107);
		getContentPane().add(l);

		JLabel ltwo = new JLabel();
		ltwo.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\patomd.PNG"));
		ltwo.setBounds(645, 285, 102, 99);
		getContentPane().add(ltwo);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\be.PNG"));
		p.setBounds(401, 369, 120, 86);
		getContentPane().add(p);

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

		JButton button_3 = new JButton("Take the Lesson Review");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(783, 444, 215, 36);
		getContentPane().add(button_3);

		JLabel lblyouCannotAccess = new JLabel(
				"<html>You cannot access this page during the review, there will be no questions on this optional lesson in the review\r\n\r\n");
		lblyouCannotAccess.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblyouCannotAccess.setBounds(748, 395, 282, 45);
		getContentPane().add(lblyouCannotAccess);

		JCheckBox chckbxLesson_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		chckbxLesson_2.setForeground(Color.RED);
		chckbxLesson_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_2.setEnabled(false);
		chckbxLesson_2.setBounds(6, 153, 230, 23);
		getContentPane().add(chckbxLesson_2);

		JButton button_1 = new JButton("Activate Calibur!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\Plasma.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(401, 68, 132, 23);
		getContentPane().add(button_1);

		JLabel lblIntermolecularForces = new JLabel("Intermolecular Forces");
		lblIntermolecularForces.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblIntermolecularForces.setBounds(459, 195, 191, 32);
		getContentPane().add(lblIntermolecularForces);

		JLabel lblinAllSubstances = new JLabel(
				"<html>In all substances there are particles, and in a solid they dont move. Have you wondered why they stay in place? This happense due to a small force inside the atoms called INTERMOLECULAR FORCE. So in plasma, the electrons will come loose and be able to conduct electricity, toy can probably guess, it has the weakest force. ");
		lblinAllSubstances.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinAllSubstances.setBounds(459, 226, 571, 71);
		getContentPane().add(lblinAllSubstances);

		JButton button = new JButton("Activate Calibur!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\IMF.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(652, 200, 132, 23);
		getContentPane().add(button);

		JLabel lblBoseEinstein = new JLabel("Bose - Einstein");
		lblBoseEinstein.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblBoseEinstein.setBounds(10, 332, 132, 32);
		getContentPane().add(lblBoseEinstein);

		JButton button_2 = new JButton("Activate Calibur!");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\BoseEinstein.wav");
				Audio.PlaySound(Clap);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(152, 337, 132, 23);
		getContentPane().add(button_2);

		JLabel lblitComesIn = new JLabel(
				"<html>It comes in the form of condensate and can be create when the substance is cooled to temperatures that are very close to ABSOLUTE ZERO. You have to cool a gas to this temperature. To convert any phase into this phase, the temperature will be determined by a very critical formula.");
		lblitComesIn.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblitComesIn.setBounds(10, 363, 378, 92);
		getContentPane().add(lblitComesIn);

		JLabel lblThisIsHow = new JLabel("This is how electrons come loose in plasma");
		lblThisIsHow.setForeground(Color.BLUE);
		lblThisIsHow.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblThisIsHow.setBounds(757, 318, 273, 23);
		getContentPane().add(lblThisIsHow);

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
