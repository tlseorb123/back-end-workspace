package com.kh.example.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		Application a = new Application();
		a.method1();
		
	}


	public void method1() {

		boolean check = true;
		
		while(check) {	
		System.out.println("=== 메뉴 ===");	
		System.out.println("1.마지막 위치에 추가  ");
		System.out.println("2.첫 위치에 곡 추가  ");
		System.out.println("3.전체 곡 목록 출력  ");
		System.out.println("4.특정 곡 검색  ");
		System.out.println("5.특정 곡 삭제  ");
		System.out.println("6.트정 곡 수정  ");
		System.out.println("7.곡 명 오름차순 정렬  ");
		System.out.println("8.가수 명 내림차순 정렬  ");
		System.out.println("9.종료  ");
		System.out.println("메뉴 번호 입력 : ");
		int menu = Integer.parseInt(sc.nextLine());
	    int = 0;
		try {
			switch(menu) {
			case 1:
					System.out.println("곡 명 : 비의 랩소디");
					System.out.println("가수 명 : 임재현");
				    System.out.println("추가 성공");
			   break;
			case 2:
				
				break;
			case 3:
				System.out.println("***** 전체 곡 목록 출력 *****");
				if() {
					
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			}
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다 : ");
		}
		
		}
	}

	public void method2() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void method3() {
		
	
		
		list.add("비의 랩소디");
		System.out.println("곡명 : " + list);
		
		list.remove(0);
		
	    list.add("임재현");

		System.out.println("가수 명 : " + list);
		System.out.println("추가 성공");
	
	
	}
}
