package pkg01_lang.practice03;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] arr = str.split("\n");
		Person[] persons = new Person[3];
		int i = 0;
		for(String s : arr) {
			System.out.println(s);
			String[] s1 = s.split(",");
			String name = s1[0];
			String age = s1[1];
			String address = s1[2];
			String gender = s1[3];
			
			// String을 매개변수 자료형 형변환
			Person p = new Person(name,Integer.parseInt(age)
					,address,gender.charAt(0));
			persons[i] = p;
			i++;
		}
		// persons 배열 출력
		for(Person onePerson : persons) {
			System.out.println(onePerson);
		}
	}
}
