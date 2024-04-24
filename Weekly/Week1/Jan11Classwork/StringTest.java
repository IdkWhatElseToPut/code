package Week1.Jan11Classwork;

public class StringTest {
    private String myText;

    public StringTest(String myText) {
        this.myText = myText;
    }

    public int getLength() {
        return myText.length();
    }

    public void printinfo() {
        System.out.println("The string is: " + myText);
        System.out.println("The length of the string is: " + getLength());
    }

    public void printChar(int index) {
        System.out.println("The character at location " + index + " is " + myText.charAt(index));
    }

    public void printLocation(String letter) {
        System.out.println(letter + " was found at location " + myText.indexOf(letter));
    }

    public int countChar(char character) {
        int count = 0;
        for (int i = 0; i < myText.length(); i++) {
            if (myText.charAt(i) == character) {
                count++;
            }
        }
        return count;
    }
}