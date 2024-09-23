package student;

import static student.StudentUtils.next;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentMain {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// UI
		// CRUD
		StudentService ss = new StudentService();
//		ss.stuList();
		while(true) {
			// try catch를 여기서 처리하면 서비스의 코드가 줄어듦! (넘버포맷 익셉션)
			try {
				int input = 0;
				try {
//					input = StudentUtils.nextInt("1. 조회  2. 등록  3. 수정  4. 삭제  5. 종료");
					input = next("1. 조회  2. 등록  3. 수정  4. 삭제  5. 종료"
							, Integer.class, t -> t > 0 && t < 6
							, "입력 오류! 1에서 5까지의 숫자만 입력해 주세요.");
//					if(input <= 0 || input > 5) {
//						System.out.println("입력 오류! 1에서 5까지의 숫자만 입력해 주세요.");
//						System.out.println();
//					}
				} catch(NumberFormatException e) {
					System.out.println("숫자를 입력하세요.");
					System.out.println();
				}
				switch (input) {
				case 1: {
					try {
					ss.list();
					} catch (RuntimeException e) {
						System.out.println("학생 정보가 없습니다.");
						continue;
					}
					break;
				}
				case 2: {
					ss.add();
					ss.saveAndWrite();
					ss.cloneAndSort();
					break;
				}
				case 3: {
					ss.modify();
				//	ss.saveAndWrite();
					ss.cloneAndSort();
					break;
				}
				case 4: {
					ss.remove();
				//	ss.saveAndWrite();
					ss.cloneAndSort();
					break;
				}
				case 5: {
				//	ss.saveAndWrite();
					System.out.println("종료");
					return;
				}
				default:
					//throw new IllegalArgumentException("Unexpected value: " + input);
					break;
				}
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}
