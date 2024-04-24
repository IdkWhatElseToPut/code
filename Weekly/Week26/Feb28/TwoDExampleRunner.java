package Week26.Feb28;


public class TwoDExampleRunner {

	public static void main(String[] args) {
		// initialize a 2D Array.
		int[][]numArr = {{6, 5, 7, 9, 2}, {5, 3, 4, 6}, {7, 0, 8}};  
		
		// Print the elements in the 2D array
		for( int[] row : numArr ){  
			for( int num : row ) {
				System.out.print(num + " ");
			}
		System.out.println();
		}

		System.out.println();
		

		for(int row=0; row<numArr.length; row++){
			for(int column=0; column<numArr[row].length;column++){
				System.out.print(numArr[row][column] + " ");
			}
			System.out.println();
		}

		for (int[] row: numArr) {
			System.out.println("length of row 1: " + row.length);
			
		}

	}
}
