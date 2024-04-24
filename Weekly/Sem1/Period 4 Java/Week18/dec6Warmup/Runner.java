package Week18.dec6Warmup;

public class Runner {
    public static void main(String[] args){
        ArrayTest arrObj = new ArrayTest(5);
        arrObj.print();
        System.out.println("The average is: " + arrObj.average());
        System.out.println("The index of the smallest is: " + arrObj.getIndexOfSmallest());
    }
}
