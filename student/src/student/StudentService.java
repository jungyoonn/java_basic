package student;

// Logic
public class StudentService {
	Student[] students = new Student[5];
	int cnt;
	
	{
		students[cnt++] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt++] = new Student(2, "개똥이", 77, 66, 77);
		System.out.println();
	}
	
	void add() {
		System.out.println("add()");
	}
	
	void list() {
//		System.out.println("list()");
		System.out.println("학번     이름    국어   영어   수학   총점   평균");
		System.out.println("==================================================");
		
		for(int i = 0; i < cnt; i++) {
			System.out.printf("%5d %6s %5d %5d %6d %6d %7.2f\n", 
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
		System.out.println("modify()");
		
	}
	
	void remove() {
		System.out.println("remove()");
		
	}
}
