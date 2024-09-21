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
				System.out.println("해당 입력 칸은 필수 입력이며 숫자만 입력할 수 있습니다.");
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			} 
		}
	}
	
	 // 이름 입력 폼
	static <T> T next(String msg, Class<T> clazz, Predicate<T> con1, Predicate<T> con2, Predicate<T> con3, String errMsg) {
		while (true) {
			try {
				T t = next(msg, clazz);
				if (con1.test(t) && con2.test(t) && con3.test(t)) {
					return t;
				} else {
					if(!con1.test(t)) {
						throw new IllegalArgumentException("이름을 입력하지 않으셨습니다.");
					} else if(!con2.test(t)) {
						throw new IllegalArgumentException("이름의 길이가 맞지 않습니다.");						
					} else if(!con3.test(t)) {
						throw new IllegalArgumentException("이름은 초성을 포함하지 않은 한글로만 작성해 주세요.");												
					}
					throw new IllegalArgumentException(errMsg);
				}
			} catch (NumberFormatException e) {
				System.out.println("해당 입력 칸은 필수 입력이며 숫자만 입력할 수 있습니다.");
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			} 
		}
	}
}
