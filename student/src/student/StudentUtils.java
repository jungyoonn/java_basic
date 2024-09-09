package student;

import java.util.Scanner;

public class StudentUtils {
	//문자열과 숫자를 받아오는 연속적인 작업을 처리
	static Scanner scan = new Scanner(System.in);
	
	// 문자열 받아오기
	static String nextLine(String msg) {
		System.out.print(msg + " > ");
		System.out.println("\n===============================================");

		return scan.nextLine();
	}
	
	// 숫자 받아오기
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	// 새로운 학생 등록
//	static Student addInput() {
//		int no = nextInt("추가할 학번");
//		String name = nextLine("추가할 이름");
//		int kor = nextInt("국어 점수");
//		int eng = nextInt("영어 점수");
//		int mat = nextInt("수학 점수");
//		return new Student(no, name, kor, eng, mat);
//	}
}
