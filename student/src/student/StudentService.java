package student;

import static student.StudentUtils.*;

import java.util.Arrays;

// Logic
public class StudentService {
	private Student[] students = new Student[2];
	private int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
	}
	
	void add() {
		if(cnt == students.length) {
			students = Arrays.copyOf(students, cnt*2);
		}
		
		int no = 0;
		String name = null;
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		try {
			no = nextInt("추가할 학번");
			for(Student stu : students) {
				if(stu.getNo() == no) {
					System.out.println("학번이 중복입니다. 다시 시도해 주세요.");
					System.out.println();
					return;
				}
				if(no <= 0) {
					System.out.println("학번에 음수는 등록할 수 없습니다. 다시 시도해 주세요.");
					System.out.println();
					return;
				}
			}
		} catch (NumberFormatException e) {
			// 학번이 입력되지 않았거나 숫자가 아닐 때
			System.out.println("학번 입력 오류입니다. 다시 시도해 주세요.");
			System.out.println();
			return;
		} catch (NullPointerException e) {}
		
		boolean nameForm = false;
		while(!nameForm) {
			name = nextLine("추가할 이름");
			if(name.length() == 0) {
				System.out.println("이름을 입력하지 않으셨습니다. 다시 시도해 주세요.");
				System.out.println();
				return;
			}
			
			if(name.length() > 4 || name.length() < 2) {
				System.out.println("이름의 길이가 맞지 않습니다. 다시 시도해 주세요.");
				System.out.println();
				continue;
			} 
			for(int j = 0; j < name.length(); j++) {
				if(name.charAt(j) > '힣' || name.charAt(j) < '가') {
					System.out.println("이름은 초성을 포함하지 않은 한글로만 작성해 주세요.");
					System.out.println();
					break;
				} else if(j == name.length() - 1) {
					nameForm = true;
				}
			}
		}
		
		boolean scoreForm = false;
		while(!scoreForm) {
			try {
				kor = nextInt("국어 점수");
			} catch(NumberFormatException e) {
				System.out.println("점수는 숫자만 입력 가능합니다.");
				System.out.println();
				continue;
			} 
			scoreForm = overScore(kor);
		}
		scoreForm = false;
		while(!scoreForm) {
			try {
				eng = nextInt("영어 점수");
			} catch(NumberFormatException e) {
				System.out.println("점수는 숫자만 입력 가능합니다.");
				System.out.println();
				continue;
			} 
			scoreForm = overScore(eng);
		}
		scoreForm = false;
		while(!scoreForm) {
			try {
				mat = nextInt("수학 점수");
			} catch(NumberFormatException e) {
				System.out.println("점수는 필수 입력이며 숫자만 입력 가능합니다.");
				System.out.println();
				continue;
			} 
			scoreForm = overScore(mat);
		}
		
		students[cnt++] = new Student(no, name, kor, eng, mat);
	}
	
	void list() {
		System.out.println("학번     이름     국어   영어   수학    총점   평균");
		System.out.println("==================================================");
		
		for(int i = 0; i < cnt; i++) {
			if(students[i].getNo() == -1) continue;
//			System.out.printf("%4d %6s %5d %5d %6d %6d %7.2f\n", 
//								students[i].no,
//								students[i].name,
//								students[i].kor,
//								students[i].eng,
//								students[i].mat,
//								students[i].total(),
//								students[i].avg()
//								
//					);
			System.out.println(students[i]);
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
		
		String name = null;
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		boolean nameForm = false;
		while(!nameForm) {
			name = nextLine("수정할 이름");
			if(name.length() == 0) {
				System.out.println("이름을 입력하지 않으셨습니다. 다시 시도해 주세요.");
				System.out.println();
				return;
			}
			
			if(name.length() > 4 || name.length() < 2) {
				System.out.println("이름의 길이가 맞지 않습니다. 다시 시도해 주세요.");
				System.out.println();
				continue;
			} 
			for(int j = 0; j < name.length(); j++) {
				if(name.charAt(j) > '힣' || name.charAt(j) < '가') {
					System.out.println("이름은 초성을 포함하지 않은 한글로만 작성해 주세요.");
					System.out.println();
					break;
				} else if(j == name.length() - 1) {
					nameForm = true;
				}
			}
		}
		student.setName(name);
		
		boolean scoreForm = false;
		while(!scoreForm) {
			try {
				kor = nextInt("수정할 국어 점수");
			} catch(NumberFormatException e) {
				System.out.println("점수는 숫자만 입력 가능합니다.");
				System.out.println();
				continue;
			} 
			scoreForm = overScore(kor);
		}
		scoreForm = false;
		while(!scoreForm) {
			try {
				eng = nextInt("수정할 영어 점수");
			} catch(NumberFormatException e) {
				System.out.println("점수는 숫자만 입력 가능합니다.");
				System.out.println();
				continue;
			} 
			scoreForm = overScore(eng);
		}
		scoreForm = false;
		while(!scoreForm) {
			try {
				mat = nextInt("수정할 수학 점수");
			} catch(NumberFormatException e) {
				System.out.println("점수는 필수 입력이며 숫자만 입력 가능합니다.");
				System.out.println();
				continue;
			} 
			scoreForm = overScore(mat);
		}
		
		student.setKor(kor);
		student.setEng(eng);
		student.setMat(mat);
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
	private Student findByNo() {
		Student student = null;
		int no = nextInt("학생의 학번 입력 > ");
		
		for(int i = 0; i < cnt; i++) {
			if(no == students[i].getNo()) {
				student = students[i];
			}
		}
		
		return student;
	}
	
	private boolean overScore(int score) {
		try {
			if (score > 100 || score < 0) {
				throw new RangeException(0, 100);
			}
		} catch (RangeException e) { 
			System.out.println("0과 100 이하의 점수만 입력 가능합니다.");
			System.out.println();
			return false;
		}
		return true;
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
			if(students[i].getNo() == mNo) {
				student = students[i];
				break;
			}
		}
		student.update();
	}
	void remove2() {
		int rNo = nextInt("삭제할 학생의 학번 입력");
		
		for(int i = 0; i < cnt; i++) {
			if(students[i].getNo() == rNo) {
				String yn = nextLine(students[i].getName() +" 학생을 삭제하시겠습니까? (y/n)");
				if(yn.equals("y")) {
				students[i].setNo(-1);	
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
