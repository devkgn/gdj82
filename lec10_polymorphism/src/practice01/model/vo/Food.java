package practice01.model.vo;

public class Food extends Product{
	private int expirationDays;
	
	public Food(String name, int price, int expirationDays) {
		super(name,price);
		this.expirationDays = expirationDays;
	}
	
	public int calculateDiscountRate() {
		// 유통기한이 남은 일자에 따라서 달라지는 할인율 계산
		// 1일 이하 : 80%
		// 5일 이하 : 50%
		// 10일 이하 : 20%
		// 그 외 : 할인X
		// 1. 유통기한 남은 일자
		int day = expirationDays;
		// 2. 조건에 따른 할인율 도출
		int result = 0;
		
		if(day <= 1 ) {
			result =  80;
		} else if(day <= 5) {
			result = 50;
		} else if(day <= 10) {
			result = 20;
		} 
		
		return result;
	}
	
	@Override
	public int calculatePrice() {
		// calculateDiscountRate 함수 호출
		// 할인 %로 활용
		int origin = super.getPrice();
		int calcRate = calculateDiscountRate();
		int now = origin - (origin*calcRate/100);
		return now;
	}
	
	public int getExpirationDays() {
		return expirationDays; 
	}
	
}
