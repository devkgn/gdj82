package pkg03_list.practice;

import java.util.Comparator;

public class CustomComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		int price1 = p1.getPrice();	// 5000
		int price2 = p2.getPrice();	// 3000
		// 오름차순
//		if(price1 > price2) {
//			return 1; // 양수는 앞뒤 바꿈
//		}else if(price1 < price2) {
//			return -1;
//		} else {
//			return 0;
//		}
		return price1-price2;
		
	}

}
