package pkg05_map.practice01;

public class Employee {
	
	private String phone;
	private int age;
	
	public Employee() {}
	
	public Employee(String phone, int age) {
		this.phone = phone;
		this.age = age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "[phone="+phone+", age="+age+"]";
	}

}
