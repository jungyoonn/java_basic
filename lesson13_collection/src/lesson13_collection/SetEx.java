package lesson13_collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		// get을 할 수 없음 인덱스 위치를 알 수 없어서
		// 추가할 때 순서를 고려하지 않음 but 중복은 허용하지 않음
		Set<String> set = new HashSet<>();
		
		set.add("가");
		set.add("나");
		set.add("다");
		set.add("라");
		set.add("가");
		
		System.out.println(set);
		System.out.println(set.add("가")); // 중복을 허용하지 않으므로 false 출력
	}
}
