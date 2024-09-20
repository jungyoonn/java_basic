package lesson15_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ObjLongConsumer;

public class LambdaEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(30, 10, 20, 30, 40));
		list.forEach(i -> System.out.println(i)); // 파라미터가 하나라서 괄호 생략 가능
		list.removeIf(i -> i <= 20); // 조건을 만족하면 해당 리스트를 삭제
		System.out.println(list);
		
		list.replaceAll(s -> s + 10); // UnaryOperator : 단일 연산
		System.out.println(list);
		
		// 컨슈머 : 반환하지 않는다 (리턴이 없다)
		
		// 더블 컨슈머 (더블 타입의 매개변수)
		DoubleConsumer dc = d -> System.out.println(d * d);
		dc.accept(10);
		
		// Object와 long 타입의 매개변수
		ObjLongConsumer<String> olc = (s, l) -> System.out.println("문자열 :: " + s + " , long :: " + l);
		olc.accept("새똥이", 12L);
	}
}
