package com.basic.demo;

public class Tester extends Employee implements Expert {

	public Tester(String name) {
		super(name);

	}

	@Override
	public void dosomething() {
		System.out.println("Tester:--" + getName());

	}

}
