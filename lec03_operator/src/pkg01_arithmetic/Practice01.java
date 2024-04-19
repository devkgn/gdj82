package pkg01_arithmetic;

import java.util.Scanner;

public class Practice01 {
	/*
	 * 철수는 오늘 학교에서 산술 연산자 +, -, *, /, %에 대해서 배웠습니다.
	 * 이것들을 활용해서 두개의 정수를 키보드로 입력 받으면
	 * 다섯가지 연산을 해서 결과를 출력해주는 계산기를 만들고자 합니다.
	 * 첫번째 숫자 : 20
	   두번째 숫자 : 3
	   덧셈 : 23
	   뺄셈 : 17
	   곱셈 : 60
	   나누기 : 6
	   나머지 : 2
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 정수 입력 받기
		System.out.print("첫번째 숫자 : ");
		int su1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int su2 = sc.nextInt();
		// 더하기
		int multiple = su1 + su2;
		System.out.println("덧셈 : "+multiple);
		// 빼기
		int diff = su1 - su2;
		System.out.println("뺄셈 : "+diff);
		// 곱하기
		int product = su1 * su2;
		System.out.println("곱셈 : "+product);
		// 나누기 몫
		int quotient = su1 / su2;
		System.out.println("나누기 : "+quotient);
		// 나누기 나머지
		int remain = su1 % su2;
		System.out.println("나머지 : "+remain);
		
		sc.close();
	}
}
