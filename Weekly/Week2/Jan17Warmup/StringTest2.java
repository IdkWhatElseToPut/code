package Week2.Jan17Warmup;

public class StringTest2 {
    private String word;

    public StringTest2(String word){
        this.word =  word;
    }

    private char getFirstLetter(){
        return word.charAt(0);
    }

    private char getLastLetter(){
        return word.charAt(word.length()-1);
    }

    public void printWordGame(){
        System.out.print(getFirstLetter());
        for(int x=1; x<word.length()-1; x++){
            System.out.print("*");
        }
        System.out.print(getLastLetter());
        System.out.println();
    }
}
