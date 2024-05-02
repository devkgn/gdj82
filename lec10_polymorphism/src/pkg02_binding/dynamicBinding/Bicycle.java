package pkg02_binding.dynamicBinding;

public class Bicycle extends Vehicle{
	@Override
	public void go() {
		System.out.println("다리 힘으로");
		super.go();
	}
}
