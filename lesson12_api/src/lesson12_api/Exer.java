package lesson12_api;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Calendar;
import static java.util.Calendar.*;

public class Exer {
	public static void main(String[] args) {
		// 달력 출력
		// 이전달, 다음달, 이전해, 다음해, 특정 연월 입력 시 해당 연월 달력 출력
		
		// url 분석
		// String class만 사용
		String str = "";
		// 자르기
		// 1. 프로토콜 (https://)
		// 2. 도메인 search.naver.com
		// 3. file name (? 앞까지)
		// 4. 쿼리 스트링 (&로 잘라서)
		// 4-1. 파라미터와 밸류 쌍으로 묶어서 분리
		
		
		// 달력 출력
		Calendar cal = Calendar.getInstance();
		int input = 0;
		while(true) {
			try {
				input = ExerUtils.nextInt("1. 이전달 2. 다음달 3. 이전해 4. 다음해 5. 날짜 검색 6. 종료");
				if(input <= 0 || input > 6) {
					System.out.println("입력 오류! 1에서 6까지의 숫자만 입력해 주세요.");
					System.out.println();
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				System.out.println();
			}
			switch(input) {
			case 1:
				System.out.println("이전 달의 달력을 불러옵니다.");
				System.out.println("============================");
				System.out.println("\t" + (cal.get(MONTH)) + "월");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5: {
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
				System.out.println("  일  월  화  수  목  금  토");
				for(int i = 1- startDay; i <= lastDay; i++) {
					if (i <= 0) {
						System.out.printf("%-4c", ' ');
					} else {
						System.out.printf("%4d", i);
						if (i % 7 == 7 - startDay) {
							System.out.println();
						}
					}
				}
				break;
			}
			case 6: {
				System.out.println("종료합니다");
				return;
			}
			default: 
					break;
			}
		}
		
	}
}
