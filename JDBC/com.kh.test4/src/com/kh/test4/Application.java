package com.kh.test4;

import com.kh.test4.model.Person;

public class Application {

	public static  void main(String[] args) {
 
       // getName 이 필요하다 하니까 model을 하나 만들어 준다.
	   // pArr
		
		 Person[] pArr = new Person[3];
		 pArr[0] = new  Person("가");
		 pArr[1] = new  Person("나");
		 pArr[2] = new  Person("다");
			
		for(int i=0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
			System.out.println(pArr[i].getName()); 
			
	}	
}
	
}

