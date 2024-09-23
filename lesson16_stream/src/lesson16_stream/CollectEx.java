package lesson16_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(2,6,4,3,6,2,5,2,4,6,7);
		
		List<String> list =
				stream
				.distinct() // 중복 제거
				.sorted((a, b) -> b - a)
				.map(i -> i.toString() + i)
				.collect(Collectors.toList());
		System.out.println(list);
//	.forEach(Systea.out::println);
		
		Stream.concat(list.stream(), list.stream()).forEach(System.out::println);
		// 스트림 연결하기 (이어붙이기)
	}
}