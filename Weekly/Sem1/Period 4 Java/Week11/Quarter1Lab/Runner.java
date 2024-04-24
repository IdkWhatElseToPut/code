import javax.swing.JFrame;
import java.util.Scanner;

public class Runner {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter a time of day. Day or Night: ");
        String timeOfDay = scan.nextLine();
        System.out.println("Enter a season. Winter, Spring, Fall: ");
        String season = scan.nextLine();
        Scenery canvas = new Scenery(timeOfDay, season);

        JFrame frame = new JFrame("Scenery");
        frame.add(canvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        scan.close();
    }
}