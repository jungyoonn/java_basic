package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloWorld {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello World");
		
		// 0. 클래스 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 1. 접속
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe" , "sample", "1234");
		System.out.println(conn);
		
		// 2. 문장 생성 > 실행
		Statement stmt = conn.createStatement();
		
		// 3. 결과
		//  3-1. SELECT 수행 시 결과 집합이 나옴
		ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT ORDER BY 1");
		while(rs.next()) {
			System.out.println(rs.getInt("STUDNO") + " :: " + rs.getString("NAME"));
		}
				
		// 4. 자원 반납
		rs.close();
		stmt.close();
		conn.close();
		
		//  3-2. INSERT, UPDATE, DELETE 수행 시 반영된 행의 수가 나옴
		// 쿼리 하나 당 close를 계속 해 줘야 한다
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe" , "sample", "1234");
		stmt = conn.createStatement();
		
		int cnt = stmt.executeUpdate("INSERT INTO STUDENT(STUDNO, NAME) VALUES (54321, '새똥이')");
	}
}
