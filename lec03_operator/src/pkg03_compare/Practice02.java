package pkg03_compare;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		/*
		 * 철수는 친구들과 함께 게임을 하기로 했습니다.
		 * 게임은 문자열로 된 닉네임을 사용하여 접속합니다.
		 * 철수가 자신의 닉네임을 입력하면,
		 * 닉네임이 "Chulsu"인지 확인할 수 있도록 프로그램을 만들어주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		boolean bool1 = name.equals("Chulsu");
		System.out.println(bool1);
		
		String str = (bool1 == false) ?"잘못된 닉네임":"정상";
		System.out.println(str);
		
		sc.close();
	}
}
