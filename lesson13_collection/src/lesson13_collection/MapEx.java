package lesson13_collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 1);
		map.put("C", 1);
		map.put("C", 2);
		System.out.println(map); // 중복이면 마지막 값으로 덮어씀
		System.out.println(map.get("D")); // 없으면 null 리턴
		System.out.println(map.get("A")); // key의 value를 리턴 = 1 (연산도 가능)
		System.out.println(map.size());
	}
}
