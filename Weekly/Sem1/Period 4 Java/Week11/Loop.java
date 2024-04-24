import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int startingNum1 = 2, topNum1 = 19, total1 = 0;
        int startingNum2 = 2, topNum2 = 19, total2 = 0;

        Scanner scan = new Scanner(System.in);
        int num3 = 1;

        while (startingNum1 <= topNum1) {
            total1 += startingNum1;
            startingNum1++;
        }
        System.out.println(total1);

        do {
            total2 += startingNum2;
            startingNum2++;
        } while (startingNum2 <= topNum2);
        System.out.println(total2);

        System.out.println("Enter a number:");
        int topNumber3 = scan.nextInt();

        if (topNumber3 > 0) {
            while (topNumber3 >= num3) {
                System.out.print(num3 + "  ");
                num3++;
            }
        } else {
            num3 = 1; 
            while (topNumber3 <= num3) {
                System.out.print(num3 + "  ");
                num3--;
            }
        }
    }
}
