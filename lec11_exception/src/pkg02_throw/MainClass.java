package pkg02_throw;

public class MainClass {
	public static void main(String[] args) {
		try {
			int score = 999;
			if(score < 0 || score > 100) {
				throw new RuntimeException(score+"점은 존재할 수 없습니다.");
			}	
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
