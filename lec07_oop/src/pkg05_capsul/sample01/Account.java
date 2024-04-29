package pkg05_capsul.sample01;

public class Account {
	public String owner;	// 예금주
	public int balance; 	// 잔액
	
	public Account() {}
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
}
