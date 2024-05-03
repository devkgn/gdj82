package pkg03_throws;

public class Child1 extends Parent{
	@Override
	public void method1() 
			throws NumberFormatException{
		System.out.println("Child1 메소드");
	}
}
