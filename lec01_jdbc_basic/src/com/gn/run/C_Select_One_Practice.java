package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.gn.model.vo.Study;

public class C_Select_One_Practice {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("조회하고자 하는 행의 번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int no = sc.nextInt();
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
			String id = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url,id,pw);
			
			stmt = conn.createStatement();
			
			String sql = "SELECT s_no ,s_name ,s_date FROM study WHERE s_no = "+no;
			rs = stmt.executeQuery(sql);
			
			Study s = null;
			if(rs.next()) {
				s = new Study(rs.getInt("s_no"),rs.getString("s_name")
						,rs.getTimestamp("s_date").toLocalDateTime());
			}
			
			if(s == null) {
				System.out.println("조회된 결과가 없습니다.");
			} else {
				System.out.println(s);
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		sc.close();
		
	}

}
