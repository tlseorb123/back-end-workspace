package com.kh.test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {

		try{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection conn = DriverManager.getConnection("jdbc:mysql://llocalhost:3306", "root", "1234");
	      
		  String query = "SELECT emp_id, emp_name FROM employee;";
		  
		  PreparedStatement st = conn.prepareStatement(query);
		  
		  ResultSet rs = st.executeQuery();
		
		  System.out.println(rs.getString("empId") + " / " + rs.getString("empNave"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}

}




