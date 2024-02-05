// 클래스 이름 : com.kh.practice.VariablePractice 
// FQCN(Fully Qualified Class Name)
package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {


	public static void main(String[] args) {
		VariablePractice v = new VariablePractice();
		 v.method1();
		// v.method2();
		//v.method3();
	}

	Scanner sc = new Scanner(System.in); // 전역변수

	//  영화관의 요금표는 다음과 같다.
	// - 성인 : 10000원
	// - 청소년 : 7000원 
	// 성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 계산 후 출력하세요.
	
	public void method1() {

		int adultPrice = 10000;
		int teenPrice = 7000;
		int adultCount = 2;
		int teenCount = 3;

		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenCount * teenPrice;
		
		System.out.printf("성인 %d명 : %d원\n", adultCount, adultTotal);
		System.out.printf("청소년 %d명 : %d원\n\n", teenCount, teenTotal);
		System.out.printf("총 금액 : %d원", adultTotal + teenTotal);
	}

	public void method2() {
		int x = 5;
		int y = 7;
		int z = 9;

		x = 7;
		y = 9;
		z = 5;

		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);

	}

	public void method3() {

		String wri = "computer";
		char ch = 'c';
		char ce = 'r';

		System.out.println("문자열을 입력하세요 : " + wri);

		System.out.println("첫번째 문자 : " + ch);

		System.out.println("마지막 문자 : " + ce);
	}

}
