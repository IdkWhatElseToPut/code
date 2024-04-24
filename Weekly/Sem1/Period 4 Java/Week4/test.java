import java.util.Random;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        Random random = new Random();
        int score;
        score=0;
        System.out.println("\nSince you are doing so well, let's make the problems harder. :)");
        int q4x = random.nextInt(50)+1;
        double pi = 3.14;
        double ans4 = 4.0/3.0*pi*q4x*q4x*q4x;
        double roundedAnswer4 = Math.round(ans4 * 10.0) / 10.0;

        System.out.println("\nAssuming pi = 3.14, what is the volume of a sphere with a radius of " + q4x + ". Round to one decimal.");
        String response5 = keyBoard.nextLine();
        ans4 = Double.parseDouble(response5);
        if(ans4==roundedAnswer4){
            System.out.println("Good job");
            score=score+1;
        }else{
            System.out.println("Incorrect. The answer was " + roundedAnswer4);
            score=score;
        }
    }
    
}
