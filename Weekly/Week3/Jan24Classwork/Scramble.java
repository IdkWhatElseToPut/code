package Week3.Jan24Classwork;

public class Scramble {
    public void printArray(int[] array){
        for(int each : array){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public void printArray(String[] array){
        for(String each : array){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public int search(int num, int[] array){
        int index = -1;
        for(int i = 0; i<array.length; i++){
            if(num == array[i]){
                index+=i+1;
            }
        }
        return index;
    }
    public static void scramble(int[] array) {
        for (int i = 0; i <array.length; i++) {
            int x = (int)(Math.random()*i+1);

            int num = array[i];
            array[i] = array[x];
            array[x] = num;
        }
    }
    public static void scramble(String[] array) {
        for (int i = 0; i <array.length; i++) {
            int x = (int)(Math.random()*i+1);

            String str = array[i];
            array[i] = array[x];
            array[x] = str;
        }
    }
}
