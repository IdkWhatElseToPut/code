package Week2.Jan17Classwork1;

public class Split {
    private String email;

    public Split(String email){
        this.email = email;
    }

    public void print(){
        System.out.println(email);
    }

    public String getName(){
        return email.substring(0,email.indexOf('@'));
    }

    public String getDomain(){
        return email.substring(email.indexOf('@'), email.length());
    }
    

    public String getLastName(String last){
        return last.substring(last.indexOf('.')+1, last.indexOf('@'));
    }

    public String toString(){
        return "address: " + email;
    }
}
