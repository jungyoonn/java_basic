package lesson07_oop;

public class MemberMain {
	Member member = new Member();
	int a = 10;
	public static void main(String[] args) {
		Member m = new Member();
		m.age = 10;
		m.kor = 90;
		m.eng = 60;
		m.mat = 80;
		//System.out.println(m.kor + m.eng + m.mat);
		System.out.println(m.total());
		Member m2 = new Member();
		m2.kor = 80;
		m2.eng = 100;
		m2.mat = 90;
		//System.out.println(m2.kor + m2.eng + m2.mat);
		System.out.println(m2.total());
		
		if(m == m2) {
			System.out.println("m, m2는 같은 객체");
		} else {
			System.out.println("m, m2는 다른 객체");
		}
		
		
	}
}
