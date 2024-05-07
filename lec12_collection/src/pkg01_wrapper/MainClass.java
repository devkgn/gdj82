package pkg01_wrapper;

public class MainClass {

	public static void main(String[] args) {
		// Boxing : 기본형 -> 참조형
		Integer iNum = 100;
		// UnBoxing : 참조형 -> 기본형
		int num = iNum;
		boolean b = Boolean.parseBoolean("true");
		// 문자열 -> Integer
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2);
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2);
		// 문자열 -> Double
		String str3 = "3.14";
		System.out.println(str3+str3);
		double pi = Double.parseDouble(str3);
		System.out.println(pi+pi);
		// NumberFormatException
		// 1500 -> 천오백만원
		String str4 = "천오백만원";
		try {
			int num3 = Integer.parseInt(str4);
		}catch(NumberFormatException e) {
			System.out.println("숫자형태의 문자열X");
		}catch(IllegalArgumentException e) {
			System.out.println("표현법이 잘못됨");
		}
		
		// ClassCastException
		Object num4 = 9;
		try {
			String str = (String)num4;
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
