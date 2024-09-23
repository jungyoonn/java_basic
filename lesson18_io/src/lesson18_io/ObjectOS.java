package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectOS {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<String> list = new ArrayList<String>(Arrays.asList("가", "나", "다"));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos.writeObject(list);
		oos.writeObject(list);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
//		System.out.println(ois.readObject()); write 한 만큼만 read 할 수 있으므로 출력이 안 됨
		
		List<Member> members = new ArrayList<Member>(Arrays.asList(new Member("홍길동", 40), new Member("김길동", 20)));

		oos.writeObject(members); // 에러가 나는 이유? 직렬화 이슈 (class에 Serializable implements 필수)
		List<Member> result = (List<Member>)ois.readObject();
		result.forEach(System.out::println);
	}
}

// 클래스 변수는 직렬화 대상이 아니다 , 직렬화 대상은 반드시 Serializable을 구현해야 한다

class Member implements Serializable {
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
