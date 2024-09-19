package lesson13_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCompareLinkedList {
	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		LinkedList llist = new LinkedList();
		
//		List a = new ArrayList();
//		List l = new LinkedList(); 이렇게도 선언 가능
		
		for(int i = 0; i < 100000; i++) {
			alist.add(i);
			llist.add(i);
		}
		
		System.out.println("ArrayList Access");
		long start = System.currentTimeMillis();
		for(int i = 0; i < alist.size(); i++) {
			alist.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		System.out.println("LinkedList Access");
		start = System.currentTimeMillis();
		for(int i = 0; i < llist.size(); i++) {
			llist.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		
		// 데이터 추가와 삭제는 LinkedList가 빠르지만 조회는 ArrayList가 훨씬 빠르다
	}
}
