package pkg05_map.study;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapClass {

	public static void main(String[] args) {
		// 1. 객체 생성
		// K(키), V(값)
		// Map<K,V> 참조변수명 = new HashMap<K,V>();
		Map<String,String> map1 = new HashMap<String,String>();
		Map<String,Object> ticket = new HashMap<String,Object>();
		
		ticket.put("name", "파묘");
		ticket.put("price", 20000);
		ticket.put("isUsed", true);
		ticket.put("price", 10000);
		System.out.println(ticket);
		
		String str = (String)ticket.get("name");
		System.out.println(ticket.get("name"));
		System.out.println(ticket.get("price"));
		System.out.println(ticket.get("isUsed"));
		
//		Iterator<String,Object> itr = ticket.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		// keySet()
		Set<String> keySet = ticket.keySet();
		Iterator<String> itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			Object value = ticket.get(key);
			System.out.println(key+" = "+value);
		}
		// entrySet()
		Set<Entry<String,Object>> entrySet = ticket.entrySet();
		Iterator<Entry<String,Object>> entryItr = entrySet.iterator();
		while(entryItr.hasNext()) {
			Entry<String,Object> entry = entryItr.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+" = "+value);
		}
		
		// 요소 제거
		System.out.println(ticket.size());
		// ticket.remove("price");
		System.out.println(ticket.size());
		//ticket.clear();
		System.out.println(ticket);
		
		String check = "price";
		if(ticket.containsKey(check)) {
			System.out.println("ticket에 "+check+"가 있습니다.");
			System.out.println(check+"는 "+ticket.get(check)+"입니다.");
		} else {
			System.out.println("ticket에 "+check+"가 없습니다.");
		}
		
		int valueCheck = 10000;
		if(ticket.containsValue(valueCheck)) {
			System.out.println("ticket에 "+valueCheck+"이 있습니다.");
		} else {
			System.out.println("ticket에 "+valueCheck+"가 없습니다.");
		}
		
		
		// 키값 입력 순 정렬 : LinkedHashMap
		Map<String,Object> ticket2 
			= new LinkedHashMap<String,Object>();
		ticket2.put("name", "파묘");
		ticket2.put("price", 10000);
		ticket2.put("isUsed", true);
		System.out.println(ticket2);
		
		// 키값을 오름차순 정렬 : TreeMap
		Map<String,Object> ticket3 
			= new TreeMap<String,Object>(Comparator.reverseOrder());
		ticket3.put("name","파묘");
		ticket3.put("price", 10000);
		ticket3.put("isUsed", true);
		System.out.println(ticket3);
		
		
		
		
		
		
		
	}
}
