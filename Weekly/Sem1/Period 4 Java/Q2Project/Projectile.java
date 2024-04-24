

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;  


public class Projectile {
  //instance variables
  private int  x,y;
  private int width,height;
  private BufferedImage missileImage;

    public Projectile(int x,int y) {
      //sets instance variables
      this.x=x;
      this.y=y;
      this.width = 40;
      this.height = 20;
      //set the image variable to the file its associated with
      try {
      missileImage = ImageIO.read(new File("missile.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    //draw the image
  public void draw(Graphics g){
    g.drawImage(missileImage, x, y+40, null);
  }
  //methods to move the image with the ship
  public void moveUp(){
    y-=20;
  }

  public void moveDown(){
    y+=20;
  }

  //this method moves the image toward the enemy after fired
  public void move(){
    x+=10;
  }

  //rests the location of the projectile to the location of the ship
  public void reset(int x,int y){
    this.x=x;
    this.y=y;
  }

  //methods that allow other classes to see these values
    public int getX(){
        return x;
  }
    public int getY(){
        return y;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
}
  
}
//<a href='https://pngtree.com/freepng/missile-military-equipment-illustration_4762177.html'>png image from pngtree.com/</a>