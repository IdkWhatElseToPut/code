package Week8.Quiz4;

public class Rectangle {
    //instance variables
    private double length, width;
    //default constructor that sets length and width to 0
    public Rectangle(){
        length=0;
        width=0;
    }
    //constructor that sets length and width to what is passed in
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    //calculate and print area based on length and width values
    public void printArea(){
        System.out.println("Area: " + length*width);
    }
}
