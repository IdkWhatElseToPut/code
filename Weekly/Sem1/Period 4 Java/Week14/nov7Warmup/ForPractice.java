package Week14.nov7Warmup;

public class ForPractice {
    
    public void printEven(int num) {
        for (int number = 1; number <= num; number++) {
            if (number % 2 == 0)
               continue;
            System.out.print(number + " ");
        }
    }

    public int findNum(int start, int end, int divisor) {
        int val = -1;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                val = i;
                break;
            }
        }
        return val;
    }
}