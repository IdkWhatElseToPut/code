public class OneToTwo{
    private int[][] numMatrix;

    public OneToTwo() {
        numMatrix = new int[3][3];
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

    public void insert(int[] array){
        int index = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                numMatrix[i][j] = array[index];
                index++;
            }
        }
    }
}