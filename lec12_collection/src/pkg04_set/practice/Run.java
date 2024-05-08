package pkg04_set.practice;

import java.util.HashSet;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		Set<Song> songSet1 = new HashSet<Song>();
		songSet1.add(new Song("SPOT!","지코"));
		songSet1.add(new Song("Magnetic","아일릿"));
		songSet1.add(new Song("밤양갱","비비"));
		
		Set<Song> songSet2 = new HashSet<Song>();
		songSet2.add(new Song("Magnetic","아일릿"));
		songSet2.add(new Song("고민중독","QWER"));
		songSet2.add(new Song("고민중독","QWER"));
		
		System.out.println(songSet1);
		System.out.println(songSet2);
		
		// 요소 삭제 연습하기
		// 1. songSet1에서 곡 제목이 "밤양갱"이고, 
		// 가수명이 "비비"인 요소를 삭제하세요.
		// 2. songSet1을 출력하세요.
		songSet1.remove(new Song("밤양갱","비비"));
		System.out.println(songSet1);
		
		// 1. songSet1과 songSet2의 합집합을 
		// 담고 있는 객체 sumSet을 구성하세요.
		// 2. songSet1과 songSet2의 교집합을 
		// 담고 있는 객체 sameSet을 구성하세요. 
		// 3. songSet1에서 songSet2가 가진 요소를 제외한 차집합을 담고 있는 
		// 객체 minusSet을 구성하세요. 
		// (최종적으로 songSet1과 songSet2를 출력했을 때 변화가 없어야 합니다.)
		/*
		 * ===== 합집합 ===== 
		 * [{제목=SPOT!, 가수=지코}, {제목=Magnetic, 가수=아일릿}, {제목=고민중독,가수=QWER}] 
		 * ===== 교집합 ===== 
		 * [{제목=Magnetic, 가수=아일릿}] 
		 * ===== 차집합 ===== [{제목=SPOT!,가수=지코}]
		 */
	}

}
