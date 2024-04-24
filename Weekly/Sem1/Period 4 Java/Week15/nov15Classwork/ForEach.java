package Week15.nov15Classwork;

public class ForEach {

    public void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printArray(String[] a) {
        for (String b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public boolean search(int num, int[] nums) {
        for (int number : nums) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }

    public boolean search(String a, String[] string) {
        for (String str : string) {
            if (str.equals(a)) {
                return true;
            }
        }
        return false;
    }

    public int findLargest(int[] nums) {
        int largest = nums[0];
        for (int num : nums) {
            if (num>largest) {
                largest=num;
            }
        }
        return largest;
    }
}
