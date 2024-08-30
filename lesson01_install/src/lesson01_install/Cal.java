package lesson01_install;

import java.time.LocalDate;
import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		System.out.printf("검색할 날짜 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int searchYear = scanner.nextInt();
		int searchMonth = scanner.nextInt();
		int searchDay = scanner.nextInt();
		LocalDate date = LocalDate.of(searchYear, searchMonth, 1);
		int startDay = date.getDayOfWeek().getValue();
		int lastDay = date.lengthOfMonth();

		System.out.println(startDay);
		
		System.out.println("\t" + date.getMonth().getValue() + "월");
		System.out.println("일  월  화  수  목  금  토");
		for(int i = 1- startDay; i <= lastDay; i++) {
			if (i <= 0) {
				System.out.printf("%3c", ' ');
			} else {
				System.out.printf("%3d", i);
				if (i % 7 == 7 - startDay) {
					System.out.println();
				}
			}
		}
	}
}
