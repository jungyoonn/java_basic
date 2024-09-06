package day2;

public class Student {
	int no;
	String name;

	Student() {} // 기본 생성자는 미리 구현하는 것이 좋음 (컴파일 오류 방지)
	
	// 커스텀 생성자를 만들 경우 기본 생성자가 자동으로 만들어지지 않음
	Student(int i, String s) { // 생성자 오버로딩
		no = i;
		name = s;
	}
	
	Student(String s, int i) { // 위와 다른 생성자로 인식
		no = i;
		name = s;
	}

	Student(String s) { // 생성자 오버로딩
		name = s;
	}
	
}
