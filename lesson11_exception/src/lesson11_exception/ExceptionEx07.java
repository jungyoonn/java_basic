package lesson11_exception;

import java.io.IOException;

public class ExceptionEx07 {
	public static void main(String[] args) {
		// checked exception : 일반 예외, throws 필수 x
		
		// unchecked exception : 런타임 예외, throws를 강제하지 않음
		
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("실행됨");
	}
	
	static void m1() throws Exception {
		Exception ex = new Exception();		
 		throw ex; // throws 안 하면 오류 발생 (책임 떠넘기기)
	}
}

class A {
	void m() throws IOException {
		
	}
}

class B extends A {

	@Override
	void m() throws IOException { // 상속 관계에서 예외를 좁힐 수는 있지만 넓힐 수는 없다
		super.m();
	}
	
}
