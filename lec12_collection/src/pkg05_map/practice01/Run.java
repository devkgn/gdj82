package pkg05_map.practice01;

import java.util.HashMap;
import java.util.Map;

public class Run {
	public static void main(String[] args) {
		Map<String,Employee> phoneBook = new HashMap<String,Employee>();
		phoneBook.put("John", new Employee("123-456-789",30));
		phoneBook.put("Emma", new Employee("987-654-3210",25));
		phoneBook.put("Michael", new Employee("555-123-4567",35));
		System.out.println("===== 변경전 =====");
		System.out.println(phoneBook);
		// phoneBook.put("John", new Employee("123-456-789",31));
		phoneBook.get("John").setAge(31);
		System.out.println("===== 변경후 =====");
		System.out.println(phoneBook);
		
		Employee e = phoneBook.get("Emma");
		String phone = e.getPhone();
		int age = e.getAge();
		System.out.println("전화번호 : "+ phone);
		System.out.println("나이 : "+ age);
		
		String name = "Emma";
		System.out.println(" === "+name+"의 정보 ===");
		System.out.println("전화번호(2) : "+ phoneBook.get(name).getPhone());
		System.out.println("나이(2) : "+phoneBook.get(name).getAge());
		
		
	}
}
