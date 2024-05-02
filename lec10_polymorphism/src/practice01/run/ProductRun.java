package practice01.run;

import practice01.model.vo.Book;
import practice01.model.vo.Food;
import practice01.model.vo.Product;

public class ProductRun {
	public static void main(String[] args) {
		// 1. Product 타입의 참조변수 2개 생성
		// 2. Food와 Book 매개변수가 있는 생성자
		Product p1 = new Food("치킨",20000,3);
		Product p2 = new Book("자바의 정석",15000);
		// 참조변수에 할당
		// 3. 2개의 할인된 금액 계산
		int foodPrice = p1.calculatePrice();
		int bookPrice = p2.calculatePrice();
		// 4. 상품의 가격 출력
		System.out.println(p1.getName()+"의 최종 가격 : "+foodPrice);
		System.out.println(p2.getName()+"의 최종 가격 : "+bookPrice);
		// * Food : 치킨, 20000, 3
		// * Book : 자바의 정석, 15000
		
		
	}
}
