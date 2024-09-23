package lesson18_io;

import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		int c = 0;
		int cnt = 0;
		
		while((c = fr.read()) != -1) {
			System.out.print((char)c);
			cnt++;
		}
		System.out.println();
		System.out.println(cnt + "글자 읽음");
		fr.close();
	}
}
