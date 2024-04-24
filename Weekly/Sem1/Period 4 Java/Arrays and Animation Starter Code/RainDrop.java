import java.awt.Color;
import java.awt.Graphics;

// This class creates and moves one raindrop
public class RainDrop{
	
	private int x, y;
	private Color blue;
	
	public RainDrop(){
		x = (int)(Math.random()*799);
		y= (int)(Math.random()*596);
		blue = new Color(0,0,255);
	}
	
	public void drawRainDrop(Graphics g) {
		g.setColor(blue);
		g.fillOval(x, y, 3,7);
	}
	
	public void moveDown() {
		y ++;
		if(y>600){
			y=-5;
			x= (int)(Math.random()*799);
		}
	}
}