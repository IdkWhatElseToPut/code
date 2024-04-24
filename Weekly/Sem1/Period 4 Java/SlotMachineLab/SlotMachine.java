import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SlotMachine {
    private int num1, num2, num3, winnings, balance, bet;
    private BufferedImage slotMachine;
    

    public SlotMachine(int balance) {
        //sets balance to 100 (passed in value)
        this.balance = balance;
        //copyright thingy
        //casino PNG Designed By phichto from https://pngtree.com/freepng/red-slot-machine-big-win-casino-concept-in-realistic-style-vector_5548099.html?sol=downref&id=bef

        //import image
        try {
            slotMachine = ImageIO.read(new File("slotMachine.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void drawMachine(Graphics g) {
        //display imported image
        g.drawImage(slotMachine, 35, 100, 750, 600, null);

        //creating fonts
        Font timesNewRomanMedium = new Font("Times New Roman", Font.PLAIN,20);
        Font timesNewRomanBig = new Font("Times New Roman", Font.PLAIN,160);
        Font arial = new Font("Arial", Font.PLAIN,25);

        g.setColor(Color.BLACK);
        g.setFont(timesNewRomanMedium);
        drawPayout(g);

        //filled rectangles to place text on the machine (could have just made the text white but i didnt want to at the time)
        g.setColor(Color.WHITE);
        g.fillRoundRect(528, 338, 130, 33, 5, 5);
        g.fillRoundRect(528, 408, 127, 33, 5, 5);
        g.fillRoundRect(161, 269, 435, 33, 5, 5);

        //text to display necessary information (winnings, bet, and balance)
        g.setColor(Color.BLACK);
        g.drawString("Winnings: " + winnings, 545, 430);
        g.drawString("Bet: " + bet, 570, 360);
        g.setFont(arial);
        g.drawString("Balance: " + balance, 313, 293);
        g.setFont(timesNewRomanBig);
        g.drawString(num1 + " " + num2 + " " + num3, 150, 480);
        
        //if the user runs out of money, this is displayed
        if (balance <= 0) {
            g.setColor(Color.RED); 
            g.setFont(new Font("Arial", Font.PLAIN, 30)); 
            g.drawString("You're broke! Come back later.", 200, 200); 
            balance=0;
        }

    }
    

    //method to tell user the different payouts
    private void drawPayout(Graphics g) {
        g.drawString("Payout Table:", 550, 50);
        g.drawString("7 7 7 = 100 points", 550, 75);
        g.drawString("3 of a kind = 5 points", 550, 100);
        g.drawString("2 of a kind = 2 points", 550, 125);
    }


    public void play() {
        //sets each integer to a random number
        num1 = (int) (Math.random() * 9 + 1);
        num2 = (int) (Math.random() * 9 + 1);
        num3 = (int) (Math.random() * 9 + 1);

        //decides how much is won based on the combination of numbers and the amount bet
        if (num1 == num2 && num2 == num3) {
            if (num1 == 7) {
                winnings = 100*bet;
            } else {
                winnings = 5*bet;
            }
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            winnings = 2*bet;
        } else {
            winnings = 0;
        }

        //update balance
        balance = balance - bet + winnings;
    }
    //method to set the bet to what button was pressed
    public void bet(int bet){
        this.bet = bet;
    }
    //method so i could use the variable balance in screen file to check if the user has enough money to play
    public int getBalance(){
        return balance;
    }
}
