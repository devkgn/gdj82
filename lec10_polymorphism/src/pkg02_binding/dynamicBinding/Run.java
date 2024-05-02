package pkg02_binding.dynamicBinding;

public class Run {
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.go();
		Vehicle v2 = new Bicycle();
		v2.go();
	}
}
