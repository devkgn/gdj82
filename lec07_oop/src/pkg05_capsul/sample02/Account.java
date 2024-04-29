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
		if(balance < 0) {
			System.out.println("출금이 불가능합니다.");
		}else {
			this.balance = balance;
		}
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
}
