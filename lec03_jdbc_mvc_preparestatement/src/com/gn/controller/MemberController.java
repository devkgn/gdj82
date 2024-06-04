package com.gn.controller;

import java.util.List;

import com.gn.model.dao.MemberDao;
import com.gn.model.vo.Member;
import com.gn.view.MemberMenu;

public class MemberController {
	
	public void deleteMember(String mId, String mPw) {
		Member m = new MemberDao().selectByMemberIdPw(mId,mPw);
		
//		if(m == null) {
//			new MemberMenu().displayFail("회원 탈퇴");
//		}else {
//			int result = new MemberDao().deleteMember(mId);
//			if(result > 0) {
//				new MemberMenu().displaySuccess("회원 탈퇴");
//			} else {
//				new MemberMenu().displayFail("회원 탈퇴");
//			}
//		}
		
		if(m != null 
				&& new MemberDao().deleteMember(mId) > 0) {
			new MemberMenu().displaySuccess("회원 탈퇴");
		}else {
			new MemberMenu().displayFail("회원 탈퇴");
		}
		
	}
	
	public void selectByMemberName(String memberName) {
		List<Member> resultList = new MemberDao().selectByMemberName(memberName);
		if(resultList.isEmpty()) {
			new MemberMenu().displayNoData();
		} else {
			new MemberMenu().displayMemberList(resultList);
		}
	}
	
	public void insertMember(String id, String pwd, String name, String email,
			String phone, String gender) {
		Member m = new Member();
		m.setMemberId(id);
		m.setMemberPwd(pwd);
		m.setMemberName(name);
		m.setMemberEmail(email);
		m.setMemberPhone(phone);
		m.setMemberGender(gender);
		
		int result = new MemberDao().insertMember(m);
		// 중복되는 아이디, INSERT 중 오류 : 0
		// 정상 작동 : 1
		String work = "회원추가";
		if(result > 0) {
			new MemberMenu().displaySuccess(work);
		} else {
			new MemberMenu().displayFail(work);
		}
		
	}
	
}
