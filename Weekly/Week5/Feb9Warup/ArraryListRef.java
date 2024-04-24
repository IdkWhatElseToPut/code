package Week5.Feb9Warup;
import java.util.ArrayList;
public class ArraryListRef {
    public void printArray(ArrayList<Integer> arr){
        for(Integer each : arr){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public void scramble(ArrayList<Integer> arr){
        int temp, j;
        for (int i = 0; i < arr.size(); i++) {
            j = (int) (Math.random() * arr.size());
            temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
        }
    }
}
