package com.kh.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.model.dao.RentDAO;
import com.kh.model.vo.Book;
import com.kh.model.vo.Rent;

public class RentController {

	RentDAO dao = new RentDAO();
	
  public RentController() {

	  
  
		public boolean renBook(int bkNo, int memberNo)  {
			
			try {
				if(dao.rentBook(bkNo,memberNo)==1) return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}
		
		public ArrayList<Rent> printRentBook(int No)  {
			
			try {
				return dao.printRentBook(No);
			} catch (SQLException e) {	
				e.printStackTrace();
			}
		return null;
			
		}
		public void deleteRent(int no)  {
			
			try {
				if(dao.deleteRent(no)==1) return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
		}
}
