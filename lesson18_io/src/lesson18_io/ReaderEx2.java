package lesson18_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		InputStreamReader isr = new InputStreamReader(fis, "ms949"); //인코딩 방식 바꾸기
//		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		int c = 0;
		int cnt = 0;
		
		while((c = isr.read()) != -1) {
			System.out.print((char)c);
			cnt++;
		}
		System.out.println();
		System.out.println(cnt + "글자 읽음");
		isr.close();
	}
}
