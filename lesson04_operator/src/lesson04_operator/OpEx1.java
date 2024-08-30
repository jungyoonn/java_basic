package lesson04_operator;

public class OpEx1 {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println("num1 = 10 -> "+num1);
		num1 += 10;
		System.out.println("num1 += 10 -> "+num1);
		num1 -= 10;
		System.out.println("num1 -= 10 -> "+num1);
		num1 *= 2;
		System.out.println("num1 *= 2 -> "+num1);
		num1 /= 2;
		System.out.println("num1 /= 2 -> "+num1);
		num1 %= 3;
		System.out.println("num1 %= 3 -> "+num1);
	
		// System.out.println(10 / 0); 0으로 나누는 것은 에러의 주범
	}
	
}
