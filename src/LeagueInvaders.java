import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders  {
	JFrame frame;
	int width = 500;
	int height = 800;
	GamePanel g;

	public static void main(String[] args) {
		LeagueInvaders haha = new LeagueInvaders();

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
