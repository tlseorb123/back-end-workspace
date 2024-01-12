// 클래스 이름 : com.kh.practice.VariablePractice 
// FQCN(Fully Qualified Class Name)
package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {


	public static void main(String[] args) {
		VariablePractice v = new VariablePractice();
		// v.method1();
		// v.method2();
		v.method3();
	}

	Scanner sc = new Scanner(System.in); // 전역변수

	public void method1() {

		int mom = 10000;
		int mom1 = 7000;

		System.out.println("성인 2명 : " + 2 * mom + "원");

		System.out.println("청소년 3명 : " + 3 * mom1 + "원\n");

		System.out.println("총 금액 : " + ((mom * 2) + (mom1 * 3) + "원"));

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
