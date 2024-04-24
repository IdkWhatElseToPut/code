public class VarQuiz {
    public static void main(String[] args){
        //define variables
        int radius;
        double pi;
        radius=10;
        pi=3.14;
        System.out.println("pi:" + pi);
        System.out.println("radius:" + radius);

        //area calculation
        double area;
        area=pi*radius*radius;
        System.out.println("area:" + area);
        
        //circumference calculation
        double circumference;
        circumference=2*pi*radius;
        System.out.println("circumference:" + circumference);
    }
}
