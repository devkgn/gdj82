package pkg03_list;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		// 배열
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		for(int i = arr.length-1 ; 1 < i ; i--) {
			arr[i] = arr[i-1];
		}
		arr[1] = 2;
		for(int i : arr) {
			System.out.print(i+", ");
		}
		// 컬렉션
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		// 1번 인덱스에 2라는 값 추가
		list.add(1,2);
		System.out.println(list);
		
		List<Object> list1 = new ArrayList<Object>();
		list1.add(1);
		list1.add("test");
		
		// 문자열 비교
		// 1. contains
		String small ="ab";
		String large = "abcdefg";
		boolean isContains = large.contains(small);
		System.out.println(isContains);
		
		// 2. compareTo
		String one = "aaa";
		String two = "bbb";
		// -1 : 그대로 , 1: 순서 뒤집기, 0: 같은 문자열
		System.out.println(one.compareTo(two));
		System.out.println(two.compareTo(one));
	}
}
