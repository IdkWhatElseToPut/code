import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        int age1;
        int age2;
        int birthYear;
        System.out.println("Enter your birth year");
         Scanner sc = new Scanner(System.in);
        birthYear = sc.nextInt();
        age1=2023-birthYear;
        age2=2023-birthYear-1;
        System.out.println("Your age is " + age2 + " or " + age1);
    }
}
