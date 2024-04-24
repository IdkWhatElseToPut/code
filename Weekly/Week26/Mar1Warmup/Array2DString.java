package Week26.Mar1Warmup;

public class Array2DString{
    public void printStr(String[][] strArr){
        for(int row = 0; row<3 ; row++){
            for(int column = 0; column<3; column++){
                System.out.print(strArr[row][column] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
    public boolean findAnimal(String[][] strArr,  String str){
        for(int row = 0; row<3 ; row++){
            for(int column = 0; column<3; column++){
                if(strArr[row][column] == str){
                    return true;
                }
                
            }
        }
        return false;
    }






}