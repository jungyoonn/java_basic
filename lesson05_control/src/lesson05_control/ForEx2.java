package lesson05_control;

public class ForEx2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.printf("i : %d, sum : %d\n", i, sum);
		}
		System.out.println("합계 : " + sum);
	}
}
