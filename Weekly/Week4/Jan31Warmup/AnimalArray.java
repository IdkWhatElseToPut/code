package Week4.Jan31Warmup;

public class AnimalArray {
    private String[] animals;
    
    public AnimalArray(){
        animals =  new String[5];
        animals[0] = "frog";
        animals[1] = "fish";
        animals[2] = "lobster";
        animals[3] = "crab";
        animals[4] = "duck";
    }
    public void printAnimals(){
        for(int i=0; i<animals.length;i++){
            System.out.print(animals[i] + " ");
        }
        System.out.println();
    }
    public void swapAnimals(int index1, int index2){
        String str = animals[index1];
        animals[index1] = animals[index2];
        animals[index2] = str;
    }

}
