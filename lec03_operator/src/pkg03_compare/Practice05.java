package pkg03_compare;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		/*
		 * 문제)
			사용자로부터 두 개의 정수를 입력 받습니다.
			삼항 연산자를 사용하여 
			두 수 중에서 작은 수를 찾아서 
			출력하는 프로그램을 작성하세요.
		 * 출력 예시)
		 	첫 번째 정수를 입력하세요 : 4
		 	두 번째 정수를 입력하세요 : 56
		 	두 수 중에서 작은 수는 4입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		int result = num1 < num2 ? num1 : num2;
		System.out.println("두 수 중에서 작은 수는 "+result+"입니다.");
	}

}
