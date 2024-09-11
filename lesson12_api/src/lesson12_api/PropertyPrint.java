package lesson12_api;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

public class PropertyPrint {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		Set<?> keys = props.keySet();
		
		for(Object o : keys) {
			String key = o.toString();
			System.out.printf("%s ::::: %s\n", key, System.getProperty(key));
		}
		
		// epoch time
		// 1970.01.01 자정을 기준으로 0 / 이후로 지나는 시간의 기준은 ms
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime());
		System.out.println(Calendar.getInstance().getTimeInMillis());
		
		// 크리스마스 카운트다운
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DATE, 25);
		long between = cal.getTimeInMillis() - System.currentTimeMillis();
		System.out.println(between / 1000); // 밀리세컨드가 기준이어서 나눠 줌
		System.out.println(between / 1000 / 60 / 60 / 24);
	}
}
