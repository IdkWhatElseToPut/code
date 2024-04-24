package Week4.Feb2Classwork;
import java.util.ArrayList;
public class ArrList {
    private ArrayList<Integer> numList;

    public ArrList(){
        numList =  new ArrayList<Integer>();
        for(int i = 0 ; i<10 ; i++){
            numList.add((int)(Math.random()*10+1));
        }
    }
    public void printList(){
        for(int each : numList){
            System.out.print(each +  " ");
        }
        System.out.println();
    }
    public int searchLargest(){
        int largest = numList.get(0);
        for(int i =1; i<numList.size();i++) {
            int num = numList.get(i);
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }

    public void searchAndReplace(int num) {
        for(int i = 0; i<numList.size(); i++) {
            if(numList.get(i) == num){
                numList.set(i, 1000);
            }
        }
    }

    public void searchAndRemove(int num){
        for(int i = 0; i<numList.size(); i++) {
            if(numList.get(i) == num){
                numList.remove(i);
                i--;
            }
        }
    }

    public void scramble() {
        int temp, j;
        for (int i = 0; i < numList.size(); i++) {
            j = (int) (Math.random() * numList.size());
            temp = numList.get(j);
            numList.set(j, numList.get(i));
            numList.set(i, temp);
        }
    }
}
