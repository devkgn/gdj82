package pkg01_condition;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		/* 철수는 스위치로 조명을 조절하는 스마트 조명을 설치했어요. 
		 * 조명의 밝기는 사용자가 입력한 값에 따라서 조절돼요. 
		 * 아래와 같은 기준을 따른다고 했을 때, 
		 * 사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성해주세요.
		 * - 0 : 조명을 끕니다.
		   - 1 : 어두운 조명입니다.
		   - 2 : 밝은 조명입니다.
		   - 3 : 매우 밝은 조명입니다.
		   - 그 외 : 올바른 입력이 아닙니다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("밝기 : ");
		int bright = sc.nextInt();
		switch(bright) {
			case 0 :
				System.out.println("조명을 끕니다.");
			break;
			case 1 :
				System.out.println("어두운 조명입니다.");
			break;
			case 2 :
				System.out.println("밝은 조명입니다.");
			break;
			case 3 :
				System.out.println("매우 밝은 조명입니다.");
			break;
			default:
				System.out.println("올바른 입력이 아닙니다.");
			break;
		}
		sc.close();
	}
}
