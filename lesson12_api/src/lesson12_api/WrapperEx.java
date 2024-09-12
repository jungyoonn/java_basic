package lesson12_api;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10; // boxing
		Integer i2 = new Integer(20); // boxing
		Integer i3 = new Integer("30"); // boxing
		
		System.out.println(i1 + i2 + i3); // unboxing
		
		Integer i4 = 20;
		
		System.out.println(i2 == i4); // 다른 주소로 인식해서 false가 나옴
		System.out.println(i2.equals(i4)); // 값 비교
		
		System.out.println(i2.intValue() == i4.intValue()); // int로 바꿔 줌
		
		Long l1 = 10L; // boxing을 위해 L로 형을 맞춰 줌
		long l2 = 10; // 이건 가능
		i2.longValue();
		
		Character c1 = 65;
		
		// 문자열 > wrapper 객체
		l2 = Long.valueOf("10");
		l2 = new Long("10"); // 권유하지 않는 방법
		
		// wrapper 객체 > 문자열
//		String str = l2.toString();
		String str = l2 + "";
		
		// 기본형 > wrapper
		l2 = Long.valueOf(10L);
		
		// wrapper > 기본형
//		long l3 = l2.longValue();
		
		// 기본형 > 문자열
		str = String.valueOf(l2);
		// 문자열 > 기본형
		l2 = Long.parseLong(str);
		
		double d = Double.parseDouble(str);
		
		System.out.println(Integer.parseInt("FF", 16)); // 16진수
		System.out.println(Integer.toBinaryString(255)); // 2진수
		System.out.println(Integer.toOctalString(255)); // 8진수
		System.out.println(Integer.toHexString(255)); // 16진수
		
		int i = 0xFF; // 이렇게도 표현 가능
		char ch = '가'; // = 44032 = 0xAC00 = '\uAC00'(유니코드)
	}
}
