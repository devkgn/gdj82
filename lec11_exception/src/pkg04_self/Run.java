package pkg04_self;

public class Run {
	public static void main(String[] args) throws MyException {
		int a = 5;
		if(a < 10) {
			throw new MyException("내가 만든 예외");
		}
	}
}
