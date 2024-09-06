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
		return "Student [학번 : " + no + ", 이름 : " + name + ", 국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 수학 점수 : " + mat + ", 총점 : "
				+ total() + ", 평균 : " + avg() + "]";
	}
	
	
}
