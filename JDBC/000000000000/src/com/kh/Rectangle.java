package com.kh;

public class Rectangle {
 
	public int width;
	public int height;
	
	protected Rectangle() {
		
	}
	
	private Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	
	
}
