package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class SmartPhone extends Product {
      
	
	private String moblieAgency;

	public SmartPhone() {
		
		
	}

	public SmartPhone(String brand, String pCode, String name, int price) {
		super(brand, pCode, name, price);
	    this.moblieAgency = moblieAgency;
	}

	
	
	
	public String getMoblieAgency() {
		return moblieAgency;
	}

	public void setMoblieAgency(String moblieAgency) {
		this.moblieAgency = moblieAgency;
	}

	@Override
	public String toString() {
		return super.toString() + ", SmartPhone [moblieAgency=" + moblieAgency + "]";
	}

	
	
}
