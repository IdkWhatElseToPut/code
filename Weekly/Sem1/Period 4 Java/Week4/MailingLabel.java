package Week4;
import java.util.Scanner;
public class MailingLabel {
    public static void main(String[] args){

        System.out.println("What is your first name?");
         Scanner keyBoard1 = new Scanner(System.in);
         String  nameFirst = keyBoard1.next();

        System.out.println("What is your last name?");
         Scanner keyBoard2 = new Scanner(System.in);
         String  nameLast = keyBoard2.next();

        System.out.println("What is your full adress?");
         Scanner keyBoard3 = new Scanner(System.in);
         String  adress = keyBoard3.nextLine();

        System.out.println("What is your city name and state ID? ex: somewhere, CA");
         Scanner keyBoard4 = new Scanner(System.in);
         String  cityState = keyBoard4.nextLine();

        System.out.println("What is your zip code?");
         Scanner keyBoard5 = new Scanner(System.in);
         int  zipCode= keyBoard5.nextInt();

        System.out.println(nameFirst + " " + nameLast + "\t\t\t" + nameFirst + " " + nameLast + "\n" + adress + "\t\t" + adress + "\n" + cityState + " " + zipCode + "\t\t" + cityState + " " + zipCode); 
    }
}
