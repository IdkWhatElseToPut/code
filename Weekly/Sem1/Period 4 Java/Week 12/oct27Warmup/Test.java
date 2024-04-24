package oct27Warmup;

public class Test {
    private int num1, num2;

    public Test(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public String check1(){
        if(num1==num2&&num1==7){
            return "Jackpot";
        }else if(num1==num2&&num1<7){
            return "Same";
        }else{
            return "No Luck";
        }
    }
    public void check2(){
        switch (num1){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            default:
                System.out.println("Other");
        }
    }
}
