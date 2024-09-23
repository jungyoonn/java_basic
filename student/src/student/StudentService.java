package student;

import static student.StudentUtils.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

// Logic
public class StudentService {
	private List<Student> students = new ArrayList<Student>(Arrays.asList(
			new Student(1, "새똥이", 80, 90, 100),
			(new Student(2, "개똥이", 77, 66, 77)),
			(new Student(3, "소똥이", 64, 34, 66)),
			(new Student(4, "말똥이", 99, 99, 99))));
	// 원본 배열에 추가 혹은 수정이 일어났을 때 초기화
	private List<Student> totalSortStudents;
	private List<Student> noSortStudents;
	private List<Student> nameSortStudents;
	
	{
//		students.add(new Student(1, "새똥이", 80, 90, 100));
//		students.add(new Student(2, "개똥이", 77, 66, 77));
//		students.add(new Student(3, "소똥이", 64, 34, 66));
//		students.add(new Student(4, "말똥이", 99, 99, 99));
		cloneAndSort();
	} 
// 초기화 블럭 대신 추가 혹은 삭제가 일어났을 시에도 리스트가 유지될 수 있도록 ObjectInput/Output을 이용하기
	void stuList() throws FileNotFoundException, IOException, ClassNotFoundException  {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("학생명단.txt"));
		oos.writeObject(students);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("학생명단.txt"));
		List<Student> sList = (List<Student>)ois.readObject();
		sList.forEach(System.out::println);
	}
	
	void add() throws FileNotFoundException, ClassNotFoundException, IOException {
		int no = 0;
		String name = null;
		int kor = 0;
		int eng = 0;
		int mat = 0;
			
		no = next("추가할 학번", Integer.class, (t) ->  {
			if(t < 0) {
				System.out.println("학번에 음수는 등록할 수 없습니다. 다시 시도해 주세요.");
				return false;
			}
			for(Student stu : students) {
				if(stu.getNo() == t) {
					System.out.println("학번이 중복입니다. 다시 시도해 주세요.");
					return false;
				}
			}
			return true;
		}
				, "");
		
		// t.matches("^[가-힣]{2,4}")
		name = next("추가할 이름", String.class, (t) -> {
			if(t.length() == 0) {
				System.out.println("이름을 입력하지 않으셨습니다. 다시 시도해 주세요.");
				return false;
			}
			if(t.length() > 4 || t.length() < 2) {
				System.out.println("이름의 길이가 맞지 않습니다. 다시 시도해 주세요.");
				return false;
			}
			
			for(int j = 0; j < t.length(); j++) {
				if(t.charAt(j) > '힣' || t.charAt(j) < '가') {
					System.out.println("이름은 초성을 포함하지 않은 한글로만 작성해 주세요. 다시 시도해 주세요.");
					return false;
				}
			}
			return true;
			}
				, "");
		
		kor = next("국어 점수", Integer.class, t -> t <= 100 && t >= 0
				, "점수는 0점부터 100점까지만 입력 가능합니다.");
	
		eng = next("영어 점수", Integer.class, t -> t <= 100 && t >= 0
				, "점수는 0점부터 100점까지만 입력 가능합니다.");
	
		mat = next("수학 점수", Integer.class, t -> t <= 100 && t >= 0
				, "점수는 0점부터 100점까지만 입력 가능합니다.");
	
		students.add(new Student(no, name, kor, eng, mat));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("학생명단.txt"));
		oos.writeObject(students);
	}
	
	void list() {
		int input = next("1. 입력순 2. 학번순 3. 이름순 4. 석차순", Integer.class, t -> t < 5 && t > 0
				, "1부터 4까지의 숫자만 입력해 주세요.");
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
	void modify() throws FileNotFoundException, ClassNotFoundException, IOException {
		Student student = findByNo(next("수정할 학번을 입력하세요", Integer.class
																, n -> findByNo(n) != null
																, "학생을 찾을 수 없습니다."));
//		if(student == null) {
//			System.out.println("학생을 찾을 수 없습니다.");
//			return;
//		}
		
		String name = null;
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		name = next("수정할 이름", String.class, t -> !(t.length() == 0)
											, t -> !(t.length() > 4 || t.length() < 2)
											, t -> t.matches("^[가-힣]*$")
											,"");
		
		student.setName(name);
		
		kor = next("수정할 국어 점수", Integer.class, t -> t <= 100 && t >= 0
				, "점수는 0점부터 100점까지만 입력 가능합니다.");
		
		eng = next("수정할 영어 점수", Integer.class, t -> t <= 100 && t >= 0
				, "점수는 0점부터 100점까지만 입력 가능합니다.");
	
		mat = next("수정할 수학 점수", Integer.class, t -> t <= 100 && t >= 0
				, "점수는 0점부터 100점까지만 입력 가능합니다.");
			
		student.setKor(kor);
		student.setEng(eng);
		student.setMat(mat);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("학생명단.txt"));
		oos.writeObject(students);
	}
	
	void remove() throws FileNotFoundException, ClassNotFoundException, IOException {
		Student student = findByNo(next("삭제할 학번을 입력하세요", Integer.class
																	, n -> findByNo(n)!=null
																	, "학생을 찾을 수 없습니다."));
//		if(student == null) {
//			System.out.println("학생을 찾을 수 없습니다.");
//			return;
//		}
		
		if(students.contains(student)) { // 위에서 조건문을 처리했기 때문에 if문 굳이 필요 x
			students.remove(student);
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("학생명단.txt"));
		oos.writeObject(students);
	}
	
	// 중복된 기능 분리
	private Student findByNo(int no) {
		Student student = null;
//		int no = next("학생의 학번 입력", Integer.class, t -> t > 0
//				, "음수인 학번은 입력할 수 없습니다. 다시 시도해 주세요.");
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		
		return student;
	}
	
	boolean validation (String msg, boolean b, String str) {
//		System.out.println(str.matches("^[가-힣]*$"));
		// next를 오버로딩(predicate를 여러 개 받는) << 성공
		// 한꺼번에 에러 던지기
		if(b) {
			System.out.println(msg);
			return false;
		}
		return true;
	}
	
	//정렬
	void cloneAndSort() {
		totalSortStudents = new ArrayList<Student>(students);
		noSortStudents = new ArrayList<Student>(students);
		nameSortStudents =  new ArrayList<Student>(students);
		
		noSortStudents.sort((o1, o2) -> o2.getNo() - o1.getNo());
		nameSortStudents.sort((o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
		totalSortStudents.sort((o1, o2) -> o2.total() - o1.total());
		
//		nameSortStudents.sort(new Comparator<Student>() {
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		}); 람다식 대신 Comparator를 이용한 방법도 있다
	}
	
	
	
//	void modify2() {
//		Student student = null;
//		int mNo = nextInt("수정할 학생의 학번 입력");
//		int i;
//		for(i = 0; i < students.size(); i++) {
//			if(students.get(i).getNo() == mNo) {
//				student = students.get(i);
//				break;
//			}
//		}
//		student.update();
//	}
	
	
//	void remove2() {
//		int rNo = nextInt("삭제할 학생의 학번 입력");
//		
//		for(int i = 0; i < students.size(); i++) {
//			if(students.get(i).getNo() == rNo) {
//				String yn = nextLine(students.get(i).getName() +" 학생을 삭제하시겠습니까? (y/n)");
//				if(yn.equals("y")) {
//				students.get(i).setNo(-1);	
//				System.out.println("삭제를 완료했습니다.");
//				System.out.println();
//				} else if(yn.equals("n")) {
//					System.out.println("초기 화면으로 돌아갑니다.");
//					System.out.println();
//					break;
//				} else {
//					System.out.println("입력 오류! 초기 화면으로 돌아갑니다.");
//					System.out.println();
//				}
//			}
//		}
//		
//		for(int i = 0; i < cnt; i++) {
//		if(students[i] == student) {
//			System.arraycopy(students, i+1, students, i, cnt-- -i - 1);
//		}
//	} i번째를 삭제하고 다음 인덱스부터 밀기
//	}
	
	
//	void sort(int type, List<Student> stu) {
//		if(type == 0) {
//			noSortStudents = new ArrayList<Student>(students);
//			noSortStudents.sort((o1, o2) -> o2.getNo() - o1.getNo());
//		} else if (type == 1) {
//			nameSortStudents =  new ArrayList<Student>(students);
//			nameSortStudents.sort((o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
//		} else if (type == 2) {
//			totalSortStudents = new ArrayList<Student>(students);
//			totalSortStudents.sort((o1, o2) -> o2.total() - o1.total());
//		}
//	}
	
	
	
//	private boolean overScore(int score) {
//		try {
//			if (score > 100 || score < 0) {
//				throw new RangeException(0, 100);
//			}
//		} catch (RangeException e) { 
//			System.out.println("0점과 100점 이하의 점수만 입력 가능합니다.");
//			System.out.println();
//			return false;
//		}
//		return true;
//	}
	
	
	
	// 오버로딩으로 점수 유효성 검증
//	int checkRange(int num, int start, int end) throws RangeException{
//		if(num < start || num > end) {
//			throw new RangeException(start, end);
//		}
//		return num;
//	}
//	int checkRange(int num) throws RangeException {
//		return checkRange(num, 0, 100);
//	}
}
