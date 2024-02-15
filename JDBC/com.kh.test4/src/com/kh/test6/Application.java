package com.kh.test6;

import java.util.Scanner;

public class Application {
 
	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		Application a = new Application(); 	
		a.Foodmenu();
	}		
   public void Foodmenu() {
	   System.out.println("=== 음식 메뉴 리스트 ===");
	   System.out.println("1. 음식 추가");
	   System.out.println("2. 음식 정보");
	   System.out.println("3. 음식 삭제");
	   System.out.println("4. 포그램램 종료");
	   
	   System.out.println("번호 선택 : "  );
	   String food = sc.nextLine();
	   
	   
	   while(true) {
		   case 1:
			   break;
		   case 2:
			   break;
		   case 3:
			   break;
		   case 4:
			   break;
		
			
	   }
	   
   }
   
   public void food () {
	   System.out.println("추가할 음식 입력 :");
	   System.out.println("칼로리 입력 :");
	   System.out.println("음식 정보가 추가 되었습니다.");
	   
   }
}
