package Week9.oct2Warmup;

public class MiniBank {
    private double balance;
    private int pin;
    private boolean access;

    public MiniBank(double balance, int pin){
        access = false;
        this.balance = balance;
        this.pin=pin;
    }
    public double getBalance(){
        if (!access){
            return balance;
        }else{
            return -1;
        }
    }
    public void setAccess(int pin){
        if(pin==this.pin){
            access=true;
        }
    }
    public void withdraw(double withdraw){
        if(access = true){
            balance = this.balance - withdraw;
            System.out.println(getBalance());
        }
    }
    public void deposit(double deposit){
        if(access = true){
            balance = this.balance+deposit;
            System.out.println(getBalance());
        }
    }
}
