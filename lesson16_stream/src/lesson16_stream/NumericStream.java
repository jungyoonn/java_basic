package lesson16_stream;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
		is.forEach(System.out::println);

		List<Integer> list = IntStream.rangeClosed(1, 45).mapToObj(s -> s).collect((Collectors.toList()));
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		
		LongStream ls = new Random().longs(6, 1, 46); // 1부터 45까지 6개 .sorted() 붙이면 정렬도 해 줌
		ls.forEach(System.out::println);
	}
}
