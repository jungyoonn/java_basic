package lesson13_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NewLotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random()*45) + 1);
		}
		System.out.println(set);
		
		// 개별 탐색
		// 향상 for
		for(Integer i : set) {
			System.out.println(i - 1);
		}
		
		// iterator로 변경
		Iterator<Integer> iter = set.iterator();
		// iter.next();
		// iter.hasNext();
		while(iter.hasNext()) {
			System.out.println(iter.next() - 1);
		}
	}
}
