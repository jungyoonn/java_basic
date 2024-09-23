package lesson17_thread;

public class ThreadEx3 {
	public static void main(String[] args) throws InterruptedException {
		Sum t1 = new Sum();
		Sum t2 = new Sum();
		
		t1.start();
		t2.start();
		
		t1.join(); // 끝날 때까지 기다렸다가 작업 시작
		t2.join();
		System.out.println(t1.sum + t1.sum);
	}
}

class Sum extends Thread {
	int sum;
	
	public void run() {
		for(int i = 0; i <= 1000; i++) {
			sum += i;
		}
	}
}
