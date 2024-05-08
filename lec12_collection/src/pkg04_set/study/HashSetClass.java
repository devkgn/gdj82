package pkg04_set.study;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
		
		// 6. 요소 조회
		// get(X), 기본 for문(X), for each(O)
		Set<String> set2 = new HashSet<String>();
		set2.add("봄");
		set2.add("여름");
		set2.add("가을");
		set2.add("겨울");
		for(String season : set2) {
			System.out.println(season);
		}
		
		// 7. 요소 조회 : iterator 
		Set<String> names = new HashSet<String>();
		names.add("자은우");
		names.add("김동원");
		names.add("송감");
		// (1) 컬렉션의 iterator 메소드 호출
		Iterator<String> itr = names.iterator();
		// (2) hasNext()로 요소가 있는지 찾아보기
		// (3) next()로 찾은 요소 꺼내기
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		// LinkedHashSet과의 비교
		Set<String> unorderedList = new HashSet<String>();
		unorderedList.add("가");
		unorderedList.add("나");
		unorderedList.add("다");
		unorderedList.add("라");
		System.out.println(unorderedList);
		
		Set<String> orderedList = new LinkedHashSet<String>();
		orderedList.add("가");
		orderedList.add("나");
		orderedList.add("다");
		orderedList.add("라");
		System.out.println(orderedList);
		
		// TreeSet(오름차순)
		Set<String> ascendSet = new TreeSet<String>();
		ascendSet.add("동");
		ascendSet.add("서");
		ascendSet.add("남");
		ascendSet.add("북");
		System.out.println(ascendSet);
		// 내림차순
		Set<Integer> descendSet 
			= new TreeSet<Integer>(Collections.reverseOrder());
		descendSet.add(234);
		descendSet.add(56);
		descendSet.add(987);
		System.out.println("내림차순 : "+descendSet);
		// Set -> TreeSet
		Set<Integer> randomSet = new HashSet<Integer>();
		randomSet.add(234);
		randomSet.add(75);
		randomSet.add(618);
		System.out.println(randomSet);
		Set<Integer> noRandomSet = new TreeSet<Integer>();
		noRandomSet.addAll(randomSet);
		System.out.println(noRandomSet);
	}
}
