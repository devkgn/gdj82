package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class E_Insert_Transaction {
	public static void main(String[] args) {
		// 1. JDBC 작업용 객체
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 2. JDBC Driver 등록
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 3. Connection 객체 등록
			String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
			String id = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url, id, pw);
			
			// 4. AutoCommit 끄기
			conn.setAutoCommit(false);
			
			// 5. Statement 객체 생성
			stmt = conn.createStatement();
			
			// 6. SQL문 실행하기
			// 6-1. SELECT : 기존에 행이 있는지 확인
			String sName = "테스트7";
			String sql1 = "SELECT COUNT(*) AS cnt FROM study WHERE s_name = '"+sName+"'";   
			int result = 0;
			rs = stmt.executeQuery(sql1);
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
