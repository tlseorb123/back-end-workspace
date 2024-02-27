package com.kh.test6;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.test6.model.Food;

public class Application {

	Scanner sc = new Scanner(System.in);
	ArrayList<Food> foodList = new ArrayList<>();

	public static void main(String[] args) {

		Application a = new Application();
		a.Foodmenu();
	}

	public void Foodmenu() {

		boolean check = true;
		while (check) {

			System.out.println("=== 음식 메뉴 리스트 ===");
			System.out.println("1. 음식 추가");
			System.out.println("2. 음식 정보");
			System.out.println("3. 음식 삭제");
			System.out.println("4. 포그램램 종료");
			System.out.println("번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				add();
				break;
			case 2:
				info();
				break;
			case 3:
				delete();
				break;
			case 4:
				check = false;
				break;

			}
		}

	}

	// 1 음식 추가!
	public void add() {
		System.out.println("추가할 음식 입력 :");
		String name = sc.nextLine();
		System.out.println("칼로리 입력 :");
		int kcal = Integer.parseInt(sc.nextLine());

		if (foodList.add(new Food(name, kcal))) {
			System.out.println("음식 정보가 추가 되었습니다.");
		}
	}

	// 2 음식 정보!
	public void info() {
     for(Food food : foodList) {
    	 System.out.println(food);
     }
	}

	// 3 음식 삭제!
	public void delete() {
      System.out.println("");
      String name = sc.nextLine();
      for(int i=0; i<foodList.size(); i++) {
    	 if(foodList.get(i).getName().equals(name)) {
    		 foodList.remove(i);
    		 System.out.println(foodList.remove(i) + "가 삭제되었습닌다.");
    	 }
      }
    	  
      
	}
}
