package com.gn.run;

import com.gn.view.MemberMenu;

public class Run {
	public static void main(String[] args) {
//		Member m = new Member(1,"admin","1234","김철수","kcs@naver.com","0101112222",
//				"M",LocalDateTime.now(),LocalDateTime.now());
//		System.out.println(m);
		
		// View -> MemeberMenu 클래스 가 가지고 있는 mainMenu() 메소드 호출
		new MemberMenu().mainMenu();
//		MemberMenu view = new MemberMenu();
//		view.mainMenu();
	}
}
