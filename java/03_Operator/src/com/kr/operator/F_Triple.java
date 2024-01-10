package com.kr.operator;

import java.util.Scanner;

public class F_Triple {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * 삼황 연산자 
	 * 
	 * 조건식 ? 값1 : 값2;
	 * 
	 * - 조건식에는 주로 비교, 논리 연산자가 사용된다.
	 * - 조건식의 결과가 true 이면 값1을 수행한다.
	 * - 조건식의 결과가 false 이면 값2를 수행한다.
	 * 
	 * */
	
	public static void main(String[] args) {
        F_Triple f = new F_Triple();
        //f.method1();
        f.practicel();
        //f.practicel2();
        //f.practice3();
	}

	
	
	public void method1() {
		// 입력받은 정수가 양수인지 음수인지 판단 
		// 양수이다. 음수이다.
		System.out.print("정수값 입력 > ");
		int number = sc.nextInt();
		
		String result = (number > 0) ? "양수이다" : "음수이다";
		// System.out.println(result);
		
		// 0이다. 포함 
		result = (number > 0 ) ? "양수이다." : number == 0 ? "0이다.": "음수이다.";
		result = (number > 0 ) ? "양수이다." : number < 0 ? "음수이다.": "0이다.";
        System.out.println(result);	
	}
	
	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서 두 정수의 곱셈 결과 100보다 크거나 같은 경우
	 * "결과가 100 이상입니다." 아닌 경우 " 결과지가 100보다 작습니다." 출력
	 * */
	public void practicel() {
		System.out.print("정수값 1 > ");
		int num1 = sc.nextInt();
		
		System.out.print("정수값 2 > ");
		int num2 = sc.nextInt();
		
		String result = num1 * num2 >= 100 ? "결과가 100 이상입니다." : 
			                           " 결과지가 100보다 작습니다.";
		
		System.out.println(result); 
	}
	
	/*
	 * 실습문제 2
	 * 
	 * 사용자한테 문자를 하나 입력받아서 입력한 문자가 대문자이면 
	 * "알파벳 대문자이다." 아닌 경우 "알파벳 대문자가 아니다. " 출력 
	 * 
	 * */
    public void practicel2() {
    	System.out.print("문자를 입력 > ");
    	char ch = sc.nextLine().charAt(0); 
        String result = 'A' <= ch && ch <= 'Z' ? "알파벳 대문자이다." : "알파벳 대문자가 아니다.";
        System.out.println(result);
    }
    
    /*
     * 실습문제 3
     * 
     * 두 정수를 입력받고 + 또는 -를 입력받아서 계산을 출력 
     * 단, + 또는 - 이외의 문자를 입력하는 경우 "잘못 입력했습니다" 출력 
     * 
     * 예시)
     * 첫 번째 수 > 3 
     * 두 번째 수 > 4 
     * 연산자 입력(+ 또는 - ) > +
     * 3 + 4 = 7 
     * 
     * 연산자 입력(+  또는 - ) > -
     * 3 - 4 = -1 
     * 
     * 연산자 입력(+ 또는 - ) > * 
     * 잘못 입력했습니다.
     * */
    public void practice3() {
   
    	System.out.print("첫 번째 수 > ");
    	// String -> int : Integer.parseInt
    	int num1 = Integer.parseInt(sc.nextLine());
    	
    	System.out.print("두 번째 수 > ");
    	int num2 = Integer.parseInt(sc.nextLine());
    	
    	
    	System.out.print("연산자 입력(+ 또는 -) > ");
    	char op = sc.nextLine().charAt(0);
    	 
        String result = op == '+' ? num1 + '+' + num2 + "=" + (num1 + num2)
        		: op == '-' ? String.format("%d - %d = %d", num1, num2, (num1 - num2))
        				: "잘못 입력했습니다";
        System.out.println(result);
        
        // 또 다른 방법  
        if(op == '+' || op == '-') {
        System.out.printf("%d %c %d = %d", num1, op, num2, op== '+' ? 
        		(num1+num2) : (num1 - num2));
        } else {
        	System.out.println("잘목 입력했습니다");
        }
        }
    
}





