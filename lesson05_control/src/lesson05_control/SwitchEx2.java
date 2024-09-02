package lesson05_control;

public class SwitchEx2 {
	public static void main(String[] args) {
		String addr = "서울";
		
		switch(addr) {
			case "서울": 
				System.out.println("저희 집은 서울입니다");
				break;
			case "제주": 
				System.out.println("저희 집은 제주입니다");
				break;
			default:
				System.out.println("주소 없음");
		}
	}
}
