package com.kh.array.practice2.model;

public class Member {
<<<<<<< HEAD

=======
      
>>>>>>> 844d0d826ee4e85ce22fda0014b87c7ee2293788
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
<<<<<<< HEAD

=======
	
>>>>>>> 844d0d826ee4e85ce22fda0014b87c7ee2293788
	public Member() {
	}

	public Member(String id, String name, String password, String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", age=" + age + "]";
	}

}
=======
		return "Memver [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + ", age=" + age + "]";
	}
	
	
	
}
>>>>>>> 844d0d826ee4e85ce22fda0014b87c7ee2293788
