package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx2 {
	public static void main(String[] args) {
		// 날짜 간 계산
		
		Calendar cal = Calendar.getInstance(); // 현재 시간
		System.out.println(cal); // 포맷을 예쁘게 바꿔야 보기 편하다
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.add(Calendar.DATE, -10000);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));

		cal.add(Calendar.MONTH, 200);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.roll(Calendar.DATE, 4); // 해당 달 안에서만 돌게 됨 (1.1이 아니라 12.1이 나오게 된다)
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
	}
}
