package lesson13_collection;

import java.util.Map;
import java.util.TreeMap;

public class MapEx2 {
	public static void main(String[] args) {
		String str = "AAAAAABBCCCDEEEEFFFFFG";
		
		Map<String, Integer> map = new TreeMap<>();
		String[] strs = str.split("");
		
		for(String s : strs) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		
		System.out.println(map);
	}
}
