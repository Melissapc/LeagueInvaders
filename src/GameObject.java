import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive= true;
	Rectangle collisionBox = new Rectangle(x,y, width,height);
	
	public static void main(String[] args) {
	
}
	void update(){
		collisionBox.setBounds(x, y, width, height);

	}
void draw(Graphics g){
	
}
}
