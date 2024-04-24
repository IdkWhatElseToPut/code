public class Runner {
    public static void main(String[] args){
        Quiz6 q1 = new Quiz6(96,95);
        Quiz6 q2 = new Quiz6(90,75);

        String g1 = q1.getGrade1();
        String g2 = q1.getGrade2();
        String g3 = q2.getGrade1();
        String g4 = q2.getGrade2();
        System.out.println("You earned a " + g1 + ".");
        System.out.println("You earned a " + g2 + ".");
        System.out.println("You earned a " + g3 + ".");
        System.out.println("You earned a " + g4 + ".");

    }
}
