public class Bank{

	private String name;
	private int pin;
	private double balance;
	private boolean access;
	
	//Initialize constructor
	public Bank(String name, double balance, int pin) {
		this.name = name;
		this.pin = pin;
		this.balance = balance;
		this.access = false;
	}
	
	//If access is true, return the name of the customer
	public String getName() {
		return name;
	}	
	
	//Return the access (true or false)
	public boolean getAccess() {
		return access;
	}
	
	//Check to see if the pin is valid
	public void checkPin(int pin) {
		if (pin == this.pin){
			access = true;
		}
	}

	// Return the balance
	public double getBalance() {
		return balance;
	}
	public void withdraw(double wAmount){
		if (access = true){
			balance = balance - wAmount;
		}
	}
	public void deposit(double dAmount){
		if (access = true){
			balance = balance + dAmount;
		}
	}
}