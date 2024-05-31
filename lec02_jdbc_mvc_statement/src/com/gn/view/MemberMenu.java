package com.gn.view;

import java.util.List;
import java.util.Scanner;

import com.gn.controller.MemberController;
import com.gn.model.vo.Member;

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
			
			System.out.print("메뉴 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1 : createMember(); break;
				case 2 : new MemberController().selectMemberAll(); break;
				case 3 : selectByMemberId(); break;
				case 4 : selectByMemberName(); break;
				
				case 0 : System.out.println("이용해주셔서 감사합니다.");return;
				default : System.out.println("다시 입력해주세요.");break;
			}
			
		}
	}
	
	public void selectByMemberName() {
		System.out.println("***** 회원 이름으로 키워드 검색 *****");
		// 이름 입력받기
		// 입력받은 이름 정보를 매개변수로 사용해서 
		// MemberController의 selectByMemberName 메소드 호출
	}
	
	
	public void selectByMemberId() {
		System.out.println("***** 회원 아이디 검색 *****");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		new MemberController().selectByMemberId(id);
	}
	
	// 2번 메뉴 실행시 : 회원 전체 조회
//	public void selectMemberAll() {
//		불필요 메소드
//	}
	
	// 1번 메뉴 실행시 : 회원 추가
	public void createMember() {
		System.out.println("***** 회원 추가 *****");
		System.out.print("아이디 : ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.nextLine();
		System.out.print("이름 : ");
		String memberName = sc.nextLine();
		System.out.print("이메일 : ");
		String memberEmail = sc.nextLine();
		System.out.print("전화번호(-제외) : ");
		String memberPhone = sc.nextLine();
		System.out.print("성별(M/F) : ");
		String memberGender = sc.nextLine().toUpperCase();
		
		new MemberController().insertMember(memberId,memberPwd,memberName
				,memberEmail,memberPhone,memberGender);
	}
	
	//////////////////////////결과 화면///////////////////////////////////
	public void displaySuccess(String work) {
		System.out.println("요청하신 "+work+"를(을) 성공적으로 수행하였습니다.");
	}
	public void displayFail(String work) {
		System.out.println("요청하신 "+work+" 수행중 오류가 발생하였습니다.");
	}
	public void displayNoData() {
		System.out.println("조회된 결과가 없습니다.");
	}
	public void displayMemberList(List<Member> list) {
		System.out.println("조회된 결과는 다음과 같습니다.");
		for(Member m : list) {
			System.out.println(m);
		}
	}
	
	public void displayMember(Member m) {
		System.out.println("조회된 결과는 다음과 같습니다.");
		System.out.println(m);
	}

}
