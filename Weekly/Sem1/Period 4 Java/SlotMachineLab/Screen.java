import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JPanel implements ActionListener {
    private SlotMachine sm;
    private JButton spinButton, bet1Button, bet5Button, bet10Button;


    public Screen() {
        //layout set to null so i can changpe it
        setLayout(null);
        sm = new SlotMachine(100);
    
        //spin button
        spinButton = new JButton("Spin");
        spinButton.addActionListener(this);
        spinButton.setBounds(210, 200, 80, 30);
        add(spinButton);
    
        //button to bet 1 
        bet1Button = new JButton("Bet 1");
        bet1Button.addActionListener(this);
        bet1Button.setBounds(300, 200, 80, 30);
        add(bet1Button);
    
        //button to bet 5
        bet5Button = new JButton("Bet 5");
        bet5Button.addActionListener(this);
        bet5Button.setBounds(390, 200, 80, 30);
        add(bet5Button);
    
        //button to bet 10
        bet10Button = new JButton("Bet 10");
        bet10Button.addActionListener(this);
        bet10Button.setBounds(480, 200, 80, 30);
        add(bet10Button);
    }


    //displays everything
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        sm.drawMachine(g);
    }

    //sets window size
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
    //listens for button presses
    @Override
    public void actionPerformed(ActionEvent e) {
        //only lets you play if you have money
        if (e.getSource() == spinButton && sm.getBalance() > 0) {
            sm.play();
            if (sm.getBalance() <= 0) {
                spinButton.setEnabled(false);
                
            }
            //sets bet value based on which button is pressed
        } else if (e.getSource() == bet1Button) {
            sm.bet(1);
        } else if (e.getSource() == bet5Button) {
            sm.bet(5);
        } else if (e.getSource() == bet10Button) {
            sm.bet(10);
        }
        repaint();
    }
    
}
