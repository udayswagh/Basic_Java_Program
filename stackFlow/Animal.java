package com.basic.inheritance;

public class Animal {

	public static void main(String[] args) {

		System.out.println("----------First Line:main------");
		method1();

		System.out.println("----------Last Line:main------");
	}

	private static void method1() {

		System.out.println("---------- First:method1------");
		method2();

		System.out.println("----------Last:method2------");
	}

	private static void method2() {

		System.out.println("---------- First:method2------");

		int c = 10 / 0;
		System.out.println(c);

		System.out.println("---------- Last:method2------");

	}

}
