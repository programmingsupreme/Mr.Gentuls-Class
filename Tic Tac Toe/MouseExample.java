import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseExample extends Applet implements MouseListener{
	int mouseX = 0;
	int mouseY = 0;
	
	public void init(){
		try{Thread.sleep(200);}catch(Exception e){} // pauses for 200 milliseconds - sometimes setSize does not work, this fixes that - we dont need to talk aobut it
		setSize(800,600); // sets the size of the window to 800x600
		addMouseListener(this); // tells us where to find the methods that react to the mouse. They are in 'this' file
		setFocusable(true); // gives this window the focus, meaning this program will react to the mouse and the keyboard instead of the last program you were using
		setBackground(Color.BLUE);
	}
	public void paint(Graphics g){
		g.setFont(new Font("Chalkduster", Font.BOLD, 24));
		g.drawString("Mouse Clicked at (" + mouseX + ", " + mouseY + ")", 20, 20);
	}
	/*
	 * This method is called when the mouse button is pressed and released
	 */
	public void mouseClicked(MouseEvent e) {
		int x = e.getX(); // gets x coordinate of the mouse pointer
		int y = e.getY(); // gets y coordinate of the mouse pointer
		mouseX = x;
		mouseY = y;
		repaint();
	}
	/*
	 * This method is called when the mouse button is pressed
	 */
	public void mousePressed(MouseEvent e) {
	
	}
	/*
	 * This method is called when the mouse button is released
	 */
	public void mouseReleased(MouseEvent e) {

	}
	/*
	 * This method is called when the mouse pointer enters the window
	 */
	public void mouseEntered(MouseEvent e) {

	}
	/*
	 * This method is called when the mouse pointer leaves the window
	 */
	public void mouseExited(MouseEvent e) {

	}
}
