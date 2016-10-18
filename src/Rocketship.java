import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	boolean up = false;
	boolean down = false;
	boolean left = false;
	boolean right = false;
	final int speed = 5;

	Rocketship(int x, int y, int width, int height) {
		super();
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		
		super.update();

		if (up) {
			y -= speed;
		}
		if (down) {
			y += speed;
		}
		if (left) {
			x -= speed;
		}
		if (right) {
			x += speed;
		}
	}

	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}

}
