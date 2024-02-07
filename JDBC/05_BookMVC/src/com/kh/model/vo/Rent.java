package com.kh.model.vo;

import java.util.Date;

public class Rent {

	private int renNo;
	private Member memberNo;
	private Book Book;
    private Date renDate;
	public Rent() {
		super();
		
	}
	public Rent(int renNo, Member memberNo, com.kh.model.vo.Book book, Date renDate) {
		super();
		this.renNo = renNo;
		this.memberNo = memberNo;
		Book = book;
		this.renDate = renDate;
	}
	public int getRenNo() {
		return renNo;
	}
	public void setRenNo(int renNo) {
		this.renNo = renNo;
	}
	public Member getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Member memberNo) {
		this.memberNo = memberNo;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Date getRenDate() {
		return renDate;
	}
	public void setRenDate(Date renDate) {
		this.renDate = renDate;
	}
	@Override
	public String toString() {
		return "Rent [renNo=" + renNo + ", memberNo=" + memberNo + ", Book=" + Book + ", renDate=" + renDate + "]";
	}

    
}