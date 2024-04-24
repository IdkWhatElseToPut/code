package Week4.Jan29Classwork;

public class Sort{
    private String[] strArray;

    public Sort(){
        strArray = new String[10];
        strArray[0] = "pig";
        strArray[1] = "cow";
        strArray[2] = "horse";
        strArray[3] = "mouse";
        strArray[4] = "moose"; 
        strArray[5] = "elephant";
        strArray[6] = "dog";
        strArray[7] = "ape";
        strArray[8] = "sheep";
        strArray[9] = "kangaroo";
    }
    public void printArray(){
        for(String each : strArray){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public void sortArray(){
        for(int i=0; i < strArray.length-1; i++ ){
            for(int j=0; j < strArray.length-i-1; j++){
                if(strArray[j].compareTo(strArray[j+1])>0 ){
                    String str = strArray[j];
                    strArray[j] = strArray[j+1];
                    strArray[j+1] = str;
                }
            }
        }
    }
}
