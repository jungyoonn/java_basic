package lesson11_exception;

public class ExceptionEx04 { // 다중 catch문
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]); // 제일 먼저 나온 예외부터 처리, 다음 catch는 실행 x
			System.out.println(4/0);
			Integer.parseInt("a");
		} catch (ArithmeticException e) {
			System.out.println(5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("에러 이슈");
//			e.printStackTrace(); 빨간 메시지를 보여 줌
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			
			StackTraceElement[] elements = e.getStackTrace();
			for(StackTraceElement ste : elements) {
				System.out.println(ste.getMethodName()); // 예외 발생 메서드
			}
		} catch (Exception e) {
			System.out.println("최후의 처리");
		}
		System.out.println(6);
	}
}
