package com.yesh.assignmentSecond;

public class Employee {
	private String firstName;
	private String lastName;
	private String company;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private String role;

	public String generatePassword() {
		String str = firstName.substring(0, 2) + lastName.substring(0, 2) + company.substring(0, 2)
				+ role.substring(0, 2);
		return str;
	}

}
