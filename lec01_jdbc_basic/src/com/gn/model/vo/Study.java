package com.gn.model.vo;

import java.time.LocalDateTime;

public class Study {
	private int studyNo;
	private String studyName;
	private LocalDateTime studyDate;
	
	// 기본 생성자
	public Study() {}

	// 매개변수 생성자
	public Study(int studyNo, String studyName, LocalDateTime studyDate) {
		this.studyNo = studyNo;
		this.studyName = studyName;
		this.studyDate = studyDate;
	}
	
	// Getter, Setter
	public int getStudyNo() {
		return studyNo;
	}

	public void setStudyNo(int studyNo) {
		this.studyNo = studyNo;
	}

	public String getStudyName() {
		return studyName;
	}

	public void setStudyName(String studyName) {
		this.studyName = studyName;
	}

	public LocalDateTime getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(LocalDateTime studyDate) {
		this.studyDate = studyDate;
	}

	@Override
	public String toString() {
		return "Study [번호=" + studyNo + ", 이름=" + studyName + ", 등록일=" + studyDate + "]";
	}
	
}
