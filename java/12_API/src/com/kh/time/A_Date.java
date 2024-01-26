package com.kh.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_Date {

	public static void main(String[] args) {
        A_Date a = new A_Date();
        a.method1();
	}

	/*
	 * Date
	 * - java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스 (JDK 1.0)
	 * - Date의 메서드는  대부분 deprecated(비권장) 되어있지만 여전히 사용 
	 * 
	 * */
	public void method1() {
		
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체 생성 
		Date today = new Date();
		System.out.println(today); // Fri Jan 26  16:19:38 KST 2024
		
		Date when =new Date(0);
		System.out.println(when); // Thu Jan 01  09:00:00 KST 1970
		
		
		System.out.println("getTime : " + today.getTime()); // 1706253662071
	  
	   // Deprecated 된 기능들! 
		System.out.println("getYear : " + (today.getYear() + 1900) + "년"); // 2024년
		System.out.println("getMonth : " + (today.getMonth() + 1) + "월"); // 1월
		System.out.println("getDate : " + today.getDate() + "일"); //  26일
		System.out.println("getHours : " + today.getHours() + "시"); // 16시
		System.out.println("getMinutes : " + today.getMinutes() + "분"); // 25분
		System.out.println("getSeconds : " + today.getSeconds() + "초"); // 51초
		   	   		
		// SimpleDateFormat : 날짜 데이터를 원하는 형태로 출력할 수 있도록 (h : 1~12, H : 0~23)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 Mm월 dd일 (E) a hh시 mm분 ss초 ");
        String formatDate =  sdf.format(today);
        // 2024년 1월 26일 (금) 오후 4시 25분 30초  
	    System.out.println(formatDate);
	
	
	
	
	
	
	}
	
}
