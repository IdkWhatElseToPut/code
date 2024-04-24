package Week3.Jan24Classwork;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scramble s = new Scramble();

        int[] numArr = new int[6];
        for(int i =0; i<6;i++){
            numArr[i] = (int)(Math.random()*9+1);
        }

        s.printArray(numArr);
        s.scramble(numArr);
        s.printArray(numArr);

        System.out.println("Enter a number between 1-10: ");
        int index = s.search(scan.nextInt(), numArr);
        System.out.println(index);
        s.printArray(numArr);

        String[] strArr = new String[6];
        strArr[0] = "Frog";
        strArr[1] = "Duck";
        strArr[2] = "Cow";
        strArr[3] = "Dog";
        strArr[4] = "Sloth";
        strArr[5] = "cat";

        s.printArray(strArr);
        s.scramble(strArr);
        s.printArray(strArr);

    }
}
