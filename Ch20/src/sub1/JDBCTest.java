package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

/*
 * 날짜 : 2020/11/25
 * 이름 : 이슬이
 * 내용 : JAVA 데이터베이스 프로그래밍(JDBC) 실습 교재 p522
 */

public class JDBCTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://192.168.10.114:3306/lse";
		String user = "lse";
		String pass = "1234";
		
		
		// 1단계 - JDBC 드라이버 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if (conn != null) {
				System.out.println("데이터베이스 접속 성공!!!");
			}
			
			// 3단계 - SQL 실행객체 생성
			
			// 4단계 - SQL 실행
			
			// 5단계 - 결과셋 처리(SELECT일 경우)

			// 6단계 - 데이터베이스 종료
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료...");
		
		
	}

}
