package pkg01_trycatch.practice;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// 사용자로부터 두개의 숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int b = sc.nextInt();
		// Practice 클래스의 3개의 메소드 실행
		Practice p = new Practice();
		System.out.println("합 : "+p.add(a, b));
		System.out.println("곱 : "+p.multiple(a, b));
		try {
			System.out.println("나누기 : "+p.divide(a, b));
		}catch(ArithmeticException e) {
			System.out.println("나누기 중 부적절한 연산이 발생했습니다.");
		}
		System.out.println("== 실행 중단 여부 확인 ==");
		// 오류가 발생하더라도 실행 중단X
		// 출력 예시)
		// 첫번째 숫자 : 5
		// 두번째 숫자 : 0
		// 합 : 5
		// 곱 : 0
		// 나누기 중 부적절한 연산이 발생했습니다.
	}
}
