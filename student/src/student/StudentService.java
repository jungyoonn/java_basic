package student;

import static student.StudentUtils.*;

import java.util.Arrays;
// Logic
public class StudentService {
	static Student[] students = new Student[2];
	static int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
	
	void add() {
		if(cnt == students.length) {
			students = Arrays.copyOf(students, cnt*2);
		} 
//		students[cnt++] = addInput();
		
//		students[cnt].no = StudentUtils.nextInt("추가할 학번"); 
//		students[cnt].name = StudentUtils.nextLine("추가할 이름"); 
//		students[cnt].kor = StudentUtils.nextInt("국어 점수"); 
//		students[cnt].eng = StudentUtils.nextInt("영어 점수"); 
//		students[cnt++].mat = StudentUtils.nextInt("수학 점수");
		
		int no = nextInt("추가할 학번");
		String name = nextLine("추가할 이름");
		int kor = nextInt("국어 점수");
		int eng = nextInt("영어 점수");
		int mat = nextInt("수학 점수");
		students[cnt++] = new Student(no, name, kor, eng, mat);
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
		Student student = findByNo();
		if(student == null) {
			System.out.println("학생을 찾을 수 없습니다.");
			return;
		}
		
		student.name = nextLine("수정할 이름");
		student.kor = nextInt("수정할 국어 점수");
		student.eng = nextInt("수정할 영어 점수");
		student.mat = nextInt("수정할 수학 점수");
		
//			if(students[i].no == mNo) {
//				students[i].name = StudentUtils.nextLine("수정할 이름");
//				students[i].kor = StudentUtils.nextInt("수정할 국어 점수");
//				students[i].eng = StudentUtils.nextInt("수정할 영어 점수");
//				students[i].mat = StudentUtils.nextInt("수정할 수학 점수");
//			
	}
	
	void remove() {
		Student student = findByNo();
		if(student == null) {
			System.out.println("학생을 찾을 수 없습니다.");
			return;
		}
		
		for(int i = 0; i < cnt; i++) {
			if(students[i] == student) {
				System.arraycopy(students, i+1, students, i, cnt-- -i - 1);
			}
		}
		
//		String yn = nextLine(student.name + " 학생의 정보를 삭제하시겠습니까?");
//		if(yn.equals("y")) {
//			student.no = -1;
//			System.out.println("삭제를 완료했습니다.");
//		} else {
//			System.out.println("삭제를 취소합니다. 초기 화면으로 돌아갑니다.");
//		}
	}
	
	// 중복된 기능 분리
	Student findByNo() {
		Student student = null;
		int no = nextInt("학생의 학번 입력 > ");
		
		for(int i = 0; i < cnt; i++) {
			if(no == students[i].no) {
				student = students[i];
			}
		}
		
		return student;
	}
	
	
	
	
	void modify2() {
		Student student = null;
		int mNo = nextInt("수정할 학생의 학번 입력");
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
		student.update();
	}
	void remove2() {
		int rNo = nextInt("삭제할 학생의 학번 입력");
		
		for(int i = 0; i < cnt; i++) {
			if(students[i].no == rNo) {
				String yn = nextLine(students[i].name +" 학생을 삭제하시겠습니까? (y/n)");
				if(yn.equals("y")) {
				students[i].no = -1;	
				System.out.println("삭제를 완료했습니다.");
				System.out.println();
				} else if(yn.equals("n")) {
					System.out.println("초기 화면으로 돌아갑니다.");
					System.out.println();
					break;
				} else {
					System.out.println("입력 오류! 초기 화면으로 돌아갑니다.");
					System.out.println();
				}
			}
		}
	}
}
