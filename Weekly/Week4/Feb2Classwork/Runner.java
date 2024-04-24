package Week4.Feb2Classwork;

public class Runner {
    public static void main(String[] args){
        ArrList a = new ArrList();

        a.printList();
        int largest  = a.searchLargest();
        System.out.println("Largest: " + largest);
        a.searchAndReplace(largest);
        a.printList();
        a.searchAndRemove(1000);
        a.printList();
        a.scramble();
        a.printList();
        
    }
}
