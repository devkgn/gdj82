package pkg04_set.study;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student() {}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "{이름="+name+", 나이="+age+"}";
	}
	// 중복된 데이터 판단 기준(1)
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	// 중복된 데이터 판단 기준(2)
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(s.name.equals(name) && s.age == age) {
				result = true;
			}
		}
		return result;
	}
	
	
}
