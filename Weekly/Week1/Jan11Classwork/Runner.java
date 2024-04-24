package Week1.Jan11Classwork;

public class Runner {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest("The quick brown fox jumps over the lazy dog");
        stringTest.printinfo();
        stringTest.printChar(5);
        stringTest.printChar(10);
        stringTest.printChar(15);
        stringTest.printLocation("h");
        stringTest.printLocation("e");
        stringTest.printLocation("jumps");
        stringTest.printLocation("dog");
        int result = stringTest.countChar('o');
        System.out.println("The number of 'o's in the string is " + result);
    }
}