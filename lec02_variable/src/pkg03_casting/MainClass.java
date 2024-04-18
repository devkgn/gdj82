package pkg03_casting;

public class MainClass {

	public static void main(String[] args) {
		// 업캐스팅 == 자동형변환
		// 1. 값의 범위가 작은 데이터가
		// 값의 범위가 큰 변수에 할당될 경우
		int a = 23;
		double b = a;
		System.out.println(a);
		System.out.println(b);
		// 2. 값의 범위가 다른 2개의 값이 산술 연산
		int c = 3;
		double d = 20.5;
		// 3 -> 3.0 -> 3.0 + 20.5
		System.out.println(c+d);
		// 3. char 타입 변수
		char f = '2';
		// 50 + '2' = 100
		System.out.println(50+f);
		// char 타입 업캐스팅 활용
		// '2' 아스키값으로 형변환하면 50
		// '2' - 48 = 2
		// '2' - '0' = 2
		System.out.println(f-'0');
		// (1)사용자가 입력한 문자 '5'를 
		// 숫자 5로 가장 빠르게 변환하는 방법은?
		System.out.println('5'-'0');
		
		// 다운캐스팅
		double d_num = 3.14;
		int i_num = 4;
		System.out.println(d_num+i_num);
		System.out.println((int)d_num);
		System.out.println((int)d_num+i_num);
		// char의 다운캐스팅
		char apple = 'A';
		int numApple = (int)apple;
		System.out.println(apple);
		System.out.println(numApple);
		System.out.println((int)'a');
		
		// (2) 소문자 -> 대문자로 변환
		// 아스키 : 소문자, 대문자 사이의 차이가 32
		char char1 ='a';
		char char2 = (char)(char1-32);
		System.out.println(char1-32);
		System.out.println(char2);
	}

}
