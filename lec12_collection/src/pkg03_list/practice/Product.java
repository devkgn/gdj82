package pkg03_list.practice;

// 1. Comparable 인터페이스 구현
public class Product implements Comparable<Product>{
	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name+"은(는) "+price+"원이에요.";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Product) {
			Product p = (Product)obj;
			if(p.name.equals(name) && p.price == price) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public int compareTo(Product p) {
		// 양수는 앞뒤자리 바꾼다.
		// 음수는 앞뒤자리를 바꾸지 않는다.
		// 0은 값이 같다.
		int price1 = price;	// 5000
		int price2 = p.price; // 3000
		// 오름차순 -> 작은게 앞
//		if(price1 > price2) {
//			return 1;
//		} else if(price1 < price2) {
//			return -1;
//		} else {
//			return 0;
//		}
		return price1 - price2;
		
		
	}
	
}
