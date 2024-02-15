package com.kh.test5;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
 
		ArrayList<>() list = new ArrayList<>();
		
		
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		list.add("바나나");
		
		for(int i = 0; i < list.length; i++) {
		 System.out.println(list[i].getName());
		}
	}

}
