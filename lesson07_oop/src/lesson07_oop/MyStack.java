package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	private int[] items = new int[3];
	private int cnt;
	
	int pop() {
		return items[--cnt];
	}
	
	void push(int item) {
		if(items.length == cnt) {
			items = Arrays.copyOf(items, cnt * 2);
		}
		items[cnt++] = item;
	}
	
	int size() {
		for(int print : items) {
			if(print == 0) {
				break;
			}
			System.out.print(print + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(items));
		return cnt;
	}
} // 증감연산자 위치에 주의 (++, --)
