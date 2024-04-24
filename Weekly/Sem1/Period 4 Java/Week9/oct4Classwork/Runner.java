package Week9.oct4Classwork;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        while (a <= 12) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

       
        int b = 39;
        while (b >= 21) {
            System.out.print(b + " ");
            b--;
        }
        System.out.println();

       
        int c = 2;
        while (c <= 20) {
            System.out.print(c + " ");
            c += 2;
        }
        System.out.println();

   
        int d = 15;
        while (d >= -10) {
            System.out.print(d + " ");
            d-= 5;
        }
        System.out.println();


        System.out.print("Enter a number greater than 1: ");
        int userInput1 = scanner.nextInt();
        int e = 1;
        while (e <= userInput1) {
            System.out.print(e + " ");
            e++;
        }
        System.out.println();

        System.out.print("Enter a number greater than 20: ");
        int userInput2 = scanner.nextInt();
        System.out.print("Enter the count by number: ");
        int count = scanner.nextInt();
        int f = 0;
        while (f <= userInput2) {
            System.out.print(f + " ");
            f += count;
        }
        System.out.println();
    }
}
