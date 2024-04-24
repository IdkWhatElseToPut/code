import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

// This class creates and draws a rainy day scene on a JPanel
public class RainyDay extends JPanel{

	// Declare a RainDrop object
	private RainDrop[] rain;
	private Tree[] tree;
	int x=(int)(Math.random()*750+50);
    int y=(int)(Math.random()*500+300);
	Tree t = new Tree(x,y);

	

	// Constructor that initializes a RainyDay object
	public RainyDay() {
		rain = new RainDrop[100];
		for(int i = 0; i<rain.length; i++){
			rain[i] = new RainDrop();
		}
		tree = new Tree[10];
		for(int i = 0; i<tree.length; i++){
			tree[i] = new Tree(x,y);
		}
	}
	
	// JPanel method that sets the size of the JPanel
	@Override
	public Dimension getPreferredSize() {
		//Sets the size of the panel
		return new Dimension(800,600);
	}

	// JPanel method that invokes methods that draw on the JPanel
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		background(g);
		for(Tree each:tree){
			each.drawTree(g);
		}
		for(RainDrop each:rain) {
			each.drawRainDrop(g);
		}
	}
		

	// Method runs continuously to simulate object movement
	public void animate(){
		while(true){
			//wait for .01 second
			try {
			    Thread.sleep(1);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			for(RainDrop each:rain){
				each.moveDown();
			}
		
			//repaint the graphics drawn
			repaint();
		}

	}
	public void background(Graphics g){
		g.setColor(new Color(204,255,255));
		g.fillRect(0,0,800,200);
		g.setColor(new Color(0,153,76));
		g.fillRect(0, 200, 800, 400);
	}
	
}