package lesson11_exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx09 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("1.txt");){ // 괄호를 쓰면 자동으로 close
			byte[] bs = {'A', 'B', 'C', 'D', 'E'};
			fos.write(bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
