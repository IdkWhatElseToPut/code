package Week5.Classwork;

public class Runner {
    public static void main(String[] args){
    Triangle triangle = new Triangle();
    Square square = new Square();
    Circle circle = new Circle();

    triangle.printArea();

    square.printArea();
    square.changeSide();
    square.printArea();

    circle.printArea();
    circle.setRadius();
    circle.printArea();
}
}
