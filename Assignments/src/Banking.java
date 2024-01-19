
public class Banking {
	
	
	public static void main(String[] args) {
		Account a1 = new Account(12345, 4000, "ICICI");
		Customer c1 = new Customer();
		Transaction t1 = new Transaction();
	}
}

class Account {
	private int accountNumber;
	private int balance;
	private String bank;
	
	public Account(int accountNumber, int balance, String bank) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.bank = bank;
	}
	
}

class Customer {
	private String name;
	private int phone;
	private String email;
	
	public Customer(String name, int phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
}

class Transaction {
	private int amount;
	private int transaction_id;
	private String status;
	
	public Transaction(int amount, int transaction_id, String status) {
		this.amount = amount;
		this.transaction_id = transaction_id;
		this.status = status;	
	}
}