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

public class Lesson3Copy extends JFrame {
	public Lesson3Copy() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Lesson 3 - Substance & Mixtures");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(350, 11, 400, 42);
		getContentPane().add(title);

		JLabel ae = new JLabel("Review of Mixtures and Subtances");
		ae.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		ae.setBounds(329, 64, 280, 32);
		getContentPane().add(ae);

		JLabel lblinOrderFor = new JLabel(
				"<html>As we learnt in the last lesson, matter is broken down into two categories of substances and mixtures. But even more!!!, mixtures can be broken down into more categories, these are called Homogoneous and Heterogeneous. Whats even better is that, these can be broken down into more categories!!!!!! We will start basic with the two broad categories.");
		lblinOrderFor.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinOrderFor.setBounds(329, 100, 724, 51);
		getContentPane().add(lblinOrderFor);

		JLabel lblTypesOfSimple = new JLabel("Homogenous Mixtures");
		lblTypesOfSimple.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblTypesOfSimple.setBounds(329, 155, 189, 32);
		getContentPane().add(lblTypesOfSimple);

		JLabel lbltakeABicycle = new JLabel(
				"<html>What does 'Homo-' mean? It means same. So that means that the materials in this mixture will have the same proportion throughout the entire mixture. Usually a way to identify them is if you cannot see the each and every ingredient, then that is an indicator for homogeneous solutions.\r\n\r\n");
		lbltakeABicycle.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbltakeABicycle.setBounds(331, 190, 294, 106);
		getContentPane().add(lbltakeABicycle);

		JButton btnPronounciation = new JButton("Pronounciation?");
		btnPronounciation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\PronounceHomo.wav");
				Audio.PlaySound(Clap);
			}
		});
		btnPronounciation.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnPronounciation.setBounds(528, 162, 132, 23);
		getContentPane().add(btnPronounciation);

		JLabel lblElements = new JLabel("Few Examples");
		lblElements.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblElements.setBounds(10, 235, 117, 32);
		getContentPane().add(lblElements);

		JLabel lblinAnElement = new JLabel("Salt Water");
		lblinAnElement.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinAnElement.setBounds(10, 282, 69, 23);
		getContentPane().add(lblinAnElement);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\swater.png"));
		pt.setBounds(339, 402, 51, 73);
		getContentPane().add(pt);

		JLabel p = new JLabel();
		p.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\beer.png"));
		p.setBounds(430, 402, 51, 73);
		getContentPane().add(p);

		JLabel p1 = new JLabel();
		p1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\bleach.png"));
		p1.setBounds(503, 402, 69, 87);
		getContentPane().add(p1);

		JLabel p2 = new JLabel();
		p2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\nuts.png"));
		p2.setBounds(722, 424, 81, 73);
		getContentPane().add(p2);

		JLabel p3 = new JLabel();
		p3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\pizza.png"));
		p3.setBounds(823, 424, 97, 57);
		getContentPane().add(p3);

		JLabel p4 = new JLabel();
		p4.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\sand.png"));
		p4.setBounds(931, 424, 97, 57);
		getContentPane().add(p4);

		JButton btnContinue = new JButton("Continue >>");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lesson3MoreCopy l = new Lesson3MoreCopy();
				l.newClass();
				close();
			}
		});
		btnContinue.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnContinue.setBounds(6, 531, 215, 36);
		getContentPane().add(btnContinue);

		JLabel lblHeterogenousMixture = new JLabel("Heterogenous Mixture");
		lblHeterogenousMixture.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblHeterogenousMixture.setBounds(722, 155, 189, 32);
		getContentPane().add(lblHeterogenousMixture);

		JButton button = new JButton("Pronounciation?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File Clap = new File("C:\\Users\\sathv\\Desktop\\WAV Audios\\PronounceHero.wav");
				Audio.PlaySound(Clap);
			}
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(921, 162, 132, 23);
		getContentPane().add(button);

		JLabel lblquiteTheOpposite = new JLabel(
				"<html>Quite the opposite of homo, 'Hetero-' means different, so it means that the proportions ARENT THE SAME throughout the entire mixture. If you can see the contents scattered here and there, that means it isnt mixed well to be a homogeneous mixture. For example, soil is a heterogeneous solution. A mixture where you can see all the ingredients is heterogeneous.\r\n\r\n");
		lblquiteTheOpposite.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblquiteTheOpposite.setBounds(722, 190, 294, 115);
		getContentPane().add(lblquiteTheOpposite);

		JLabel lblforExampleChocolate = new JLabel(
				"<html>For example, chocolate milk. The choloclate and milk are both mixed together that the proportion remains the same. You also cannot see the individual chocolate particles. Some more examples are given below.");
		lblforExampleChocolate.setForeground(Color.BLUE);
		lblforExampleChocolate.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblforExampleChocolate.setBounds(329, 296, 294, 73);
		getContentPane().add(lblforExampleChocolate);

		JLabel lblforExampleSalsa = new JLabel(
				"<html>For example, salsa. In salsa, the onions, tomatoes, jalapeno are all visible. When you take one bite, you may not get the same proportions off all vegetables, which is what makes it heterogeneous. More examples below.");
		lblforExampleSalsa.setForeground(Color.BLUE);
		lblforExampleSalsa.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblforExampleSalsa.setBounds(722, 313, 294, 81);
		getContentPane().add(lblforExampleSalsa);

		JLabel lblSugarWater = new JLabel("Sugar Water");
		lblSugarWater.setForeground(Color.RED);
		lblSugarWater.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSugarWater.setBounds(329, 380, 81, 23);
		getContentPane().add(lblSugarWater);

		JLabel lblAlchohol = new JLabel("Alchohol");
		lblAlchohol.setForeground(Color.RED);
		lblAlchohol.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAlchohol.setBounds(430, 380, 81, 23);
		getContentPane().add(lblAlchohol);

		JLabel lblBleach = new JLabel("Bleach");
		lblBleach.setForeground(Color.RED);
		lblBleach.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBleach.setBounds(508, 380, 81, 23);
		getContentPane().add(lblBleach);

		JLabel lbltheProportionsIn = new JLabel(
				"<html>The proportions in each of these examples are equal and uniform, and if you look at them closely you will not be able to seperate each ingredient from each other.");
		lbltheProportionsIn.setForeground(Color.BLUE);
		lbltheProportionsIn.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lbltheProportionsIn.setBounds(329, 494, 294, 73);
		getContentPane().add(lbltheProportionsIn);

		JLabel lblAssortedNut = new JLabel("Assorted Nuts");
		lblAssortedNut.setForeground(Color.RED);
		lblAssortedNut.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblAssortedNut.setBounds(722, 402, 81, 23);
		getContentPane().add(lblAssortedNut);

		JLabel label_2 = new JLabel("Alchohol");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		label_2.setBounds(823, 402, 81, 23);
		getContentPane().add(label_2);

		JLabel lblSand = new JLabel("Sand");
		lblSand.setForeground(Color.RED);
		lblSand.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblSand.setBounds(930, 402, 81, 23);
		getContentPane().add(lblSand);

		JLabel lblyouCanClearly = new JLabel(
				"<html>You can clearly see each material in each mixture clearly, and they arent distributed equally in throughout the entire mixture, which makes it heterogeneous.");
		lblyouCanClearly.setForeground(Color.BLUE);
		lblyouCanClearly.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblyouCanClearly.setBounds(722, 492, 294, 73);
		getContentPane().add(lblyouCanClearly);

		JLabel lblHomogeneousMixture = new JLabel("Homogeneous Mixture");
		lblHomogeneousMixture.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHomogeneousMixture.setBounds(123, 282, 122, 23);
		getContentPane().add(lblHomogeneousMixture);

		JLabel lblGranite = new JLabel("Granite");
		lblGranite.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblGranite.setBounds(10, 316, 69, 23);
		getContentPane().add(lblGranite);

		JLabel lblHeterogeneousMixture = new JLabel("Heterogeneous Mixture");
		lblHeterogeneousMixture.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHeterogeneousMixture.setBounds(123, 316, 143, 23);
		getContentPane().add(lblHeterogeneousMixture);

		JLabel lblPepper = new JLabel("Pepper");
		lblPepper.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPepper.setBounds(10, 346, 69, 23);
		getContentPane().add(lblPepper);

		JLabel label_1 = new JLabel("Heterogeneous Mixture");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_1.setBounds(123, 346, 143, 23);
		getContentPane().add(label_1);

		JLabel lblBlood = new JLabel("Blood");
		lblBlood.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblBlood.setBounds(10, 371, 69, 23);
		getContentPane().add(lblBlood);

		JLabel label_4 = new JLabel("Homogeneous Mixture");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_4.setBounds(123, 371, 122, 23);
		getContentPane().add(label_4);

		JLabel lblAir = new JLabel("Air");
		lblAir.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblAir.setBounds(10, 402, 69, 23);
		getContentPane().add(lblAir);

		JLabel label_5 = new JLabel("Homogeneous Mixture");
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_5.setBounds(123, 402, 122, 23);
		getContentPane().add(label_5);

		JLabel lblDressing = new JLabel("Dressing");
		lblDressing.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblDressing.setBounds(10, 425, 69, 23);
		getContentPane().add(lblDressing);

		JLabel label_6 = new JLabel("Heterogeneous Mixture");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_6.setBounds(123, 425, 143, 23);
		getContentPane().add(label_6);

		JLabel lblLemonade = new JLabel("Lemonade");
		lblLemonade.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblLemonade.setBounds(10, 452, 69, 23);
		getContentPane().add(lblLemonade);

		JLabel label_7 = new JLabel("Homogeneous Mixture");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		label_7.setBounds(123, 452, 122, 23);
		getContentPane().add(label_7);

		JCheckBox checkBox = new JCheckBox("Lesson 6 - Temperature Conversions\r\n");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox.setEnabled(false);
		checkBox.setBounds(10, 210, 230, 23);
		getContentPane().add(checkBox);

		JCheckBox checkBox_1 = new JCheckBox("Lesson 5 - Phase Changes");
		checkBox_1.setForeground(Color.RED);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(10, 184, 215, 23);
		getContentPane().add(checkBox_1);

		JCheckBox checkBox_2 = new JCheckBox("Lesson 4 - Phases of Matter");
		checkBox_2.setForeground(Color.RED);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(10, 160, 230, 23);
		getContentPane().add(checkBox_2);

		JCheckBox checkBox_3 = new JCheckBox("Lesson 3 - Substances & Mixtures");
		checkBox_3.setForeground(Color.RED);
		checkBox_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(10, 135, 230, 23);
		getContentPane().add(checkBox_3);

		JCheckBox checkBox_4 = new JCheckBox("Lesson 2 - Classifying Matter");
		checkBox_4.setSelected(true);
		checkBox_4.setForeground(Color.RED);
		checkBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_4.setEnabled(false);
		checkBox_4.setBounds(10, 109, 215, 23);
		getContentPane().add(checkBox_4);

		JCheckBox checkBox_5 = new JCheckBox("Lesson 1 - Structure");
		checkBox_5.setSelected(true);
		checkBox_5.setForeground(Color.RED);
		checkBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(10, 83, 215, 23);
		getContentPane().add(checkBox_5);

		JLabel label = new JLabel("Chapter Progress");
		label.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		label.setBounds(25, 64, 112, 16);
		getContentPane().add(label);

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
