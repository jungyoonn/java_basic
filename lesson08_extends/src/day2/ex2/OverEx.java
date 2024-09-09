package day2.ex2;

public class OverEx {
	public static void main(String[] args) {
		A obj = new B();
		
		System.out.println(obj.i);
		obj.m();
		System.out.println(obj.si);
		obj.sm();
	}
} // 오버라이드는 인스턴스 메서드에서만 일어난다

class A {
	static int si = 1;
	int i = 2;
	
	static void sm() {
		System.out.println("A.sm();");
	}
	
	void m() {
		System.out.println("A.m();");
	}
}

class B extends A {
	static int si = 3;
	int i = 4;
	
	static void sm() {
		System.out.println("B.sm();");
	}
	
	void m() {
		System.out.println("B.m();");
	}
}
