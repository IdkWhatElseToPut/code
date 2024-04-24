package Week13.oct30Warmup;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade 1: ");
        int grade1 = scan.nextInt();
        System.out.println("Enter grade 2: ");
        int grade2 = scan.nextInt();
        System.out.println("Enter grade 3: ");
        int grade3 = scan.nextInt();

        Grade grade  = new Grade(grade1, grade2, grade3);

        Boolean pass;

        pass=grade.checkPass();

        if(pass == true){
            System.out.println("You passed!");
        }else{
            System.out.println("You didn't pass :(");
        }


    }
    
}
