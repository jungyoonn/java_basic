package lesson05_control;

public class WhileEx2 {
	public static void main(String[] args) {
		// 정수를 입력받아 각 자릿수의 합계를 구하라
		int num = 123456;
		int sum = 0;
		
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//		}
//		
		for(; num != 0; num /= 10) {
			sum += num % 10;
		}
		System.out.println(sum);
	}
}
