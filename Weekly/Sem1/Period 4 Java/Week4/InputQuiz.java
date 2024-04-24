package Week4;
//import scanner
import java.util.Scanner;
public class InputQuiz{
    public static void main(String[] args){
        //create scanner
        Scanner keyBoard = new Scanner(System.in);
        //ask for name 
        System.out.println("What is your name?");
        String name;
        //reads what was entered for name
        name = keyBoard.nextLine(); 
        //tells what program does
        System.out.println("Hello " + name + ", this program will calculate the area and circumference of a circle.");

        //create variables and initiate variables
        double radius, pi;
        pi = 3.14;

        //get value for radius
        System.out.println("Enter a value for the radius:");
        radius = keyBoard.nextDouble();
        //print known information
        System.out.println("The value of pi is " + pi + " and the value of the radius is " + radius);

        //create and initialize area variable
        double area;
        area = pi*radius*radius;
        //print area value
        System.out.println("area: " + area);


        //create and initalize circimference variable
        double circumference;
        circumference = 2*pi*radius;
        //print circimference vlue
        System.out.println("circumference: " + circumference);
    }
}