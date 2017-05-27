package BrickBreaker;

import javax.swing.JFrame;

public class Center {
	public void newClass() {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		obj.add(gamePlay);
	}

	public static void main(String[] args) {
		Center c = new Center();
		c.newClass();
	}
}
