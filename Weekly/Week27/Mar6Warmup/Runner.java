package Week27.Mar6Warmup;

public class Runner {
    public static void main(String[] args){NumMatrix2 nm2 = new NumMatrix2(3, 4);

    nm2.print();
    nm2.printReverse();
    System.out.println("The value at [1][3] is " + nm2.getValue(1,3));
    System.out.println("The value at [0][2] is " + nm2.getValue(0, 2));



    }
}
