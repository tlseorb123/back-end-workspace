package com.kh;

import java.util.Scanner;

import javax.lang.model.element.Name;

import com.kh.controller.MemberController;



public class Application {

	private Scanner sc = new Scanner(System.in);
	MemberController me = new MemberController();
	


	public static void main(String[] args) {
 
		Application app = new Application();
	    app.mainMenu();
	}
	
	public void mainMenu() {
		
		
		
		System.out.println("===== kh 사이트 =====");
	
		boolean check = true;
		while(check) {
			System.out.println("**** 메인 메뉴 *****");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인 ");
			System.out.println("3. 종료");
			System.out.print("메뉴 번호 입력 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				signUp();
				break;
			case 2:
				login();
				break;
			case 9:
				// "프로그램 종료" 출력 후 반복문 종료
				System.out.println("프로그램 종료");
				check =false;
				break;
			}
			
		} 
	} 
		
	
	
	public void signUp() {
		
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		
		
		if(false) {
			System.out.println("성공적으로 회원가입 완료하였습니다");
		}else{
			System.out.println("중복된 아이디입니다.");
			
		}
		
		// 아이디,비밀번호,이름을 사용자한테 입력받아
		// MemberController의 signUp 메서드 반환 결과에 따라
		// true면 "성공적으로 회원가입 완료하였습니다." 출력
		// false면 "중복된 아이디입니다. 다시 입력해주세요." 출력
		
		
		}
	public void login() {
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		
		
	/*		
		
		if( != null) {
			System.out.println("~~님, 환영합니다");
		}else{
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요");
		}
		*/
		// 아이디,비밀번호를 사용자한테 입력받아 
		// MemberController의 login 메서드 반환 결과를 이름으로 받고 
		// 이름이 null이 아니면 "~~님, 환영합니다."출력
		// --> login 성공! 성공했다면 memberMenu() 출력
		// null이면 "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요." 출력
	}
	public void memberMeny() {
		boolean check =true;
		while(check) {
			System.out.println("**** 회원 메뉴 *****");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.println("메뉴 번호 입력 : ");
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				// 로그아웃 처리 -> 프로그램 종료처럼 하시면 됩니다.
				break;
			}
			
		}
	}
	public void changePassword() {
		// 아이디, 현재 비밀번호, 새로운 비밀번호를 사용자한테 입력받아
		// MemberController의 changePassword 메서드 반환 결과에 따라
		// true면 "비밀번호 변경에 성공했습니다" 출력
		// false면 "비밀번호 변경에 실패했습니다. 다시 입력해주새요" 출력
		
	}
	public void changeName() {
		// 아이디, 비밀번호를 사용자한테 입력받아
		// 사용자가 맞는지 확인 후 - MemberController의 login 메서드 활용
		// 이름이 null이 아니면 
		// --> 현재 설정된 이름 : ㅇㅇㅇ" 출력
		// --> 변경할 이름을 사용자한테 입력받아
		// MemberController의 changeName 메서드로 이름 변경 
		// "이름 변경에 성공하였습니다" 출력 
		// 이름이 null이면 "이름 변경에 실패했습니다. 다시 입력해주세요." 출력 
	}
}
