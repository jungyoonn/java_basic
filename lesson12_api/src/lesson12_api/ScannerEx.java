package lesson12_api;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		FileOutputStream fos = new FileOutputStream("google.png");
		InputStream is = url.openStream();
		Scanner scan = new Scanner(is);
		int b = 0;
		while((b = is.read()) != -1) {
			fos.write(b);			
		}
		fos.close();
	}
}
