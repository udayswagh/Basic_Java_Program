package com.yesh.assignmentSecond;

import java.util.Scanner;

public class ActionUrlMain {
	public static void main(String[] args) {
		ActionUrl actionUrl = new ActionUrl();
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();

		System.out.println(actionUrl.checkOpenUrl(s1));

	}

}
