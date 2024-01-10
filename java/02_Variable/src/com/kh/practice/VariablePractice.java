// 클래스 이름 : com.kh.practice.VariablePractice 
// FQCN(Fully Qualified Class Name)
package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	String name = "";
	int age = 0;         // 객체는 변수도 지정가능 
	
	public static void main(String[] args) {
        VariablePractice v = new VariablePractice();
	    v.method1();
	}

	Scanner sc = new Scanner(System.in);  // 전역변수
	  
	public void method1() {
		System.out.print("성인 2명 :");
		String money = sc.nextLine();
		
		System.out.print("청소년 3명 :");
		String money2 = sc.nextLine();
	
		System.out.print("총 금액 :");
		String money3 = sc.nextLine();
		
		System.out.println("성인 2명 : "  + money + "원" + "   청소년 3명 : " + money2 + "원" +
				           "   총 금액 : " + money3 + "원");
	}

	public void method2() {
		
	}
		
	
	public void method3() {
		
		
	}
	
}
