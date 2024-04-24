
//import random and scanner
import java.util.Random;
import java.util.Scanner;

public class Trivia {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        String responseRule;
        String responseSubject;
        int score=0;
        //while,do statement if the user doesn't input yes, it will ask again
        do{
        //stating a rule for the game
        System.out.println("For this game, answers must be in lowercase. Do you understand? Yes or No");
        responseRule = keyBoard.nextLine();
            //if the user understands, start the game
            if(responseRule.equals("yes")){
                //while do statement if user doesn't select an option it will ask again
                do{
                //ask subject
                System.out.println("\nWhat subject do you want trivia for. Math, or Geography?");
                responseSubject = keyBoard.nextLine();
                //math trivia start
                    if(responseSubject.equals("math")){
                        //question 1
                        //create random variables, answer, rounded answer
                        int q1x =(int) (Math.random()*25+1);
                        int q1y =(int) (Math.random()*25+1);
                        
                        double roundedAnswer1 = Math.round((.5*q1x*q1y) * 100.0) / 100.0;
                        System.out.println(roundedAnswer1);

                        //ask question 1
                        System.out.println("\nWhat is the area of a triangle who has a base of " + q1x + " and a height of " + q1y +"? Round to two decimal place.");
                        String response1M = keyBoard.nextLine();
                        //convert string to double
                        double responseDouble1M = Double.parseDouble(response1M);
                        //check response
                        if(responseDouble1M==roundedAnswer1){
                            System.out.println("Good job");
                            score=score+1;
                        }else{
                            System.out.println("Incorrect. The answer was " + roundedAnswer1);
                            
                        }
                        //question 2
                        //create random variables, answer, rounded answer
                        int q2x = (int) (Math.random()*25+1);
                        int q2y = (int) (Math.random()*25+1);
                        
                        double roundedAnswer2 = Math.round((2*q2x+2*q2y) * 100.0) / 100.0;

                        //ask question 2
                        System.out.println("\nWhat is the perimiter of a rectangle with a base of " + q2x + " and a height of " + q2y + "? Round to two decimal place.");
                        String response2M = keyBoard.nextLine();
                        //convert string to double
                        double responseDouble2M = Double.parseDouble(response2M);
                        //check reponse
                       
                        if(responseDouble2M==roundedAnswer2){
                            System.out.println("Good job");
                            score=score+1;
                        }else{
                            System.out.println("Incorrect. The answer was " + roundedAnswer2);
                            
                        }
                        //question 3
                        //create random variables, answer, rounded answer
                        int q3x = (int) (Math.random()*25+1);

                        double roundedAnswer3 = Math.round((q3x*q3x) * 100.0) / 100.0;

                        //ask question 3
                        System.out.println("\nWhat is the Area of a square who's side length is " + q3x + ". Round to two decimal place.");
                        String response3M = keyBoard.nextLine();
                        //convert string to double
                        double responseDouble3M = Double.parseDouble(response3M);
                        //check response
                        if(responseDouble3M==roundedAnswer3){
                            System.out.println("Good job");
                            score=score+1;
                        }else{
                            System.out.println("Incorrect. The answer was " + roundedAnswer3);
                        }
                        //check if first 3 were correct to move to harder questions
                        if(score==3){
                            //Question 4
                            //create random variables, answer, rounded answer
                            System.out.println("\nSince you are doing so well, let's make the problems harder. :)");
                            int q4x = (int) (Math.random()*25+5);
                            double pi = 3.14;
                                                            
                            double roundedAnswer4 = Math.round((4.0/3.0*pi*q4x*q4x*q4x) * 100.0) / 100.0;
                            //ask question 4
                            System.out.println("\nAssuming pi = 3.14, what is the volume of a sphere with a radius of " + q4x + ". Round to two decimal place.");
                            String response4M = keyBoard.nextLine();
                            //convert string to double
                            double responseDouble4M = Double.parseDouble(response4M);
                            //check answer
                            if(responseDouble4M==roundedAnswer4){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was " + roundedAnswer4);
                                
                            }
                            //Question 5
                            //create random variables, answer, rounded answer
                            int q5x = (int) (Math.random()*25+1);
                            int q5y = (int) (Math.random()*25+1);
                            int q5z = (int) (Math.random()*25+1);
                            double roundedAnswer5 = Math.round((.5*q5x*q5y*q5z) * 100.0) / 100.0;
                            //ask question 5
                            System.out.println("\nWhat is the volume of a triangular prism with a base of " + q5x + ", a height of " + q5y + ", and a length of " + q5z + "? Round to two decimal place.");
                            String response5M = keyBoard.nextLine();
                            //convert string to double
                            double responseDouble5M = Double.parseDouble(response5M);
                            //check response
                            if(responseDouble5M==roundedAnswer5){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was " + roundedAnswer5);
                                
                            }
                            //Question 6
                            //create random variables, answer, rounded answer
                            int q6x = (int) (Math.random()*25+1);
                            int q6y = (int) (Math.random()*25+1);
                            int q6z = (int) (Math.random()*25+1);
                          
                            double roundedAnswer6 = Math.round(((6*(.5*q6x*q6y))*q6z) * 100.0) / 100.0;
                            //ask question 6
                            System.out.println("\nWhat is the volume of a regular hexagonal prism that has a face length of " + q6x + ", a length perpindicular to that face length that is " + q6y + ", and a side length of " + q6z + "? Round to two decimal place.");
                            String response6M = keyBoard.nextLine();
                            //convert string to double
                            double responseDouble6M = Double.parseDouble(response6M);
                            //check response
                            if(responseDouble6M==roundedAnswer6){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was " + roundedAnswer6);
                                
                            }
                            //fianl score for hard questions
                            if (score==0 || score==1 || score==2){
                                System.out.println("Your score was " + score + " out of 6 and your grade is an F");
                            }
                            if (score==3){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a D");
                            }
                            if (score==4){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a C");
                            }
                            if (score==5){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a B");
                            }
                            if (score==6){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a A");
                            }
                            //continue easy questions uless first 3 were correct
                        }else{
                            //Question 7
                            //create random variables, answer, rounded answer
                            int q7x = (int) (Math.random()*25+1);
                            int q7y = (int) (Math.random()*25+1);
                           
                            double roundedAnswer7 = Math.round((180-q7x-q7y) * 100.0) / 100.0;
                            //ask question 7
                            System.out.println("\nHow many degrees are in the last angle of a triangle with the other angles being " + q7x + " and "+ q7y + "? Round to two decimal place.");
                            String response7M = keyBoard.nextLine();
                            //convert string to double
                            double responseDouble7M = Double.parseDouble(response7M);
                            //check response
                            if(responseDouble7M==roundedAnswer7){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was " + roundedAnswer7);
                                
                            }
                            //Question 8
                            //create random variables, answer, rounded answer
                            int q8x = (int) (Math.random()*25+1);
                           
                                                   
                            double roundedAnswer8 = Math.round((3.14*q8x*q8x) * 100.0) / 100.0;
                            //ask question 8 
                            System.out.println("\nWhat is the area of a circle assuming pi = 3.14, with a radius of " + q8x +"? Round to two decimal place.");
                            String response8M = keyBoard.nextLine();
                            //convert string to double
                            double responseDouble8M = Double.parseDouble(response8M);
                            //check response
                            if(responseDouble8M==roundedAnswer8){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was " + roundedAnswer8);
                                
                            }
                            //Question 9
                            //create random variables, answer, rounded answer
                            int q9x = (int) (Math.random()*25+1);
                            int q9y = (int) (Math.random()*25+1);
                            int q9z = (int) (Math.random()*25+1);
                            int q9h = (int) (Math.random()*25+1);
                           
                            double roundedAnswer9 = Math.round(((.5*q9x*q9y) + .5*q9z*q9h) * 100.0) / 100.0;
                            //ask question 9
                            System.out.println("\nWhat is the combined area of two triangles. Triangle one's base is " + q9x + " and the height is " + q9y + ". The second triangle has a base of " + q9z + " and a height of " + q9h + ". Round to two decimal place.");
                            String response9M = keyBoard.nextLine();
                            //convert string to double
                            double responseDouble9M = Double.parseDouble(response9M);
                            //check response
                            if(responseDouble9M==roundedAnswer9){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was " + roundedAnswer9);
                                
                            }
                            //final score for easy questions
                            if (score==0 || score==1 || score==2){
                                System.out.println("Your score was " + score + " out of 6 and your grade is an F");
                            }
                            if (score==3){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a D");
                            }
                            if (score==4){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a C");
                            }
                            if (score==5){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a B");
                            }
                            if (score==6){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a A");
                            }
                        }
                        //start geography trivia
                    }else if(responseSubject.equals("geography")){
                        //question 1
                        //print question and options
                        System.out.println("\nWhat country does Mount Everst border?\na) United States and Canada\nb) Pakistan and China\nc) China and Nepal");
                        String response1H = keyBoard.nextLine();
                        //check response
                        if(response1H.equals("c")){
                            System.out.println("Good job");
                            score=score+1;
                        }else{
                            System.out.println("Incorrect. The answer was c.");
                            
                        }
                        //question 2
                        //print question and options
                        System.out.println("\nWhere is the coldest place on Earth??\na) Russia\nb) Antarctica\nc) Norway");
                        String response2H = keyBoard.nextLine();
                        //check response
                        if(response2H.equals("b")){
                            System.out.println("Good job");
                            score=score+1;
                        }else{
                            System.out.println("Incorrect. The answer was b.");
                            
                        }
                        //question 3
                        //print question and options
                        System.out.println("\nWhat is the capital of Australia?\na) Melbourne\nb) Canberra\nc) Perth");
                        String response3H = keyBoard.nextLine();
                        //check response
                        if(response3H.equals("b")){
                            System.out.println("Good job");
                            score=score+1;
                        }else{
                            System.out.println("Incorrect. The answer was b.");
                            
                        }
                        //move to hard questions if first 3 were correct
                        if(score==3){
                            System.out.println("\nSince you are doing so well, let's make the problems harder. :)");
                            //question 4
                            //print question and options
                            System.out.println("What is the smallest country in the world?\na) Nauru\nb) Monaco\nc) Vatican City");
                            String response4H = keyBoard.nextLine();
                            //check response
                            if(response4H.equals("c")){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was c.");
                                
                            }
                            //question 5
                            //print question and options
                            System.out.println("\nWhat is the capital of Senegal?\na) Dakar\nb) Kaolack\nc) Touba");
                            String response5H = keyBoard.nextLine();
                            //check response
                            if(response5H.equals("a")){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was a.");
                                
                            }
                            //question 6
                            //print question and options
                            System.out.println("\nWhat country borders ONLY Russia and China?\na) Mongolia\nb) North Korea\nc) Afghanistan");
                            String response6H = keyBoard.nextLine();
                            //check response
                            if(response6H.equals("a")){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was a.");
                                
                            }
                            //final score after hard questions
                             if (score==0 || score==1 || score==2){
                                System.out.println("Your score was " + score + " out of 6 and your grade is an F");
                            }
                            if (score==3){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a D");
                            }
                            if (score==4){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a C");
                            }
                            if (score==5){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a B");
                            }
                            if (score==6){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a A");
                            }
                            //continue easy questions if one of first 3 was incorrect
                        }else{
                            //question 7
                            //print question and options
                            System.out.println("\nWhere is the Eiffel Tower located??\na) Norway\nb) France\nc) England");
                            String response7H = keyBoard.nextLine();
                            //check response
                            if(response7H.equals("b")){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was b.");
                                
                            }
                            //question 8
                            //print question and options
                            System.out.println("\nWhat country borders the United States??\na) Spain\nb) Canada\nc) Alaska");
                            String response8H = keyBoard.nextLine();
                            //check response
                            if(response8H.equals("b")){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                System.out.println("Incorrect. The answer was b.");
                                
                            }
                            //question 9
                            //print question and options
                            System.out.println("What is the biggest country in the world?\na) United States\nb) China\nc) Russia");
                            String response9H = keyBoard.nextLine();
                            //check respons
                            if(response9H.equals("c")){
                                System.out.println("Good job");
                                score=score+1;
                            }else{
                                    System.out.println("Incorrect. The answer was c.");
                                    
                            }
                            //final score for easy questions
                            if (score==0 || score==1 || score==2){
                                System.out.println("Your score was " + score + " out of 6 and your grade is an F");
                            }
                            if (score==3){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a D");
                            }
                            if (score==4){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a C");
                            }
                            if (score==5){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a B");
                            }
                            if (score==6){
                                System.out.println("Your score was " + score + " out of 6 and your grade is a A");
                            }
                        }
                        //end program after all questions answered
                System.exit(0);
                        //if user didn't select geography or math print this
                    }else{
                         System.out.println("Please select one of the options. Remember the lowercase rule.");
                    }
                }
                //ask the question again if the user doesn't input geography or math
                while (!responseSubject.equals("geography") || !responseSubject.equals( "math"));
                //if user doesn't say yes to rule print this
                }else{
                    System.out.println("\nYou should reread the directions..."); 
            }
        }
        //ask question again until user inputs yes
        while (!responseRule.equals("yes"));
    }
}