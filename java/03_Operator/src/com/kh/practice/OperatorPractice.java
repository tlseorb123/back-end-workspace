package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
    
    Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			OperatorPractice o = new OperatorPractice();
			//o.method1();
			//o.method2();
			o.method3();
			//o.method4();
	}

	//모든 사람이 연필을 골고루 나눠가지려고 한다. 인원 수와 연필 개수를 키보드로 입력 받고 
	//1인당 동일하게 나눠가진 연필 개수와 나눠주고 남은 연필의 개수를 출력하세요.
	public void method1() {
		System.out.println("연필 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("인원 수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("남은 연필 개수: ");
		int num3 = sc.nextInt();
		
		String result = (num1 -= num2)
	}
	
	//키보드로 입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
	//만약 432이라면 400, 111이라면 100이 출력됩니다.
	public void method2() {
		int num1 = 432; 
		
		num1 -= 32; 
		System.out.println(num1);
		
		int num2 = 111;
		
		num2 -= 11;
		System.out.println(num2);
				
	}
	
	//3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
	public void method3() {  
	     int a = 0;
	     int b = 0;
		 int c = 0;	
			
		    System.out.println("a == b : " + (a == b )); 
			System.out.println("b == c : " + (b == c));
			 System.out.println("a != b : " + (a != b )); 
				System.out.println("b != c : " + (b != c));
				
			
		
	}
	//키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
	public void method4() {
		System.out.print("정수값 입력 > ");
		int number = sc.nextInt();
		
		String result = (number > 0) ? "짝수다" : "홀수다";
		
		result = (number * 2) ? "짝수다" : %= number ? "홀수다";
		
	
		
	}
	
	//나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
	public void method5() {
		
	}
	
	//키보드로 사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아
	//필요한 바구니의 수를 출력하세요
	public void method6() {
		
	}
	
}