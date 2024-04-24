package Week30.Apr3Classwork1;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;



public class Screen extends JPanel {
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(800,600);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		

		drawBranch(g, 400, 400, 70, 90);
        g.drawLine(400,400,400,550); //trunk of the tree
	}
	
	private void drawBranch(Graphics g, int x, int y, int width, int height) {

	}
}