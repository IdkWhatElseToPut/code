package Week8.sept17Warmup;

public class Runner {
    public static void main(String[] args){
        Two obj1 = new Two();
        Two obj2 = new Two("Maria");
        obj1.printName();
        obj1.printName(15);
        obj2.printName();
        obj2.printName(15);
    }
}
