package pkg01_casting.practice02.run;

import pkg01_casting.practice02.model.vo.*;

public class Run {
	public static void main(String[] args) {
		SchoolMember[] sm = new SchoolMember[3];
		sm[0] = new Student();
		sm[1] = new Teacher();
		sm[2] = new Staff();
		
		for(SchoolMember s : sm) {
			s.introduce();
			if(s instanceof Student) {
				((Student)s).study();
			} else if(s instanceof Teacher) {
				((Teacher)s).teach();
			} else if(s instanceof Staff) {
				((Staff)s).work();
			}
		}
		
		
		
	}
}
