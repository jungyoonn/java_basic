package student;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1, "새똥이", 90, 80, 90);
		
		System.out.println("바바".matches("^[가-힣]*$"));
		
		// 복제의 방법은 클론 오버라이드와 생성자를 통한 복제 두 가지가 있다
		//오버라이드 하고 형변환으로 타입 맞추고 implements Cloneable 해 준다
		
		try {
			Student s2 = (Student)s1.clone();
			s1.setName("개똥이");
			System.out.println(s1);
			System.out.println(s2);
			
			Student s4 = new Student(s1);
			System.out.println(s4);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Student s5 = s1;
		System.out.println(s1 == s5);
		System.out.println(s1.equals(s5));
	}
}
