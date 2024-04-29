package pkg05_capsul.sample02;

public class Account {
	private String owner;
	private int balance;
	
	public Account() {}
	
	public Account(String owner,int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
}
