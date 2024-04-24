package Week15.nov15Classwork;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        ForEach forEach = new ForEach();
        Scanner scan = new Scanner(System.in);

        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 99) + 1;
        }

        forEach.printArray(intArray);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        boolean numberFound = forEach.search(number, intArray);
        if(numberFound ==true){
            System.out.println("Number found in the array.");
        }else{
            System.out.println("Number not found in the array.");
        }

        int largestInt = forEach.findLargest(intArray);
        System.out.println("The largest integer is " + largestInt);

        String[] strArray = {"dog", "bird", "cat", "bear", "cow"};

        forEach.printArray(strArray);

        System.out.print("Enter an animal name: ");
        scan.nextLine();
        String animalName = scan.nextLine();
        boolean animalFound = forEach.search(animalName, strArray);
        if(animalFound ==true) {
            System.out.println("Animal found in the array.");
        }else{
            System.out.println("Animal not found in the array.");
        }
    }
}
