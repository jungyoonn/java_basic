package lesson12_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {
	public static void main(String[] args) {
		String[] arr = {"홍길동", "이순신", "강감찬", "김유신"};
		Arrays.sort(arr, (o1, o2) -> o1.compareTo(o2)); // 람다식을 이용한 정렬
		// -o1.compareTo(o2) 라고 하면 내림차순이 된다!
		System.out.println(Arrays.toString(arr)); // 오름차순
		
		BiFunction<String, String, Integer> bi = (o1, o2) -> o1.compareTo(o2);
		
		int[] arr2 = new int[10];
//		Arrays.fill(arr2, 5); // 5로 배열을 채움
		Arrays.fill(arr2, new Random().nextInt(6) + 1);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = IntStream.rangeClosed(1, 6).limit(5).toArray(); // 1과 6 사이의 수를 채워 줌
		System.out.println(Arrays.toString(arr3));
	}
}
