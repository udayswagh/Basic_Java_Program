package com.yesh.assignmentSecond;

public class NumberToString {
	private double input;

	public double getInput() {
		return input;
	}

	public void setInput(double input) {
		this.input = input;
	}

	public int numberOutputInString(String str)

	{
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != '.') {
				count++;
			} else {
				break;
			}
		}

		return count;

	}

	

}
