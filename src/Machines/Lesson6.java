package Machines;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson6 extends JFrame {
	public Lesson6() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 6 - Practice Problems");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(300, 11, 354, 42);
		getContentPane().add(title);

		JCheckBox l1 = new JCheckBox("Lesson 1 - Simple Machines\r\n");
		l1.setSelected(true);
		l1.setForeground(Color.RED);
		l1.setEnabled(false);
		l1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l1.setBounds(6, 76, 215, 23);
		getContentPane().add(l1);

		JCheckBox l2 = new JCheckBox("Lesson 2 - Work ");
		l2.setSelected(true);
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		l2.setEnabled(false);
		l2.setBounds(6, 102, 215, 23);
		getContentPane().add(l2);

		JLabel cp = new JLabel("Chapter Progress");
		cp.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		cp.setBounds(21, 57, 112, 16);
		getContentPane().add(cp);

		JLabel ae = new JLabel("Introduction\r\n");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(286, 64, 403, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>In order to prepare you for this test, we have numerous practice problems that will cover all the lessons and it is like a practice test, so use it wisely as a study guide.\r\n");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(286, 100, 658, 42);
		getContentPane().add(lblinOrderFor);

		JButton btnNewButton = new JButton("Continue >>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				End e = new End();
				e.newClass();
				close();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(729, 334, 215, 42);
		getContentPane().add(btnNewButton);

		JCheckBox chckbxLesson_1 = new JCheckBox("Lesson 3 - Advantage");
		chckbxLesson_1.setSelected(true);
		chckbxLesson_1.setForeground(Color.RED);
		chckbxLesson_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		chckbxLesson_1.setEnabled(false);
		chckbxLesson_1.setBounds(6, 128, 215, 23);
		getContentPane().add(chckbxLesson_1);

		JCheckBox checkBox = new JCheckBox("Lesson 6 - Practice Problems\r\n");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(6, 203, 215, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Energy & Machines\r\n");
		checkBox_1.setSelected(true);
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(6, 177, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Evaluating Machines");
		checkBox_2.setSelected(true);
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(6, 151, 215, 23);
		getContentPane().add(checkBox_2);

		JButton btnSimpleMachines = new JButton("Simple Machines");
		btnSimpleMachines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleMachinesPP s = new SimpleMachinesPP();
				s.newClass();
			}
		});
		btnSimpleMachines.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSimpleMachines.setBounds(286, 153, 165, 32);
		getContentPane().add(btnSimpleMachines);

		JButton btnWork = new JButton("Work\r\n");
		btnWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WorkPP w = new WorkPP();
				w.newClass();
			}
		});
		btnWork.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnWork.setBounds(286, 205, 165, 32);
		getContentPane().add(btnWork);

		JButton btnMechanicalAdvantage = new JButton("Mechanical Advantage");
		btnMechanicalAdvantage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MAPP m = new MAPP();
				m.newClass();
			}
		});
		btnMechanicalAdvantage.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnMechanicalAdvantage.setBounds(286, 254, 165, 32);
		getContentPane().add(btnMechanicalAdvantage);

		JButton btnEfficiencyPower = new JButton("Efficiency & Power");
		btnEfficiencyPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EfficiencyPowerPP a = new EfficiencyPowerPP();
				a.newClass();

			}
		});
		btnEfficiencyPower.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnEfficiencyPower.setBounds(286, 297, 165, 32);
		getContentPane().add(btnEfficiencyPower);

		JLabel lblsomeWordProblems = new JLabel("<html>Some word problems about simple machines are in here\r\n");
		lblsomeWordProblems.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsomeWordProblems.setBounds(461, 157, 354, 23);
		getContentPane().add(lblsomeWordProblems);

		JLabel label = new JLabel("<html>Some word problems and theory problems about work are in here\r\n");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label.setBounds(461, 207, 354, 23);
		getContentPane().add(label);

		JLabel lblsomeWordProblems_1 = new JLabel(
				"<html>Some word problems and theory problems about adavantage are in here\r\n");
		lblsomeWordProblems_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsomeWordProblems_1.setBounds(461, 258, 408, 23);
		getContentPane().add(lblsomeWordProblems_1);

		JLabel lblsomeWordProblems_2 = new JLabel(
				"<html>Some word problems and theory problems about evaluating machines are in here\r\n\r\n");
		lblsomeWordProblems_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblsomeWordProblems_2.setBounds(461, 301, 428, 23);
		getContentPane().add(lblsomeWordProblems_2);

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public static void music() {

	}

	public void newClass() {

		setSize(972, 427);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
