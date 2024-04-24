package Week6.sept13warmup;

import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Animal aObj1 = new Animal();
        Animal aObj2 = new Animal();
        
        Scanner keyBoard = new Scanner(System.in);
        
        System.out.print("Enter the animal type: ");
        String animalType = keyBoard.nextLine();
        
        System.out.print("Enter the animal age: ");
        int animalAge = keyBoard.nextInt();
        
        aObj1.setVariables(animalType, animalAge);
        aObj1.printInfo();
        
        aObj2.setVariables("Horse", 7);
        aObj2.printInfo();
    }
}
