package pkg03_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		// 순차적으로 진행하는 업무
		// 1970년 1월 1일 1/1000초
		long arrayListStartTime = System.currentTimeMillis();
		for(int i = 0 ; i < 1000000 ;i++) {
			arrayList.add(i);
		}
		long arrayListEndTime = System.currentTimeMillis();
		System.out.println("1. ArrayList 추가 시간");
		System.out.println(arrayListEndTime-arrayListStartTime);
		long linkedListStartTime = System.currentTimeMillis();
		for(int i = 0 ; i < 1000000 ; i++) {
			linkedList.add(i);
		}
		long linkedListEndTime = System.currentTimeMillis();
		System.out.println("2. LinkedList 추가 시간");
		System.out.println(linkedListEndTime-linkedListStartTime);
	}
}
