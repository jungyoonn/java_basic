package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		String what = stack.push("������");
		stack.push("������");
		stack.push("��");
		
		for(int i = 0; i < 100_000; i++) {
			stack.push("������");
		}
		System.out.println(stack.size());
		
		System.out.println(what);
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.peek()); // ������ ���� ��ȸ�� ��
	}
}
