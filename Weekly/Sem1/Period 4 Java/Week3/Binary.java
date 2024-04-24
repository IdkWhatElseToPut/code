
import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in a number between 0 and 15 to convert to binary.");
        int num = sc.nextInt();
        int remainder = 0;
        int result = 0;
        
        if(num == 0){
            System.out.println("0000");
        }
         if(num == 1){
            System.out.println("0001");
         }
         if(num == 2){
            System.out.println("0010");
         }
         if(num == 3){
            System.out.println("0011");
         }
         if(num == 4){
            System.out.println("0100");
         }
         if(num == 5){
            System.out.println("0101");
         }    
          if(num == 6){
            System.out.println("0110");
         }
          if(num == 7){
            System.out.println("0111");
         }
          if(num == 8){
            System.out.println("1000");
         }
          if(num == 9){
            System.out.println("1001");
         }
          if(num == 10){
            System.out.println("1010");
         }
          if(num == 11){
            System.out.println("1011");
         }
          if(num == 12){
            System.out.println("1100");
         }
          if(num == 13){
            System.out.println("1101");
         }
          if(num == 14){
            System.out.println("1110");
         }
          if(num == 15){
            System.out.println("1111");
         }
    }
}