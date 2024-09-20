package lesson16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class MakeStream {
	public static void main(String[] args) {
		// 배열로 스트림 만들기
		String[] strs = {"가", "나", "A", "B"};
		Stream<String> stream = Arrays.stream(strs);
		
		stream.forEach(System.out::println); // 스트림 출력 (더블 콜론을 이용한 참조)
//		stream.forEach(System.out::println); // IllegalStateException 터지는 이유 - 스트림은 한 번 돌고 끝나기 때문
		// 포인터를 처음으로 돌리는 방법이 없다. 스트림은 일회성 소비이다.
		
		stream = Arrays.stream(strs);
		System.out.println("========================");
		stream.forEach(System.out::println);
		// 이렇게 스트림을 다시 만들어 줘야 반복문이 돌아간다

		stream = Arrays.stream(strs, 1, 3); // 스트림에 담을 범위 지정
		
		// 리스트로 스트림 만들기
		List<String> list = new ArrayList<String>(Arrays.asList(strs));
		stream = list.parallelStream();
		System.out.println("========================");
		stream.forEach(System.out::println);
		
		// 셋으로 스트림 만들기
		stream = new HashSet<>(list).stream();
		System.out.println("========================");
		stream.forEach(System.out::println);
		
		// 빌더 패턴으로 스트림 만들기
		stream = Stream.builder()
					.add("새똥이")
					.add("길동이")
					.add("소똥이")
					.build().map(o -> o.toString());
		System.out.println("========================");
		stream.forEach(System.out::println);
		
		// generate() 메서드로 스트림 만들기
//		stream = Stream.generate(() -> "애국가"); // 길이 지정을 해 주지 않으면 무한으로 출력됨
		stream = Stream.generate(() -> "애국가").limit(10);
		System.out.println("========================");
		stream.forEach(System.out::println);
		
		// iterate() 메서드로 스트림 만들기
		stream = Stream.iterate("A", s -> (char)(s.charAt(0) + 1) + "").limit(26);
		System.out.println("========================");
		stream.forEach(System.out::print);
		System.out.println();
		
		// of 사용으로 스트림 만들기
		stream = Stream.of("가", "길동이", "새똥이");
		System.out.println("========================");
		stream.forEach(System.out::println);
	}
}
