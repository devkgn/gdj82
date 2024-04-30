package pkg02_super.practice.model.vo;

public class Employee {
	protected String name;
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("직원 이름 : "+name);
	}
}
