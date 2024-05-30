package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import com.gn.model.vo.Study;

public class C_Select_One {
	public static void main(String[] args) {
		// 1. JDBC 작업용 객체 생성
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
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
			
			// 5. SQL문 실행
			String sql = "SELECT s_no ,s_name ,s_date FROM study WHERE s_no = 1";
			rs = stmt.executeQuery(sql);
					
			// 6. SQL문 실행 결과 전달 받기
			Study s = null;
			if(rs.next()) {
				// 매개변수 생성자 이용
				int sNo = rs.getInt("s_no");
				String sName = rs.getString("s_name");
				LocalDateTime sDate = rs.getTimestamp("s_date").toLocalDateTime();
				s = new Study(sNo,sName,sDate);
			}
					
			// 7. 결과 조회
			if(s == null) {
				System.out.println("해당하는 조회 결과가 없습니다.");
			} else {
				System.out.println(s);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 8. 사용 객체 close()
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
