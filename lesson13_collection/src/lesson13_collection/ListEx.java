package lesson13_collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
//		list.add(0, 4); >> 0번 인덱스에 4를 넣음
		
//		List<Integer> list = new ArrayList();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6); 제네릭 타입 명시를 해 주는 것이 좋음
		
		System.out.println(list);
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " ::: " + list.get(i));
			sum += (Integer)(list.get(i));
			// 제네릭 타입을 명시하면 sum += list.get(i);처럼 형 변환을 안 해 줘도 된다
		}
		System.out.println(sum);
	}
}
