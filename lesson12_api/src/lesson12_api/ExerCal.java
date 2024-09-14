package lesson12_api;

import java.util.Calendar;
import static java.util.Calendar.*;

public class ExerCal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar searchCal = Calendar.getInstance();
		int input = 0;
		
		ExerUtils.calPrint(cal);
		while(true) {
			try {
				searchCal = Calendar.getInstance();
				input = ExerUtils.nextInt("1. 이전달 2. 다음달 3. 이전해 4. 다음해 5. 날짜 검색 6. 종료");
				System.out.println();
				if(input <= 0 || input > 6) {
					System.out.println("입력 오류! 1에서 6까지의 숫자만 입력해 주세요.");
					System.out.println();
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				System.out.println();
				continue;
			}
			switch(input) {
			case 1: {
				System.out.println("이전 달의 달력을 불러옵니다.");
				
				searchCal.set(MONTH, cal.get(MONTH) - 1);
				ExerUtils.calPrint(searchCal);
				break;
			}
			case 2: {
				System.out.println("다음 달의 달력을 불러옵니다.");
				
				searchCal.set(MONTH, cal.get(MONTH) + 1);
				ExerUtils.calPrint(searchCal);
				break;
			}
			case 3: {
				System.out.println("이전 해의 달력을 불러옵니다.");
				
				searchCal.set(YEAR, cal.get(YEAR) - 1);
				ExerUtils.calPrint(searchCal);
				break;
			}
			case 4:{
				System.out.println("다음 해의 달력을 불러옵니다.");
				
				searchCal.set(YEAR, cal.get(YEAR) + 1);
				ExerUtils.calPrint(searchCal);
				break;
			}
			case 5: {
				System.out.println("검색할 날짜 입력 :");
				int searchYear = ExerUtils.nextInt("연");
				int searchMonth = ExerUtils.nextInt("월");
				
				searchCal.set(searchYear, searchMonth - 1, 1);
				ExerUtils.calPrint(searchCal);
				break;
			}
			case 6: {
				System.out.println("종료합니다.");
				return;
			}
			default: 
					break;
			}
		}
	}
}
