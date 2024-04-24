

import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;    

public class Enemy {
    //instance variables
    //image variable
    private BufferedImage alienImage;
    private int x, y, width, height, num, call = 0;
    private boolean visible;

    public Enemy(int x, int y){
        //set variables
        this.x = x;
        this.y = y;
        this.width = 75;
        this.height = 100;

        visible = true;

        //set the image variable to the file its associated with
        try {
            alienImage = ImageIO.read(new File("alien.jpg"));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    //methods to get x,y,width,height information to other classes
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

    //draw the image if it is supposed to be visible
    public void draw(Graphics g){
        if(visible){
        g.drawImage(alienImage, x, y, null);
        }
    }
    //hide image
    public void disappear(){
        visible = false;
    }
    //allow other classes to get whether it is visible
    public boolean getVisible(){
        return visible;
    }
    //methods to move the alien up or down. if the enemy is going to go out of the screen, set the y value so it stays on the screen
    public void moveUp(){
        y-=2;
        if(y<0){
            y=0;
        }
    }
    public void moveDown(){
        y+=2;
        if(y>500){
            y=500;
        }
    }

    //call the move methods randomly
    public void moveRandom(){
        //move left constantly
        x-=1;
        //increase the value of call constantly
        call+=1;
        //if call divided by 20 has a remainder of 0, then set num to a random number which calls the movement up or down.
        //basically slows down how often the random up and down is called so it isn't just jittering up and down super fast
        if (call%20==0) {
            num = (int)(Math.random()*2+1);
        }
        if(num == 1){
            moveUp();
        }else if(num == 2){
            moveDown();
        }
    }
    
}


//alien image used
//image: <a href="https://www.freepik.com/free-vector/sticker-template-with-alien-monster-ufo-robot-isolated_18554443.htm#query=alien%20transparent&position=33&from_view=keyword&track=ais&uuid=d10399e8-c29e-4ee1-9bf0-a08d43361902">Image by brgfx</a> on Freepik