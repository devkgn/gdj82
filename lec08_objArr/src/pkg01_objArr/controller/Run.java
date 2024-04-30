package pkg01_objArr.controller;

import pkg01_objArr.model.vo.Academy;

public class Run {
	public static void main(String[] args) {
		// 객체배열 선언
		Academy arr2[];
		
		// 선언 후 생성
		// 선언과 동시 생성
		Academy[] arr3 = new Academy[4];
		
		// 인덱스를 이용한 초기화
		Academy[] arr1;
		arr1 = new Academy[2];
		arr1[0] = new Academy("가남 교육원","010-111-1111");
		arr1[1] = new Academy("나남 교육원","010-222-2222");
		
		// 선언과 동시 초기화
		Academy[] arr4 = {
				new Academy("다담 교육원","010-333-3333"),
				new Academy("라람 교육원","010-444-4444")
		};
		
		// 인덱스를 이용한 출력
		System.out.println(arr1);
		System.out.println(arr1[0]);
		System.out.println(arr1[0].getName());
		
		// 반복문을 이용한 출력(기본 for문)
		for(int i = 0 ; i < arr4.length ; i++) {
			System.out.println(i+" : "+arr4[i]);
			System.out.println("이름 : "+arr4[i].getName());
		}
		
		// 반복문을 이용한 출력(for each)
		for(Academy a : arr4) {
			System.out.println(a);
			System.out.println(a.getName());
		}
		
		
		
		
		
	}
}
