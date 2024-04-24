

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpaceBackground {
    //instance variables
    private int[] starX, starY;
    private BufferedImage asteroidImage, planetsImage;
    private int asteroidX = 0, stars = 200, planetsX = 0;

    public SpaceBackground() {
        //set an array of size stars for both x coordinate and y coordinate
        starX = new int[stars];
        starY = new int[stars];

        
        //set the image variable to the file its associated with    
        try {
            asteroidImage = ImageIO.read(new File("asteroids.jpg"));
            planetsImage = ImageIO.read(new File("planets.jpg"));
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //method to setup the values in the array with random coordinates
    public void makeStars() {
        for (int i = 0; i < stars; i++) {
            starX[i] = (int)(Math.random()*800 + 1);
            starY[i] = (int)(Math.random()*600 + 1);
        }
    }
    //level 1 background
    public void drawBackgroundLevel1(Graphics g) {
        g.setColor(new Color(30, 33, 75));
        g.fillRect(0, 0, 800, 600);
        drawStars(g); 
        drawAsteroids(g);
    }

    //level 2 background
    public void drawBackgroundLevel2(Graphics g) {
        drawPlanets(g); 
        drawStars(g); 
    }

    //method that draws the stars
    public void drawStars(Graphics g) {
        g.setColor(Color.white);
        for (int i = 0; i < stars; i++) {
            g.drawLine(starX[i], starY[i], starX[i] + 15, starY[i]);
            starX[i] -= 5;

            if (starX[i] < 0) {
                starX[i] = 800;
            }
        }
    }

    //draw the asteroid image
    //makes it seamless betweent he images
    public void drawAsteroids(Graphics g) {
        //2 images because one starts right after the other ends
        g.drawImage(asteroidImage, asteroidX, 0, null);
        g.drawImage(asteroidImage, asteroidX + asteroidImage.getWidth(), 0, null);
        asteroidX -= 2;
        //once the image completely finishes, it resets the location to the begninng
        if (asteroidX < -asteroidImage.getWidth()) {
            asteroidX = 0;
        }
    }

    //draw the planet image
    //makes a seamless moving background image
    public void drawPlanets(Graphics g) {
        //2 images because one starts right after the other ends
        g.drawImage(planetsImage, planetsX, 0, null);
        g.drawImage(planetsImage, planetsX + planetsImage.getWidth(), 0, null);
    
        planetsX -= 2;
        //once the image completely finishes, it resets the location to the begninng
        if (planetsX < -planetsImage.getWidth()) {
            planetsX = 0;
        }
    }
}
