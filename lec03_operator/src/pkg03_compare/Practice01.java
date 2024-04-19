package pkg03_compare;

import java.util.Scanner;

public class Practice01 {
	
	public static void main(String[] args) {
		/*
		 * 두 개의 숫자를 입력 받아서,
		 * 첫번째 숫자가 두번째 숫자보다 큰지 확인하는
		 * 프로그램을 만들고자 합니다.
		 * 비교 연산자를 활용해서 문제를 해결해주세요.
		 * 첫 번째 숫자 :  7
		   두 번째 숫자 :  4
		   첫 번째 숫자가 두 번째 숫자보다 큰가요? true
		 */
		// 1. 두개의 숫자를 입력받기
		// 2. 첫번째 숫자와 두번재 숫자 크기 비교
		// 3. boolean을 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		boolean result = num1 > num2;
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요? "+result);
	}

}
