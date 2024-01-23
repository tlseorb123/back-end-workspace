package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.AniBook;
import com.kh.practice.model.CookBook;
import com.kh.practice.model.Member;

public class Application {

	  Scanner sc = new Scanner(System.in);
	    LibraryController lc = new LibraryController();
		
	
	public static void main(String[] args) {
		CookBook c = new CookBook();
		AniBook a = new AniBook();
		
		
		System.out.println("1. 마이페이지");
    	System.out.println("2. 도서 대여하기");
    	System.out.println("3. 프로그램 종료하기");
    	System.out.println("메뉴 번호 : ");
    
    	
    	Member me = new Member("김미경", 16, 0, null);
    	System.out.println(me);
    	Member mi = new Member("김미경", 16, 1 );
    	System.out.println(mi);
    	
    	System.out.println("성공적으로 대여되었습니다.");
    	
    	
	}

  
      
}
