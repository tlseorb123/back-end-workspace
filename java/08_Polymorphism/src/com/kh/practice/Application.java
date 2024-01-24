package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;
import com.kh.practice.controller.LibraryController;
import com.kh.practice.model.Book;
import com.kh.practice.model.Member;

public class Application {

	// 한 사람에 대한 정보를 담고 있는 변수들
	// 모델 클래스가 묶은것 객체
	// 객체로 담는게 가독성이 좋다

	Scanner sc = new Scanner(System.in);
	Member m = new Member();

	int num = -1;   // 조건이 양수가 걸리니까 음수로 조건을 건다
					// 조건을 0으로 걸었다
					// 조건을 바꾸면 걸면 변한다

	// 뎁스가 많으면 가독성이 떨어진다
	// 기본으로 2, 3 뎁스 정도 한다.

	Book[] books = { new Book("맛있는 지중해식 레시피", false), new Book("가페 샌드위치 클래스", false), new Book("원피스 107", 19),
			new Book("주술회전", 15) };

	public static void main(String[] args) {

		// 책에 대한 정보!
		// 생성자 만들기는 book 객체한테 들어가면 된다

		Application app = new Application();
		app.mainMenu();
	}

	public void mainMenu() {

		System.out.print("이름 : ");
		m.setName(sc.nextLine()); // setter

		System.out.print("나이 : ");
		m.setAge(Integer.parseInt(sc.nextLine())); // setter 내보낸다

		// for문 숫자나 횟수가 제한되어있다
		// while 조건이나 무한루프 일때쓴다

		// 1, 2, 3, 순서가 있으면 switch를 쓴다 

		boolean check = true;

		while (check) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 대여하기");
			System.out.println("3. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());

			// 메서드를 지정하고 코드 저장

			switch (menu) {
			case 1:
				myPage();
				break;
			case 2:
				rentbook();
				break;
			case 3:
				check = false;
				break;
			}

		}
	}

	public void myPage() {

		System.out.println(m);

	}

	public void rentbook() {
	for(int index = 0; index < books.length; index++) {
		System.out.println(index + "번 도서: " + books[index]);
	}  
		System.out.print("대여할 도서 번호 선택 : ");
		num = Integer.parseInt(sc.nextLine());
		
		Book selectBook = books[num]; // 사용자가 선택한 책 -> 대여할 도서 책!
		
		
		// getter를 이용해서 기존 책 리스트를 일단 가지고 와야 함! 
		Book[] newBookList = m.getBookList();
		
		for (int i = 0; i < newBookList.length; i++) { //getter 가지고 온다 . 그대로 이다
			
			if (newBookList[i] == null) {
				// 대여 가능 공간!
            
				
//				if (num == 0) { 
//					// -> 새로운 쿠폰 값(setter) = 기존 쿠폰 값 (getter) + 1
//					  // setter 변화한다 바뀐다 + getter 
//					 // getter 들어간다
//					
//					m.setCoupon(m.getCoupon() + 1); // 쿠폰이 true인 경우!
//					
//				} else if (num == 1) {
//					 // getter
//				} else if (num == 2 && m.getAge() >= selectBook.getAccessAge()) { // getter
//					
//					// getter
//				} else if (num == 3 && m.getAge() >= selectBook.getAccessAge()) { //getter
//					
//				}		    
                 
				if(selectBook.isCoupon()) {
					m.setCoupon(m.getCoupon() + 1);
				}
				
	        	if(m.getAge() >= selectBook.getAccessAge()) {
	        		newBookList[i] = books[num];
	        	}
				//    if()
				
			//	newBookList[i] = books[num];
				break;
		}
		}
		
		m.setBookList(newBookList);

		
		
		if (selectBook.getAccessAge() > m.getAge()) { //getter
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다.");
		}

	}

}
