package pkg04_set.practice02;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.age);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Student) {
			Student check =(Student)obj;
			if(name.equals(check.name) && age==check.age) {
				result = true;
			}	
		}
		return result;
	}

	@Override
	public int compareTo(Student s) {
		String standard = name;
		String obj = s.name;
		if(standard.equals(obj)) {
			int standardAge = age; // 20
			int objAge = s.age; // 40
			return standardAge-objAge;
		}
		return standard.compareTo(obj);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
