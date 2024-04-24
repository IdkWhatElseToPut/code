package Week9.oct4Warmup;

public class Runner {
    public static void main(String[] args){
        Rectangle r = new Rectangle(7.5,4.0);
        double area, perimeter, length, width, volume;
        length=r.getLength();
        width=r.getWidth();
        area=r.getArea();
        perimeter=r.getPerimeter();
        volume=r.getVolume(10);
        System.out.println("Length: " + length + " Width: " + width + " Area: " + area + " Perimeter: " + perimeter);
        System.out.println("Volume: " + volume);

    }
}
