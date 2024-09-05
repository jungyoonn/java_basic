package lesson07_oop;

import java.util.Arrays;

public class MyQueue {
	private int[] items = new int[3];
	private int inCnt;
	private int outCnt;
	
	int pop() {
		return items[outCnt++];
	}
	
	void push(int item) {
		if(items.length == inCnt) {
			items = Arrays.copyOf(items, inCnt * 2);
		}
		items[inCnt++] = item;
	}

	int size() {
		if(inCnt < outCnt) {
			System.out.println("오류");
//			return -1;
			throw new ArrayIndexOutOfBoundsException();
		}
		
		for(int print : items) {
			if(print == 0) {
				break;
			}
			System.out.print(print + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(items));
		return inCnt - outCnt;
	}

}