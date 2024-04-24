package Week14.nov7Warmup;

public class Runner {
    public static void main(String[] args) {
        ForPractice fp = new ForPractice();

        fp.printEven(25);
        System.out.println();

        int val1 = fp.findNum(9, 21, 7);
        if (val1 == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("The number is " + val1);
        }
    

        int val2 = fp.findNum(12, 21, 11);
        if (val2 == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("The number is " + val2);
        }
    }
}
