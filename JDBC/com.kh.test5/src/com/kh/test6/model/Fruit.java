package com.kh.test6.model;

public class Fruit {

	private String name;
	private String colre;
	public Fruit() {

	}
	public Fruit(String name, String colre) {
		this.name = name;
		this.colre = colre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColre() {
		return colre;
	}
	public void setColre(String colre) {
		this.colre = colre;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", colre=" + colre + "]";
	}
	
	
}
