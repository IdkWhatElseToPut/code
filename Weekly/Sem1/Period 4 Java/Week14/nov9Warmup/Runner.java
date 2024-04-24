package Week14.nov9Warmup;

public class Runner {
    public static void main(String[] args){
        int row = (int)(Math.random()*10+1);
        int col = (int)(Math.random()*10+1);

        Table t = new Table(row, col);

        t.printDrawBox();
    }
}
