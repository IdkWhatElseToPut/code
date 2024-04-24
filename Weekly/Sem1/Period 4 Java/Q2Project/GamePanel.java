

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements KeyListener {
    //instance variables
    private Ship ship;
    private Enemy[] enemies;
    private Font font, fontEndGame;
    private Color white;
    private int score = 0, level = 1;
    private SpaceBackground space;
    private boolean levelRestarted = false;
    //instantiate enemy
    Enemy enemy = new Enemy(725, 50);

    public GamePanel() {
        //instantiate space and ship
        space = new SpaceBackground();
        ship = new Ship(50, 250);
        //set and create the array of enemies to a size of 3
        enemies = new Enemy[3];
        for(int i = 0; i<3; i++){
            enemies[i] = new Enemy(enemy.getX(), enemy.getY()+(i*150));
        }
        //set the variables for text
        font = new Font("Arial", Font.PLAIN, 25);
        fontEndGame = new Font("Arial", Font.PLAIN, 125);
        white = new Color(225, 225, 225);
        //setup the stars in the array
        space.makeStars();

        setFocusable(true);
        addKeyListener(this);

    }
    //set dimension
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600); // Set your desired window size here
    }

    //draw on the window
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //change background based on curent level
        if (level == 1) {
            space.drawBackgroundLevel1(g);
        } else {
            space.drawBackgroundLevel2(g);
        }

        //draw the ship
        ship.draw(g);

        //draw the enemies
        for (Enemy each : enemies) {
            each.draw(g);
        }

        //draw the level and score text
        g.setColor(white);
        g.setFont(font);
        g.drawString("Score: " + score, 15, 40);
        g.drawString("Level: " + level, 130, 40);

        //if the level is 3, the game is over and it draws the end screen
        if (level == 3) {
            g.setColor(white);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.red);
            g.setFont(fontEndGame);
            g.drawString("You Win!", 140, 330);
        }

        //if you are out of lives, it shows a death screen
        if (ship.getLives()<=0){
            g.setColor(white);
            g.fillRect(0, 0, 800, 600);
            g.setColor(Color.red);
            g.setFont(fontEndGame);
            g.drawString("You Lose...", 100, 330);
        }
    }

    //calls methods based on what key was pressed
    public void keyPressed(KeyEvent e) {

        //w means the ship moves up
        if (e.getKeyCode() == 87) {
            ship.moveUp();
        }
        //s means the ship moves down
        if (e.getKeyCode() == 83) {
            ship.moveDown();
        }
        //space means the ship fires
        if (e.getKeyCode() == 32) {
            ship.fire();
        }
        //o is the cheat key and makes the level increase by 1
        if (e.getKeyCode() == 79) {
            level++;
            newLevel();
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    //method to check things/update things constantly
    public void animate() {
        while (true) {
            //how often it refreshes
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            //moves the projectile across the screen after fired
            ship.moveProjectile(800);

            // constantly checking weather the enemy was hit by a projectile or if an enemy collides with the ship
            //calls move random constantly so they are always moving
            for (Enemy each : enemies) {
                each.moveRandom();
                if (ship.checkProjectileCollision(each)) {
                    score++;
                    break;
                }

                //if an enemy hits the ship, it resets. it only does it once because of the levelRestarted boolean flag
                if (ship.checkShipCollision(each)) {
                    //levelRestarted makes it only reset once, otherwise it would be resetting the locations every 10 milliseconds
                    if (levelRestarted==false) {
                        restartLevel();
                        //set flag to true so it stops resetting
                        levelRestarted=true;
                    }
                    break;
                }
            }

            //sets the level restarted flag back to false so if I lose another life, it can properly reset
            if (ship.getLives() <= 2) {
                levelRestarted = false;
            }

            //calls level 2
            levelTwo();


            repaint();
        }
    }

    public void levelTwo() {
        //boolean to check if the enemies are all gone or not
        boolean allEnemiesGone = true;
        //for each enemy, it checks the visibility
        for (Enemy each : enemies) {
            if (each.getVisible()) {
                allEnemiesGone = false;
                break;
            }
        }

        //once all the enemies are gone, then it changes the level
        if (allEnemiesGone == true) {
            //if all the enemies are gone and it is currently level 1, then it moves to level 2. otherwise, it moves to level 3
            if (level == 1) {
                level = 2;
                newLevel();
            } else {
                level = 3;
            }

        }
    }
    //starts level 2. it is its own method so it can be called in both level two and used in the cheat key
    private void newLevel() {
        if (level == 2) {
            enemies = new Enemy[5];
            for (int i = 0; i < 5; i++) {
                enemies[i] = new Enemy(enemy.getX(), enemy.getY() + (i * 100));
            }
        }
    }

    //after losing a life, this is called
    //restarts the current level and resets the score after losing a life
    public void restartLevel() {
        score = 0;
        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = new Enemy(enemy.getX(), enemy.getY() + (i *150));
        }
    }

}