

public class Runner {
    public static void main(String[] args){
        //instantiate ArrayQuiz and set the size to 8
        ArrayQuiz aq = new ArrayQuiz(8);
        //call print
        aq.print();
        //set getNum to a variable then print that variable in a sentance
        int num = aq.getNum(4);
        System.out.println("The element at index location 4 is " + num);
        //print getLargest in a full sentance
        System.out.println("The largest number in the array is " + aq.getLargest());
    }
}
