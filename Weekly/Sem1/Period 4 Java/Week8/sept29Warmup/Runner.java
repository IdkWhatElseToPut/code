package Week8.sept29Warmup;

public class Runner {
    public static void main(String[] args){
        Bus b1 = new Bus();
        Bus b2 = new Bus(120);
        b1.numBuses(15);
        b2.numBuses(330);
        b2.numBuses(250, 2);
    }
}
