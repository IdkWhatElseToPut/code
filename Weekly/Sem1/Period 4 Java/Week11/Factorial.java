public class Factorial {
    public static void main(String[] args){

    int num = 5;
    int num2 = num;
    int total=1;


    do{
        total *= num;
        num--;
    }while(num>0);

    while (num>0);{
        total *= num;
        num--;
    }
    System.out.println(num2 + "! = " + total);




    //the difference between a do while loop and a while loop is that a do while loop will always run at least once
    }
}
