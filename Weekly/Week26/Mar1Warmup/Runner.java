package Week26.Mar1Warmup;

public class Runner{
public static void main(String[] args){

    String[][] strArr  =  new String[3][3];

    strArr[0][0] = "duck";
    strArr[0][1] = "frog";
    strArr[0][2] = "cat";
    strArr[1][0] = "dog";
    strArr[1][1] = "cow";
    strArr[1][2] = "rat";
    strArr[2][0] = "crab";
    strArr[2][1] = "chicken";
    strArr[2][2] = "horse";


        Array2DString a = new  Array2DString();

        a.printStr(strArr);
        
        if(a.findAnimal(strArr, "duck")){
            System.out.println("Animal Found");
        }else{
            System.out.println("Animal Not Found");
        }

        if(a.findAnimal(strArr, "mouse")){
            System.out.println("Animal Found");
        }else{
            System.out.println("Animal Not Found");
        }
        

    }
}