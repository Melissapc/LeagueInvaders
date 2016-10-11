import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
	Alien(int x, int y, int width, int height) {

		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	void update() {
		y ++ ;
		//to do:! the challenge part for league invaders pt 11 )
	}

	void draw(Graphics g) {

		g.setColor(Color.yellow);
		g.drawRect(x, y, width, height);
	}
}
