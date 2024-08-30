package lesson04_operator;

public class OpEx5 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		//AND
		System.out.println(a > b && a == 10);
		System.out.println(a > b && a == b);

		//OR
		System.out.println(a > b || a == b);
		System.out.println(a < b || a == b);
		
		//XOR
		System.out.println(a > b ^ a == 10);
		System.out.println(a > b ^ a == b);
		
		//NOT
		System.out.println(!(a > b));
		System.out.println(!(a < b));
	}
}
