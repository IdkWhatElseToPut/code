package Week1.Jan12Warmup;

public class Runner {
    public static void main(String[] args){
        String word = "abracadabra";

        System.out.println(word + " " + word.length());
        System.out.println("The index of a is:  " + word.indexOf('a'));
        System.out.println("The index of a after index 6 is:  " + word.indexOf('a', 6));
        System.out.println("The character at index 6 is: " +  word.charAt(6));   
    }
}
