package Week15.nov13Warmup;

public class ArrayTest {
    private int[] numArr;

    public ArrayTest(int num) {
        numArr = new int[num];
        for (int i=0; i<numArr.length;i++) {
            numArr[i]=(int) (Math.random()*5+1);
        }
    }

    public void print() {
        System.out.print("The " + numArr.length + " elements are ");
        for (int i=0;i<numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
    }

    public int getSum() {
        int sum=0;
        for (int i=0; i <numArr.length; i++) {
            sum += numArr[i];
        }
        return sum;
    }
}
