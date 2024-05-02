package pkg03_abstract.sample02;

public abstract class AbstractApp {
	// 모든 앱은 화면을 표시해야해요. 
	public abstract void display();
	// 모든 앱은 사용자가 입력한 값을 처리해야해요.
	public abstract void processInput();
	// 일부 앱은 종료가 가능합니다.
	public void close() {
		System.out.println("앱을 종료합니다.");
	}
	
}
