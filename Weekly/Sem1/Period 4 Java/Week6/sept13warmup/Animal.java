package Week6.sept13warmup;

public class Animal {
  
    private String animalType;
    private int age;
    public void setVariables(String aAnimalType, int aAge){
        animalType = aAnimalType;
        age = aAge;
    }

    public void printInfo(){
        System.out.println("Animal Type: " + animalType + "\nAnimal Age: " + age);
    }
}

