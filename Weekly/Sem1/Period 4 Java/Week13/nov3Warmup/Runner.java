package Week13.nov3Warmup;

public class Runner {
    public static void main(String[] args){
        Fortune fortune = new Fortune();
        System.out.println(fortune.getFortune(10));
        System.out.println(fortune.getFortune(8));
        System.out.println(fortune.getFortune(17));
        fortune.tellFortune(2);
        fortune.tellFortune(5);
        fortune.tellFortune(8);
    }
}
