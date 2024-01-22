package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;

public class Application {

	  Scanner sc = new Scanner(System.in);
	    LibraryController lc = new LibraryController();
		
	
	public static void main(String[] args) {

	}

    public int Menu() {
      
    	System.out.println("1, 마이페이지");
    	System.out.println("2, 도서 대여하기");
    	System.out.println("3, 프로그램 종료하기");
    
    }
	
}
