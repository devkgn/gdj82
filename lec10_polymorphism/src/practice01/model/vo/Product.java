package practice01.model.vo;

public class Product {
	private String name;	//상품명
	private int price;		//가격
	
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
	
	public int calculatePrice() {
		// 10%할인된 금액을 리턴합니다.
		// 1. 지금 가격
		// 2. 지금 가격 * 0.1 빼기
		int origin = price;
		int now = origin - (origin*10/100);
		return now;
	}
}
