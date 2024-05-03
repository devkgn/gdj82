package pkg01_trycatch;

public class NullTest {
	public static void main(String[] args) {
		String[] arr = new String[3];
//		if(arr[0].equals("test")) {
//			System.out.println("test와 같습니다.");
//		}
		arr[0] = "test";
		if("test".equals(arr[0])) {
			System.out.println("비교가능");
		}
		
		
//		try {
//			System.out.println(arr[0].length());	
//		}catch(NullPointerException e) {
//			System.out.println("null의 길이는 도출 불가");
//			System.out.println("============================");
//			System.out.println(e.getMessage());
//			System.out.println("============================");
//		}
	}
}
