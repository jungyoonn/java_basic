package lesson12_api;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {
	public static void main(String[] args) throws ParseException {
		double[] scores = {999990.555, 88888880.6666, 70.77777, 66.666666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(double d : scores) {
			System.out.println(df.format(d));
		}
		
		// format의 반대는 parse
		// format : 원시 > 문자열
		// parse : 문자열 > 원시
		
		Number number = df.parse("9,999.99");
		double dou = number.doubleValue();
		System.out.println(dou);
	}
}
