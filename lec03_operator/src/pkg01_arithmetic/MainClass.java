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
	}
}
