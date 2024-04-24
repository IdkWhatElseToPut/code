package Week27.Mar6Warmup;

public class NumMatrix2 {
    private int[][] matrix;

    public NumMatrix2(int rows, int columns){
        int num = 0;
        matrix = new  int[rows][columns];
        for(int row = 0; row<matrix.length;row++){
            for  (int column = 0; column<matrix[row].length; column++){
                num++;
                matrix[row][column] = num;
            }
        }
    }

    public void print(){
        for(int row=0; row<matrix.length; row++){
			for(int column=0; column<matrix[row].length;column++){
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
        System.out.println();
    }


    public void printReverse(){
        for(int row = matrix.length-1; row>-1;row--){
            for  (int column = matrix.length; column>-1; column--){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getValue(int row, int column){
        return matrix[row][column];
    }

}
