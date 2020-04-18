package com.springsessions.mvc.entity;

public enum Country {
	SPAIN("Spain"),
	USA("America"),
	INDIA("India"),
	JAPAN("Japan"),
	AUSTRALIA("Australia"),
	BRAZIL("Brazil"),
	FRANCE("France");

	private String label;

	Country(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
