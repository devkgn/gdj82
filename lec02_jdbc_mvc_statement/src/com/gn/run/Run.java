package com.gn.run;

import java.time.LocalDateTime;

import com.gn.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member(1,"admin","1234","김철수","kcs@naver.com","0101112222",
				"M",LocalDateTime.now(),LocalDateTime.now());
		System.out.println(m);
	}
}
