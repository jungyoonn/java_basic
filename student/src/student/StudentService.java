package student;

import static student.StudentUtils.*;

import java.util.ArrayList;
import java.util.List;

// Logic
public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	// 원본 배열에 추가 혹은 수정이 일어났을 때 초기화
	private List<Student> totalSortStudents;
	private List<Student> noSortStudents;
	private List<Student> nameSortStudents;
	
	{
		students.add(new Student(1, "새똥이", 80, 90, 100));
		students.add(new Student(2, "개똥이", 77, 66, 77));
		students.add(new Student(3, "소똥이", 64, 34, 66));
		students.add(new Student(4, "말똥이", 99, 99, 99));
		cloneAndSort();
	}
	
	void add() {
		int no = 0;
		String name = null;
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		try {
			no = nextInt("추가할 학번");
			for(Student stu : students) {
				if(stu.getNo() == no) {
					throw new RuntimeException("학번이 중복입니다. 다시 시도해 주세요.");
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
				System.out.println("점수는 필수 입력이며 숫자만 입력 가능합니다.");
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
				System.out.println("점수는 필수 입력이며 숫자만 입력 가능합니다.");
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
		
		students.add(new Student(no, name, kor, eng, mat));
	}
	
	void list() {
		int input = checkRange(nextInt("1. 입력순 2. 학번순 3. 이름순 4. 석차순"), 1, 4);
		List<Student> tmp = null;
		switch (input) {
		case 1:
			tmp = students;
			break;
		case 2:
			tmp = noSortStudents;
			break;
		case 3:
			tmp = nameSortStudents;
			break;
		case 4:
			tmp = totalSortStudents;
			break;
		default:
			break;
		}
		
		System.out.println("학번     이름     국어   영어   수학    총점   평균");
		System.out.println("==================================================");
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println(tmp.get(i));
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
				System.out.println("점수는 필수 입력이며 숫자만 입력 가능합니다.");
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
				System.out.println("점수는 필수 입력이며 숫자만 입력 가능합니다.");
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
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i) == student ) {
				students.remove(i);
			}
		}
		
//		for(int i = 0; i < cnt; i++) {
//			if(students[i] == student) {
//				System.arraycopy(students, i+1, students, i, cnt-- -i - 1);
//			}
//		} i번째를 삭제하고 다음 인덱스부터 밀기
		
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
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
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
			System.out.println("0점과 100점 이하의 점수만 입력 가능합니다.");
			System.out.println();
			return false;
		}
		return true;
	}
	
	void sort(int type, List<Student> stu) {
		if(type == 0) {
			noSortStudents = new ArrayList<Student>(students);
			noSortStudents.sort((o1, o2) -> o2.getNo() - o1.getNo());
		} else if (type == 1) {
			nameSortStudents =  new ArrayList<Student>(students);
			nameSortStudents.sort((o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
		} else if (type == 2) {
			totalSortStudents = new ArrayList<Student>(students);
			totalSortStudents.sort((o1, o2) -> o2.total() - o1.total());
		}
	}
	
	// 오버로딩으로 점수 유효성 검증
	int checkRange(int num, int start, int end) throws RangeException{
		if(num < start || num > end) {
			throw new RangeException(start, end);
		}
		return num;
	}
	int checkRange(int num) throws RangeException {
		return checkRange(num, 0, 100);
	}
	
	
	
	
	void modify2() {
		Student student = null;
		int mNo = nextInt("수정할 학생의 학번 입력");
		int i;
		for(i = 0; i < students.size(); i++) {
			if(students.get(i).getNo() == mNo) {
				student = students.get(i);
				break;
			}
		}
		student.update();
	}
	void remove2() {
		int rNo = nextInt("삭제할 학생의 학번 입력");
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getNo() == rNo) {
				String yn = nextLine(students.get(i).getName() +" 학생을 삭제하시겠습니까? (y/n)");
				if(yn.equals("y")) {
				students.get(i).setNo(-1);	
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
	
	//정렬
	void cloneAndSort() {
		totalSortStudents = new ArrayList<Student>(students);
		noSortStudents = new ArrayList<Student>(students);
		nameSortStudents =  new ArrayList<Student>(students);
		
		sort(0, noSortStudents);
		sort(1, nameSortStudents);
		sort(2, totalSortStudents);
	}
}
