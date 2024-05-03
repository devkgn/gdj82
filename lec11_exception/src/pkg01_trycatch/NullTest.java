package pkg01_trycatch;

public class NullTest {
	public static void main(String[] args) {
		String[] arr = new String[3];
		try {
			System.out.println(arr[0].length());	
		}catch(NullPointerException e) {
			System.out.println("null의 길이는 도출 불가");
			System.out.println("============================");
			System.out.println(e.getMessage());
			System.out.println("============================");
		}
	}
}
