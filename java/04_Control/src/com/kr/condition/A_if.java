package com.kr.condition;

import java.util.Scanner;

public class A_if {

	Scanner sc = new Scanner(System.in);

	/*
	 * if문
	 * 
	 * if(조건식){ 조건식이 참(true)일 때 실행 }
	 * 
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용
	 */
	public void method1() {
		
	  // 입력받은 성적이 60점 이상이면 "합격입니다."를 출력 	
		System.out.print("성적 입력 > ");
		int score = Integer.parseInt(sc.nextLine());
		
		if(score >= 60) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		}
      // 한 줄만 들어갔을 때는 유용!
		if(score >= 60) 
			System.out.println("합격입니다");
		
		
		if(score >= 60) 
			System.out.println("합격입니다");  // 비추천!
			System.out.println("축하합니다");  // if 문 바깥에 있는 걸로 인식
		
		}
	/*
	 * if-else문
	 * 
	 * if(조건식) { 조건식이 참(true)일 때 실행 } else { 조건식이 거짓(false)일 때 실행 }
	 * 
	 */

	public void method2() {
		// 입력받은 성적이 60점 이상이면 "합격입니다."
		// 아니면 "불합격입니다"를 출력
		System.out.print("성적 입력 > ");
		int score = Integer.parseInt(sc.nextLine());

		if (score >= 60) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		} else {
			System.out.println("불합격입니다.");

		}
		// 삼항연산자
		System.out.println(score >= 60 ? "합격입니다" : "불합격입니다");

	}

	public void method3() {
		// 본인의 이름을 입력했을 때 본인이면 "본인이다", 아니면 "본인이 아니다" 를 출력 
		System.out.println("이름을 입력해주새요 > ");
		String name = sc.nextLine();
		
		System.out.println("name의 주소값 : " + System.identityHashCode(name));
		System.out.println("본인이름의 주소값 : " + System.identityHashCode("신대규"));
		System.out.println(name == "신대규");
		// String -> 참조형 변수 (클래스 변수)는 주소값을 저장!
		System.out.println(name.equals("신대규")); // true
        
		if(name.equals("신대규")) {
			System.out.println("본인이다");
		} else 
			System.out.println("본인이 아니다");
	}

	public void method4() {

		// 입력받은 숫자가 0보다 크면 "양수", 0이면 "0이다", 작으면 "음수" 출력
		System.out.print("숫자 입력 > ");
		int number = Integer.parseInt(sc.nextLine());

		// 삼항 연산자
		String result = number > 0 ? "양수" : number == 0 ? "0이다" : "음수";

		// if문
		if (number > 0) {
			System.out.println("양수");
		} else if (number == 0) { // if문은 중첩 가능!
			if (number == 0) {
				System.out.println("0이다");
			} else {
				System.out.println("음수");
			}
		}
	}

	/*
	 * if-else if-else문
	 * 
	 * if(조건식1) { 조건식1이 참(true)일 때 실행 } else if(조건식2) { 조건식1이 거짓(false)이면서 조건식2이
	 * 참(true)일 때 실행 } else { 조건식1, 조건식2 모두 거짓(false)일 때 실행 }
	 * 
	 * - else if 수는 제한이 없다
	 */
	public void method5() {

		System.out.print("숫자 입력 > ");
		int number = Integer.parseInt(sc.nextLine());

		// if ~ else --> if ~ else if ~ else 로 변경
		if (number > 0) {
			System.out.println("양수");
		} else if (number == 0) { // if문은 중첩 가능!
				System.out.println("0이다");
		} else {
				System.out.println("음수");
			}
		
	/*
	 * 
	 * 사용자에게 점수(0~100)를 입력받아서 점수별로 등급을 출력 
	 * - 90점 이상은 A등급 
	 * - 90점 미만 80점 이상은 B 등급 
	 * - 80점 미만 70점 이상은 C 등급
	 * - 70점 미만 60점 이상은 D 등급
	 * - 60점 미만 F 등급 
	 * */
	System.out.print("점수 입력(0~100) > ");
	int num = sc.nextInt();
	
	String grade = "";
	
	if (num >= 90) {
		grade = "A";
	} else if (num >= 80) {
		grade = "B";
	} else if (num >= 70) {
		grade = "C";
	} else if (num >= 60) {
		grade = "D";
	} else {
		grade = "F";
	}
	
	System.out.println(grade);
	
	}
	
    public void practicel() {
    	
     /*
      * 세 정수를 입력했을 때 짝수만 출력 
      * 
      * num1 입력 > 3 
      * num2 입력 > 4
      * num3 입력 > 6
      * 4
      * 6
      * 
      * 
      * */	
		System.out.print("num1 입력 > ");
		int num1 = sc.nextInt();
		
		System.out.print("num2 입력 > ");
		int num2 = sc.nextInt();
		
		System.out.print("num3 입력 > ");
		int num3 = sc.nextInt();
		
		// if문 하나 가지고! 중첩 허용! 비추천  
		/*
		if(num1 % 2 == 0) {
			System.out.println(num1);
			
			if(num2 % 2 == 0) {
				System.out.println(num2);
				
				if(num3 % 2 == 0) {
					System.out.println(num3);
				}
			} else {
				if(num3 % 2 == 0) {
					System.out.println(num3);
				}
			}
		} else {
			if(num2 % 2 == 0) {
				System.out.println(num2);
				
				if(num3 % 2 == 0) {
					System.out.println(num3);
				}
			} else {
				if(num3 % 2 == 0) {
					System.out.println(num3);
				}
			}
			
		}
		*/
		
		// if ~ else if 사용! 중첩 X -> 비추천!!!!!!
		/*
		if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		} else if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 != 0) {
			System.out.println(num1);
			System.out.println(num2);
		} else if(num1 % 2 == 0 && num2 % 2 != 0 && num3 % 2 == 0) {
			System.out.println(num1);
			System.out.println(num3);
		} else if(num1 % 2 == 0 && num2 % 2 != 0 && num3 % 2 != 0) {
			System.out.println(num1);
		} else if(num1 % 2 != 0 && num2 % 2 == 0 && num3 % 2 == 0) {
			System.out.println(num2);
			System.out.println(num3);
		} else if(num1 % 2 != 0 && num2 % 2 == 0 && num3 % 2 != 0) {
			System.out.println(num2);
		} else if(num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 == 0) {
			System.out.println(num3);
		}
		*/
		if(num1 % 2 == 0) System.out.println(num1);
		if(num2 % 2 == 0) System.out.println(num2);
		if(num3 % 2 == 0) System.out.println(num3);

	}
    
    public void practice2() {
    	
      /*
       * 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero), 짝(even)/홀(odd) 출력
       * 
       * 정수 입력 > -3 
       * minus 
       * odd
       * 
       * 
       * */	
    	System.out.print("정수 입력 > ");
    	int number = sc.nextInt();
    	String result = "";
    	String result2 = "";
    	
    	if(number > 0) {
    		result = "plus";
    	} else if (number < 0) {
    		result = "minus";
    	} else {
    		result = "zero";
    	}
    	
    	if(number == 0) {
    		result2 = "";
    	} else if (number % 2 == 0) {
    		result2 = "even";
    	} else {
    		result2 = "odd";
    	}
    	
    	System.out.println(result);
    	System.out.println(result2);
    	
    	
    }
   
    
    	
    	
    	
    	
    	
    	
    
	

	public static void main(String[] args) {
		A_if a = new A_if();
		 a.method1();
		// a.method2();
		// a.method3();
		// a.method4();
		// a.method5();
        //   a.practicel();
         //  a.practice2();
	}
	}


