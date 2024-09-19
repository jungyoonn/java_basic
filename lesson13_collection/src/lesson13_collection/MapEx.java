package lesson13_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		// 탐색 (Map은 for로 탐색 불가함)
		// 1.
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
		// 2.
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for(String key : keys) {
			System.out.println(key + " :: " + map.get(key));
		}
		
		Collection<Integer> collection = map.values(); // 밸류 값만 뽑기
		System.out.println(collection);
		
		List<Integer> list = new ArrayList<Integer>(collection);
		Set<Integer> set = new HashSet<Integer>(collection);
		
		System.out.println(list);
		System.out.println(set);
	}
}
