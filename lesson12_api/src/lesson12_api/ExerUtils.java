package lesson12_api;

import java.util.Scanner;

public class ExerUtils {
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
