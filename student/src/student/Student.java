package student;

public class Student {
	int no;
	String name;
	int kor;
	int eng;
	int mat;

	// 생성자 (필드를 다 쓰는 생성자 단 하나)
	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total() {
		return this.kor + this.eng + this.mat;
	}
	
	double avg () {
		return total() / 3d;
	}

	@Override
	public String toString() {
		return String.format("%4d %6s %5d %5d %6d %6d %7.2f", no, name, kor, eng, mat, total(), avg());
	}
	
	void update() {
		this.name = StudentUtils.nextLine("수정할 이름");
		this.kor = StudentUtils.nextInt("수정할 국어 점수");
		this.eng = StudentUtils.nextInt("수정할 영어 점수");
		this.mat = StudentUtils.nextInt("수정할 수학 점수");
	}
}
