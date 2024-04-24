package Week26.Feb28Classwork1;

public class Array2Dint {
    private int intArray[][];

    public Array2Dint(int rows, int columns){
        intArray = new int[rows][columns];
        for(int row=0; row<rows; row++){
			for(int column=0; column<columns;column++){
				intArray[row][column] = (int)(Math.random()*10+1);
			}
		}
    }
    public void printInts(){
        for(int row=0; row<intArray.length; row++){
			for(int column=0; column<intArray[row].length;column++){
				System.out.print(intArray[row][column] + " ");
			}
			System.out.println();
		}
    }
    public void findLargest(){
        int  largest = intArray[0][0];
        for(int row=0; row<intArray.length; row++){
			for(int column=0; column<intArray[row].length;column++){
				if(intArray[row][column]>largest){
                    largest = intArray[row][column];
                }
			}
			
		}
        System.out.println();
        System.out.println(largest);
    }

}
