package Week4.Feb2Warmup;
import java.util.ArrayList;
public class ArrayListTest {
    ArrayList<Integer> numlist = new ArrayList<Integer>();

    public ArrayListTest(int elements){
        for(int i=0; i<elements; i++){
            numlist.add((int)(Math.random()*15+1));
        }
    }
    public void print(){
        for(int i=0;i<numlist.size();i++){
            System.out.print(numlist.get(i) + " ");
        }
        System.out.println();
    }
    public void printBackwards(){
        for(int i=numlist.size()-1;i>=0;i--){
            System.out.print(numlist.get(i) + " ");
        }
        System.out.println();
    }

}
