package pkg03_abstract.sample02;

public class Run {
	public static void main(String[] args) {
		MyMobileApp mma = new MyMobileApp();
		mma.display();
		mma.processInput();
		mma.close();
		
		// AbstractApp aa = new AbstractApp(); 
		
		AbstractApp aa = new MyMobileApp();
		aa.display();
		aa.processInput();
		aa.close();
		
	}
}
