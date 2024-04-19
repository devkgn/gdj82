package pkg03_compare;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
//		사용자로부터 boolean 값을 입력받고, 
//		이에 반대되는 결과를 출력하는 프로그램을 만들어주세요.
		Scanner sc = new Scanner(System.in);
		boolean kind = sc.nextBoolean();
		System.out.println(!kind);
	}

}
