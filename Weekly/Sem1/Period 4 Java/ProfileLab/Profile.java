
public class Profile {
    //Define private instance variables
    private String name, subject, hobby, food;
    private int age;

    //Constructor to pass in information
    public Profile(String name, int age, String subject, String hobby, String food) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.hobby = hobby;
        this.food = food;
    }


    //Method to print profile information and suggest a career
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Subject: " + subject);
        System.out.println("Favorite Hobby: " + hobby);
        System.out.println("Favorite Food: " + food);
        printCareer();
    }


    //Method to choose a career based on choices
    public void printCareer() {
        String career;


        if (subject.equalsIgnoreCase("Math") && hobby.equalsIgnoreCase("Sports") && food.equalsIgnoreCase("Burgers")) {
            career = "Career suggestion: Math teacher";
        } else if (subject.equalsIgnoreCase("Math") && hobby.equalsIgnoreCase("Sports") && food.equalsIgnoreCase("Salad")) {
            career = "Career suggestion: Statistician making data for salad companies about athletes";
        } else if (subject.equalsIgnoreCase("Math") && hobby.equalsIgnoreCase("Video Games") && food.equalsIgnoreCase("Burgers")) {
            career = "Career suggestion: Accountant for a burger company";
        } else if (subject.equalsIgnoreCase("Math") && hobby.equalsIgnoreCase("Video Games") && food.equalsIgnoreCase("Salad")) {
            career = "Career suggestion: Financial planner";
        } else if (subject.equalsIgnoreCase("Science") && hobby.equalsIgnoreCase("Sports") && food.equalsIgnoreCase("Burgers")) {
            career = "Career suggestion: Scientist doing experiments on unhealthy food's effect on athletes";
        } else if (subject.equalsIgnoreCase("Science") && hobby.equalsIgnoreCase("Sports") && food.equalsIgnoreCase("Salad")) {
            career = "Career suggestion: Science teacher";
        } else if (subject.equalsIgnoreCase("Science") && hobby.equalsIgnoreCase("Video Games") && food.equalsIgnoreCase("Burgers")) {
            career = "Career suggestion: Science game developer";
        } else if (subject.equalsIgnoreCase("Science") && hobby.equalsIgnoreCase("Video Games") && food.equalsIgnoreCase("Salad")) {
            career = "Career suggestion: Astrophysicist";
        } else if (subject.equalsIgnoreCase("History") && hobby.equalsIgnoreCase("Sports") && food.equalsIgnoreCase("Burgers")) {
            career = "Career suggestion: History Teacher";
        } else if (subject.equalsIgnoreCase("History") && hobby.equalsIgnoreCase("Sports") && food.equalsIgnoreCase("Salad")) {
            career = "Career suggestion: Historian reviewing sports through history";
        } else if (subject.equalsIgnoreCase("History") && hobby.equalsIgnoreCase("Video Games") && food.equalsIgnoreCase("Burgers")) {
            career = "Career suggestion: History Game creater";
        } else if (subject.equalsIgnoreCase("History") && hobby.equalsIgnoreCase("Video Games") && food.equalsIgnoreCase("Salad")) {
            career = "Career suggestion: Museum worker";
        }else{
            career = "Try again, remember to input informaton just as it is provided.";
        }
        System.out.println(career);
    }

    //Method to update profile information
    public void updateProfile(String name, int age, String subject, String hobby, String food) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.hobby = hobby;
        this.food = food;
    }
}