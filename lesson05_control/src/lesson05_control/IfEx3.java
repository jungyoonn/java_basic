package lesson05_control;

public class IfEx3 {
	public static void main(String[] args) {
//		int math = (int)(Math.random() * 101);
//		int eng = (int)(Math.random() * 101);
//		
//		System.out.println("수학 점수는 " + math + ", 영어 점수는 " + eng);
//		
//		if (math >= 60) {
//			if (eng >= 60) {
//				System.out.println("통과");
//			} else {
//				System.out.println("탈락");
//			}
//		} else System.out.println("탈락");
		
		// 자격증 시험, 과락 o
		// 60점 이상이면 합격
		// 과락(40점 미만) 있을 시 불합격
		int score1 = 90, score2 = 90, score3 = 50;
		int avg = (int)((score1 + score2 + score3) / 3d);
		
//		if (avg >= 60) {
//			if (score1 < 60 || score2 < 60 || score3 < 60) {
//				System.out.println("불합격입니다.");
//			} else {
//				System.out.println("합격입니다");
//			}
//		} else {
//			System.out.println("불합격입니다");
//		}
		
		if (avg >= 60 && score1 >= 40 && score2 >= 40 && score3 >= 40) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
	}
}
