package pkg04_interface;

public interface BicycleInterface {
	// 상수 선언
	public static final String BRAND = "Goodee";
	public static final int MAX_SPEED = 30;
	// 추상 메소드 선언
	public abstract void speedUp(int increment);
	public abstract void speedDown(int decrement);
	
}
