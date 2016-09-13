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
 
Timer time ;

GamePanel(){
time = new Timer(1000/60,this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		// TODO Auto-generated method stub
		o.update();
	}
	void  startGame(){
		time.start();
	}
public void paintComponent(Graphics g){
	o.draw(g);
	}
@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("mouse dragged");
	
}
@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Mouse moved");
	
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("mouse clicked");
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("mouse pressed");
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("mouse released");
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	System.out.println("mouse entered");
	
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
	System.out.println("key pressed");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("key released");
	
}
 
}
