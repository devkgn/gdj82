package pkg03_abstract.sample01;

// 추상 클래스
public abstract class Animal {
	// 추상 메소드는 반드시 추상 클래스 안에!!
	public abstract void makeSound();
	
	public void method() {
		System.out.println("구현부있는 메소드");
	}
}

