package pkg05_capsul.practice.model.vo;

public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String information() {
		String result = "";
		result += "아이디 : "+id+"\n";
		result += "비밀번호 : "+pwd+"\n";
		result += "이름 : "+name+"\n";
		result += "나이 : "+age+"\n";
		result += "성별 : "+gender+"\n";
		result += "전화번호 : "+phone+"\n";
		result +="이메일 : "+email+"\n";
		return result;
	}
}
