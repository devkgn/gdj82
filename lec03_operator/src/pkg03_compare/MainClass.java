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
		// String(문자열) 비교하기
		String str1 = "출발";
		String str2 = "출발";
		boolean bool6 = (str1 == str2) ;
		System.out.println("결과 : "+bool6);
		// 참조형 비교
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println("문자열 비교 : "+(text1 == text2)); 

		String noun1 = "나비";
		String noun2 = new String("나비");
		boolean bool7 = noun1.equals(noun2);
		System.out.println("나비 : "+bool7);

		boolean bool8 = noun1.equals("나비");
		System.out.println(bool8);
		
		
		// 논리 연산자
		int su1 = 10;
		int su2 = 5;
		int su3 = 7;
		boolean test1 = su1 > su2;	// true
		boolean test2 = su1 > su3;  // true
		boolean test3 = su1 < su2;	// false
		
		boolean result1 = test1 && test2;	// true && true
		// boolean result1 = (su1 > su2) && (su1 > su3);
		System.out.println("true && true : "+result1);
		boolean result2 = test1 && test3;	// true && false
		System.out.println("true && false :"+result2);
		
		boolean result3 = test1 || test2;	// true || true
		System.out.println("true || true : "+result3);
		boolean result4 = test1 || test3;	// true || false
		System.out.println("true || false : "+result4);
		
		
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println("isFalse : "+isFalse);
		// true && false -> false -> true
		System.out.println(!(test1 && test3));
		// true && !false -> true
		System.out.println(test1 && !test3);
		
		
		
	}
}
