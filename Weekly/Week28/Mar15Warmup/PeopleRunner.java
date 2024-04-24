package Week28.Mar15Warmup;

public class PeopleRunner {
    public static void main(String[] args){
        Student student = new Student("John");
        Teacher teacher = new Teacher("Jose");
        student.printInfo();
        teacher.printInfo();
    }
}

class People{
    private String name;

    public People(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void printInfo(){
        System.out.println("I go to Mountain View High School");
    }
}
class Teacher extends People{
    public Teacher(String name){
        super(name);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("My name is " + getName() + " I am a teacher");
    }
}

class Student extends People{
    public Student(String name){
        super(name);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("My name is " + getName() + " I am a student");
    }
}
