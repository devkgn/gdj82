package pkg05_capsul.sample01;

public class Run {
	public static void main(String[] args) {
		Account a = new Account("김철수",2000);
		a.balance -= 5000;
		System.out.println(a.balance);
	}
}
