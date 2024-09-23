package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\새 텍스트 문서.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\복사2.txt");
		byte[] bs = new byte[5];
		int i = 0;

		// 바이트 단위로 읽어오기 (남은 바이트에는 전에 있던 배열의 데이터가 그대로 들어가 있다)
		while((i = fis.read(bs)) != -1) {
			System.out.println(Arrays.toString(bs));
			fos.write(bs, 0, i); // 0, i를 안 하면 배열에 남아 있던 데이터가 쓸 때 그대로 들어감
		}
		System.out.println();
		fis.close();
		fos.close();
	}
}
