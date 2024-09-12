package lesson12_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random(0); // 시드 값을 0으로 설정
		// 시드를 넣지 않으면 컴파일을 실행하는 시간이 계속 달라져서 계속 다른 값이 나옴
		
		for(int i = 0; i < 20; i++) {
			System.out.println(random.nextInt(6)+1); 
			// 시드를 설정하면 컴파일을 해도 계속 같은 랜덤 값이 나온다
		}
	}
}
