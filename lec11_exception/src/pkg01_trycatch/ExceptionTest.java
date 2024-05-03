package pkg01_trycatch;

public class ExceptionTest {
	public static void main(String[] args) {
		// 다중 catch
		// 하위 클래스가 상단에 와야함
		String[] arr = new String[3];
		try {
			System.out.println(arr[0].length());
			System.out.println(arr[3]);
			arr[0].equals(arr[1]);
		} catch(NullPointerException e) {
			System.out.println(e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2. 인덱스는 배열의 길이를 벗어날 수 없어요.");
		} catch(Exception e) {
			System.out.println("뭐든, 에가 생겼나봐요.");
		}
	}
}
