package pkg03_abstract.sample02;

public class MyMobileApp extends AbstractApp{
	@Override
	public void display() {
		System.out.println("앱 시작 화면 표시");
	}
	@Override
	public void processInput() {
		System.out.println("사용자정보 입력 받기");
	}
}
