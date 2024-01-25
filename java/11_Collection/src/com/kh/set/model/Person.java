package com.kh.set.model;

import java.util.Objects;



public class Person implements Comparable<Person>  {
 
	private String neme;
	private int age;
	
	
	public Person() {
	}


	public Person(String neme, int age) {
		this.neme = neme;
		this.age = age;
	}


	public String getNeme() {
		return neme;
	}


	public void setNeme(String neme) {
		this.neme = neme;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [neme=" + neme + ", age=" + age + "]";
	}

	
	@Override
	public int compareTo(Person o) {
	//	return (this.age - o.age) * -1;
	//   return this.age == o.age ? 0 : this.age > o.age ? 1: -1;
	    return o.age - this.age * -1;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(neme, other.neme);
	}
	
	
	
}
