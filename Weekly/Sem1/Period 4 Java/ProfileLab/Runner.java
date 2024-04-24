
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Instantiate three profiles and send in variables for first two
        Profile p1 = new Profile("John", 15, "Science", "Sports", "Salad");
        Profile p2 = new Profile("Alice", 62, "Math", "Video Games", "Burgers");
        Profile p3 = new Profile("", 0, "", "", "");

        //Print out the information for first two profiles
        System.out.println("Profile 1:");
        p1.printInfo();
        System.out.println("\nProfile 2:");
        p2.printInfo();

        //Change the instance variables of p3
        System.out.println("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your favorite subject of the options: Math, Science, History");
        String subject = scanner.nextLine();

        System.out.println("Enter your favorite hobby of the options: Sports, Video Games");
        String hobby = scanner.nextLine();

        System.out.println("Enter your favorite food of the options: Burgers, Salad");
        String food = scanner.nextLine();
        
        //Update p3 with information from user
        p3.updateProfile(name, age, subject, hobby, food);


        //Print out the information and suggest career
        System.out.println("\nProfile 3:");
        p3.printInfo();

        //close scanner
        scanner.close();
    }
}
