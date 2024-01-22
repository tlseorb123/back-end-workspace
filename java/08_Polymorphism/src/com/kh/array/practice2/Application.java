package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		
		/*
		 * 회원 수가 3명이 최대 등록 가능 
		 * 3명 모두 등록되면 "회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다." 와 함께
		 * "1. 새 회원 등록" 하지 못하게 -> 화면상 안보이게만 처리하셔도 됩니다.
		 * 
		 * 1번인 경우 -> inserMember()
		 * 2번인 경우 -> updateMember()
		 * 3번인 경우 -> printAll()
		 * 9번인 경우 -> 프러그램 종료
		 * 그 외의 경우 -> 잘못 입력하셨습니다. 다시 입력해주세요.
		 * 
		 * */
	}
	
	   public void insertMember() {
		   /*
		    * 아이디를 입력 받았는데 기존 멤버 배열에 아이디가 있는 경우
		    * "중복된 아이디입니다. 다시 입력해주세요." 출력 후 
		    * 다시 아이디 입력부터 나올 수 있게 처리 
		    * */
	   }
	
	   public void updateMember () {
		   /*
		    * 아이디를 입력 받았는데 기존 멤버 배열에 아이디가 없는 경우 
		    * "회원 정보가 없습니다." 출력 후 다시 메인 화면으로
		    * 
		    * */
	   }
	   
	   public void printAll() {
		   /*
		    * 전체 회원 정보 출력
		    * */
	   }
}
