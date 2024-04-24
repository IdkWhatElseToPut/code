package Week15.nov17Warmup;
public class Runner {
    public static void main(String[] args){
    ArrayTest at = new ArrayTest(4);
        at.print();
        System.out.println();
        System.out.println("The smallest number in the array is: " + at.getSmallest());
    }
}
