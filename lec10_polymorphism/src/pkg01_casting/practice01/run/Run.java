package pkg01_casting.practice01.run;

import pkg01_casting.practice01.model.vo.Employee;
import pkg01_casting.practice01.model.vo.Person;
import pkg01_casting.practice01.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Person[] arr = new Person[2];
		arr[0] = new Student();
		arr[1] = new Employee();
		for(Person p : arr) {
			p.introduce();
		}
	}

}
