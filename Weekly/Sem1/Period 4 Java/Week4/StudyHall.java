package Week4;
import java.util.Scanner;
public class StudyHall {
    //Noah Kikuta, Drew Honer, Leo Colli
    public static void main(String[] args){
        //overall scanner
        Scanner keyBoard = new Scanner(System.in);
        
        //asking which subject trivia
        System.out.println("What subject do you want trivia for. History, Math, or Science?");
        String answer = keyBoard.nextLine();
        if(answer.equals("Math")){
            //score
             int score;
        score=0;
            //question one
              System.out.println("What is the formula for volume of a sphere?");
        String answer1 = keyBoard.nextLine();
        if(answer1.equals("4/3pir^3") ){
            System.out.println("Good job");
        score=score+1;
        } else {
            System.out.println("Sorry wrong answer. It was 4/3pir^3");
            score=score;
         }
        //question 2
        System.out.println("What number doesn't have a Roman Numberal?");
        String answer2 = keyBoard.nextLine();
        if(answer2.equals("0") ){
            System.out.println("Good job");
        score=score+1;
        } else {
            System.out.println("Sorry wrong answer. It was 0");
            score=score;
         }
         //question 3
        System.out.println("What triangle has all sides with equal lengths");
        String answer3 = keyBoard.nextLine();
        if(answer3.equals("equilateral") ){
            System.out.println("Good job");
        score=score+1;
        } else {
            System.out.println("Sorry wrong answer. It was equilateral");
            score=score;
         }
         //question 4
        System.out.println("What are the first 3 digits of pi?");
        String answer4 = keyBoard.nextLine();
        if(answer4.equals("3.14") ){
            System.out.println("Good job");
        score=score+1;
        } else {
            System.out.println("Sorry wrong answer. It was 3.14");
            score=score;
         }
         
         //question 5
        System.out.println("Is 2 a prime number?");
         String answer5 = keyBoard.nextLine();
        if(answer5.equals("yes") ){
            System.out.println("Good job");
        score=score+1;
        } else {
            System.out.println("Sorry wrong answer. It was yes");
            score=score;
         }
         System.out.println("Your final score was " + score + " out of 5");
    }

         //selection for other topic
     else if(answer.equals("Science")){

        //settin score equal to zero and creating the scanner
       int scoreS = 0;
       Scanner sc = new Scanner(System.in);
       Scanner typedAnswer = new Scanner(System.in);
	//asking first question, if get right then +1 to scoreS if not move on 
       System.out.println("Does sound travel faster in the air or in water?");
       String answer1 = typedAnswer.next();
       if(answer1.equals("water")){
           System.out.println("correct!");
           scoreS = scoreS +1;
       }
       else{
           System.out.println("incorrect!");
       }
	//same with second question
        System.out.println("Which is the most abundant element in the universe??");
       String answer2 = typedAnswer.next();
       if(answer2.equals("hydrogen")){
           System.out.println("correct!");
           scoreS = scoreS +1;
       }
       else{
           System.out.println("incorrect!");
       }
	//same with third question 
       System.out.println("True or False? Electrons are smaller than atoms");
       String answer3 = sc.nextLine();
       if (answer3.equals("True")){
       System.out.println("correct");
       scoreS =scoreS +1;
       }
       else{
           System.out.println("incorrect");
       }
	//same as first question with fourth question
        System.out.println("What color is the blood inside your body?");
       String answer4 = sc.nextLine();
       if (answer4.equals("red")){
       System.out.println("correct");
       scoreS =scoreS +1;
       }
       else{
           System.out.println("incorrect");
       }
	//same as other questions.
        System.out.println("is pluto a planet?");
       String answer5 = sc.nextLine();
       if (answer5.equals("no")){
       System.out.println("correct");
       scoreS =scoreS +1;
       }
       else{
           System.out.println("incorrect");
       }
       System.out.println("You got " +scoreS+ " out of five correct");
    }

        // selection for other topic
    else if(answer.equals("History")){
        //creating variables 
		int hScore = 0;
		int userInput;
		//Question 1 
		//Get user input
		System.out.print("What year was the battle of Ticonderoga: ");
		userInput = keyBoard.nextInt();
		//check if answer is correct and tell user
		if (userInput == 1775){
			System.out.println("Correct!");
			//increase score
			hScore = hScore + 1;
		}
		else{
			System.out.println("Incorrect.");
		}
		//Question 2
		//Get user input
		System.out.print("What year did the US gain independence: ");
		userInput = keyBoard.nextInt();
		//check if answer is correct and tell user
		if (userInput == 1776){
			System.out.println("Correct!");
			//increase score
			hScore = hScore + 1;
		}
		else{
			System.out.println("Incorrect.");
		}
		//Question 3
		//Get user input
		System.out.print("What year did John F kennedy die: ");
		userInput = keyBoard.nextInt();
		//check if answer is correct and tell user
		if (userInput== 1963){
			System.out.println("Correct!");
			//increase score
			hScore = hScore + 1;
		}
		else{
			System.out.println("Incorrect.");
	}
		//Question 4
		//Get user inputz
		System.out.print("What year did WWII end: ");
		userInput = keyBoard.nextInt();
		//check if answer is correct and tell user
		if (userInput == 1945){
			System.out.println("Correct!");
			//increase score
			hScore = hScore + 1;
		}
		else{
			System.out.println("Incorrect.");
		}
		//Question 5
		System.out.print("When was Obama inaugurated: ");
		userInput = keyBoard.nextInt();
		//check if answer is correct and tell user
		if (userInput == 2009){
			System.out.println("Correct!");
			//increase score
			hScore = hScore + 1;
		}
		else{
			System.out.println("Incorrect.");
		}
		System.out.println("Score: "+ hScore);
        }  
    }
}