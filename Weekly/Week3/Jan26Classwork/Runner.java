package Week3.Jan26Classwork;

public class Runner {
    public static void main(String[] args){
        Bubble b = new Bubble();
        int[] arr = new int[10];
        for(int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*25+1);
        }

        b.printArray(arr);
        b.bubbleSort(arr);
        b.printArray(arr);
    }
}
