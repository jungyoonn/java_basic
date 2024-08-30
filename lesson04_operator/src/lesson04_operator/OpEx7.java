package lesson04_operator;

public class OpEx7 {
	public static void main(String[] args) {
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		int num = 71;
		String isOdd = num % 2 == 1 ? "홀수" : "짝수";
		String isEven = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(isOdd);
		System.out.println(isEven);
		
		String s = "ABCD";
		s += "가나다라";
		s += "1234";
		System.out.println(s);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		char ch = 'A';
		// char ch2 = ch + 1; 산술 형 상승 => int보다 작은 숫자 타입을 이항 연산하면 int가 된다! char 타입에는 담기지 않음
		char ch2 = (char)(ch + 1); // 이렇게 연산해야 값이 담긴다
		System.out.println(ch2);
		
		// int double char boolean
		// int보다 작은 타입 : byte short, char
		byte b = Byte.MAX_VALUE;
		byte b2 = (byte)(b - 1);
		// byte b1 = b - b1; 이것도 성립되지 않음
		System.out.println(b + 1);
		System.out.println(b2);

		int i = 300; // 2진수로 100101100
		byte b3 = (byte)i;
		System.out.println(i);
		System.out.println(b3); // 오버플로우 발생

		
		int korFirst = (int)'가';
		int korLast = (int)'힣';
		int korCount = korLast - korFirst + 1;
		System.out.println(korCount);
		
		int cnt = 0;
		System.out.println("======================");
		for(ch ='다' ; ch < '따'; ch++, cnt++) {
			System.out.print(ch);
		}
		System.out.println(cnt);
		
		//페이징
		int apple = 173;
		int box = 10;
		int totalBox = apple % box == 0 ? apple / box : apple / box + 1;
		
		int totalBox2 = (apple + 9) / box;
		
		System.out.println(totalBox);
		System.out.println(totalBox2);
		
		//소수점 자르기 반올림
		Double pi = 3.141592;
		System.out.println((int)(pi * 1000 + 0.5) / 1000d);
	}
}
