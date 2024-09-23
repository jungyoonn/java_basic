package lesson17_thread;

public class ThreadEx extends Thread {
	public static void main(String[] args) {
		Thread t1 = new ThreadExtend();
		Thread t2 = new Thread(new RunnableImpl());
		
		t2.setPriority(6); // 우선순위 지정
		
		t1.start();
		t2.start();
		// start() : 멀티 스레드를 시작하는 메서드
		
		System.out.println("main 종료 " + currentThread().getName());
	}
}

class ThreadExtend extends Thread {
	@Override
	public void run() {
		System.out.println("Thread 상속 ");
		for(int i = 0; i < 50; i++) {
			System.out.println("Thread 상속 " + i + currentThread().getName());
		}
	}
}

class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable 구현 ");
		for(int i = 0; i < 50; i++) {
			System.out.println("Runnable 구현 " + i + Thread.currentThread().getName());
		}
	}
}
