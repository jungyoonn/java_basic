package lesson07_oop;

public class MemberMain {
	public static void main(String[] args) {
		Member m = new Member();
		Member m2 = new Member();
		
		if(m == m2) {
			System.out.println("m, m2는 같은 객체");
		} else {
			System.out.println("m, m2는 다른 객체");
		}
	}
}
