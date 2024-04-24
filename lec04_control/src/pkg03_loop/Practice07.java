package pkg03_loop;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		// 1. 숫자를 키보드로 입력받기
		// 2. 입력받은 값으로부터 시작해서
		// 값이 10이 될때까지 
		// 하나씩 커지면서 출력
		// 3. 최초에 입력된 숫자가 10보다 크더라도 반드시 출력
		// 출력 예시)
		// 숫자 : 500
		// 500
		// 숫자 : 7
		// 7
		// 8
		// 9
		// 10
		/////////////////////////////////////////////////////
		// 숫자 : stop
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
//		while(num <= 10) {
//			System.out.println(num);
//			num++;
//		}
		do {
			System.out.println(num);
			num++;
		} while(num <= 10);
		
	}
}
