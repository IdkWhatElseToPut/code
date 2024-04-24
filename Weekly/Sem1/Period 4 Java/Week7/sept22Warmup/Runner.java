package Week7.sept22Warmup;

public class Runner {
    public static void main(String[] args){
        Rect obj1 = new Rect();
        
        Rect obj2 = new Rect(5,2);

        obj1.calcArea();
        obj2.calcArea();
        obj2.calcArea(6, 2);
    }
}
