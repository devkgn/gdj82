package pkg04_set.practice02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Run {

	public static void main(String[] args) {
		// HashSet 객체 생성
		Set<Student> studentSet1 = new HashSet<Student>();
	  Set<Student> studentSet2 = new HashSet<Student>();
      
    // 학생 정보 추가
    studentSet1.add(new Student("홍길동", 20));
    studentSet1.add(new Student("이순신", 25));
    studentSet1.add(new Student("유관순", 22));
    
    studentSet2.add(new Student("유관순", 22));
    studentSet2.add(new Student("강감찬", 27));
    studentSet2.add(new Student("을지문덕", 30));
    
    // 두 집합의 합집합, 교집합, 차집합 구하기
    Set<Student> union = new HashSet<Student>();
    union.addAll(studentSet1);
    union.addAll(studentSet2);

    Set<Student> intersection = new HashSet<Student>();
    intersection.addAll(studentSet1);
    intersection.retainAll(studentSet2);

    Set<Student> difference = new HashSet<Student>();
    difference.addAll(studentSet1);
    difference.removeAll(studentSet2);

    // 결과 출력
    System.out.println("=== 합집합 ===");
//    Set<Student> unionTree = new TreeSet<Student>();
//    unionTree.addAll(union);
//    Iterator<Student> itr1 = unionTree.iterator();
    Iterator<Student> itr1 = union.iterator();
    int count1 = 1;
	while(itr1.hasNext()) {
		Student s = itr1.next();
		System.out.println(count1+"번 "+s.getName()+"("+s.getAge()+")");
		count1++;
	}
	System.out.println("=== 교집합 ===");
	Iterator<Student> itr2 = intersection.iterator();
	int count2 = 1;
	while(itr2.hasNext()) {
		Student s = itr2.next();
		System.out.println(count2+"번 "+s.getName()+"("+s.getAge()+")");
		count2++;
	}
	System.out.println("=== 차집합 ===");
	Iterator<Student> itr3 = difference.iterator();
	int count3 = 1;
	while(itr3.hasNext()) {
		Student s = itr3.next();
		System.out.println(count3+"번 "+s.getName()+"("+s.getAge()+")");
		count3++;
	}
	}
}