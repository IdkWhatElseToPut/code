package Week5.Classwork;
import java.util.Scanner;

public class Triangle {
    Scanner keyBoard = new Scanner(System.in);
    public void printArea(){

    System.out.println("Enter a base: ");
    double base = keyBoard.nextDouble();

    System.out.println("Enter a height: ");
    double height = keyBoard.nextDouble();

    System.out.println("Triangle Area = " + .5*base*height);
    }
}
