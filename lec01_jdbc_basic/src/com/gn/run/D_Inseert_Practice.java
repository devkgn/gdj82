package com.gn.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class D_Inseert_Practice {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
			String id = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url, id, pw);
			
			conn.setAutoCommit(false);
			
			stmt = conn.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("입력하고자 하는 이름을 작성하세요.");
			System.out.print("이름 : ");
			String sName = sc.nextLine();
			
			String sql = "SELECT COUNT(*) AS cnt FROM study WHERE s_name = '"+sName+"'";
			
			int result = 0;
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
			
			if(result == 0) {
				sql = "INSERT INTO study(s_name) VALUES('"+sName+"')";
				result = stmt.executeUpdate(sql);
				if(result > 0) {
					System.out.println("성공적으로 추가되었습니다.");
				} else {
					System.out.println("추가 중 오류가 발생하였습니다.");
				}
			}else {
				System.out.println("중복되는 이름이 있습니다.");
			}
			
			conn.commit();
		}catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
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
