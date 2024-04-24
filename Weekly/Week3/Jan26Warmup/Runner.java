package Week3.Jan26Warmup;

public class Runner {
    public static void main(String[] args){
        char cha = 't';
        Quiz obj = new Quiz("tom.johnson@mvla.net");

        String name = obj.getName();
        System.out.println("The name is ... " + name);
        int characters  = obj.countChar(cha);
        System.out.println("There are "  + characters + " of the letter " + cha + " in the string.");

    }
}
