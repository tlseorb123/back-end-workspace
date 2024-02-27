package com.kh;

import java.util.Scanner;

public class fgfgg {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  while(true){
			System.out.print("문자열을 입력해주세요.");
			String str = sc.nextLine();
			if(str == "exit") {
				
				System.out.println("프로그램을 종료합니다");
				continue;
			}else {
				System.out.println(str.charAt(0) + "글자 입니다.");			
			}
			
		}
		
	}
}
