package pkg05_map.study;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjClass {
	public static void main(String[] args) {
		Map<String,Snack> snackMap = new HashMap<String,Snack>();
		snackMap.put("다이제", new Snack("초코맛",1144));
		snackMap.put("칸초", new Snack("밀크맛",270));
		snackMap.put("새우깡", new Snack("매운맛",500));
		System.out.println(snackMap);
		
		snackMap.put("새우깡",new Snack("트러플맛",400));
		System.out.println(snackMap);
		
		// 요소 조회
		Snack s = snackMap.get("다이제");
		System.out.println(s);
	}
}
