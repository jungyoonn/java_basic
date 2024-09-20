package lesson14_generic;

public class GenericEx {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>(); // Box<Integer, String, Object>
		box.setItem(10);
		
		int result = (Integer)box.getItem();
		System.out.println(result);
	}
}

// 제네릭 클래스
class Box<T> { // class Box<T, R, V>처럼 여러 개도 가능
	private T item;
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
