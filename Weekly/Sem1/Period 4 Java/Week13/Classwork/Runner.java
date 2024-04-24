package Week13.Classwork;

import java.util.Scanner;
public class Runner{
  public static void main(String[] args){
    
    //Insantiates scanner class
    Scanner scan = new Scanner(System.in);
  
    //insantiates NestedLoops class
    NestedLoops obj1 = new NestedLoops();
    
    //call first methodScanner keyBoard = new Scanner(System.in);
    obj1.drawFilledBox();

    //gets value 1
    System.out.println("Enter a Height: ");
    int height1 = scan.nextInt();
    //gets value 2
    System.out.println("Enter a Width: ");
    int width = scan.nextInt();
    
    //takes values from user and calls drawFilledBox()
    obj1.drawFilledBox(height1,width);

    //calls drawMultiChart()
    obj1.drawMultiChart();

    //gets height value for triangle
    System.out.println("Enter a Height: ");
    int height2 = scan.nextInt();

    //calls drawTriangle()
    obj1.drawTriangle(height2);


  }
}