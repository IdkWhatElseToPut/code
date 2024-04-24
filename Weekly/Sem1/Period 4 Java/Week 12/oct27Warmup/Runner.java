package oct27Warmup;

public class Runner {
    public static void main(String[] args){
        Test t1 = new Test(2,2);
        Test t2 = new Test(7,7);
        System.out.println(t1.check1());
        t1.check2();
        System.out.println(t2.check1());
        t2.check2();

    }
}
