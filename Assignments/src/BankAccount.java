		
public class BankAccount {
	
	private int accountNumber;
	private String name;
	private float balance;
	
	private static int totalAccounts;
		
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float depositMoney(float amount) {
		this.balance += amount;
		System.out.println("Money deposited : " + amount);
		return this.balance;
	}
	
	public float withdrawMoney(float amount) {
		if(amount<=balance) {
			this.balance -= amount;
			System.out.println("Money withdrawn : " + amount);
			return amount;
		}
		else {
			System.out.println("Insufficient money!");
			return -1;
		}
	}
	
	public void printDetails(float balance, String name, int accountNumber) { 
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.name = name;
		
		System.out.println("\nName : " + name + "\nAccount Number : " + accountNumber + "\nBalance : " + balance);
	}
	
	public BankAccount() {
		totalAccounts++;
	}

	public static void main(String[] args) {
		BankAccount mihir = new BankAccount();
		BankAccount hebalkar = new BankAccount();
		
		mihir.setAccountNumber(120);
		mihir.setBalance(5000);
		mihir.setName("\nMihir Hebalkar");
		
		System.out.println(mihir.getName());
		
		mihir.depositMoney(500);
		System.out.println("New balance = " + mihir.getBalance());
		
		mihir.withdrawMoney(1000);
		System.out.println("New balance = " + mihir.getBalance());
		
		hebalkar.setAccountNumber(264);
		hebalkar.setBalance(10000);
		hebalkar.setName("\nHebalkar Mihir");
		
		System.out.println(hebalkar.getName());
		
		hebalkar.depositMoney(2000);
		System.out.println("New balance = " + hebalkar.getBalance());
		
		hebalkar.withdrawMoney(5000);
		System.out.println("New balance = " + hebalkar.getBalance());
		
		hebalkar.printDetails(hebalkar.balance, hebalkar.name, hebalkar.accountNumber);
		
		System.out.println("\nNumber of accounts : " + totalAccounts);
	}
}
