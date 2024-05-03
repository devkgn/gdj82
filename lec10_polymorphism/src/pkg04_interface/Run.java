package pkg04_interface;

public class Run {
	public static void main(String[] args) {
		MountainBike mb = new MountainBike();
		// System.out.println(mb.BRAND);
		System.out.println(BicycleInterface.BRAND);
		mb.speedUp(10);
		mb.speedUp(40);
		mb.speedDown(50);
		System.out.println("현재 속도 : "+mb.getSpeed());
	}
}
