package Week5;
import java.util.Scanner;
public class BuildSentence {
    public static void main(String[] args){
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter a verb");
        String verb = keyBoard.nextLine();
        System.out.println("Enter a singular noun");
        String noun = keyBoard.nextLine();
        String sentence = ("The " + noun + " " + verb + "s");
        System.out.println(sentence);
    }
}
