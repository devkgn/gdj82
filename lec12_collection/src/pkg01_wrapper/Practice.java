package pkg01_wrapper;

public class Practice {
	
	public void printSum(String str1, String str2) {
		// 문자열 -> 정수 변환
		// 두개의 정수 더하기
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println("합 : "+(num1+num2));
	}

}
