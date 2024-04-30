package pkg01_inherit;

public class Run {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.walk();
		dog.bark();
		
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
		cat.walk();
	}
}
