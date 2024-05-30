package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gn.model.vo.Study;

public class B_Select_Many_Vo {
	public static void main(String[] args) {
		// 1. JDBC 작업용 객체 미리 선언
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
			String sql = "SELECT s_no,s_name,s_date FROM study";
			rs = stmt.executeQuery(sql);
			
			// 6. ResultSet에 있는 데이터 추출 -> List<Study>
			List<Study> resultList = new ArrayList<Study>();
			while(rs.next()) {
				Study s = new Study(rs.getInt("s_no"),rs.getString("s_name")
						,rs.getTimestamp("s_date").toLocalDateTime());
				resultList.add(s);
			}
			// 7. 조회된 결과
			if(resultList.isEmpty()) {
				System.out.println("조회된 결과가 없습니다.");
			}else {
				for(int i = 0 ; i < resultList.size() ; i++) {
					System.out.println(resultList.get(i));
				}
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
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
