package pkg05_capsul.study;

public class Run {
	public static void main(String[] args) {
		Student s = new Student();
		// Student의 studentNo 필드 값 설정
		s.setStudentNo(15);
		System.out.println(s.getStudentNo());
		s.setStudentNo(23);
		System.out.println(s.getStudentNo());
		
	}
}
