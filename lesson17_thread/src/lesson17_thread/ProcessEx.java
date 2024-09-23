package lesson17_thread;

import java.io.IOException;

public class ProcessEx {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process p1 = Runtime.getRuntime().exec("notepad"); // 메모장
		Process p2 = Runtime.getRuntime().exec("mspaint"); // 그림판
		
		p1.waitFor();
		p2.destroy();
	}
}
