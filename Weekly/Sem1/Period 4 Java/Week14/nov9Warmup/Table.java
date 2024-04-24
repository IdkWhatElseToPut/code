package Week14.nov9Warmup;

public class Table {
    private int row, col;

    public Table(int row, int col){
        this.row = row;
        this.col = col;
    }
    public void printDrawBox(){
        for(int x = 0; x<=row;x++){
            for( int y = 0; y<=col; y++){
              System.out.print("*");
          }
          System.out.println();
        }
    }
}
