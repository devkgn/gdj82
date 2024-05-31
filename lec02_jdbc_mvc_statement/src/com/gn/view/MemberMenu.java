package com.gn.view;

import java.util.Scanner;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	// 애플리케이션을 실행했을 때 사용자가 보게될 첫화면
	public void mainMenu() {	
		while(true) {
			System.out.println("===== 회원 관리 =====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 아이디 검색");		// 정확히 일치하는 경우
			System.out.println("4. 회원 이름 키워드 검색");	// 검색어 포함된 경우
			System.out.println("5. 회원 정보 수정");
			System.out.println("6. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("메뉴 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1 : createMember(); break;
				
				case 0 : System.out.println("이용해주셔서 감사합니다.");return;
				default : System.out.println("다시 입력해주세요.");break;
			}
			
		}
	}
	
}
