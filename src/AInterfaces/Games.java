package AInterfaces;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import BrickBreaker.Center;
import ColorGame.Driver;
import FlappyBird.FlappyBird;
import Simulations.DiceRolling;
import Simulations.HeadsTails;
import Simulations.RandomGuessing;
import SnakeGame.MainClass;

public class Games {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Games window = new Games();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JLabel lblGamesByCalibur;
	private JLabel lblafterADays;

	/**
	 * Create the application.
	 */
	public Games() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Games");
		frame.getContentPane().setBackground(Color.MAGENTA);
		frame.setBounds(100, 100, 752, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		frame.getContentPane().add(scrollPane);

		lblGamesByCalibur = new JLabel("Games By Calibur");
		lblGamesByCalibur.setFont(new Font("Castellar", Font.PLAIN, 34));
		lblGamesByCalibur.setBounds(180, 11, 377, 42);
		frame.getContentPane().add(lblGamesByCalibur);

		lblafterADays = new JLabel(
				"<html>After a days hard work, you can relax by playing some games designed by Calibur. We also have simulations you can use too.");
		lblafterADays.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblafterADays.setBounds(28, 53, 680, 16);
		frame.getContentPane().add(lblafterADays);

		JButton btnRandomGuessingGame = new JButton("Random Guessing Game");
		btnRandomGuessingGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RandomGuessing r = new RandomGuessing();
				r.newClass();

			}
		});
		btnRandomGuessingGame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnRandomGuessingGame.setBounds(45, 184, 178, 29);
		frame.getContentPane().add(btnRandomGuessingGame);

		JLabel lbltryAndGuess = new JLabel("<html>Try and guess the number!!! There are different versions too!");
		lbltryAndGuess.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lbltryAndGuess.setBounds(55, 218, 161, 51);
		frame.getContentPane().add(lbltryAndGuess);

		JButton btnDiceRollingSimulation = new JButton("Dice Rolling Simulation");
		btnDiceRollingSimulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiceRolling dr = new DiceRolling();
				dr.newClass();
			}
		});
		btnDiceRollingSimulation.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnDiceRollingSimulation.setBounds(289, 184, 178, 29);
		frame.getContentPane().add(btnDiceRollingSimulation);

		JLabel lblaProbabilityRolling = new JLabel("<html>A probability rolling simulation!");
		lblaProbabilityRolling.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblaProbabilityRolling.setBounds(289, 216, 186, 23);
		frame.getContentPane().add(lblaProbabilityRolling);

		JButton btnHeadsOrTails = new JButton("Heads or Tails?");
		btnHeadsOrTails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HeadsTails ht = new HeadsTails();
				ht.newClass();
			}
		});
		btnHeadsOrTails.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnHeadsOrTails.setBounds(530, 184, 178, 29);
		frame.getContentPane().add(btnHeadsOrTails);

		JLabel lblACoinFlipping = new JLabel("A coin flipping simulation");
		lblACoinFlipping.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblACoinFlipping.setBounds(529, 217, 146, 23);
		frame.getContentPane().add(lblACoinFlipping);

		JLabel pt = new JLabel();
		pt.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\qmark.png"));
		pt.setBounds(111, 255, 46, 67);
		frame.getContentPane().add(pt);

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\dice.png"));
		label.setBounds(331, 238, 92, 72);
		frame.getContentPane().add(label);

		JLabel lab = new JLabel();
		lab.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\coin.png"));
		lab.setBounds(576, 238, 55, 72);
		frame.getContentPane().add(lab);

		JLabel lab1 = new JLabel();
		lab1.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\random.png"));
		lab1.setBounds(40, 122, 188, 51);
		frame.getContentPane().add(lab1);

		JLabel lab2 = new JLabel();
		lab2.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\dr.PNG"));
		lab2.setBounds(277, 93, 186, 80);
		frame.getContentPane().add(lab2);

		JLabel lab3 = new JLabel();
		lab3.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\coinir.PNG"));
		lab3.setBounds(508, 80, 200, 93);
		frame.getContentPane().add(lab3);

		JLabel lblSimulations = new JLabel("Simulations");
		lblSimulations.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblSimulations.setBounds(22, 80, 86, 16);
		frame.getContentPane().add(lblSimulations);

		JLabel lblFunGames = new JLabel("Fun Games!!");
		lblFunGames.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		lblFunGames.setBounds(22, 323, 105, 16);
		frame.getContentPane().add(lblFunGames);

		JButton btnSnake = new JButton("Snake!!");
		btnSnake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainClass m = new MainClass();
				m.newClass();
			}
		});
		btnSnake.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSnake.setBounds(10, 350, 178, 29);
		frame.getContentPane().add(btnSnake);

		JLabel lblaClassicAnd = new JLabel("<html>A classic and common game that is highly addictive!!");
		lblaClassicAnd.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblaClassicAnd.setBounds(17, 383, 161, 32);
		frame.getContentPane().add(lblaClassicAnd);

		JLabel lab4 = new JLabel();
		lab4.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\snake.PNG"));
		lab4.setBounds(198, 356, 75, 80);
		frame.getContentPane().add(lab4);

		JLabel lab5 = new JLabel();
		lab5.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\changer.PNG"));
		lab5.setBounds(541, 336, 175, 60);
		frame.getContentPane().add(lab5);

		JButton btnRapidColorFire = new JButton("Rapid Color Fire!!");
		btnRapidColorFire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driver m = new Driver();
				m.newClass();
			}
		});
		btnRapidColorFire.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnRapidColorFire.setBounds(353, 350, 178, 29);
		frame.getContentPane().add(btnRapidColorFire);

		JLabel lblchooseTheColor = new JLabel("<html>Choose the color that it says as fast as possible!!!");
		lblchooseTheColor.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblchooseTheColor.setBounds(363, 385, 161, 32);
		frame.getContentPane().add(lblchooseTheColor);

		JLabel lab6 = new JLabel();
		lab6.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\breaker.PNG"));
		lab6.setBounds(216, 447, 107, 96);
		frame.getContentPane().add(lab6);

		JButton btnBreakOut = new JButton("Break Out!!");
		btnBreakOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Center c = new Center();
				c.newClass();
			}
		});
		btnBreakOut.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBreakOut.setBounds(10, 460, 178, 29);
		frame.getContentPane().add(btnBreakOut);

		JLabel lbltryAndKill = new JLabel("<html>Try and kill all the bricks with luck and skill!");
		lbltryAndKill.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lbltryAndKill.setBounds(17, 493, 161, 32);
		frame.getContentPane().add(lbltryAndKill);

		JButton btnFlappyBird = new JButton("Flappy Bird!!");
		btnFlappyBird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlappyBird.main(null);
			}
		});
		btnFlappyBird.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnFlappyBird.setBounds(353, 460, 178, 29);
		frame.getContentPane().add(btnFlappyBird);

		JLabel lblaCultClassic = new JLabel("<html>A cult classic game that has addicted people accross the nation");
		lblaCultClassic.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblaCultClassic.setBounds(360, 493, 161, 50);
		frame.getContentPane().add(lblaCultClassic);

		JLabel lab7 = new JLabel();
		lab7.setIcon(new ImageIcon("C:\\Users\\sathv\\Desktop\\Pics\\flap.PNG"));
		lab7.setBounds(541, 471, 75, 72);
		frame.getContentPane().add(lab7);

	}

	public void newClass() {

		frame.setSize(752, 594);
		frame.setLocation(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}
