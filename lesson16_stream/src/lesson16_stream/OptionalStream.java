package lesson16_stream;

import java.util.Optional;

public class OptionalStream {
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("가");
		System.out.println(optional.get());
		
		String str = null;
		optional = Optional.ofNullable(str); // 문자열이 null일 때
		System.out.println(optional);
		
		System.out.println(optional.isPresent()); // null 체크
		System.out.println(optional.orElse("대체 문자")); // null 값일 때만 대체 문자가 나옴
		optional.ifPresent(System.out::println); // 문자열이 있다면 출력
	}
}
