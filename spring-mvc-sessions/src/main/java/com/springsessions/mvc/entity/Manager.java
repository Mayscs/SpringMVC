package com.springsessions.mvc.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Manager {
	@NotNull(message = "Required Parameter")
	@Size(min=1, message = "Required Parameter")
	private String firstName;
	@NotNull(message = "Required Parameter")
	@Size(min=1, message = "Required Parameter")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

