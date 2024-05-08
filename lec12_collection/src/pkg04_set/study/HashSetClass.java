package pkg04_set.study;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
	public static void main(String[] args) {
		// 1. 요소 추가
		// 중복 저장X, 순서X
		Set<String> set1 = new HashSet<String>();
		set1.add("봄");
		set1.add("여름");
		set1.add("봄");
		set1.add("가을");
		System.out.println(set1);
		
		// 2. 요소 삭제
		set1.remove("여름");
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
		
		
	}
}
