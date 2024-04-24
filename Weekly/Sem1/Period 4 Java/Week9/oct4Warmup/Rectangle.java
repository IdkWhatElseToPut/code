package Week9.oct4Warmup;

public class Rectangle {
    private double length, width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        double area =length*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2*length+2*width;
        return perimeter;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getVolume(double height){
        double volume=length*width*height;
        return volume;
    }
}

