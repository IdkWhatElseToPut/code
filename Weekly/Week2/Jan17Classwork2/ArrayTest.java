package Week2.Jan17Classwork2;

public class ArrayTest {
    private int[] numArray;
    private String[] stringArray;

    public ArrayTest(){
        numArray = new int[10];
        for(int x=0;  x<10;  x++) {
            numArray[x] = (int)(Math.random()*20+1);
        }

        stringArray = new String[5];
        stringArray[0] = "duck";
        stringArray[1] = "fish";
        stringArray[2] = "cow";
        stringArray[3] = "dog";
        stringArray[4] = "frog";
    }

    public void printNumArray(){
        for(int each : numArray){
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public void printStringArray(){
        for(String each : stringArray){
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public void swapNumArray(int index1, int index2){
        int num = numArray[index1];
        numArray[index1] = numArray[index2];
        numArray[index2] = num;
    }
    
    public void swapStringArray(int index1, int index2){
        String str = stringArray[index1];
        stringArray[index1] = stringArray[index2];
        stringArray[index2] = str;
    }
    
    public int searchString(String target){
        for(int i = 0; i < stringArray.length; i++){
            if(stringArray[i].equals(target)){
                return i; 
            }
        }
        return -1;
    }
    
}
