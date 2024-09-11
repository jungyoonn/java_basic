package student;

public class NullException extends RuntimeException {
	Object obj;

	public NullException(Object obj) {
		this(obj, obj + " 이름의 길이가 유효하지 않습니다. 다시 시도해 주세요.");
	}
	
	public NullException(Object obj, String msg) {
		super(msg);
		this.obj = obj;
	}
	
	
}
