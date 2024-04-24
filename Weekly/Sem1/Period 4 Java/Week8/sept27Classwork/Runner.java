package Week8.sept27Classwork;

public class Runner {
    public static void main(String[] args){
        MathLibrary m1 = new MathLibrary();
        m1.volCylinder(10, 15);
        m1.volSphere(10);
        m1.solvePythagorean(5, 12);
        m1.checkOddOrEven(-6);
        m1.checkOddOrEven(11);
        m1.solveQuadratic(1,2,2);
        m1.solveQuadratic(1,2,-3);
    }
}
