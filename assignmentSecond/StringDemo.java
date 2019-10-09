package com.yesh.assignmentSecond;

public class StringDemo {
	private String input;

	public String getInput() {
		return input;
	}

	public String setInput(String input) {
		return this.input = input;
	}

	public String getRequiredData(String input) {

		if (input.isEmpty()) {
			System.out.println("There is no String");

		} else {
			System.out.println("java test");
		}
		return input;

	}

}
