package com.yesh.assignmentSecond;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setFirstName("uday");
		employee.setLastName("wagh");
		employee.setCompany("yesh");
		employee.setRole("Trainee");
		employee.generatePassword();

		System.out.println(employee);
	}

}
