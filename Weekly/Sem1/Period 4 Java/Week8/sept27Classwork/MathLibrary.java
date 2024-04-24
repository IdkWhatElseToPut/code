package Week8.sept27Classwork;

public class MathLibrary {
    private double pi=3.14;
    public void volCylinder(double radius, double height){
        double volume = radius*radius*Math.PI*height;
        System.out.println("Volume: " + volume);
    }
    public void volSphere(double radius){
        double volume = 4.0/3.0*radius*radius*radius*Math.PI;
        System.out.println("Volume: " + volume);
    }
    public void checkOddOrEven(int num){
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public void solveQuadratic(int a, int b, int c){
        double x1 = (-1*b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2;
        double x2 = (-1*b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2;
        System.out.println("X=" +x1+", " +x2);
        }
        public void solvePythagorean(int a, int b){
            double c = Math.sqrt(Math.pow(a, 2)*Math.pow(b, 2));
            System.out.println("C="+c);
        }
}
