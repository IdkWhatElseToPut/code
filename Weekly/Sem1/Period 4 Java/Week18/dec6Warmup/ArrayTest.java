package Week18.dec6Warmup;

public class ArrayTest {
    private int[] numArray;

    public ArrayTest(int size){
        numArray = new int[size];
        for(int x = 0 ; x<numArray.length; x++){
            numArray[x] = (int)(Math.random()*9+1);
        }
    }
    public void print(){
        for(int x = 0; x<numArray.length; x++){
            System.out.print(numArray[x] +  " ");
        }
        System.out.println();
    }
    public double average(){
        int sum = 0;
        for(int each : numArray){
            sum+=each;
        }
        return sum/numArray.length;
    }
    public int getIndexOfSmallest(){
        int index = 0;
        int smallest = numArray[0];
        for(int x = 1; x<numArray.length; x++){
            if(smallest>numArray[x]){
                smallest = numArray[x];
                index = x;
            }
        }
        return index;
    }
}
