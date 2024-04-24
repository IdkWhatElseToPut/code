

public class ArrayQuiz {
    private int[] numArray;

    public ArrayQuiz(int size){
        //initialize the array with passed in value
        numArray = new  int[size];

        //set each spot in the array to a random number between 1 and 9
        for(int x = 0; x<numArray.length; x++){
            numArray[x] = (int)(Math.random()*9+1);
        }
    }
    public void print(){
        //for each loop, goes through the array and prints each number
        for(int x : numArray){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public int getNum(int num){
        //set index to the fourth position in the array
        int index = numArray[3];
        return index;
    }
    public int getLargest(){

        int largest = numArray[0]; 
        //compare each elemnt with the current largest elemt until reaching the end of the array.
        //if a larger number is found, it updates the current largest
        for (int x = 1; x < numArray.length; x++) 
            if (numArray[x] > largest) 
                largest = numArray[x]; 
        return largest; 
    }
}
