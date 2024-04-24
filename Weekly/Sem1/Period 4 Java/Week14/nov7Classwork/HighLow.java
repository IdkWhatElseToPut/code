package Week14.nov7Classwork;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int max = 100, min = 1, guesses = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100. Press enter when you are ready to begin.");
        scan.nextLine(); 

        int guess = (int) (Math.random() * (max - min + 1) + min);

        int input;
        do {
            System.out.println("Is your number " + guess + "?\n1. Higher\n2. Lower\n3. That's correct!");
            input = scan.nextInt();
            guesses++;

            if (input == 1) {
                min = guess + 1;
            } else if (input == 2) {
                max = guess - 1;
            } else if (input != 3) {
                System.out.println("That's not an option. Please select again.");
            }

            guess = (int) (Math.random() * (max - min + 1) + min);


        } while (input != 3);

        System.out.println("Congratulations! I guessed the number in " + guesses + " tries.");
    }
}
