package Week3.Jan24Warmup;

public class StringSwap {
    private String[] words;

    public StringSwap(){
        words = new String[5];
        words[0] = "Frog";
        words[1] = "Duck";
        words[2] = "Cow";
        words[3] = "Dog";
        words[4] = "Sloth";
    }
    public void printWords(){
        for(String each : words){
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public void swapWords(int index1, int index2){
        String str = words[index1];
        words[index1] = words[index2];
        words[index2] = str;
    }
}
