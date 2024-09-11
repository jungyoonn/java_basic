package lesson11_exception;

public class ExceptionEx05 {
	public static void main(String[] args) {
		System.out.println("main 전");
		m1();
		System.out.println("main 후");
	}
	
	static void m1() {
		System.out.println("m1() 전");
		
		try {
			m2();			
		} catch (ArithmeticException e) {
			System.out.println("arithmetic 예외 처리");
		}
		
		System.out.println("m1() 후"); // catch에서 처리했으므로 실행됨
	}
	static void m2() {
		System.out.println("m2() 전");
		
		try {
		 m3();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("index 예외 처리");
		} finally {
			System.out.println("m2() 후 (finally)"); // 32번째 줄은 실행되지 않지만 finally 블럭은 예외 유무에 상관없이 반드시 실행됨
		}
		
		System.out.println("m2() 후"); //try 블럭에서 m3() 예외가 발생해서 실행되지 않음
	}
	
	static void m3() {
		System.out.println(3/0);
	}
}
