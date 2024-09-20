package lesson16_stream;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
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
		
		is = "가나다라ABCD".chars();
		is.forEach(s -> System.out.println((char)s));
		
		IntBinaryOperator ibo = Math::max;
		Function<String, Integer> f = Integer::parseInt;
		BinaryOperator<String> bo = (x, y) -> x.concat(y);
		bo = String::concat;
		
		System.out.println("a".concat("b"));
	}
}
