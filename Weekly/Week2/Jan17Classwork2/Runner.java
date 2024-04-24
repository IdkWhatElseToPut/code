package Week2.Jan17Classwork2;

public class Runner {
    public static void main(String[] args){
        ArrayTest at = new ArrayTest();

        at.printNumArray();
        at.printStringArray();
        at.swapNumArray(0, 9);
        at.printNumArray();
        at.swapStringArray(1, 2);
        at.printStringArray();
        System.out.println(at.searchString("frog"));
        System.out.println(at.searchString("crab"));
        
    }
}
