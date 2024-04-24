package Week5.Classwork;
import java.util.Scanner;
public class Circle {
    double pi = 3.14;
    double radius = 0;
    Scanner keyBoard = new Scanner(System.in);

    public void setRadius(){
        System.out.println("Enter a radius: ");
        radius = keyBoard.nextDouble();
    }

    public void printArea(){
        System.out.println("Circle Area = " + radius*radius*pi);
    }
}
