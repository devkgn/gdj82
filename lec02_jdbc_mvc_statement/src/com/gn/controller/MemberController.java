package com.gn.controller;

import java.util.List;

import com.gn.model.dao.MemberDao;
import com.gn.model.vo.Member;
import com.gn.view.MemberMenu;

// 사용자의 요청 처리 : View에서 전달받은 데이터 가공 -> Dao 
public class MemberController {
	
	public void 
	
	public void deleteMember(String memberId) {
		int result = new MemberDao().deleteMember(memberId);
		if(result > 0) {
			
		} else {
			
		}
	}
	
	public void updateMember(String memberId, String memberName, 
			String memberEmail, String memberPhone) {
		Member m = new Member();
		m.setMemberId(memberId);
		m.setMemberName(memberName);
		m.setMemberEmail(memberEmail);
		m.setMemberPhone(memberPhone);
		
		int result = new MemberDao().updateMember(m);
		if(result > 0) {
			new MemberMenu().displaySuccess("회원 정보 수정");
		} else {
			new MemberMenu().displayFail("회원 정보 수정");
		}
	}
	
	
	public void selectByMemberName(String name) {
		// MemberMenu로 부터 전달 받은 매개변수를 활용하여
		// MemberDao의 selectByMemberName 메소드 호출
		// 메소드 호출의 결과를 List<Member>로 받아야 함
		// 리턴받은 결과 기준으로 화면 출력
	}
	
	
	public void selectByMemberId(String id) {
		Member resultVo = new MemberDao().selectByMemberId(id);
		if(resultVo == null) {
			new MemberMenu().displayNoData();
		} else {
			// MemberMenu의 displayMember 메소드 호출
			new MemberMenu().displayMember(resultVo);
		}
	}
	
	public void selectMemberAll() {
		// Dao에게 회원 전체 정보 조회
		List<Member> resultList = new MemberDao().selectMemberAll();
		if(resultList.isEmpty()) {
			new MemberMenu().displayNoData();
		}else {
			new MemberMenu().displayMemberList(resultList);
		}
		
	}
	
	public void insertMember(String memberId, String memberPwd ,String memberName
			,String memberEmail, String memberPhone, String memberGender) {
		// 전달받은 값을 Dao에 예쁘게 전달하기 위해서 순수 데이터 가공
		Member m = new Member();
		m.setMemberId(memberId);
		m.setMemberPwd(memberPwd);
		m.setMemberName(memberName);
		m.setMemberEmail(memberEmail);
		m.setMemberPhone(memberPhone);
		m.setMemberGender(memberGender);
		// Dao에 있는 insertMember 메소드 호출
		int result = new MemberDao().insertMember(m);
		if(result > 0){
			new MemberMenu().displaySuccess("회원 추가");
		}else {
			new MemberMenu().displayFail("회원 추가");
		}
	}
}
