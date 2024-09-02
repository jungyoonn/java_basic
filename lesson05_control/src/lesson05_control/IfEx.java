package lesson05_control;

public class IfEx {
	public static void main(String[] args) {
		double rand =  Math.random();
		int score = (int)(rand * 101);
		System.out.println("시험 시작");
		System.out.println("점수 :: " +score);
		if (score >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		System.out.println("시험 끝");
	}
}
