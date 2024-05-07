package pkg03_list.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Run {
	public static void main(String[] args) {
//		Product p1 = new Product("수박",10000);
//		System.out.println(p1);
//		
//		Object o = new Object();
//		System.out.println(o);
		
		List<Product> products = new ArrayList<Product>();
		Product p1 = new Product("사과",1000);
		products.add(p1);
		products.add(new Product("바나나",2000));
		products.add(new Product("딸기",3000));
		
		System.out.println("===== for each로 조회 =====");
		for(Product p :products) {
			System.out.println(p);
		}
		
		products.remove(1);
		products.set(0, new Product("오렌지",1500));
		
		System.out.println("===== 기본 for문 조회 =====");
		for(int i = 0 ; i < products.size() ;i++) {
			System.out.println(i+" : "+products.get(i));
		}
		
		// 요소 검색
		boolean isObj = products.contains(new Product("오렌지",1500));
		System.out.println("오렌지 있어요? "+isObj);
		
		// 객체 요소 정렬
		// 1. Comparable 2. Comparator
		products.add(new Product("복숭아",2000));
//		Collections.sort(products);
//		System.out.println(products);
		
		// Collections.sort(products,new CustomComparator());
		
		Collections.sort(products,new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getPrice() - p2.getPrice();
			}
		});
		
		Collections.sort(products,new Comparator<Product>() {
			@Override
			public int compare(Product p1,Product p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		System.out.println(products);
		
		
	}
}
