package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		CastingPractice c = new CastingPractice();
		// c.method1();
		c.method2();
	}

	Scanner sc = new Scanner(System.in);

	public void method1() {

		char wir = 'A';
		int A = 65;
		int B = 66;

		System.out.println("문자 : " + wir);

		System.out.println("A unicode : " + A);

		System.out.println("B unicode : " + B);

	}

	public void method2() {

		int A = 37;
		int B = 45;
		int C = 33;
		float D = 3;

		System.out.println("국어 : " + A);
		System.out.println("영어 : " + B);
		System.out.println("수학 : " + C);
		System.out.println("총점 : " + (A + B + C));
		System.out.printf("평균 : " + "%.2f", (A + B + C) / D);

	}
}
