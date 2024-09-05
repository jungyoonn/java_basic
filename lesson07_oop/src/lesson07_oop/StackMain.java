package lesson07_oop;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		String what = stack.push("새똥이");
		stack.push("에어컨");
		stack.push("츄르");
		
		for(int i = 0; i < 100_000; i++) {
			stack.push("새똥이");
		}
		System.out.println(stack.size());
		
		System.out.println(what);
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.peek()); // 마지막 값을 조회만 함
	}
}
