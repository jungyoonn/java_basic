package day2;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}

	public static Singleton getInstance() {
		return singleton; // 형식적으로는 가능하지만 외부에서 접근할 방법이 없으므로 static을 붙여서 클래스로 만듦
	}
	
}
