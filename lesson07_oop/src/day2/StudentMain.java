package day2;

public class StudentMain {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.no = 20;
		stu.name = "새똥이";
		
		System.out.println(stu.no);
		System.out.println(stu.name);

		Student st2 = new Student(10, "길동이");
		System.out.println(st2.no);
		System.out.println(st2.name);
	}
}
