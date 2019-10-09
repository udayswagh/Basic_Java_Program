package com.basic.multithreading;

public class Mythread extends Thread {

	// String currentThread = getName().toString();
	


	public void run() {
		method1();
		System.out.println(getState());

	}

	private void method1() {
		for (int i = 0; i < 10; i++) {
			// System.out.println(i);
			// System.out.println( toString() );
			System.out.println(" " + getName() + " ");

		}
	}

	public static void main(String[] args) {
		Mythread mythread1 = new Mythread();
		Mythread mythread2 = new Mythread();
		mythread1.setName("uday");
		mythread2.setName("abhi");

		mythread1.start();

		mythread2.start();

	}
}