package pkg01_lang;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		// 사용자로부터 문자를 반복해서 입력받으세요. 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자열 : ");
			String input = sc.nextLine();
			
			if(input.toUpperCase().equals("N")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
		// 입력받은 문자가 n또는 N이 되면 프로그램을 종료하세요. 
		// 이때, toUpperCase 혹은 toLowerCase를 활용하여 
		// 코드를 구성하세요.
		/*
		 * 문자열 : 화 
		 * 문자열 : 이 
		 * 문자열 : 팅 
		 * 문자열 : n 
		 * 프로그램을 종료합니다.
		 */
	}
}
