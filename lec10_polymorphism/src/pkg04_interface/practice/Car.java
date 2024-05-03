package pkg04_interface.practice;

public class Car implements Machine, Vehicle{

	@Override
	public void speedUp() {
		System.out.println("자동차 속도를 높입니다.");
	}

	@Override
	public void speedDown() {
		System.out.println("자동차 속도를 줄입니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("자동차를 시동합니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("자동차 시동을 끕니다.");
	}

}
