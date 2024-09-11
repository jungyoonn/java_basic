package student;

public class Student implements Cloneable {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int[] arr;
	
	public Student() { }

	// 생성자 (필드를 다 쓰는 생성자 단 하나)
	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public Student(Student s ) {
		no = s.no;
		name = s.name;
		kor = s.kor;
		eng = s.eng;
		mat = s.mat;
		if(s.arr != null)
		arr = s.arr.clone();
	}
	
	// 학번
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	// 이름
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 국어 점수
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	// 영어 점수
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 수학 점수
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	// 총점
	public int total() {
		return this.kor + this.eng + this.mat;
	}
	
	// 평균
	public double avg () {
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

	
	// 클론 연습용	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student obj = null;
		
		obj = (Student)super.clone(); // 얕은 복사
		if(obj.arr != null)
		obj.arr = arr.clone(); // 깊은 복사
		
		return super.clone();
	}
	
	// 이퀄스 연습용
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student)) return false; //널 체크와 타입 체크
		Student s = (Student)obj;
		
		return no == s.no && name.equals(s.name); // 메서드 이름인 이퀄스랑 다름
	}
}
