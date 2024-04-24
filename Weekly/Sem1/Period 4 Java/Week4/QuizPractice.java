package Week4;
import java.util.Scanner;
public class QuizPractice {
    public static void main(String[] args){
        double length, width, area;
        String polyName;
        Scanner keyBoard = new Scanner(System.in);

        System.out.print("Enter a length: ");
        length = keyBoard.nextDouble();
    
        System.out.print("Enter a width: ");
        width = keyBoard.nextDouble();

        area=length*width;
        System.out.println("area = length*width = " + area);

        System.out.print("What type of polygon is this? ");
        polyName = keyBoard.next();
        if(polyName.equals("rectangle")){
        System.out.println("You are correct");
    }else{System.out.println("Sorry try again");
}
}
}