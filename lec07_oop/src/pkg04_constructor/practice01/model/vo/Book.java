package pkg04_constructor.practice01.model.vo;

public class Book {
	private String title;			// 도서명
	private String publisher; 		// 출판사 
	private String author; 			// 저자명
	private static final int price = 2000;				// 가격
	private double discountRate;	// 할인율
	
	public Book() {
		// this.price = 2000;
	}
	
	public Book(String title, int price, String author) {
		this.title = title;
		// this.price = price;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, 
			int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		// this.price = price;
		this.discountRate = discountRate;
	}
	
	public void information() {
		System.out.println("=== "+title+" ===");
		System.out.println("저자 : "+author);
		System.out.println("출판사 : "+publisher);
		System.out.println("가격 : "+price+"원");
		System.out.println("할인율 : "+discountRate);
	}
}
