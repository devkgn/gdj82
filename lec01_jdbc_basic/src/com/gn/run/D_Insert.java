package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class D_Insert {
	public static void main(String[] args) {
		// 1. JDBC 작업용 객체 만들기
		Connection conn = null;
		Statement stmt = null;
		// ResultSet 사용X
		try {
			// 2. JDBC Driver 등록
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 3. Connection 객체 생성
			String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
			String id = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url, id, pw);
			
			// 4. Statement 객체 생성
			stmt = conn.createStatement();
			
			// 5. SQL문 실행하기
			String sql = "INSERT INTO study(s_no,s_name,s_date) VALUES(4,'테스트5',NOW())";
			
			// Select -> executeQuery -> ResultSet
			// DML(Insert,Update,Delete) -> executeUpdate -> int
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("성공적으로 추가되었습니다.");
			} else {
				System.out.println("추가중 오류가 발생했습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
