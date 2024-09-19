package lesson13_collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add("가");
		set.add("가");
		System.out.println(set);
		Member member = new Member("홍길동", 40);
		set.add(member);
		set.add(new Member("홍길동", 40));
		System.out.println(set);
		
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode());
		// 둘이 해시 코드가 같다
	}
}

class Member implements Comparable{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// return Objects.hash(name, age); 얘를 추천
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Member)) {
			return false;
		}
		Member member = (Member)obj;
		return name.equals(member.name) && age == member.age;
	}

	@Override
	public int compareTo(Object o) {
		Member m = (Member)o;
		return -name.compareTo(m.name);
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
