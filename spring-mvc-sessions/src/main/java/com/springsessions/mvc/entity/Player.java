package com.springsessions.mvc.entity;

public class Player {

	private String firstName;
	private String lastName;
	private int age;
	private String sportsCategory;

	//Getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getSportsCategory() {
		return sportsCategory;
	}


	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSportsCategory(String category) {
		this.sportsCategory = category;
	}

}
