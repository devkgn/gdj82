package pkg01_trycatch;

public class OutBoundTest {
	public static void main(String[] args) {
		String[] arr = new String[3];
		try {
			System.out.println(arr[3]);			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이를 초과한 인덱스 호출 불가능");
			System.out.println("============================");
			System.out.println(e.getMessage());
			System.out.println("============================");
			e.printStackTrace();
			
		}
	}
}
