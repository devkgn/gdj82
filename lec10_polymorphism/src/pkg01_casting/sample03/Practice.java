package pkg01_casting.sample03;

import pkg01_casting.sample01.Animal;
import pkg01_casting.sample01.Cat;
import pkg01_casting.sample01.Dog;

public class Practice {
	public void callAnimal(Animal animal) {
		System.out.println("=== callAnimal ===");
		// animal.sound();
		if(animal instanceof Dog) {
			((Dog)animal).wagTail();	
		} else if (animal instanceof Cat) {
			((Cat)animal).eatChur();
		}
		
	}
}
