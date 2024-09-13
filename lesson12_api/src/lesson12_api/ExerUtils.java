package lesson12_api;

import java.util.Scanner;

public class ExerUtils {
static Scanner scan = new Scanner(System.in);

	// 문자열 받아오기
	static String nextLine(String msg) {
		System.out.print(msg + " > ");
		System.out.println("\n============================================================");

		return scan.nextLine();
	}
	
	// 숫자 받아오기
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	public static void calPrint(int year, int month, int startDay, int lastDay) {
		System.out.println("시작 요일 ::: " + startDay + "  끝 날짜 ::: " + lastDay);
		System.out.println("\t" + year + "년 " + month + "월");
		System.out.println("  일  월  화  수  목  금  토");
		int cnt = startDay;
//		startDay -= 1;
		for(int i = 2 - startDay; i <= lastDay; i++, cnt++) {
			if (i <= 0) {
				System.out.printf("%-4c", ' ');
			} else {
				System.out.printf("%4d", i);
				if (i % 7 == 7 - startDay) {
					System.out.println();
					if(cnt == 7) {
						System.out.println();
					}
				}
			}
			
		}
		System.out.println(); 
		System.out.println();
	}
}
