package Week7.sept22Warmup;

public class Rect {
    private int length, width, area;
    public Rect(){
        length=0;
        width=0;
        area= 0;
    }
    public Rect(int length, int width){
        this.length=length;
        this.width=width;
    }
    private void printArea(){
        System.out.println("Area: " + area);
    }
    public void calcArea(){
        area=length*width;
        printArea();
    }
    public void calcArea(int length, int width){
        this.length=length;
        this.width=width;
        area=length*width;
        printArea();
    }

}
