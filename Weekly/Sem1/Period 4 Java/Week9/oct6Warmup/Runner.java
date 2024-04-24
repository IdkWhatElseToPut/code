package Week9.oct6Warmup;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number greater than 1: ");
        int number = scan.nextInt();

        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            int sum = 0;
            int x = 1;
            while (x <= number) {
                sum += x;
                x++;
            }
            System.out.println("The summation from 1 to " + number + " is: " + sum);
        }
    }
}
