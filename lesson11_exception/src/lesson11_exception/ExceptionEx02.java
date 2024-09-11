package lesson11_exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3/0); // 원래 터지는 위치부터 에러 캐치
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
