package com.gn.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gn.model.vo.Member;

public class MemberDao {
	
	public int insertMember(Member mem) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url = "jdbc:mariadb://127.0.0.1:3306/jdbc_test";
			String id = "scott";
			String pw = "tiger";
			conn = DriverManager.getConnection(url, id, pw);
			
			conn.setAutoCommit(false);
			
			String sql1 = "SELECT COUNT(*) AS cnt FROM member WHERE member_id = ?"; 
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, mem.getMemberId());
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = rs.getInt("cnt");
			}

			if(result == 0) {
				String sql2 = "INSERT INTO member "
						+ "(member_id,member_pwd,member_name,member_email,member_phone,member_gender)"        
						+ " VALUES (?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setString(1, mem.getMemberId());
				pstmt.setString(2, mem.getMemberPwd());
				pstmt.setString(3, mem.getMemberName());
				pstmt.setString(4, mem.getMemberEmail());
				pstmt.setString(5, mem.getMemberPhone());
				pstmt.setString(6, mem.getMemberGender());
				
				result = pstmt.executeUpdate();
			}else {
				// 중복되는 아이디가 있는 경우 : 문제상황
				result = 0;
			}
			
			
			conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
