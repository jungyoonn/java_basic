package lesson07_oop;

import java.lang.ArrayIndexOutOfBoundsException;

public class MyQueueMain {	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		
		mq.push(10);
		mq.push(20);
		mq.push(5);
		mq.push(2);
		//ms.push(30);
		System.out.println(mq.size());
		System.out.println(mq.pop());
		System.out.println(mq.pop());
		mq.push(30);
		System.out.println(mq.pop());
		System.out.println(mq.size());
		mq.push(64);
		System.out.println(mq.pop());
		System.out.println(mq.pop());
		System.out.println(mq.pop());
		
		try {
			System.out.println(mq.pop());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류입니다 : " + e.getMessage());
			return;
		} catch (Exception e) {
			System.out.println("오류입니다 : " + e.getMessage());
			return;
		} 
	}
}
