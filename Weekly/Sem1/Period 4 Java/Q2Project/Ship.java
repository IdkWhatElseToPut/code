

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Ship {
    //instance variables
    private BufferedImage shipImage, heartImage;
    private int x, y, lives = 3;
    private BufferedImage[] hearts;
    private boolean fire;
    private Projectile pObj;

    public Ship(int x, int y) {
        //set x and y to what was passed in
        this.x = x;
        this.y = y;

        //instantiate projectile and set fire to false
        pObj =new Projectile(x, y);
        fire= false;

        //instantiate hearts as an array of images
        hearts = new BufferedImage[3];
        //set the image variable to the file its associated with
        try {
            shipImage = ImageIO.read(new File("ship.jpg"));
            heartImage = ImageIO.read(new File("heart.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //setup the array of hearts
        for (int i = 0; i <3; i++) {
            hearts[i] = heartImage;
        }
    }

    //draw the ship, lives, and projectiles
    public void draw(Graphics g) {
        //if the projectile is fired, then draw
        if(fire){
            pObj.draw(g);
        }

        //draw the ship
        g.drawImage(shipImage, x, y, null);

        //draw the lives
        for (int i = 0; i < lives; i++) {
            g.drawImage(hearts[i], 10 + (i * 40), 50, null);
        }
    }


    //methods to mvoe the ship up and down
    //also moves the projectile with it
    public void moveUp() {
        //only allows the ship and projectile to move if it isn't going to leave the screen
        if (y > 0) {
            y -= 20;
            if (!fire) {
                pObj.moveUp();
            }
        }
    }

    public void moveDown() {
                //only allows the ship and projectile to move if it isn't going to leave the screen
        if (y < 460) {
            y += 20;
            pObj.moveDown();
        }
    }

    //fires the projectile becasue fire is set to true
    public void fire() {
        fire=true;
    }

    //moves the projectile toward the enemy
    public void moveProjectile(int limit){
        //if fired, move the projectile to the right
    if(fire){
        pObj.move();
    }
    //if the projectile goes off the screem, reset it to the ship's position and reset the fire flag
    if(pObj.getX()>limit){
        pObj.reset(x,y);
        fire=false;
    }
}
    

//check if the projectile collided with the enemy
    public boolean checkProjectileCollision(Enemy eObj){
		
        //only moves on if the enemy is visible
        if( eObj.getVisible() ){ 
        
            //setup variables for the projectile position
            int pX = pObj.getX();
            int pY = pObj.getY();
            int pWidth = pObj.getWidth();
            int pHeight = pObj.getHeight();

            //setup variables for the enemy positon
            int eX = eObj.getX();
            int eY = eObj.getY()-20;
            int eWidth = eObj.getWidth();
            int eHeight = eObj.getHeight();

            //if any part of the projectile and the enemy intersect, it calls the following things
            if(pX+pWidth >= eX && pX <= eX + eWidth  &&  
                pY+pHeight >= eY && pY <= eY + eHeight) {
                    //if they collide, the enemy disappears, the projectile returns to the ship, and the fire flag is reset
                eObj.disappear();
                pObj.reset(x, y);
                fire = false;
                return true;
            }
        }
    return false;
    }

    public boolean checkShipCollision(Enemy eObj) {
        if (eObj.getVisible()) {

            //setup variables for the ship position
            int sX = x;
            int sY = y;
            int sWidth = 150;
            int sHeight = 150;

            //setup variables for the enemy position
            int eX = eObj.getX();
            int eY = eObj.getY();
            int eWidth = eObj.getWidth();
            int eHeight = eObj.getHeight();

            // if any part of the projectile and the enemy intersect, it calls the following things
            if (sX + sWidth >= eX && sX <= eX + eWidth &&
                sY + sHeight >= eY && sY <= eY + eHeight) {
                    //the enemy disappears, the ship rests its location, and the ship loses a life which causes the level to restart
                eObj.disappear();
                lives--;
                y = 250;
                return true;
            }
            //if the enemies reach the end of the screen, the ship loses a life, resets location, and the enemy disappears
            if (eX < 0) {
                eObj.disappear();
                lives--;
                y = 250;
                return true;
            }
        }
        return false;
    }

    //method so other classes can see the value of lives
    public int getLives() {
        return lives;
    }
}