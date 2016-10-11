import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders  {
	JFrame frame;
	final static int width = 500;
	final static int height = 800;
	GamePanel g;

	public static void main(String[] args) {
		LeagueInvaders league = new LeagueInvaders();

	}

	LeagueInvaders() {
		frame = new JFrame();
		g = new GamePanel();
		
		setup();
	}

	void setup() {
		frame.add(g);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.addKeyListener(g);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.startGame();
	}


}
