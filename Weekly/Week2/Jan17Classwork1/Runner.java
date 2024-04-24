package Week2.Jan17Classwork1;

public class Runner {
    public static void main(String[] args){
        Split sp = new Split("joe.shmo@gmail.com");

        sp.print();
        System.out.println(sp.getName());
        String domain = sp.getDomain();
        System.out.println(domain);
        System.out.println(sp.getLastName("lisa.simpson@mvla.net"));
        System.out.println(sp);
        
    }
}
