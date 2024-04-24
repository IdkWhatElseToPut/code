import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;

// import KeyListener classes
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class GamePanel extends JPanel implements KeyListener{

  //instance variables
  private Ship ship;

  public GamePanel(){
      //instantiate the ship
      ship = new Ship(50,300);
      setFocusable(true);
      //set up to listen for key clicks
    addKeyListener(this);
  }

  @Override
  public Dimension getPreferredSize() {
    //Sets the size of the panel
          return new Dimension(800,600);
  }

  @Override
  public void paintComponent(Graphics g) {
        super.paintComponent(g);
    //draw the ship
    ship.draw(g);
  }


  public void keyPressed(KeyEvent e){
    //for testing purposes
  System.out.println(e.getKeyCode());
    //interpret the key pressed
    if(e.getKeyCode()==87){//Up arrow was pressed
      ship.moveUp();
    }
    if(e.getKeyCode()==83){
      ship.moveDown();
    }
    if(e.getKeyCode()==32){
      ship.fire();
    }
  }


  // You must have method signatures for all methods that are
  // part of an interface.
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}
  // Run continuously to simulate animation
  public void animate(){

    while(true){
      //wait for .01 second
      try {
          Thread.sleep(10);
      } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
      }
        ship.moveProjectile(800);


      //repaint the graphics
      repaint();
    }

  }

}
