import java.awt.Color;
import java.awt.Graphics;
public class Tree {
    
	
        private int x, y;
        
        public Tree(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public void drawTree(Graphics g){
		g.setColor(new Color(153,56,0));
		g.fillRect(x, y, 20, 50);
		g.setColor(Color.green);
		g.fillOval(x-20, y-50, 60, 60);
	}
}
