import java.math.*;
import java.util.Scanner;
public class MathGame {
    public static void main(String[] args){
      double a;
      double b;
      double c;
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter value of 'a'");
      a=scan.nextDouble();

      System.out.print("Enter value of 'b'");
      b=scan.nextDouble();

      System.out.print("Enter value of 'c'");
      c=scan.nextDouble();
      
      double x1;
      double x2;

      x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
      x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
      System.out.println("Quadratic formula: x="+ x1 + "," + x2);

      double x3;
      x3=a+b;
      System.out.println("Addition: x=" + x3);
      double x4;
      x4=a-b;
      System.out.println("Subtraction: x=" + x4);
      double x5;
      x5=a*b;
      System.out.println("multiplication: x=" + x5);
      double x6;
      x6=a/b;
      System.out.println("division: x=" + x6);
    }
}