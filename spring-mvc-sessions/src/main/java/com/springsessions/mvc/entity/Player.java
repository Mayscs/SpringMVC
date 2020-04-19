package com.springsessions.mvc.entity;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Player {

	private String firstName;
	private String lastName;
	private int age;
	private String sportsCategory;
	private String country;
	private String birthCountry;
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

}
