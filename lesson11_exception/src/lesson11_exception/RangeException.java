package lesson11_exception;

public class RangeException extends RuntimeException{
	int start;
	int end;
	
	public RangeException(int start, int end) {
		this(start, end, start + " 이상 " + end + "이하의 정수를 입력하세요");
	}
	
	public RangeException(int start, int end, String msg) {
		super(msg);
		this.start = start;
		this.end = end;
	}
}
