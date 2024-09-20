package lesson13_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Final {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4); // 배열을 리스트로 바꿔 줌! 리턴 타입이 리스트임
		System.out.println(list);
		// 이렇게 생겨난 리스트는 길이가 가변적이지 않아서 add를 바로 쓸 수 없다
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		list2.add(10);
		System.out.println(list2);
		// new로 객체를 생성하면 add를 쓸 때 문제 x
		
		Integer[] arr = {1, 2, 3, 4, 5, 6}; // int로 선언된 배열은 asList와 호환되지 않음! Integer로 해야 호환됨
		list = Arrays.asList(arr);
		
		// 리스트를 배열로 바꿔 줌
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		Collections.shuffle(list); // 값 섞기
		System.out.println(list);
		
		Collections.sort(list);
		// List의  sort는 반드시 Comparator가 필요하지만 Collections의 sort는 그냥 써도 됨
		System.out.println(list);
		
		Collections.reverse(list); // 역순
		System.out.println(list);
 	}
}
