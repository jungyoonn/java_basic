package lesson16_stream;

import java.util.stream.Stream;

public class FilterStream {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("홍길동", "김유신", "홍길동", "이순신", "홍길동", "유관순");
	
		stream
		.distinct() // 중복 제거 (중간 연산)
		.filter(s -> s.startsWith("홍")) // 홍으로 시작하는 문자열을 필터링 (중간 연산)
		.forEach(System.out::println); // (최종 연산)
	}
}
