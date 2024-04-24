package Week28.Mar13Classwork;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void speak(){
        System.out.println("Hello, my name is ");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void printInfo() {
        super.speak();
        System.out.println(super.getName());
        System.out.println("I make the sound: ");
        this.speak();
    }
    public void speak(){
        System.out.println("Woof");
    }
}

class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }
    public void printInfo() {
        super.speak();
        System.out.println(super.getName());
        System.out.println("I make the sound: ");
        this.speak();
    }

    public void speak(){
        System.out.println("Tweet");
    }

}

public class Runner{
    public static void main(String[] args){
    Dog d = new Dog("Fido");
    d.printInfo();

    Bird b = new Bird("Tweety");
    b.printInfo();
    }
}


