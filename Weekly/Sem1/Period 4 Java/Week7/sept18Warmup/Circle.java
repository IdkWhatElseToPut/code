package Week7.sept18Warmup;

public class Circle {
    private double pi, radius, volume, area;
    public Circle(){
        radius=0;
        pi=3.14;
        volume=0;
    }
    public Circle(double radius){
        this.radius=radius;
        pi=3.14;
        volume=0;
    }
    public void calcVol(){
        volume = 1.33*radius*radius*radius*pi;
    }
    public void printVol(){
        calcVol();
        System.out.println("Volume: " + volume);
    }
    public void printArea(){
        area = pi*radius*radius;
        System.out.println("Area: " + area);
    }
    public void printArea(double radius){
        area = pi*radius*radius;
        System.out.println("Area: " + area);
    }
}
