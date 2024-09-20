package lesson15_lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		List<String> list = Stream.of(5, 4, 3, 2, 1).map(s -> s + "").distinct().collect(Collectors.toList());
		// 스트림 리스트가 된다
		// int를 String으로 맵핑 후 리스트로 변환
	}
}
