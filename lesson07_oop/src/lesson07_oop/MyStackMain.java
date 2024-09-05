package lesson07_oop;

public class MyStackMain {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push(10);
		ms.push(20);
		ms.push(5);
		ms.push(2);
		//ms.push(30);
		System.out.println(ms.size());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		ms.push(30);
		System.out.println(ms.pop());
		System.out.println(ms.size());
	}
}

