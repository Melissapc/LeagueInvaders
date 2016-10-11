import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener {

	GameObject o = new GameObject();

	Timer time;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titlefont;
	Font enterfont;
	Font spacefont;
	Rocketship rock;
	ObjectManager object = new ObjectManager();

	GamePanel() {
		titlefont = new Font("Arial", Font.PLAIN, 48);
		enterfont = new Font("Arial", Font.PLAIN, 35);
		spacefont = new Font("Arial", Font.PLAIN, 30);
		time = new Timer(1000 / 60, this);
		rock = new Rocketship(250, 700, 50, 50);
		object.addObject(rock);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	void startGame() {
		time.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		object.update();
		object.manageEnemies();
	}

	public void updateEndState() {

	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(titlefont);
		g.setColor(Color.PINK);
		g.drawString("LEAGUE INVADERS", 40, 200);

		g.setFont(spacefont);

		g.setColor(Color.RED);
		g.drawString(" press ENTER to start", 20, 300);

		g.setFont(enterfont);
		g.setColor(Color.GREEN);
		g.drawString("press SPACE for instructions", 15, 400);

	}

	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		object.draw(g);

	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);
		g.drawString("Game Over", 60, 400);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Dragged");

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Moved");

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse entered");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseexited");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hiii");

	}

	@Override
	public void keyPressed(KeyEvent e) {

		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;

			if (currentState > END_STATE) {
				currentState = MENU_STATE;
			}

		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {

			object.addObject(new Projectile(rock.x, rock.y, 10, 10));

		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rock.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rock.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rock.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rock.right = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key released");
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rock.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rock.down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rock.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rock.right = false;
		}
	}

}
