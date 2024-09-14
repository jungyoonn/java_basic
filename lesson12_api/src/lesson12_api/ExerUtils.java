package lesson12_api;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExerUtils {
static Scanner scan = new Scanner(System.in);

	// 문자열 받아오기
	static String nextLine(String msg) {
		System.out.print(msg + " > ");
		System.out.println("\n====================================================");

		return scan.nextLine();
	}
	
	// 숫자 받아오기
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	public static void calPrint(Calendar cal) {
		cal.set(DATE, 1);
		int year = cal.get(YEAR);
		int month = cal.get(MONTH) + 1;
		int startDay = cal.get(DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(DAY_OF_MONTH);
		
		System.out.println("=============================");
		System.out.println("\t " + year + "년 " + month + "월");
		System.out.println("  일   월   화   수   목   금   토");
		System.out.println("------------------------------");
		
		for(int i = 1; i < startDay; i++) {
			System.out.printf("%-4c", ' ');
		}
		int cnt = startDay;
		for(int i = 1; i <= lastDay; i++, cnt++) {
			System.out.printf("%4d", i);
			if(cnt == 7) {
				System.out.println();
				cnt = 0;
			}
		}
		System.out.println();
		System.out.println("==============================");
		System.out.println();
	}
}

//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
//		System.out.println("startDay ::: " + startDay + ", lastDay ::: " + lastDay);