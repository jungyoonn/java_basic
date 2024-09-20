package student;

import java.util.Scanner;
import java.util.function.Predicate;

public class StudentUtils {
	//문자열과 숫자를 받아오는 연속적인 작업을 처리
	static Scanner scan = new Scanner(System.in);
	
	// 문자열 받아오기
//	static String nextLine(String msg) {
//		System.out.print(msg + " > ");
//		System.out.println("\n===============================================");
//
//		return scan.nextLine();
//	}
	
	// 숫자 받아오기
//	static int nextInt(String msg) {
//		return Integer.parseInt(nextLine(msg));
//	}
	
	// 입력 통합
	static <T> T next(String msg, Class<T> clazz) {
		System.out.println(msg);
		System.out.print("> ");
		String str = scan.nextLine();
		if (clazz == Integer.class) {
			return clazz.cast(Integer.parseInt(str));
		} else if (clazz == String.class) {
			return clazz.cast(str);
		} else {
			throw new RuntimeException("잘못된 타입");
		}
	}
	
	// 입력 반복
	static <T> T next(String msg, Class<T> clazz, Predicate<T> con, String errMsg) {
		while (true) {
			try {
				T t = next(msg, clazz);
				if (con.test(t)) {
					return t;
				} else {
					throw new IllegalArgumentException(errMsg);
				}
			} catch (NumberFormatException e) {
				System.out.println("올바른 숫자를 입력하세요");
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			} 
		}
	}
}
