package pkg03_override;

public class Run {
	public static void main(String[] args) {
		Student s1 = new Student(1,"김철수");
		Student s2 = new Student(1,"김철수");
		
		if(s1.equals(s2)) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("불일치!!");
		}
		
		System.out.println(s1.toString());
	}
}
