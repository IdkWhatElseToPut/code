package Week27.Mar8Warmup;

public class NumMatrix3{

    private int[][] numMatrix;
    public NumMatrix3(int[][] numMatrix){
        this.numMatrix  = numMatrix;
    }
    public void print(){
        for(int row=0; row<numMatrix.length; row++){
			for(int column=0; column<numMatrix[row].length;column++){
				System.out.print(numMatrix[row][column] + " ");
			}
			System.out.println();
		}
        System.out.println();
    }

    public int sumRow(int row){
        int sum = 0;
        for(int column = 0; column<numMatrix[row].length; column++){
            sum += numMatrix[row][column];
        }
        return sum;
    }
}