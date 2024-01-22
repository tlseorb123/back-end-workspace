package com.kh.practice.model;

public class CookBook extends Book{

    private boolean coupon; // 요리 쿠폰 유무

 
    public CookBook() {}


	public CookBook(boolean coupon) {
		this.coupon = coupon;
	}


	public boolean isCoupon() {
		return coupon;
	}


	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}


	@Override
	public String toString() {
		return "CookBook [coupon=" + coupon + "]";
	}


    
}
