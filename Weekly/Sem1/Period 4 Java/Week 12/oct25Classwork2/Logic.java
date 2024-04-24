package oct25Classwork2;
import java.util.Scanner;
public class Logic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input;
        int score = 0;
        do{
            int num1 = (int)(Math.random()*5+1), num2 = (int)(Math.random()*5+1);
            System.out.println("\n"+num1);
            System.out.println(num2);
            if(num1==num2&&num1==5){
                System.out.println("you win 10 points");
                score+=10; 
            }else if(num1==num2&&num1<5){
                System.out.println("you win 3 points");
                score+=3;
            }else if(num1>3||num2>3){
                System.out.println("you win 1 points");
                score+=1;
            }else{
                System.out.println("you lose 1 point");
                score-=1;
            }
            System.out.println("Your score is: " + score);
            System.out.println("would you like to play again? (y or n)");
            input = scan.nextLine();
        }while(input.equalsIgnoreCase("y"));
        System.exit(0);
    }
}