package pkg04_set.study;

import java.util.HashSet;
import java.util.Set;

public class HashSetObjClass {
	public static void main(String[] args) {
		Set<Student> set1 = new HashSet<Student>();
		Student s1 = new Student("김철수",15);
		set1.add(s1);
		set1.add(new Student("홍길동",24));
		set1.add(new Student("김철수",15));
		System.out.println(set1);
		
		// 2. 요소 삭제 -> hashCode, equals
		// set1.remove(new Student("김철수",15));
		System.out.println(set1);
		// set1.clear();
		System.out.println(set1);
		
		// 3. 합집합
		Set<Student> set2 = new HashSet<Student>();
		set2.add(new Student("홍길동",24));
		set2.add(new Student("마동식",21));
		
//		set1.addAll(set2);
//		System.out.println(set1);
		
		// 4. 교집합
//		set1.retainAll(set2);
//		System.out.println(set1);
		
		// 5. 차집합
		set1.removeAll(set2);
		System.out.println(set1);
		
		// 6. 요소 조회 : for each
		for(Student s : set2) {
			System.out.println(s);
			System.out.println(s.getName());
			System.out.println(s.getAge());
		}
		
	}
}
