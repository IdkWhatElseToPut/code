import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        //title window
        JFrame frame = new JFrame("Slot Machine Game");
        //create window
        Screen canvas = new Screen();
        frame.add(canvas);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
