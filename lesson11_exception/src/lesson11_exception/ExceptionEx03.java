package lesson11_exception;

public class ExceptionEx03 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3); // try 블럭 안에 에러가 없으면 catch를 건너뜀
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
