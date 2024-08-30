package lesson04_operator;

public class OpEx6_2 {
	public static void main(String[] args) {
		int num = 10;
		String s = num + "";
		System.out.println(s);
		
		int num2 = Integer.parseInt(s);
		System.out.println(num2);
		
		String bin = "11010";
		int num3 = Integer.parseInt(bin, 2); // 2진수
		System.out.println(num3);
	}
}
