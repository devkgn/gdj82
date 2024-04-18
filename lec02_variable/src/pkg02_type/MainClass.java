package pkg02_type;

public class MainClass {

	public static void main(String[] args) {
		// 정수형 변수
		byte b_num = 1;
		short s_num = 23;
		int i_num = 456;
		long l_num = 7890;
		// 실수형 변수
		float f_num = 1.23f;
		double d_num = 4.567;
		System.out.println(f_num);
		System.out.println(d_num);
		// 문자형 변수
		// 문자 하나, 홑따옴표
		char grade = '김';
		// char gender = 'Female';
		// 논리형 변수
		boolean isStudent = true;
		System.out.println(isStudent);
		
		//String(문자열)
		String str1 = new String("감사");
		// 1. 표준출력
		System.out.println(str1);
		// 2. 재할당
		str1 = new String("합니다.");
		System.out.println(str1);
		// 3. 다른 변수 값
		String str2 = str1;
		System.out.println(str2);
		// 기본형처럼 초기화
		String str3 = "감사합니다.";
		System.out.println(str3);
		System.out.println(1==1);
		// 기본형 비교
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1==num2);
		// 참조형 비교
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println(text1 == text2);
		// +부호
		// 부호 사이에 문자열이 하나 이상
		System.out.println(1+2);
		System.out.println(1+" : "+2);
		// 문자열 변수 초기화에 +부호 사용
		String str4 = new String("감사"+"합니다"+22);
		String str5 = "감사"+100+"합니다";
		// charAt()
		String name = "apple";
		// java에서 순서는 0부터 시작
		char singleCha = name.charAt(2);
		System.out.println(name+"의 3번째 문자는 "+singleCha);
		// 저장 가능 범위를 벗어난 값을 할당
		// 오버플로우
		// byte b_number = 130;

	}

}
