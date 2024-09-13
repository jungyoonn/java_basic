package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(); // 그레고리
		Calendar cal2 = Calendar.getInstance(); // 위와 같음
		
		Date date = new Date(cal.getTimeInMillis()); // 에포크 구하기
		date.setTime(cal.getTimeInMillis()); // 위와 같음
		cal.setTimeInMillis(date.getTime()); // date와 calendar의 상호 변환
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		System.out.println(cal.get(MONTH)); // 6번째 줄처럼 import 하면 이렇게도 호출 가능
		System.out.println(cal.get(DATE));
		System.out.println(cal.get(DAY_OF_MONTH));
		System.out.println(cal.get(DAY_OF_WEEK));
		
		cal.set(DATE, 15); // 바꾸기
		
		System.out.println(cal.get(DAY_OF_WEEK_IN_MONTH)); // 달에서 몇 번째 n요일인지
	}
}
