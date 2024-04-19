package pkg03_compare;

public class MainClass {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		boolean bool1 = (num1 == num2);
		System.out.println("==사용 : "+bool1);
		System.out.println(num1 == num2);
		
		boolean bool2 = num1 != num2;
		System.out.println("!= 사용 : "+bool2);
		
		boolean bool3 = num1 > num2;
		System.out.println("> 사용 : "+bool3);
		
		boolean bool4 = num1 <= num2;
		System.out.println("<= 사용 : "+bool4);
		
		int num3 = 20;
		// 여러 비교 연산자를 연속적으로 사용 X
		// boolean bool5 = num1 < num2 < num3;
		
		// char 비교하기
		char c1 = 'a';
		char c2 = 'd';
		boolean bool5 = c1 < c2;
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println(bool5);
	}
}
