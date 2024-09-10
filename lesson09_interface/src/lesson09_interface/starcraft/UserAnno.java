package lesson09_interface.starcraft;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 런타임 때까지 유지되게 하겠다
public @interface UserAnno {
	String value() default ""; // 변수를 저장할 공간/ 어노테이션의 value에 들어갈 부분을 디폴트로 설정 가능
	int number() default 5; 
	
//	String[] value() default ""; 처럼 배열로도 가능
//  ex) @UserAnno({"hey", "hi", "world"})
}
