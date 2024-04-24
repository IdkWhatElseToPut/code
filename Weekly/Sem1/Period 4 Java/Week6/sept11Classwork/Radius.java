package Week6.sept11Classwork;

public class Radius {
    private double pi = 3.14;

    public void printArea(double radius){
        System.out.println("Area: "+pi*radius*radius);
    }

    public void printCir(double radius){
        System.out.println("Circumference: " + 2*pi*radius);
    }

    public void printConeVol(double radius, double height){
        System.out.println("Volume: " + (1.0/3.0)*pi*radius*radius*height);
    }
}
