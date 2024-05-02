package pkg02_binding.dynamicBinding;

public class Car extends Vehicle{
	
	@Override
	public void go() {
		System.out.println("모터 힘으로");
		super.go();
	}
}
