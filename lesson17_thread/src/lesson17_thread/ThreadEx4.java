package lesson17_thread;

public class ThreadEx4 {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
//		c.incre();
//		System.out.println(c.i);
		
		T t = new T(c);
		T t2 = new T(c);
		
		t.start();
		t2.start();
		
		t.join();
		t2.join();
		System.out.println(c.i);
	}
}

class Counter {
	int i;
	synchronized void incre() { // synchronized : 동기화
		for(int i = 0; i < 1000000; i++) {
			this.i++;
		}
		
		// 블럭 형태로도 가능
		// synchronized (this) {
		//		for~~
		// }
	}
}

class T extends Thread {
	Counter c;
	T(Counter c) {
		this.c = c;
	}
	public void run() {
		c.incre();
	}
}