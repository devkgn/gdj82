package pkg03_override;

public class Student {
	private int id;
	private String name;
	
	public Student() {}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		if(s.id == this.id && s.name.equals(this.name)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "학생의 이름 : "+name+"\n학생의 번호 : "+id;
	}

}
