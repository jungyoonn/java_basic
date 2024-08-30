package lesson04_operator;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		int kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int mat = scanner.nextInt();
		
		int total = kor + eng + mat;
		//double avg = total / 3d;
		
		double avg = (int)(total / 3d * 100 + 0.5) / 100d;
		
		System.out.println("==========================");
		System.out.println("이름  국어  영어  수학  총점  평균");
		System.out.println("==========================");
		System.out.printf("%s %-4d %-4d %-4d %-4d %f", name, kor, eng, mat, total, avg);
	}
}
