package Week5.Feb9Warup;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        ArraryListRef refListObj = new ArraryListRef();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i = 0; i<10;i++){
            intList.add((int)(Math.random()*15+1));
        }

        refListObj.printArray(intList);
        System.out.println("scramble: ");
        refListObj.scramble(intList);
        refListObj.printArray(intList);


    }
}
