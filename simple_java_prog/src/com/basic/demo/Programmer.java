package com.basic.demo;

public class Programmer extends Employee implements Expert {

	public Programmer(String name) {

		super(name);
	}

	@Override
	public void dosomething() {
		System.out.println("programmer:--" + getName());
	}

}
