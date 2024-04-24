import java.util.Scanner;
public class TriviaGame {
    public static void main(String[] args){

        //score keeper
    int scoreFinal;
    scoreFinal=0;
        //question output 1
    System.out.println("What temperature does water boil in Celcius (number only)?");
    
     //answer checker +score question 1
    Scanner keyBoard1 = new Scanner(System.in);
    String answer1 = keyBoard1.nextLine();
    if(answer1.equals("100") ){
    	System.out.println("Good job");
    scoreFinal=scoreFinal+1;
    } else {
	    System.out.println("Sorry wrong answer");
        scoreFinal=scoreFinal;
     }



     //question output 2
    System.out.println(" ");
    System.out.println("Who is the current president (no caps)?");
    
    //answer checker + score question 2
    Scanner keyBoard2 = new Scanner(System.in);
    String answer2 = keyBoard2.nextLine();
    if(answer2.equals("joe biden") ){
    	System.out.println("Good job");
        scoreFinal=scoreFinal+1;
    } else {
	    System.out.println("Sorry wrong answer");
        scoreFinal=scoreFinal;
     }


     //question 3 output
     System.out.println(" ");
    System.out.println("How many hours ahead is Florida?");
   
     //question 3 answer checker + score
    Scanner keyBoard3 = new Scanner(System.in);
    String answer3 = keyBoard3.nextLine();
    if(answer3.equals("3") ){
    	System.out.println("Good job");
        scoreFinal=scoreFinal+1;
    } else {
	    System.out.println("Sorry wrong answer");
        scoreFinal=scoreFinal;
     }

     //question 4 output
     System.out.println(" ");
    System.out.println("What is the name of the big green statue of a lady gifted by france (no caps)?");
  
     //question 4 answer checker + score
    Scanner keyBoard4 = new Scanner(System.in);
    String answer4 = keyBoard4.nextLine(); 
    if(answer4.equals("statue of liberty") ){
    	System.out.println("Good job");
        scoreFinal=scoreFinal+1;
    } else {
	    System.out.println("Sorry, wrong answer");
        scoreFinal=scoreFinal;
     }

     //question 5 output
     System.out.println(" ");
    System.out.println("How many weeks are in a year?");
   
   //question 5 answer checker + score
    Scanner keyBoard5 = new Scanner(System.in);
    String answer5 = keyBoard5.nextLine();
    if(answer5.equals("52") ){
    	System.out.println("Good job");
        scoreFinal=scoreFinal+1;
    } else {
	    System.out.println("Sorry, wrong answer");
        scoreFinal=scoreFinal;
     }
    System.out.println("Your final score was " + scoreFinal + " out of 5");
   
    }
}
