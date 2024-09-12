package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date(); // 현재
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		long target = date.getTime() + 3000L * 24 * 60 * 60 * 1000; // epoch 타임
		System.out.println(new Date(target)); // epoch 타임을 넣는 메서드
	}
}
