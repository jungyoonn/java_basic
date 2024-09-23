package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사.txt");
		
		int i = 0;
		int cnt = 0;
		while((i = fis.read()) != -1) {
			System.out.print((char)i);
			cnt++;
			
			fos.write(i);
		}
		System.out.println();
		System.out.println(cnt + "byte");
		fis.close();
		fos.close();
	}
}
