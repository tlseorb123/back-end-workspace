package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.model.vo.Member;

public class MemberDAO {
 
   public MemberDAO (){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		}
		
		
		public Connection getConnect() throws SQLException {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "1234");
		    return conn;
		}
		
		public void close(PreparedStatement ps, Connection conn) throws SQLException {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}
		public void close (ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
			if(rs!=null) rs.close();
			close(ps, conn);
		}
	

	public int registerMember(String id, String password, String name) throws SQLException {
	
		Connection conn = getConnect();
		String query = "INSERT INTO tb_member(member_id, member_pwd, member_name) VALUES(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, password);
		ps.setString(3, name);
	    int result = ps.executeUpdate();
	    close(ps, conn);
	    return result;
	}
	
	public Member login(String id, String password) throws SQLException {
	  Connection conn = getConnect();
	  String query = "SELECT * FROM to_member WHERE member_id=? AND member_pwd=?";
	  PreparedStatement ps = conn.prepareStatement(query);
	  ps.setNString(1, id);
	  ps.setNString(2, password);
	  ResultSet rs = ps.executeQuery();
	  Member member = new Member();
	  
	  if(rs.next()) {
		  member.setMemberId(rs.getString("member_id"));
		  member.setMemberName(rs.getString("mamber_name"));
          member.setMemberPwd(rs.getString("mamber_pwd"));
          member.setMemberNo(rs.getInt("mamber_no"));
          member.setStatus(rs.getString("status"));
          
	  } 
        return member;
	}
	
	public int deleteMember(int no) throws SQLException {
		Connection conn = getConnect();
		String query = "UPDATE tb_member SET status = 'Y' WHERE member_no=1"; // 회원 탈퇴시 status = 'Y'
	    PreparedStatement ps = conn.prepareStatement(query);
	    ps.setInt(1, no);
	    ps.executeUpdate();
	    int result = ps.executeUpdate();
	    close(ps, conn);
	    return result;
	}
}
