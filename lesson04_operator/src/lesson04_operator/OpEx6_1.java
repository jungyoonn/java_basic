package lesson04_operator;

public class OpEx6_1 {
	public static void main(String[] args) {
		String s = Integer.toBinaryString(10);
		System.out.println(s);

		String s2 = Integer.toBinaryString(6);
		System.out.println(s2);
		
		String s3 = Integer.toBinaryString(-3);
		System.out.println(s3); //int라서 32비트로 출력된다!
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(max+", "+min);
		
		System.out.println(String.format("%32s", Integer.toBinaryString(max)).replace(" ","0"));
		System.out.println(Integer.toBinaryString(min));
	}
}
