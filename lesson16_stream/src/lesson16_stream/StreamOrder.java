package lesson16_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamOrder {
	public static void main(String[] args) {
		// 스트림 생성
		
		// 연산
		// 1. 중간 연산
		// 필터, 맵, 정렬, peek
		Stream.of("홍길동", "김유신", "이순신", "유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println) // peek은 중간 연산자라서 뒤에 반드시 최종 연산자가 붙어야 실행된다 ex) count(); << 갯수를 리턴
		.forEach(System.out::println);
		// Comparator.reverseOrder() : 역순으로 정렬 (문자열은 기본적으로 오름차순으로 정렬됨)
		// filter(s -> !s.startsWith("김")) : 필터링
		
		long cnt = Stream
		.of("홍길동", "김유신", "이순신", "유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println)
		.count();
		System.out.println(cnt);
		
		// 2. 최종 연산
		// forEach, allMatch, anyMatch
		boolean result = 
		Stream.of("홍길동", "김유신", "이순신", "유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println)
		.allMatch(s -> s.startsWith("홍"));
		System.out.println(result); // 이순신에서 이미 조건을 만족하지 못했기 때문에 유관순까지 가지 않고 바로 리턴된다
		
		result = 
		Stream.of("홍길동", "김유신", "이순신", "유관순")
		.sorted(Comparator.reverseOrder())
		.filter(s -> !s.startsWith("김"))
		.peek(System.out::println)
		.anyMatch(s -> s.startsWith("홍"));
		System.out.println(result); // 홍길동에서 이미 조건을 만족했기 때문에 이순신으로 가지 않고 바로 리턴된다
	}
}
