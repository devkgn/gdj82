package pkg04_constructor.model.vo;

public class Cake {
	// 1. 자료형 기본값
	// 2. 명시적 초기화
	public String flavor = "Cheese";
	public static int price = 20000;
	
	// 4. 생성자
	public Cake() {
		this.flavor = "Choco";
		// this.price = 48000;
	}
	// 3. 초기화 블록
	{flavor = "SweetPotato";}
	static {price = 35000;}
	
	
}
