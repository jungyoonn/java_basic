package lesson18_io;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DataInOutEx {
	public static void main(String[] args) throws IOException {
		String pi = Math.PI + "";
		char[] pis = pi.toCharArray();
		FileWriter fw = new FileWriter("원주율.txt");
		
		fw.write(pis);
		fw.close();
		
		FileInputStream fis = new FileInputStream("원주율.txt");
		byte[] bs = fis.readAllBytes();
		String s = new String(bs);
		System.out.println(s);
	}
}
