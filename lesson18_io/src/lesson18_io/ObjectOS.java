package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectOS {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<String> list = new ArrayList<String>(Arrays.asList("가", "나", "다"));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos.writeObject(list);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		System.out.println(ois.readObject());
	}
}
