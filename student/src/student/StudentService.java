package student;

import java.util.Arrays;
// Logic
public class StudentService {
	static Student[] students = new Student[5];
	static int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
	
	void add() {
		if(cnt == students.length) {
			students = Arrays.copyOf(students, cnt*2);
		} 
		students[cnt++] = StudentUtils.addInput();
//		students[cnt].no = StudentUtils.nextInt("추가할 학번"); 
//		students[cnt].name = StudentUtils.nextLine("추가할 이름"); 
//		students[cnt].kor = StudentUtils.nextInt("국어 점수"); 
//		students[cnt].eng = StudentUtils.nextInt("영어 점수"); 
//		students[cnt++].mat = StudentUtils.nextInt("수학 점수"); 
	}
	
	void list() {
		System.out.println("학번     이름     국어   영어   수학    총점   평균");
		System.out.println("==================================================");
		
		for(int i = 0; i < cnt; i++) {
			if(students[i].no == -1) continue;
			System.out.printf("%4d %6s %5d %5d %6d %6d %7.2f\n", 
								students[i].no,
								students[i].name,
								students[i].kor,
								students[i].eng,
								students[i].mat,
								students[i].total(),
								students[i].avg()
								
					);
		}
		System.out.println();
	}
	
	// 이름, 점수 
	void modify() {
		Student student = null;
		int mNo = StudentUtils.nextInt("수정할 학생의 학번 입력");
		int i;
		for(i = 0; i < cnt; i++) {
//			if(students[i].no == mNo) {
//				students[i].name = StudentUtils.nextLine("수정할 이름");
//				students[i].kor = StudentUtils.nextInt("수정할 국어 점수");
//				students[i].eng = StudentUtils.nextInt("수정할 영어 점수");
//				students[i].mat = StudentUtils.nextInt("수정할 수학 점수");
//			}
			if(students[i].no == mNo) {
				student = students[i];
				break;
			}
		}
	}
	
	void remove() {
		int rNo = StudentUtils.nextInt("삭제할 학생의 학번 입력");
		
		for(int i = 0; i < cnt; i++) {
			if(students[i].no == rNo) {
				students[i].no = -1;				
			}
		}
	}
}
