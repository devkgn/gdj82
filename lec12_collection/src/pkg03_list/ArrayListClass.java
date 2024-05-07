package pkg03_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
	public static void main(String[] args) {
		// 1. ArrayList 자체 사용
		ArrayList<String> list1 = new ArrayList<String>();
		// 2. List 인터페이스 사용(V)
		List<String> list2 = new ArrayList<String>();
		// 3. 제네릭 빼줄 수 있음
		List<String> list3 = new ArrayList<>();
		// 4. 역량(가능성) 설정 가능
		List<String> list4 = new ArrayList<String>(10);
		// 5. 배열 -> 리스트화
		// 배열의 특징 유지(리스트 크기 고정)
		List<String> list5 = Arrays.asList("사과","딸기","체리");
		
		// 요소 추가
		List<String> season = new ArrayList<String>();
		season.add("봄");
		season.add("여름");
		season.add("겨울");
		System.out.println(season);
		season.add(2, "가을");
		System.out.println(season);
		// 요소 삭제
		season.remove(1);
		System.out.println(season);
		season.clear();
		System.out.println(season);
		// 요소 변경
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(16);
		nums.add(17);
		System.out.println(nums);
		nums.set(1, 25);
		System.out.println(nums);
		// 요소 조회
		System.out.println("0 : "+nums.get(0));
		// 기본 for문
		for(int i = 0 ; i < nums.size() ; i++) {
			System.out.println(nums.get(i));
		}
		// for each문
		System.out.println("=== for each문 ===");
		for(Integer num : nums) {
			System.out.println(num);
		}
		
		// isEmpty, contains
		List<String> list6 = new ArrayList<String>();
		list6.add("수박");
		list6.add("참외");
		if(list6.isEmpty()) {
			System.out.println("비어있어요.");
		} else {
			boolean isObj = list6.contains("수박");
			System.out.println(isObj);
		}
			
		// 요소 정렬
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(5);
		numList.add(1);
		numList.add(9);
		numList.add(3);
		System.out.println(numList);
		// 오름차순
		Collections.sort(numList);
		System.out.println(numList);
		// 내림차순
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println(numList);
			
		
	}
}
