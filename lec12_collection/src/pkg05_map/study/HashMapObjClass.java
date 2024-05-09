package pkg05_map.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		
		// keySet()
		Set<String> keySet = snackMap.keySet();
		Iterator<String> itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = snackMap.get(key);
			System.out.println(key+" = "+value);
		}
		// entrySet()
		Set<Entry<String,Snack>> entrySet = snackMap.entrySet();
		Iterator<Entry<String,Snack>> entryItr = entrySet.iterator();
		while(entryItr.hasNext()) {
			Entry<String,Snack> entry = entryItr.next();
			String kye = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(kye+" = "+value);
		}
		
		
		
		
		
		
		
	}
}
