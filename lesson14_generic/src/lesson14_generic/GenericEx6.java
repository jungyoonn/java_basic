package lesson14_generic;

import java.lang.reflect.Method;

public class GenericEx6 {
	public static void main(String[] args) {
		Class<GenericEx6> cls = GenericEx6.class;
		Method[] methods = cls.getMethods(); // 메서드 배열
		
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
