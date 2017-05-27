package Motion;

import java.awt.Font;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Motion extends JFrame {

	public Motion() {
		getContentPane().setLayout(null);

		JLabel title = new JLabel("Physics - Motion Course");
		title.setFont(new Font("Castellar", Font.PLAIN, 20));
		title.setBounds(256, 11, 329, 42);
		getContentPane().add(title);

		JLabel quizIntro = new JLabel(
				"Before beginning the real content of this course, please take a quick preview/quiz about the course");
		quizIntro.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		quizIntro.setBounds(126, 50, 556, 16);
		getContentPane().add(quizIntro);

		ButtonGroup bg1 = new ButtonGroup();

		ButtonGroup bg2 = new ButtonGroup();

		ButtonGroup bg4 = new ButtonGroup();

		ButtonGroup bg5 = new ButtonGroup();

		ButtonGroup bg6 = new ButtonGroup();

		ButtonGroup bg7 = new ButtonGroup();

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(715, 455, 109, 37);
		getContentPane().add(btnNewButton);

		ButtonGroup bg3 = new ButtonGroup();

		ButtonGroup bg8 = new ButtonGroup();

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
				frame.setSize(348, 145);
				frame.setLocation(600, 300);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				int maxScore = 0;

				frame.getContentPane().setLayout(null);
				JLabel result = new JLabel("You scored " + maxScore + " out of 8");
				result.setFont(new Font("Times New Roman", Font.BOLD, 14));
				result.setBounds(27, 39, 272, 27);
				frame.getContentPane().add(result);

				JButton next = new JButton("Next Lesson >>>>");
				next.setFont(new Font("Times New Roman", Font.PLAIN, 14));
				next.setBounds(142, 77, 168, 23);
				frame.getContentPane().add(next);

				next.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Lesson1 l1 = new Lesson1();
						l1.newClass();
						close();

					}
				});

			}
		});

	}

	public void close() {
		WindowEvent w = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
	}

	public void newClass() {

		setSize(857, 540);
		setLocation(300, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}
