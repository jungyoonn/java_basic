package student;

import java.util.Scanner;

public class StudentUtils {
	//문자열과 숫자를 받아오는 연속적인 작업을 처리
	static Scanner scan = new Scanner(System.in);
	
	// 문자열 받아오기
	static String nextLine(String msg) {
		System.out.print(msg + " > ");
		System.out.println("\n===============================================");

		return scan.nextLine();
	}
	
	// 숫자 받아오기
	static int nextInt(String msg) {
		
		return Integer.parseInt(nextLine(msg));
	}
}
