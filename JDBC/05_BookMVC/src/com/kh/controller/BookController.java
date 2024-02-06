package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookController {

	public  BookController() {
		try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kh", "root", "1234");
	    return conn;
	}
	
	public void printBookAll() {
		
	}
	public void registerBook() {
		
	}
	public void sellBook() {
		
	}
	public void registerMember() {
		
	}
	public void login() {
		
	}
	public void renBook() {
		
	}
	public void printRentBook() {
		
	}
	public void deleteRent() {
		
	}
	public void deleteMember() {
		
	}
}
