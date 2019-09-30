package com.basic.demo;

public class EmployeeTest {

	public static void main(String[] args) {

		// Employee emp1 = new Programmer("wagh");
		Employee[] e = { new Programmer("uday"), new Tester("dhan"), new Programmer("abhi"), new Programmer("suraj"),
				new Tester("ajay") };

		for (Employee emp : e) {

			if (emp instanceof Expert) {
				emp.dosomething();

			}

			// emp.dosomething();
		}

	}

}
