package pkg02_super.practice.run;

import pkg02_super.practice.model.vo.Manager;

public class Run {
	public static void main(String[] args) {
		Manager m = new Manager("김철수","영업부");
		m.printInfo();
		m.printDepartment();
	}
}
