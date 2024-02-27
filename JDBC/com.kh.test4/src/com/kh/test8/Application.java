package com.kh.test8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application {

	public static void main(String[] args) {

		try{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  //스키마 x -> 이거 기재! kh!
		  Connection conn = DriverManager.getConnection("jdbc:mysql://llocalhost:3306/kh", "root", "1234");
	      
		  // query 추가!
		  String query = "SELECT * FROM employee;";
		  
		  PreparedStatement st = conn.prepareStatement(query);
		  
		  // executeUpdate X -> exexuteQuery
		  ResultSet rs = st.executeQuery();
		
		  // empid ,empname -> emp_id, emp_name
		  // rs X -> rs.next()
		  while(rs.next()) {
		  System.out.println(rs.getString("emp_Id") + " / " + rs.getString("emp_Nave"));
		  }
		       
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}

}




