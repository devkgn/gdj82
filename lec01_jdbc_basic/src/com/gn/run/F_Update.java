package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class F_Update {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
			String id = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url, id, pw);
			
			stmt = conn.createStatement();
			
			String sql = "UPDATE study SET s_name = '홍길동' WHERE s_no = 6";
			int result = stmt.executeUpdate(sql);
			
			if(result>0) {
				System.out.println("성공적으로 수정되었습니다.");
			} else {
				System.out.println("수정중 오류가 발생했습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
