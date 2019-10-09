package com.yesh.assignmentFirst;

public class Member {

	private String firstname;
	private String lastname;
	private String email;
	private String role;
	private int password;

	public String showMemberDetail() {

		String str = ("Firstname: " + getFirstname() + " " + "Lastname: " + getLastname() + " " + "Email: " + getEmail()
				+ " " + "Role: " + getRole() + " " + "Password: " + getPassword());

		return str;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
