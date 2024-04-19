package pkg01_arithmetic;

public class MainClass {
	public static void main(String[] args) {
		// 산술 연산자
		int su1 = 17;
		int su2 = 3;
		// 더하기
		int multiple = su1 + su2;
		System.out.println("+ : "+multiple);
		System.out.println(" +(2) :"+(su1+su2));
		// 빼기
		int diff = su1 - su2;
		System.out.println("- : "+diff);
		// 곱하기
		int product = su1 * su2;
		System.out.println("* : "+product);
		// 나누기 몫
		int quotient = su1 / su2;
		System.out.println("/ : "+quotient);
		// 나누기 나머지
		int remain = su1 % su2;
		System.out.println("% : "+remain);
		// 산술 연산과 형변환
		// 점수는 정수형 , 평균은 실수
		int math = 33;
		int science = 82;
		int sum = math + science; // 115
		// 1. 평균(정수)
		int avg1 = sum / 2;
		System.out.println(avg1);
		// 2. 평균(실수)
		double avg2 = sum / 2.0;
		System.out.println(avg2);
		// 복합 대입 연산자
		int a = 5; 
		 a += 3;
		//a = a + 3;
		 String str = "구디";
		 str = str + "아카데미";
		 System.out.println(str);
		/*
		 * 1. 자기 자신과 연산 -> 5 + 3 = 8
		 * 2. 연산 결과를 자기 자신에게 대입 -> a = 8;
		 * */
		System.out.println(a);
		// -=
		int b = 10;
		b -= 4; // b = b-4; 
		System.out.println(b);
		// *=
		int c = 10;
		c *= 5; // c = c*5;
		System.out.println(c);
		// 나누기 몫
		int d = c;
		d /= 3; 
		System.out.println(d);
		// 나누기 나머지
		int e = 10;
		e %= 3;
		System.out.println(e);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
