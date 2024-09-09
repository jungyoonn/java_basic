package day2.ex2;

public class OverEx {
	public static void main(String[] args) {
		// bind : 관계 형성
		//		  어떤 객체가 특정 멤버를 호출할 때 대상을 지정
		A obj = new B();
		
		System.out.println(obj.i); // 정적 바인드 : 컴파일 시 지정
		obj.m(); // 동적 바인드의 결과물(오버라이드) : 런타임 시 지정
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
