package com.kh.example.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import com.kh.list.model.Person;

public class Application {

	public static void main(String[] args) {
	

	

    ArrayList<Integer> lotto = new ArrayList<>();	
	
	while(lotto.size() < 6 ) {
		int num = (int)(Math.random() * 45 + 1);
       if(!lotto.contains(num)) {
    	   lotto.add(num);   
       }
			
	}

	System.out.println(lotto);
	
    int count = 0;
	while(true) { 
 //     TreeSet<Integer> myLotto = new TreeSet<>();
		 ArrayList<Integer> myLotto = new ArrayList<>();
     while(myLotto.size() < 6) {
    	 int num = (int)(Math.random() * 45 + 1);
    	  if(!myLotto.contains(num)){
    		  myLotto.add(num);
    	  }
        
}
    
      
     count++;
     
     System.out.println("로또 번호 : " + lotto);
     System.out.println("내 번호 : " + myLotto);
     
     Collections.sort(lotto);
     Collections.sort(myLotto);
 
   
     
     // 멈추는 조건 : 로또 번호와 내 번호가 정확히 일치!
   if(lotto.equals(myLotto)) {
	   System.out.println("횟수 : " + count);
	   break;
   }

	
	}
	
	}
}
