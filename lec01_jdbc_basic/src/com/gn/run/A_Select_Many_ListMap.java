package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A_Select_Many_ListMap {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. JDBC Driver 등록
			Class.forName("org.mariadb.jdbc.Driver");
			// 2. Connection 객체 생성
			// DB에 연결 : url, 계정명, 비밀번호
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/jdbc_test","scott","tiger");
			// 3. Statement : SQL문 실행
			stmt = conn.createStatement();
			// 4. SQL문 실행 결과 받기 :ResultSet
			rs = stmt.executeQuery("SELECT s_no,s_name,s_date FROM study");
			// 5. 데이터 추출
			List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
			while(rs.next()) {
				// 정수 : rs.getInt(컬럼명)
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("s_no", rs.getInt("s_no"));
				map.put("s_name", rs.getString("s_name"));
				map.put("s_date",rs.getTimestamp("s_date").toLocalDateTime());
				resultList.add(map);
			}
			// 6. 조회된 결과 출력
			if(resultList.isEmpty()) {
				System.out.println("조회된 결과가 없습니다.");
			}else {
				for(int i = 0 ; i < resultList.size() ; i++) {
					System.out.println(resultList.get(i));
				}
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			// 7. 사용 객체 close
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
