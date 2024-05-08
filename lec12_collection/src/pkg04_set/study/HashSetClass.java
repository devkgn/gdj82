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
		
		// 3. 합집합
		Set<Integer> numSet1 = new HashSet<Integer>();
		numSet1.add(1);
		numSet1.add(2);
		numSet1.add(3);
		
		Set<Integer> numSet2 = new HashSet<Integer>();
		numSet2.add(2);
		numSet2.add(3);
		numSet2.add(4);
				
//		numSet1.addAll(numSet2);		
//		System.out.println(numSet1);
		
		Set<Integer> numSet3 = new HashSet<Integer>();
		numSet3.addAll(numSet1);
		numSet3.addAll(numSet2);
		System.out.println(numSet3);
	
		// 4. 교집합
		Set<Integer> numSet4 = new HashSet<Integer>();
		numSet4.addAll(numSet1);
		numSet4.retainAll(numSet2);
		System.out.println(numSet4);
		
		// 5. 차집합
		Set<Integer> numSet5 = new HashSet<Integer>();
		numSet5.addAll(numSet1);
		numSet5.removeAll(numSet2);
		System.out.println(numSet5);
		
				
		
	}
}
