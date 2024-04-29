package pkg05_capsul.sample02;

public class Run {
	public static void main(String[] args) {
		Account a = new Account("김철수",2000);
		int total = a.getBalance()-5000;
		a.setBalance(total);
		System.out.println(a.getBalance());
	}
}
