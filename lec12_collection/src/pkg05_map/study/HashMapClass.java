package pkg05_map.study;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
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
		
	}

}
