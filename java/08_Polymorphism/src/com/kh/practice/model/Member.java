package com.kh.practice.model;

import java.util.Arrays;

// model class : 캡슐화! <- 변수 private!
public class Member {

   // private 정보 차단 
	
    private int age = 0;
    private String name = "";
    private int coupon = 0;
    private Book[] bookList = new Book[3];
    
	
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;  // 다시 그대로 가지고 와야해서 return이다
	}
	public void setName(String name) {
		this.name = name; // 매개 변수에 넣는 setter 
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;

    
    
}
	public Book[] getBookList() {
		return bookList;
	}
	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}
	
	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + ", coupon=" + coupon + ", bookList="
				+ Arrays.toString(bookList) + "]";
	}
	




}



