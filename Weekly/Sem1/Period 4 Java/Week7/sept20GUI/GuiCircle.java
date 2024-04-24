package Week7.sept20GUI;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

//(5) What is imported to get Graphics to work?
public class GuiCircle extends JPanel {
	private int x, y;

	public GuiCircle() {
		
		x = 300;
		y = 200;
	}

	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//(6) What is being drawn?
        Color colorBrown = new Color(101,67,33);
        g.setColor(colorBrown);
        g.fillRect(x,y+100,50,150);
		Color colorRed = new Color(0, 128, 0);
		g.setColor(colorRed);
		g.fillOval(x-50,y+50,150,100);
        
	}
}