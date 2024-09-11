package lesson11_exception;

public class CustomException {
	public static void main(String[] args) {
		int num = 102;
		if(num < 0 || num > 100) {
			throw new RangeException(0, 100);
		}
	}
}
