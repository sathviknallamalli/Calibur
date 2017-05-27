package FlappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel {

	private static final long serialVersionUID = -274743950577187857L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		FlappyBird.flappyBird.repaint(g);
	}

}
