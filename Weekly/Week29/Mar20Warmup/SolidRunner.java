package Week29.Mar20Warmup;
import java.util.ArrayList;

public class SolidRunner {
    public static void main(String[] args){
        ArrayList<Solid> solids  = new ArrayList<Solid>();
        solids.add(new RectangularPrism("RecPrism", 10.5,7,3));
        solids.add(new Sphere("Sphere", 4));
        for(Solid solid : solids){
            solid.printInfo();
            solid.calcVolume();
            System.out.println();
        }
    }
}

abstract class Solid{
    private String name;


    public Solid(String name) {
        this.name = name;
    }

    abstract public void calcVolume();

    public void printInfo(){
        System.out.println("The name of this solid is " + name);
    }
}

class RectangularPrism extends Solid{
    private double length, width, height;

    public RectangularPrism(String name, double length, double width, double height) {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void calcVolume(){
        System.out.println("The volume of this solid is " + length * width * height);
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("The length is " + length  + ", the width is " + width + ", and the height is " + height + ".");
    }
}

class Sphere extends Solid{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public void calcVolume(){
        System.out.println("The volume of this solid is " + (4*Math.PI*Math.pow(radius,3))/3);
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("The radius is " + radius);
    }
}


