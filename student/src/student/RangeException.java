package student;

public class RangeException extends RuntimeException {
	int start;
	int end;
	
	public RangeException(int start, int end) {
		this(start, end, start + "점 이상 " + end + "점 이하의 점수를 입력하세요");
	}
	
	public RangeException(int start, int end, String msg) {
		super(msg);
		this.start = start;
		this.end = end;
	}
}
