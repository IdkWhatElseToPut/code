package Week4.Jan29Classwork;

public class Runner {
    public static void main(String[] args){
        Sort s  = new Sort();

        System.out.println("Unsorted Array:");
        s.printArray();
        s.sortArray();
        System.out.println("Sorted Array:");
        s.printArray();

    }
}
