package Week3.Jan26Warmup;

public class Quiz {
    private String email;

    public Quiz(String email){
        this.email = email;
    }
    public String getName(){
        return email.substring(0,email.indexOf('@'));
    }
    public int countChar(char cha){
        int counter =0;
        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == cha){
                counter++;
            }
        }
        return counter;
    }
    
    public String toString(){
        return "Email Adress:  " + email;
    }
}
