package Week15.nov17Warmup;

public class ArrayTest {
    private int[] numbers;

    public ArrayTest(int size){
        numbers = new int[size];
        for(int i=0; i<size; i++){
            numbers[i]=(int)(Math.random()*9+1);
        }
    }
    public void print(){
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
    public int getSmallest(){
        int smallest = numbers[0];
        for (int num : numbers) {
            if (num<smallest) {
                smallest=num;
            }
        }
        return smallest; 
    }
}
