package pkg01_trycatch.practice02;

public class Practice {
	public void printStrLength(String str) {
		// 문자열의 길이 체크
		try {
			int length = str.length();
			System.out.println(length);	
		}catch(NullPointerException e) {
			System.out.println("NullPointerException 발생 : "+e.getMessage());
		}
	}
}
