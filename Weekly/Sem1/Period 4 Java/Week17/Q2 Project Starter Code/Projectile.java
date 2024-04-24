import java.awt.Color;
import java.awt.Graphics;

// Code that implements a projectile
public class Projectile {

    // Instance variables
  private int  x,y;
  private int width,height;
  private Color red;

    // Constructor
    public Projectile(int x,int y) {
    // intialize instance varibles
      this.x=x;
      this.y=y;
      this.width = 5;
      this.height = 10;
      this.red = new Color(255,0,0);
    }
  // draw the projectile
  public void draw(Graphics g){
    g.setColor(red);
    g.fillOval(x,y,width,height);
  }
// move projetile up
  public void moveUp(){
    y-=2.5;
  }
  // move projetile down
  public void moveDown(){
    y+=2.5;
  }
// move the projectile to the right
  public void move(){
    x+=10;
  }
  // reset the projectile
  public void reset(int x,int y){
    this.x=x;
    this.y=y;
  }
  // return the x cordinate
  public int getX(){
    return x;
  }
}
