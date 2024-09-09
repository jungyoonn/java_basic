package day2;

public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.print();
	}
}

class Parent {
	int number = 3;
	
	public Parent() {
		super();
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {
	int number = 2; // 만약 자식에 없으면 부모에서 찾음
	
	public Child() {
		super(); // 조상의 생성자 호출 (최고 조상은 Object)
				 // 조건: 생성자의 파라미터가 동일해야 호출된다
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}
