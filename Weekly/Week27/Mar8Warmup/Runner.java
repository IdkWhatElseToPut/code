package Week27.Mar8Warmup;
public class Runner {
    public static void main(String[] args){
        int[][] numMatrix = new int[6][4];
        for(int row=0; row<numMatrix.length; row++){
			for(int column=0; column<numMatrix[row].length;column++){
				numMatrix[row][column] = (int)(Math.random()*10+1);
			}
		}

        NumMatrix3 nm3 = new NumMatrix3(numMatrix);
        nm3.print();
        System.out.println("The sum of row index 2 is: " + nm3.sumRow(2));

    }
}
