package Week9.oct2Warmup;

public class Runner {
    public static void main(String[] args){

        MiniBank bank = new MiniBank(100, 1234);
        System.out.println(bank.getBalance());
        bank.setAccess(1234);
        System.out.println(bank.getBalance());
        bank.deposit(25);
        bank.withdraw(80);
    }
}
