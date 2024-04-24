package Week5.Feb7Warmup;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        
        students.add(new Student("Hemry", 34));
        students.add(new Student("Jose", 21));
        students.add(new Student("Carla", 21));
        students.add(new Student("Nancy", 19));


        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getAge() == 21){
                System.out.println(students.get(i).toString());
            }
        }
    }
}
