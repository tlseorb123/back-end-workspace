package com.kh.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
	//	String[] fl = new Strting[5]; //  다른 방식 풀이 
		
		String [] fl = {"바나나", "사과", "딸기", "오렌지", "포도"};
		int num = (int)
				(Math.random()*5); // 랜덤으로 풀이 
	//	System.out.println(fl[num]);
	
	// ArrayList ~~~  배열 -> ArrayList 변환 
		ArrayList<String> fruitList = new ArrayList<>(Arrays.asList(fl));
	/*	fruitList.add("복숭아");
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("오렌지");
		fruitList.add("포도");
	*/	
		System.out.println(fruitList);
		System.out.println(fruitList.get(num));
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		int [] num = {4, -4, 3, -3, 2};  
        int [] num1 = {4 + -4 + 3 + -3 + 2};
       
        System.out.print("정수 : ");
        int num = sc.nextInt();
        int[]arr = new int[num];
        
        int sum = 0;
	      
        /*
        for(int i = 0; i <arr.length; i++) {
        	System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];     
        }
        
        System.out.println(Arrays.toString(arr));
	}
	*/
        
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0; i<num; i++) {
        	System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            int answer = sc.nextInt();
         //   arrList.add(sc.nextInt());
         //  sum += arrList.get(i);
            arrList.add(answer);
            sum += answer;
        
        
       
	}
        System.out.println(answer);
        System.out.println(sum);
	}
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		String [] food = {"짜장면", "라면", "치킨", "케이크", "피자", "떡볶이"};
	    System.out.print("주문하실 메뉴를 골라주세요 : ");
		String select = sc.nextLine();
	/*	
		for(int i=0; i<food.length; i++) {   //for문
			if(select.equals(food[i])) {
				System.out.println("배달 가능");
				break;
			} else if(i == food.length -1) {
				System.out.println("배달 불가능");
			}
			
		}
	   */	
		boolean check = false; 
		for(String fl : food) {    // 향상된 for문
			if(select.equals(food)) {  
				check = true;           
			}
		}
		System.out.println(check ? "배달 가능" : "배달 불가능"); //삼항연산자 
	
		ArrayList<String> flList = ArrayList<>()(Array.asList());
	
	
	
	
	
	}
	
		
		
		
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		System.out.print("주민등록번호 : ");
		String no = sc.nextLine();
	/*	
		// 문자 배열
		char[] charNo =  no.toCharArray();
		for(int i=0; i<charNo.length; i++) {
			if(i <= 7) {
				System.out.print(charNO[i]);
			}else {
				System.out.print("*");
			}

		}
	}
	*/
	
	
	char[] charNo =  no.toCharArray();
	String[] strNo = no.split("");
	ArrayList<Character> noList = new ArrayList<>(Arrays.asList(strNo));
	for(int i=0; i<noList.size(); i++) {
		if(i <= 7) {
			System.out.print(noList.get(i));
		//	System.out.print(strNO[i]);
		}else {
			System.out.print("*");
		}
	}
	
	}
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		System.out.println("단어 입력 : ");
		String word = sc.nextLine();
		String [] wordArr = word.split("");
		
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordArr));
        Collections.reverse(wordList);
        for(String s : wordList) {
        	System.out.print(s);
        }
		
		/*
		for(int i=word.length()-1; 1>=0; i--) {
			System.out.print(wordArr[i]);
		}
	*/	
	}
	
	public static void main(String[] args) {
		ArrayPractice a = new ArrayPractice();
//	a.method1();
//	a.method2();
//	a.method3();
//	a.method4();
	a.method5();
	}
}

