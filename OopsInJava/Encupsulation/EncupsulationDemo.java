package Encupsulation;

public class EncupsulationDemo {

//	 Variables are private so we con't access in another class.
//	 to use below variables we need to create settler and gettler methods.

	private int accountNumber;
	private String name;
	private double amount;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
