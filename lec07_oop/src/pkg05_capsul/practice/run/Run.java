package pkg05_capsul.practice.run;

import pkg05_capsul.practice.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId("user01");
		p.setPwd("1234");
		p.setName("김철수");
		p.setAge(43);
		p.setGender('M');
		p.setPhone("010-111-1111");
		p.setEmail("kcs@gmail.com");
		
		System.out.println(p.information());
	}
}
