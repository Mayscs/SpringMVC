package com.springsessions.mvc.entity;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;

//@Size(min=1, message = "Field can't be empty")
//@Size(min=1, message = "Field can't be empty")
public class Player {
	@NotNull(message="Mandatory Field")
	//@Size(min=1)
	private String firstName;
	@NotNull(message="Mandatory Field")
	//@Size(min=1)
	private String lastName;
	@NotNull(message="Age field can not be empty.")
	private int age;
	private String sportsCategory;
	private String country;
	private String birthCountry;
	private String gender;
	private String[] strengths;
	private LinkedHashMap<String,String> countryList;

	public Player() {
		init();
	}

	private void init() {
		countryList = new LinkedHashMap<>();
		Country[] countries = Country.values();

		for(Country nation : countries) {
			countryList.put(nation.name(), nation.getLabel());
		}
	}
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

	public String getCountry() {
		return country;
	}

	public HashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getBirthCountry() {
		return birthCountry;
	}


	public String getGender() {
		return gender;
	}

	public String[] getStrengths() {
		return strengths;
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

	public void setCountry(String country) {
		this.country=country;
	}

	public void setBirthCountry(String country) {
		this.birthCountry=country;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setStrengths(String[] strengths) {
		this.strengths = strengths;
	}

}
