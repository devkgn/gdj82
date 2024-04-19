package pkg03_compare;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// 1. 키보드로 나이(정수) 입력받기
		// 2. 50대인지 여부 출력
		// 출력 예시)
		// 나이 : 34
		// false
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		// 50 <= age <= 59
		boolean bool1 = 50 <= age;
		boolean bool2 = age <= 59;
		
		boolean result = bool1 && bool2;
		
		System.out.println(result);
		

	}

}
