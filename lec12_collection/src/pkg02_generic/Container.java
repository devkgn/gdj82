package pkg02_generic;

// 제네릭 X : n개 타입 처리하려면 n개 코드
// 제네릭 O : n개 타입 처리에 1개 코드만 이용
public class Container<T> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}
//public class Container {
//	private String item;
//}
//public class Container {
//	private double item;
//}
