package lesson07_oop;

public class MyQueueMain {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.push(10);
		mq.push(20);
		mq.push(5);
		mq.push(2);
		//ms.push(30);
		//System.out.println(mq.size());
		System.out.println(mq.pop());
		System.out.println(mq.pop());
		mq.push(30);
		System.out.println(mq.pop());
		//System.out.println(mq.size());
		mq.push(64);
		System.out.println(mq.pop());
		System.out.println(mq.pop());
		System.out.println(mq.pop());
	}
}
