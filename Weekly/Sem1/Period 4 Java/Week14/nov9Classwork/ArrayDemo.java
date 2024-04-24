package Week14.nov9Classwork;

public class ArrayDemo {
    public static void main(String[] args){
        System.out.print("Demo 1:");
        int[] array1 = new int[5];
        array1[0] = (int)(Math.random()*15+1);
        array1[1] = (int)(Math.random()*15+1);
        array1[2] = (int)(Math.random()*15+1);
        array1[3] = (int)(Math.random()*15+1);
        array1[4] = (int)(Math.random()*15+1);
        System.out.print(array1[0] + " ");
        System.out.print(array1[1] + " ");
        System.out.print(array1[2] + " ");
        System.out.print(array1[3] + " ");
        System.out.print(array1[4] + " ");

        System.out.print("\nDemo 2:");

        int[] array2 = new int[25];

        for(int x = 0; x<25; x++){
            array2[x] = (int)(Math.random()*9+1);
        }
        for(int i=0; i<25; i++){
            System.out.print(array2[i] + " ");
        }


        System.out.print("\nDemo 3:");

        String[] array3 = new String[5];
        array3[0] = "seven";
        array3[1] = "tree";
        array3[2] = "potato";
        array3[3] = "grass";
        array3[4] = "track";

        System.out.print("\n");
        for(int i = 0; i<5; i++){
            System.out.println(array3[i]);
        }


    }
}
