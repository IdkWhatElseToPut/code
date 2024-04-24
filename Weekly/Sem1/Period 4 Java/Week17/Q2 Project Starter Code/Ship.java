import java.awt.Color;
import java.awt.Graphics;

import Q2Project.Enemy;

public class Ship{
  private int x,y;
  private Color blue;
  private Projectile pObj;
  private boolean fire;
  //Constructor that intiilitzes instance variables
  public Ship(int x,int y){
  this.x=x;
  this.y=y;
  pObj = new Projectile(x,y);
  blue = new Color(0,0,225);
  fire = false;
  }

  //Draw the ship
public void draw(Graphics g){
  //Check to see if projectile should be drawn
  if(fire){
    pObj.draw(g);
  }
  g.setColor(blue);
  g.fillRect(x,y,100,50);
}

  //Move the ship up
  public void moveUp(){
    if(y>0){
    y-=2.5;
      if(!fire){
        pObj.moveUp();
      }
    }
  }
  public void moveDown(){
    y+=2.5;
    if(!fire){
      pObj.moveDown();
    }
  }
  public void fire(){
    fire = true;
  }
  public void moveProjectile(int limit){
    if(fire){
    pObj.move();
    }
      //if the projectile went to the end of the JPanel
    if(pObj.getX()>limit){
      pObj.reset(x,y);
      fire=false;
  }
}

}
