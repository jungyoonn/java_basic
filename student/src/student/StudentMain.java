package student;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// CRUD
		StudentService ss = new StudentService();
		
		while(true) {
			int input = StudentUtils.nextInt("1. 조회  2. 등록  3. 수정  4. 삭제  5. 종료");
			
			switch (input) {
			case 1: {
				ss.list();
				break;
			}
			case 2: {
				ss.add();
				break;
			}
			case 3: {
				ss.modify();
				break;
			}
			case 4: {
				ss.remove();
				break;
			}
			case 5: {
				System.out.println("종료");
				return;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value: " + input);
				break;
			}
		}
		
		
	}
}
