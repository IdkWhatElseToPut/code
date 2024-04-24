package Week3.Jan22Warmup;

public class ArraySwap {
    private int[] nums;

    public ArraySwap(){
        nums = new int[10];
        for(int i  = 0; i<10; i++){
            nums[i] = (int)(Math.random()*99+1);
        }
    }

    public void print(){
        for(int each : nums){
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public void swap(int index1, int index2){
        int num = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = num;
    }
}