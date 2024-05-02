package pkg01_casting.sample03;

import pkg01_casting.sample01.Cat;
import pkg01_casting.sample01.Dog;

public class Run {

	public static void main(String[] args) {
		Practice p = new Practice();
		p.callAnimal(new Dog());
		p.callAnimal(new Cat());
	}

}
