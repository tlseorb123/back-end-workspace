package com.kh.test5;

import java.util.ArrayList;

import java.util.List;

import com.kh.test5model.Fruit;

public class Application {

	public static void main(String[] args) {
 
		List<Fruit> list = new ArrayList<>();
		
		// add 문제 <> 이게 Fruit 어서  
		
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		
		
		for(int i = 0; i < list.size(); i++) {
		 System.out.println(list.get(i).getName());
		}
	}

}
