package Week29.Mar18Classwork;

public class DogRunner {
    public static void main(String[] args){
        Dog d1 = new Dog("Fido");
        System.out.println(d1.speak());
    }
    
}

class Dog{
    private String name;
    public Dog(String name){
        this.name = name;
    }
    public String speak(){
        return "Woof";
    }
}

class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    public String speak(){
        return super.speak() +  "!!!!";
    }
}

class Husky extends BigDog{
    public Husky(String name){
        super(name);
    }
    public String speak(){
        return super.speak() + "howl!!!";
    }

}
class SmallDog extends Dog{
    public SmallDog(String name){
        super(name);
    }
    public String speak(){
        return super.speak() + "....";
    }
}