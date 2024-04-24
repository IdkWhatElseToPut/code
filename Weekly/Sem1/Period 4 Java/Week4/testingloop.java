import java.util.Scanner;
public class testingloop {
    
    public static void main(String[] args){
         Scanner keyBoard = new Scanner(System.in);
         String answer;
         
         System.out.println("yes or no");
         answer = keyboard.nextLine();
         do{
         if(answer.equals("no")){

            System.out.println("");
            break;
        }else if(answer.equals("yes")){

        }else{
            System.out.println("Please select one of the options.");
            
        }
        }while (!answer.equals("yes") || !answer.equals( "no"));
    
    }
}

