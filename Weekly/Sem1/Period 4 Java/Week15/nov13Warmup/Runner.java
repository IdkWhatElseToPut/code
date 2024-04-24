package Week15.nov13Warmup;

public class Runner {
    public static void main(String[] args){

    ArrayTest at = new ArrayTest(5);

    at.print();
    int sum = at.getSum();

    System.out.println("The sum is " + sum);
    }
}
