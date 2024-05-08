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
		set1.remove(new Student("김철수",15));
		System.out.println(set1);
		set1.clear();
		System.out.println(set1);
	}
}
